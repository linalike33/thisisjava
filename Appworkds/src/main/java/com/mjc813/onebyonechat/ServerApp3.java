package com.mjc813.onebyonechat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//서버소켓 생성(IP 대역 OPtion, 포트번호 필수)
//클라이언트 접속 기다리는 동작 (블로킹)
//클라이언트 접속되면 새로운 데이터소켓\클라이언트통신소켓을 리턴한다
//새로운 통신 소켓과 클라이언트가 통신하도록 프로그래밍 해야한다
//종료시에는 소켓과 자원을 모조리 해제 해야한다
public class ServerApp3 {
    private ServerSocket serverSocket;
    private DataInputStream dis;
    private DataOutputStream dos;

    public ServerApp3() throws IOException { //던저버림 나를 생성한 곳에서 예외처리해
        this.serverSocket = new ServerSocket(5999); //빨간 줄이 생기는 이유 예외가 생길 수 있기때문에 예외처리를 해줘야한다
        //포트번호로 서버소켓을 생성한다
    }

    public Socket accept() throws IOException {
        return this.serverSocket.accept();
        //생성된 소켓으로 서버는 클라이언트 연결을 기다린다.
        //클라이언트 연결이 되면 Socket 객체를 리턴한다.
    }

    public void close() throws IOException {
        this.serverSocket.close();
    }
    public static void main(String[] args){
        try {
            ServerApp3 sa = new ServerApp3();
           while (true) {
            System.out.println("\n[서버] 연결 요청을 기다림\n ");
            Socket socket = sa.accept();

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String mgs = dis.readUTF();
            System.out.println("[상대방]"+mgs);

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

           }
        } catch (Exception e) {
           System.err.println(e.toString());
        }
    }
}
