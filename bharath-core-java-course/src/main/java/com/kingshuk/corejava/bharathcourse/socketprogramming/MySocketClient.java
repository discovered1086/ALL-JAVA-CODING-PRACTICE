package com.kingshuk.corejava.bharathcourse.socketprogramming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

@SuppressWarnings({"java:S106", "java:S125"})
public class MySocketClient {

    public static void main(String[] args) throws IOException {
        //We create a socket or rather a connection to a server
        //Using the host address/ip address and port number of the server
        try (Socket socket = new Socket("localhost", 8080)) {
            //Now we'll establish an output stream to send data to
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            //Write the data to the DOS
            outputStream.writeUTF("This is my first socket program");

            outputStream.close();
        }
    }
}
