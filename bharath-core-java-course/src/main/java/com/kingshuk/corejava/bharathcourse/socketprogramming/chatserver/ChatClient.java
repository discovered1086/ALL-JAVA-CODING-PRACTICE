package com.kingshuk.corejava.bharathcourse.socketprogramming.chatserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({"java:S106", "java:S125"})
public class ChatClient {

    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 9090)) {
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
                messageToBeSent = reader.readLine();
                outputStream.writeUTF(messageToBeSent);
                outputStream.flush();
                if (messageToBeSent.equals("exit")) {
                    break;
                }
                messageReceived = inputStream.readUTF();
                System.out.println("Server says...\n" + messageReceived);
            }

            reader.close();
            outputStream.close();
            inputStream.close();

        }
    }
}
