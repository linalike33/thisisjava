package com.mjc813.onebyone;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//서버소켓 생성(IP 대역 OPtion, 포트번호 필수)
//클라이언트 접속 기다리는 동작 (블로킹)
//클라이언트 접속되면 새로운 데이터소켓\클라이언트통신소켓을 리턴한다
//새로운 통신 소켓과 클라이언트가 통신하도록 프로그래밍 해야한다
//종료시에는 소켓과 자원을 모조리 해제 해야한다
public class ServerApp2 {
    private ServerSocket serverSocket;
    private DataInputStream dis;
    private DataOutputStream dos;

    public ServerApp2() throws IOException { //던저버림 나를 생성한 곳에서 예외처리해
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
            ServerApp2 sa = new ServerApp2();
           while (true) {
               System.out.println("\n[서버] 연결 요청을 기다림\n");

               Socket socket = sa.accept();
               System.out.println("[서버] 연결이 들어옴");
               //accept는 손님이 올 때까지 코드를 멈추고 기다리다가
               //손님이 오면 '입장 허가'를 내주고 대화용 비서(Socket)를 데려오는 동작이다

               //Welcome 메시지 보내기 (Out)
               String are = "Welcome server";
               DataOutputStream osw = new DataOutputStream(socket.getOutputStream());
               osw.writeUTF(are);
               osw.flush();

               //클라이언트가 보낸 메시지 읽기 (In)
               BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
               String msg = br.readLine();
               System.out.println("[상대방]"+msg);

               //이번 손님 전용 소켓만 닫습니다
               socket.close();
               System.out.println("[서버]종료됨");

           }
        } catch (Exception e) {
           System.err.println(e.toString());
        }
    }
}
