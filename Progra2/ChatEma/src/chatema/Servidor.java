/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

    private ServerSocket serverSocket;
    private List<ManejadorCliente> clientesConectados;

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.iniciar();
    }

    public void iniciar() {
        clientesConectados = new ArrayList<>();

        try {
            // Crear un ServerSocket en el puerto 1234
            serverSocket = new ServerSocket(1234);
            System.out.println("Servidor iniciado en el puerto 1234");
            System.out.println("Dirección IP del servidor: " + serverSocket.getInetAddress().getLocalHost().getHostAddress());

            // Esperar a que lleguen conexiones de clientes
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ManejadorCliente(clientSocket)).start();
            }

        } catch (IOException ex) {
            System.out.println("Error al iniciar el servidor: " + ex.getMessage());
        }
    }

    private class ManejadorCliente implements Runnable {

        private String clientName;
        private BufferedReader input;
        private PrintWriter output;
        private Socket clientSocket;

        public ManejadorCliente(Socket clientSocket) {
            this.clientSocket = clientSocket;
            try {
                // Crea los objetos para leer y escribir en el socket
                input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                output = new PrintWriter(clientSocket.getOutputStream(), true);

                // Pide al cliente que ingrese su nombre y lo almacena
                output.println("Introduce tu nombre:");
                clientName = input.readLine();
                System.out.println(clientName + " se ha conectado.");

                // Avisa a los demás clientes que se ha conectado un nuevo usuario
                for (ManejadorCliente cliente : clientesConectados) {
                    cliente.output.println(clientName + " se ha conectado.");
                }
                clientesConectados.add(this);

            } catch (IOException ex) {
                System.out.println("Error al manejar la conexión: " + ex.getMessage());
            }
        }

        public void run() {
            try {
                // Espera a que lleguen mensajes del cliente y los reenvía a todos los demás clientes
                String message;
                while ((message = input.readLine()) != null) {
                    System.out.println(clientName + ": " + message);
                    // Reenvía el mensaje a todos los demás clientes
                    for (ManejadorCliente cliente : clientesConectados) {
                        if (cliente != this) {
                            cliente.output.println(clientName + ": " + message);
                        }
                    }
                }
            } catch (IOException ex) {
                System.out.println("Error al manejar la conexión: " + ex.getMessage());
            } finally {
                // Avisa a los demás clientes que este usuario se ha desconectado
                clientesConectados.remove(this);
                for (ManejadorCliente cliente : clientesConectados) {
                    cliente.output.println(clientName + " se ha desconectado.");
                }

                // Cierra el socket cuando se termina la conexión
                try {
                    clientSocket.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el socket: " + ex.getMessage());
                }
                System.out.println(clientName + " se ha desconectado.");
            }
        }
    }
}



