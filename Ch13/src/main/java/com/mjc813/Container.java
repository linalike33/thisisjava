package com.mjc813;

//public class Container<T>{
//    //확인문제 02번
//   private T t;
//   public T get(){
//       return t;
//   }
//   public void set(T t){
//       this.t = t;
//   }
//
//}
//연습문제 03번
public class Container<K, V>{
    private K Key;
    private V value;

    public void set(K key, V value){
        this.Key = key;
        this.value = value;
    }
    public K getKey(){
        return this.Key;
    }
    public V getValue(){
        return this.value;
    }

}
