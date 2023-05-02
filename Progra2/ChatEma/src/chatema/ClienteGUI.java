/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author crema
 */

public class ClienteGUI extends JFrame {
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton botonEnviar;
    private JTextArea areaTexto;
    private Socket socket;
    private PrintWriter escritor;
    private BufferedReader lector;

    public ClienteGUI() {
        super("Cliente de Chat");
        setLayout(new BorderLayout());

        etiqueta = new JLabel("Escribe tu mensaje:");
        add(etiqueta, BorderLayout.NORTH);

        campoTexto = new JTextField();
        add(campoTexto, BorderLayout.CENTER);

        botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(new EnviarMensajeListener());
        add(botonEnviar, BorderLayout.EAST);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto), BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            socket = new Socket("localhost", 1234);
            escritor = new PrintWriter(socket.getOutputStream(), true);
            lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Thread receptorMensajes = new Thread(new RecibirMensajes());
            receptorMensajes.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private class EnviarMensajeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String mensaje = campoTexto.getText();
            escritor.println(mensaje);
            campoTexto.setText("");
        }
    }

    private class RecibirMensajes implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    String mensaje = lector.readLine();
                    areaTexto.append(mensaje + "\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ClienteGUI();
    }
}
