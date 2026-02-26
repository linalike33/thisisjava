package com.mjc813.genericci;

public interface MyInterface <K ,V>{
    void m1(K key, V value); // 추가/수정
    V m2(K key);             // 가져오기
    void m3(K key);          // 삭제
    int m4();                // 개수
    void m5(K key1, K key2); // 교환
}
