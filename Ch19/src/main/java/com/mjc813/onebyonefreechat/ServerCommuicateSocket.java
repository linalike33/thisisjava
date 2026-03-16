package com.mjc813.onebyonefreechat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerCommuicateSocket implements Runnable {
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;

	public  ServerCommuicateSocket(Socket socket) throws IOException {
		this.socket = socket;
		this.dis = new DataInputStream(this.socket.getInputStream());//		this.dis = new ~~~~;    코딩하세요
		this.dos = new DataOutputStream(this.socket.getOutputStream());//		this.dos = new ~~~~;    코딩하세요
	}

	public void send(String msg) {
		try {
			this.dos.writeUTF(msg);// this.dos 를 이용하여 msg 를 전송하는 코딩 하세요
			this.dos.flush();
		}catch (IOException e){
			System.err.println("[전송실패]"+e.getMessage());
		}
    }

	public String read() {
        String str = "";
        try {
            str = this.dis.readUTF();
        } catch (IOException e) {// this.dis 를 이용하여 InputStream 문자를 읽어서 str 에 리턴하는 코딩 하세요.
            System.err.println("[읽기실패]" + e.getMessage());// 읽는 동작은 블로킹모드 이므로 스레드에서 실행하도록 해야 한다.
        }
        return str;
    }

        public void close () {
            try {
                this.dos.close();
            } catch (Exception e) {
            }
            try {
                this.dis.close();
            } catch (Exception e) {
            }
            try {
                this.socket.close();
            } catch (Exception e) {
            }
        }

    @Override
    public void run() {
        try {
            while (true) {
                String msg = this.read(); // 여기서 클라이언트 메시지 올 때까지 대기(블로킹)
                if (msg == null || msg.equals("")) break;

                //  읽어온 메시지를 화면에 출력한다.
                System.out.println("\n[상대방]: " + msg);
                System.out.print("서버 입력 >> ");
            }
        } catch (Exception e) {
            // 연결이 끊기면 알아서 종료
        }
    }
}

