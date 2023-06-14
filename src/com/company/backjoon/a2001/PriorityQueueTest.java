package com.company.backjoon.a2001;

import java.util.PriorityQueue;

/**
 * @author InSeok
 * Date : 2021-08-23
 * Remark :
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Node n1 = new Node("홍길동",24);
        Node n2 = new Node("이순신",34);
        Node n3 = new Node("김좌진",25);
        pq.add(n1);
        pq.add(n2);
        pq.add(n3);

        System.out.println(pq.poll().toString());
        System.out.println(pq.poll().toString());
        System.out.println(pq.poll().toString());

    }
}

class Node implements Comparable<Node> {

    private String name;
    private int age;

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        if(this.age > o.age){
            return 1;
        } else {
            return -1;
        }

    }
}
