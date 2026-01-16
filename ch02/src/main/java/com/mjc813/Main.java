package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
        Variable01 v1 = new Variable01();
        IntegerType v2 = new IntegerType();
        FDType v3 = new FDType();
        CharType v6 = new CharType();
        boolType v4 = new boolType();
        StringType v5 = new StringType();
        Promotion v7 = new Promotion();
        Casting v8 = new Casting();
        TranslateType v9 = new TranslateType();


        v1.howToUseVariable();
        v2.USeInteger();
        v3.usrFDType();
        v4.usrboolType();
        v5.usrStringType();
        v6.usrChar();
        v7.usrPromotion();
        v8.usrCasting();
        v9.useTranslate();



    }
}