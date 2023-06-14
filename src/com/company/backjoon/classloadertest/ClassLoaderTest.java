package com.company.backjoon.classloadertest;

/**
 * @author InSeok
 * Date : 2022-03-14
 * Remark :
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader.toString());
        System.out.println(classLoader.getParent().toString());
        System.out.println(classLoader.getParent().getParent().toString());


    }
}
