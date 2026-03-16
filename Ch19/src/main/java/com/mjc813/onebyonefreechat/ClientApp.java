package com.mjc813.onebyonefreechat;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp implements Runnable {
	//ClientApp라는 클래스가 '입력(Main)' 업무에만 묶여 있지 않고, '서버 대답 듣기(run)'
	// 라는 업무를 별도로 동시에 수행할 수 있는 '스레드용 일꾼'임을 자바에게 증명하기 위해서입니다."
	private Socket socket;
	private DataInputStream dis;
	private BufferedWriter bw;

	public ClientApp() throws IOException {
		this.socket = new Socket(); // 클라이언트의 통신용 소켓 생성
	}

	public void connect() throws IOException {
//		this.socket.bind(new InetSocketAddress("localhost", 59998)); // ip 와 포트 정보를 bind 하고 접속 시도한다.
		this.socket.connect(new InetSocketAddress("localhost", 59997));
		// 해당 ip 와 포트로 접속을 시도한다.

		this.dis = new DataInputStream(this.socket.getInputStream());
		this.bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
	}

	public void close() throws IOException {
		try {
			this.bw.close();
		} catch (Exception ex) {
		}
		try {
			this.dis.close();
		} catch (Exception ex) {
		}
		try {
			this.socket.close();
		} catch (Exception ex) {
		}
		// 클라이언트 통신 소켓을 닫는다.
	}

	public String read() throws IOException {
		String str = null;
//		try {
			str = this.dis.readUTF();
//		} catch (IOException e) {
//			System.err.println("데이터 입력 받을 수 없습니다.");
//			System.exit(-82429);
//		}
		return str;
	}

	@Override
	public void run(){
		try {
			while (true){
				String mag =this.read();
				if(mag!= null){
					System.out.println("[상대방]"+mag);
				}

			}
		} catch (IOException e) {
        }
        // 서버로부터 데이터를 읽는 동작을 해야 한다.
		// 읽어서 화면에 출력해야 한다.
		// 왜 스레드에서 실행해야 하나요 ? 읽는 동작이 블로킹모드가 되기 때문이다.
	}


	public void send(String msg) {
		try {
			bw.write(msg);
			bw.newLine();
			bw.flush();
		} catch (Exception ex) {
		}
	}

	public static void main(String[] args) {
		Scanner scanner;
		ClientApp ca = null;
		try {
			scanner = new Scanner(System.in);
			ca = new ClientApp();
			ca.connect();

			while(true) {
				String str = scanner.nextLine();
				ca.send(str);

				String msg = ca.read();
				System.out.println("SERVER:" + msg);
			}
		} catch (Exception ex) {
			System.err.println(ex.toString());
		} finally {
			try {
				ca.close();
			} catch (Exception ex) {
			}
		}
	}
}
