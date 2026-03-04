package org.example;

public class Button {
    @FunctionalInterface
    public static interface ClickListener{
        void onClick(); //on버튼이 눌렷을때 작동되는 동작의 이름표
    }
    private ClickListener clickListener; //외부에서 받아온 실행할동작을 저장

    //외부에서 버튼을 눌렀을 경우 실행
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }
    //사용자가 버튼을 딸깍! 하고 누르는 행위를 시뮬레이션한
    public void click(){
        this.clickListener.onClick();
    }
}
