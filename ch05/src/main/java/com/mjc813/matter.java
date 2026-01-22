package com.mjc813;

import java.util.Scanner;

public class matter {
    public void p6(){
        int[][] array = {
                {95,86}
                ,{86,78,100}
                ,{77,88,99}
        };
        System.out.println(array.length);
        System.out.println(array[2].length);
    }
    public void p7(){
        //주어진 배열 항목에서 최대값을 출력하는 코드
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            System.out.println(max);
        }
    }
    public void p8(){
        int sum = 0;
        int [] [] arr = {
                {95,86}
                ,{86,78,100}
                ,{77,88,99}
        };
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; i++) {
                sum += arr[i][j];
            }
        }
        System.out.println("총합: "+ sum);

        double avg = (double) sum / arr.length;
        System.out.println(avg);
    }
    public void p9(){
        Scanner scanner = new Scanner(System.in);
        boolean st = true;
        int pa = 0;
        int[] scores = null;
        while (st) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.println("선택>");

            String strN = scanner.nextLine();

            if (strN.equals("1")) {
                System.out.println("학생수");
                int ppp = Integer.parseInt(scanner.nextLine());
                scores = new int[ppp];
            } else if (strN.equals("2")) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            } else if (strN.equals("3")) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            } else if (strN.equals("4")) {
                int max = 0;
                int sum = 0;
                double avg = 0;

                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }

                avg = (double) sum / scores.length; // 평균 계산

                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            }else if (strN.equals("5")){
                st = false;
            }

        }
    }

}
