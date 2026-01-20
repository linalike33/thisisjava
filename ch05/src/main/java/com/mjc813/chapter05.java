package com.mjc813;

public class chapter05 {
    public static void Third01() {
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

    public static void Third02() {
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

    public static void Third03() {
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

    public static void Third04() {
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

    public static void Third05() {
        //문자열길이
        String ssn = "681023456789651";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다");
        }
    }

    public static void Third06() {
        //문자열대체
        String old = "자바 무자열은 불변입니다. 자바 문자열은 String입니다";
        String newstr = old.replace("자바", "JAvA");

        System.out.println(old);
        System.out.println(newstr);
    }

    public static void Third07() {
        //문자열잘라내기
        String ssn = "020709-1234567";

        String fir = ssn.substring(0, 6);
        System.out.println(fir);

        String se = ssn.substring(7);
        System.out.println(se);
    }

    public static void Third08() {
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

    public static void Third09() {
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

    public static void Third10() {
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

    public static void printItem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]:" + scores[i]);
        }
    }

    public static void Third11() {
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

    public static void Third12() {
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

    public static void Third13() {
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

    public static void Third14() {
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
            for (int k = 0; k < math[i].length; k++) {
                System.out.println("engf[" + i + "]" + "[" + k + "]:" + eng[i][k]);
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
}
