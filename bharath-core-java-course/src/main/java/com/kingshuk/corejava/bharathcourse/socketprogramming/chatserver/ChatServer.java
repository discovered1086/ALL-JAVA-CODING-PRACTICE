package com.kingshuk.corejava.bharathcourse.socketprogramming.chatserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({"java:S106", "java:S125"})
public class ChatServer {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(9090)) {
            System.out.println("Server is ready to chat");
            Socket socket = serverSocket.accept();

            //Data inout stream for reading messages
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            //Data output stream for writing messages back to the client
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            //We'll read data from the console and send to the client
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String messageReceived = "";
            String messageToBeSent = "";

            //We don't want to terminate the program after a single message is received
            //This infinite loop is a simulation for a server that's always up and running
            while (true) {
                messageReceived = inputStream.readUTF();
                System.out.println("Client says...\n" + messageReceived);
                if (messageReceived.equals("exit")) {
                    break;
                }
                messageToBeSent = reader.readLine();
                outputStream.writeUTF(messageToBeSent);
                outputStream.flush();
            }

            reader.close();
            outputStream.close();
            inputStream.close();
            socket.close();

        }
    }
}
