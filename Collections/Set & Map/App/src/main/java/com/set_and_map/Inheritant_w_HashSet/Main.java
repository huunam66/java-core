package com.set_and_map.Inheritant_w_HashSet;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        Dog chihuahua = new Chihuahua("Dog");

        System.out.println(dog.equals(chihuahua));

        System.out.println(chihuahua.equals(dog));
    }
}
