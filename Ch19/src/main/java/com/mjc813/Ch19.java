package com.mjc813;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import static com.mjc813.ServerEx.serverSocket;

public class Ch19 {
    //IP 주소 얻기
    public void InetAdd(){
        try{
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP 주소:"+local.getHostAddress());

            InetAddress[] isArr = InetAddress.getAllByName("www.naver.com");
            for(InetAddress remote : isArr){
                System.out.println("www.naver.com IP 주소 :"+remote.getHostAddress());
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
    //TCP 서버
    public void Server(){
        System.out.println("----------------------------------------------------");
        System.out.println("서버를 종료하려면 q  또는 Q를 입력하고 Enter 키를 입력하시요");
        System.out.println("----------------------------------------------------");

         new startServer();

        Scanner scanner = new Scanner(System.in);
        while (true){
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")){
                break;
            }
        }
        scanner.close();

        stopServer();
    }

    private void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버]종료됨");
        }catch (IOException e1){}
    }
    public void Client(){
        try {
            Socket socket = new Socket("localhost",50001);

            System.out.println("[클라이언트]연결 성공");

            socket.close();
            System.out.println("[클라이언트]연결 끊음");
        }catch (UnknownHostException e){
        }catch (IOException e){

        }
    }
}
