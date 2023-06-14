package com.company.backjoon.efjava;

/**
 * @author InSeok
 * Date : 2021-11-30
 * Remark :
 */
public class ClothTest {
    public static void main(String[] args) {
        Cloth cloth = new Cloth.Builder()
                .name("cis")
                .type("cotton")
                .build();
        System.out.println(cloth.toString());
    }
}
