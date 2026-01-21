package com.mjc813;

import java.util.Scanner;


public class Chapter05 {
    public void Third01() {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[3]; //(칸 방에 하나하나 넣어줌)
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr3 = arr1;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }

    public void Third02() {
        //int [] intArray = null;
        //intArray[0] = 10;
        //String str = null;
        //System.out.println("총문자수 :"+str.length());
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = "kind1";
        kind1 = null;
        System.out.println("Kind2:" + kind2);
    }

    public void Third03() {
        //문자열 비교
        String strVar = "홍길동";
        String strVar1 = "홍길동";

        if (strVar == strVar1) {
            System.out.println("strvar과 strvar1는 참조가 같음");
        } else {
            System.out.println("strvar과 strvar1는 참조가 같음");
        }
        if (strVar.equals(strVar1)) {
            System.out.println("strvar과 strvar1는 문자열이 같음");
        }
        String strVar2 = new String("홍길동");
        String strVar3 = new String("홍길동");

        if (strVar2 == strVar3) {
            System.out.println("strvar2과 strvar3는 참조가 같음");
        } else {
            System.out.println("strva2과 strvar3는 참조가 다름");
        }
        if (strVar2.equals(strVar3)) {
            System.out.println("strvar2과 strvar3는 문자열이 같음");
        }
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 string 객체는 빈 문자열");
        }
    }

    public void Third04() {
        //문자추출
        String ssn = "961234567890268";
        char sex = ssn.charAt(7);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다");
                break;
        }
    }

    public void Third05() {
        //문자열길이
        String ssn = "681023456789651";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다");
        }
    }

    public void Third06() {
        //문자열대체
        String old = "자바 무자열은 불변입니다. 자바 문자열은 String입니다";
        String newstr = old.replace("자바", "JAvA");

        System.out.println(old);
        System.out.println(newstr);
    }

    public void Third07() {
        //문자열잘라내기
        String ssn = "020709-1234567";

        String fir = ssn.substring(0, 6);
        System.out.println(fir);

        String se = ssn.substring(7);
        System.out.println(se);
    }

    public void Third08() {
        //문자열찾기
        String su = "자바 프로그래밍";

        int lo = su.indexOf("프로그래밍");
        System.out.println(lo);
        String suing = su.substring(lo);
        System.out.println(suing);

        lo = su.indexOf("자바");
        if (lo != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }

        boolean re = su.contains("자바");
        if (re) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }

    }

    public void Third09() {
        //문자열분리
        String board = "1,자바학습,참조타입 String을 학습합니다,홍길동";

        String[] tok = board.split(",");

        System.out.println("번호:" + tok[0]);
        System.out.println("제목:" + tok[1]);
        System.out.println("내용:" + tok[2]);
        System.out.println("성몀:" + tok[3]);
        System.out.println();

        for (int i = 0; i < tok.length; i++) {
            System.out.println(tok[i]);
        }

    }

    public void Third10() {
        //값 목록으로 배열 생성
        int[] scores;
        scores = new int[]{83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합:" + sum1);

        printItem(new int[]{83, 90, 87});

    }

    public void printItem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]:" + scores[i]);
        }
    }

    public void Third11() {
        //new 연산자로 배열 생성
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "]:" + arr1[i] + ",");
        }
        System.out.println();

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "]:" + arr1[i] + ",");
        }
        System.out.println();

        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "]:" + arr2[i] + ",");
        }
        System.out.println();

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "]:" + arr2[i] + ",");
        }
        System.out.println("\n");

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "]:" + arr3[i] + ",");
        }
        System.out.println();

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "]:" + arr3[i] + ",");
        }

    }

    public void Third12() {
        //배열길이
        int[] scores = {84, 89, 53};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

        }
        System.out.println("총합:" + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균:" + avg);
    }

    public void Third13() {
        //다차원 배열 (값 목록으로 생성)
        int[][] sc = {
                {78, 79, 97},
                {90, 100}
        };
        System.out.println("1차원 배열 길이(반의 수):" + sc.length);
        System.out.println("2차원 배열 길이(첫 번재 반의 학생수):" + sc[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생수):" + sc[1].length);

        System.out.println("sc:" + sc[0][2]);
        System.out.println("sc:" + sc[1][1]);

        int classS = 0;
        for (int i = 0; i < sc[0].length; i++) {
            classS += sc[0][1];
        }
        double classA = (double) classS / sc[0].length;
        System.out.println("첫번째 반의 평균 점수:" + classA);


        int classS2 = 0;
        for (int i = 0; i < sc[1].length; i++) {
            classS2 += sc[1][i];
        }
        double classA2 = (double) classS2 / sc[1].length;
        System.out.println("첫번째 반의 평균 점수:" + classA2);

        int to = 0;
        int toS = 0;
        for (int i = 0; i < sc.length; i++) {
            to += sc[i].length;
            for (int k = 0; k < sc[i].length; k++) {
                toS += sc[i][k];
            }
        }
        double toA = (double) toS / to;
        System.out.println("전체 학생의 평균 점수:" + toA);
    }

    public void Third14() {
        //다차원 배열 (new 연산자로 다차원 배열 생성)
        int[][] math = new int[2][3];

        for (int i = 0; i < math.length; i++) {
            for (int k = 0; k < math[i].length; k++) {
                System.out.println("math[" + i + "]" + "[" + k + "]:" + math[i][k]);
            }
        }
        System.out.println();

        math[0][0] = 80;
        math[0][1] = 65;
        math[0][2] = 56;
        math[1][0] = 86;
        math[1][1] = 879;
        math[1][2] = 97;

        int totaS = 0;
        int totaM = 0;
        for (int i = 0; i < math.length; i++) {
            totaS += math[i].length;
            for (int k = 0; k < math[i].length; k++) {
                totaM += math[i][k];
            }
        }
        double totaMA = (double) totaM / totaS;
        System.out.println("전체 학생의 수학 평균 점수:" + totaMA);
        System.out.println();

        int[][] eng = new int[2][];
        eng[0] = new int[2];
        eng[1] = new int[3];
        for (int i = 0; i < eng.length; i++) {
            for (int k = 0; k < eng[i].length; k++) {
                System.out.println("eng[" + i + "]" + "[" + k + "]:" + eng[i][k]);
            }
        }
        System.out.println();
        eng[0][0] = 99;
        eng[0][1] = 87;
        eng[1][0] = 34;
        eng[1][1] = 67;
        eng[1][2] = 97;
        totaS = 0;
        int totaE = 0;
        for (int i = 0; i < eng.length; i++) {
            totaS += eng[i].length;
            for (int k = 0; k < eng[i].length; k++) {
                totaE += eng[i][k];
            }
        }
        double totaEA = (double) totaE / totaS;
        System.out.println("전채 학생의 영어 평균 점수: " + totaEA);
    }

    public void Third15() {
        boolean[] boolArray = new boolean[10];
        for (int i = 0; i < boolArray.length; i++) {
            if (i % 2 == 0) {
                boolArray[i] = true;
            }
        }
        for (int i = 0; i < boolArray.length; i++) {
            System.out.printf("%s ", boolArray[i]);
        }
        System.out.println();
    }

    public void Third15_1() {
        // 1-1 : 30개의 int 형 배열을 선언하고 모든 원소의 값을 인덱스 번호로 대입하세요.
        int[] arrff = new int[30];
        for (int i = 0; i < arrff.length; i++) {
            System.out.println("인덱스번호 :" + i); //
        }
    }

    public void Third15_2() {
        char[] charr = new char[20];
        for (int i = 0; i < charr.length; i++) {
            System.out.println(i + "길이는:" + charr[i]);
        }
    }

    public void Third15_3() {
        boolean[][] booleans = new boolean[3][4];
        for (int i = 0; i < booleans.length; i++) {
            for (int k = 0; k < booleans[i].length; k++) {
                booleans[i][k] = true;
                System.out.println(booleans[i][k]);
            }
        }

    }

    public void Third15_4() {
        String[] a = new String[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = "empty";
            System.out.println(a[i]);
        }
    }

    public void Third16() {
        int ze = 0;
        int en = 0;
        int[][] intDementiom2 = {
                {1, 0, 1, 0, 0, 1}
                , {1, 0, 1, 1, 0, 1}
                , {0, 1, 0, 1, 0, 0}
                , {1, 0, 0, 1, 0, 1}
                , {1, 0, 1, 0, 0, 1}
        };
        for (int i = 0; i < intDementiom2.length; i++) {
            //1차원 배열을 순환
            for (int k = 0; k < intDementiom2[i].length; k++) {
                //2차원배열
                if (intDementiom2[i][k] == 1) {
                    en++; // 1의 개수 증가
                } else if (intDementiom2[i][k] == 0) {
                    ze++; // 0의 개수 증가
                }
            }
        }

        System.out.println("0의 갯수는" + ze + "개" + ", 1의 갯수는" + en + "개");
    }

    public void Third17() {
        char[][] chInput = {
                {'*', ' ', '*', '*', ' '}
                , {'*', '*', ' ', ' ', ' '}
                , {'*', ' ', '*', ' ', '*'}
                , {' ', '*', '*', ' ', '*'}
                , {'*', ' ', '*', ' ', '*'}
                , {' ', ' ', '*', '*', '*'}

        };

        char[][] chOutput = new char[chInput[0].length][chInput.length];
        for (int i = 0; i < chInput.length; i++) {
            for (int k = 0; k < chInput[i].length; k++) {
                chOutput[k][i] = chInput[i][k];
            }
        }

        for (int i = 0; i < chOutput.length; i++) {
            for (int k = 0; k < chOutput[i].length; k++) {
                System.out.print(chOutput[i][k]);
            }
            System.out.println();
        }
    }

    public void Third18() {
        double[] dArray = new double[25];
        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = Math.random() * 100;
            System.out.println("배열의 값: " + dArray[i]);
        }
    }

    public void Third19() {
        double[] dArray = new double[25];
        int[] nArray = new int[25];
        int sum = 0;
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = (int) dArray[i];

            sum += nArray[i];
        }

        System.out.println("총합: " + sum);

        double average = (double) sum / nArray.length;
        System.out.println("평균: " + average);
    }
    public void Third20(){
        String[] strings = new String[25];
        double[] dArray = new double[25];
        int[] nArray = new int[25];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = dArray[i] + " => " + nArray[i];
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
    public void Third21(){
        
    }
}

//    public String runFifth04(String s) {
//        if ( s ==  null ) {
//            // 매개변수에 null 이 오면 NullPointException 예외가 발생한다.  try ~ catch 방어코드
//            // 예외를 방어코드로 처리했다.
//            return "";
//        }
//        return s.substring(0, 1);
//    }
//
//    public void runTest() {
//        String a = "홍길동";
//        String b = new String("홍길동");
//        System.out.println("a.hashCode() : " + a.hashCode());
//        System.out.println("b.hashCode() : " + b.hashCode());
//        boolean b1 = a == b;
//        System.out.println("a == b : " + b1);
//
//        for ( int i = 0; i < a.length(); i++ ) {
//            char ch = a.charAt(i);
//            System.out.println("ch = " + ch);
//        }
//
//        String str1 = "I am a Boy, 홍길동, 안녕 Z";
//        String str2 = str1.replace("a", "A");
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);
//        String str3 = str1.substring(2, 4);
//        System.out.println("str1 = " + str1);
//        System.out.println("str3 = " + str3);
//        int ndx1 = str1.indexOf("Z1");
//        System.out.println("ndx1 = " + ndx1);
//        String[] arr1 = str1.split(",");
//        for ( String aItem : arr1 ) {
//            System.out.println("aItem = " + aItem);
//        }
//    }
//
//    public void runArray() {
//        // for 문을 *, **, ***, ****, *****
//        String[] line = {"*", "**", "***", "****", "*****"};
//        for ( String item : line ) {
//            System.out.println(item);
//        }
//
//        char[][] lines = new char[5][];
////		lines[0] = new char[1];
////		lines[1] = new char[2];
////		lines[2] = new char[3];
////		lines[3] = new char[4];
////		lines[4] = new char[5];
//        for ( int i = 0; i < lines.length; i++ ) {
//            lines[i] = new char[i+1];
//            for ( int j = 0; j < lines[i].length; j++ ) {
//                lines[i][j] = '*';
//            }
//        }
//        for ( int i = 0; i < lines.length; i++ ) {
//            for ( int j = 0; j < lines[i].length; j++ ) {
//                System.out.printf("%c", lines[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    public void acmicpcNet_problem_10818() {
//        int[] count = this.getIntArrayFromScanner("처리할 갯수를 입력", 1);
//        if ( count == null || count.length <= 0 || count[0] == 0 ) {
//            return;
//        }
//
//        int[] intArray = this.getIntArrayFromScanner("3 -1 5..., 이런식으로 공백으로 숫자를 띄워서 입력", count[0]);
//        if ( intArray == null || intArray.length <= 0 ) {
//            return;
//        }
//        int[] resArray = this.findMinMax(intArray);
//        System.out.printf("acmicpcNet_problem_10818 = %d, %d\n", resArray[0], resArray[1]);
//    }
//
//    private int[] findMinMax( int[] intArray ) {
//        int[] arrResult = {Integer.MAX_VALUE, Integer.MIN_VALUE};
//        for ( int number : intArray ) {
//            if ( number < arrResult[0] ) {
//                // 최솟값 구하기
//                arrResult[0] = number;
//            }
//            if ( arrResult[1] < number ) {
//                // 최댓값 구하기
//                arrResult[1] = number;
//            }
//        }
//        return arrResult;
//    }
//
//    private int[] getIntArrayFromScanner(String title, int length) {
//        System.out.printf("%s : ", title);
//        Scanner scanner = new Scanner(System.in);
//
//        int[] nResult = new int[length];
//        int number = 0;
//        String sInput = scanner.nextLine();
//        try {
//            String[] arrItem = sInput.split(" ");
//            for ( int i = 0, j = 0; i < nResult.length && j < arrItem.length; i++, j++ ) {
//                nResult[i] = Integer.parseInt(arrItem[j]);
//            }
//            int j = 0;  // 예외가 발생하면 다음 문장을 실행 안하고 catch 블록으로 이동한다.
//            j = 10 + j;
//            // try 블록은 예외가 발생할수도 있는 문장을 try 블록으로 감싸는 역할을 한다.
//        } catch (Exception e1) {
//            // try 블록에서 예외가 발생되면 catch (예외클래스 객체이름) 블록으로 자동 실행된다.
//            System.err.println(e1.getMessage() + ": 숫자 값을 입력하세요 !");
//            nResult = null;
//        }
//        // 키보드 입력으로 정수형 문자열 입력받아서 정수로 변환하고 리턴
//        return nResult;
//    }




