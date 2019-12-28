package com.company.backjoon.A1912;

import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2019-12-28
 * Remark : https://www.acmicpc.net/problem/1931  회의실 배정
 */
public class D028_1931 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        TimeData[] data = new TimeData[n];

        for (int i = 0; i < n; i++) {
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            data[i] = new TimeData(i1, i2);
        }

//        for (TimeData timeData:data) {
//            System.out.println(timeData);
//        }
        //끝나는시간으로 정렬
        Arrays.sort(data);

        int resultcnt = 0;
        int pretime = 0;
        for (TimeData v : data) {
            if (v.x >= pretime) {
                pretime = v.y;
                resultcnt += 1;

            }
        }
        System.out.println(resultcnt);

    }


}

class TimeData implements Comparable<TimeData> {

    public int x; //시작시간
    public int y; //종료시간

    public TimeData(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "TimeData{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(TimeData timeData) {
        if (this.y < timeData.y) {
            return -1;
        } else if (this.y == timeData.y) {
            if(this.x < timeData.x)
                return -1;
            else
                return 0;
        } else {
            return 1;
        }

    }
}
