package org.example.LambdaEx;

public class NormalUseInterface {
    public void doSome() {
        Mystring ms1 = new ClassString();
        ms1.procString("abc", 3);

        Mystring ms2 = new ClassString2();
        ms2.procString("abc", 3);
    }
}
