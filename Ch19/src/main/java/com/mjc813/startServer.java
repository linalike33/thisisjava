package com.mjc813;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import static com.mjc813.ServerEx.serverSocket;

public class startServer {
    Thread thread = new Thread() {
        @Override
        public void run() {
            try {
                try {
                    ServerSocket serverSocket = new ServerSocket(50001);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("[서버]시작됨");

                while (true) {
                    System.out.println("\n[서버]연결 요청을 기다림\n");
                    Socket socket = serverSocket.accept();

                    InetSocketAddress isa =
                            (InetSocketAddress) socket.getRemoteSocketAddress();
                    System.out.println("[서버]" + isa.getHostString() + "의 연결 요청을 수락함");

                    socket.close();
                    System.out.println("[서버]" + isa.getHostString() + "의 연결을 끊음");
                }
            } catch (IOException e) {
                System.out.println("[서버]" + e.getMessage());
            }
        }
    };
  //  thread.start();
}


