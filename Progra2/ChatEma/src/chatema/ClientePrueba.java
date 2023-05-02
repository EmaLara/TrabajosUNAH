/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatema;

import java.net.*;
import java.io.*;

/**
 *
 * @author crema
 */

public class ClientePrueba {
    public static void main(String[] args) throws IOException {
        String hostName = "localhost";
        int portNumber = 1234;

        try (
            Socket socket = new Socket(hostName, portNumber);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String message;
            while ((message = userInput.readLine()) != null) {
                output.println(message);
                System.out.println("Servidor: " + input.readLine());
            }
        } catch (UnknownHostException ex) {
            System.out.println("Host desconocido: " + hostName);
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("Error de E/S en la conexión con el servidor: " + hostName);
            System.exit(1);
        }
    }
}
