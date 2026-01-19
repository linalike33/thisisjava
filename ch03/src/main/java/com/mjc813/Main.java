package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
        Chapter03 v = new Chapter03();
        v.Third01();
        v.Third02();
        v.Third03();
        v.Third04();
        v.Third05();
        v.Third06();
        v.Third07();
        v.Third08();
        v.Third09();
        v.Third010();
        v.Third011();


        Chapter03 solver = new Chapter03();
        System.out.printf("2x + 8 = 0 의 해, x 는 %d%n", solver.equationFirst(2, 8));
        System.out.printf("5x - 30 = 0 의 해, x 는 %d%n", solver.equationFirst(5, -30));
        System.out.printf("7x + 49 = 0 의 해, x 는 %d%n", solver.equationFirst(7, 49));
        Matter v1 = new Matter();
        v1.matter01();
        v1.matter02();
        v1.matter03();
        v1.matter04();
        v1.matter05();
        v1.matter06();
        v1.matter07();
    }

}