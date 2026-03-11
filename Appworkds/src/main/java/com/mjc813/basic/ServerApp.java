package com.mjc813.basic;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//서버소켓 생성(IP 대역 OPtion, 포트번호 필수)
//클라이언트 접속 기다리는 동작 (블로킹)
//클라이언트 접속되면 새로운 데이터소켓\클라이언트통신소켓을 리턴한다
//새로운 통신 소켓과 클라이언트가 통신하도록 프로그래밍 해야한다
//종료시에는 소켓과 자원을 모조리 해제 해야한다
public class ServerApp {
    private ServerSocket serverSocket;
    private DataInputStream dis;
    private DataOutputStream dos;

    public  ServerApp() throws IOException { //던저버림 나를 생성한 곳에서 예외처리해
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
            ServerApp sa = new ServerApp();
            Socket socket = sa.accept();
            //클라이너트 연결되면 세로운 소켓 (새로운 클라이언트 통신 소켓)으로 통신이 가능하다

            String are ="Welcome server";
            DataOutputStream osw = new DataOutputStream( socket.getOutputStream());
            osw.writeUTF(are);
            osw.flush();

//            socket.getOutputStream().write(are.getBytes(StandardCharsets.UTF_8));
//            socket.getOutputStream().write("\n".getBytes(StandardCharsets.UTF_8));
//            socket.getOutputStream().flush();
            //서버가 클라이언트 총신 소켓에게 데이터를 전송했다

//            byte[] buf = new byte[1024];
//            int num = socket.getInputStream().read(buf);
//            String msg = new String(buf);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = br.readLine();
            System.out.println(msg);
            //클라이통신 소켓으로부터 데이터를 읽어 출력함

            socket.close();;
            //클라이언트 통신 소켓을 닫았다라고볼수잇음tlqkfahtgoahrrptek

            sa.close();
            //서버소켓을 닫았다다다아아dkdkdkdkdkddk아니요못하겟는데요tlqkf
        } catch (Exception e) {
           System.err.println(e.toString());
        }
    }
}
