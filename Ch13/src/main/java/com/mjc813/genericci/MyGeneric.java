package com.mjc813.genericci;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class MyGeneric<K, V> implements MyInterface<K,V> {
    private Map<K, V> map = new HashMap<>();

    @Override
    public void m1(K key, V value) {// 추가/수정
      map.put(key,value);
    }

    @Override
    public V m2(K key) {  // 가져오기
        return map.get(key);
    }

    @Override
    public void m3(K key) {// 삭제
        map.remove(key);
    }

    @Override
    public int m4() {// 개수
        return map.size();
    }

    @Override
    public void m5(K key1, K key2) {// 교환
        if(map.containsKey(key1)&& map.containsKey(key2)){
            V temp = map.get(key1);
            map.put(key1, map.get(key2));
            map.put(key2,temp);
        }

    }
}