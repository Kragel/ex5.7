/* Create a class without a constructor, and then create an object of that
class in main( ) to verify that the default constructor is automatically synthesized. */
package com.company;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
