package com.mjc813;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("10.11.83.77", 50001);

            System.out.println("[클라이언트]연결 성공");

            socket.close();
            System.out.println("[클라이언트]연결 끊음");
        } catch (UnknownHostException e) {

        } catch (IOException e) {
        }
    }
}
