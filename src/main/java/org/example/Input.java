package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Input {

    public static void main(String[] args) throws IOException {
        try (Socket clientSocket = new Socket("127.0.0.1", 8080);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Andrey");
            String InputAnswer = in.readLine();
            System.out.println(InputAnswer);
        }
    }
}