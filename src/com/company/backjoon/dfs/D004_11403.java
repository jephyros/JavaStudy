package com.company.backjoon.dfs;

import java.util.ArrayList;

/**
 * @author InSeok
 * Date : 2019-12-06
 * Remark : https://www.acmicpc.net/problem/11403  경로 찾기
 */
public class D004_11403 {
    public static void main(String[] args) {
        int matrixSize = 3;
        //인접행열저장을위한 Arraylist
        ArrayList<Integer>[] amatrix = new ArrayList[matrixSize];

        int[][] data = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 0, 0}};

        fnMakeAMarix(matrixSize, data, amatrix);

    }

    private static void fnMakeAMarix(int matrixSize, int[][] data, ArrayList<Integer>[] amatrix) {
        for (int i = 0; i < matrixSize; i++) {

        }
    }
}
