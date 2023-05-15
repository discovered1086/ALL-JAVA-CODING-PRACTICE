package com.kingshuk.corejava.bharathcourse.socketprogramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({"java:S106", "java:S125"})
public class MySocketServer {

    public static void main(String[] args) throws IOException {
        //Here we are creating the server and binding it to port 8080
        try(ServerSocket serverSocket = new ServerSocket(8080)){
            System.out.println("Waiting for the client to connect to port 8080");

            //Here we are opening the connection and the
            //Server will start accepting connections
            //This part onwards will only be activated when the client sends some data
            Socket establishedConnection = serverSocket.accept();
            System.out.println("Connection established");

            //Reading data sent by the client through this connection
            //socket.getInputStream() allows us to read data from the socket connection
            DataInputStream dataInputStream = new DataInputStream(establishedConnection.getInputStream());

            //Converting the data sent by the client into a string
            String data = dataInputStream.readUTF();

            System.out.println("Client sent this: " + data);

            //Closing the input streams and the socket
            dataInputStream.close();

            //This is not necessary because once the server socket closes, this connection
            // will also automatically close
            //establishedConnection.close();
        }


    }
}
