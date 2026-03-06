package com.mjc813;

import java.io.*;

public class ch18 {
    //입출력 스트림(바이트 출력 스트림)
    public void writeE() {
        try {
            OutputStream os = new FileOutputStream("C:Temp/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;
            byte d = 40;

            os.write(a);
            os.write(b);
            os.write(c);
            os.write(d);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //바이트 배열 출력
    public void Write() {
        try {
            OutputStream os = new FileOutputStream("C:Temp/test2.db");

            byte[] array = {10, 20, 30, 40, 50};

            os.write(array);
            //os.write(array,1,3); 1부터 3번 인덱스까지만 출력
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace(); //Print: 화면에 찍어라! Stack: 쌓여 있는 (함수 호출 기록) Trace: 추적하다, 발자국을 찾다
            // 에러가 발생한이유 어디서 발생햇는지 알려주는 역할
        }
    }

    //바이트 입력 스트림 외부->프로그램
    public void ReadE() {
        try {
            InputStream is = new FileInputStream("C:/Temp/test1.db");

            while (true) {
                int date = is.read(); //1byte씩만 읽기
                if (date == -1) break;//-1 읽을 데이터가 없다는 뜻 다 읽었다는 뜻
                System.out.println(date);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //바이트 배열로 읽기
    public void ResdEE() {
        try {
            InputStream is = new FileInputStream("C:/Temp/test2.db");

            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data); //최대 100바이트를 읽고 바이트를 데이터저장 읽은 수는 리턴
                if (num == -1) break;

                for (int i = 0; i < num; i++) { //읽은 바이트 출려ㅕㄱ
                    System.out.println(data[i]);
                }
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CopyE() { //IOException파일이나 네트워크로 데이터를 주고받을 때 발생하는 모든 사고를 통틀어
        try {
            String or = "C:/Temp/test.jpg";
            String ta = "C:/Temp/test2.jpg";

            InputStream is = new FileInputStream(or);
            OutputStream os = new FileOutputStream(ta);

            byte[] data = new byte[1025];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                os.write(data, 0, num);
            }
            os.flush();
            os.close();
            is.close();

            System.out.println("복사가 잘 되었습니다");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

