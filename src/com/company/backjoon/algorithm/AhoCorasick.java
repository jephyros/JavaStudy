package com.company.backjoon.algorithm;
import java.util.*;
public class AhoCorasick {
    private AhoCorasickNode root;

    public AhoCorasick() {
        this.root = new AhoCorasickNode();
    }

    public void addPattern(String pattern) {
        //테스트
        AhoCorasickNode current = root;
        for (char c : pattern.toCharArray()) {
            AhoCorasickNode child = current.getChild(c);
            if (child == null) {
                child = new AhoCorasickNode();
                current.setChild(c, child);
            }
            current = child;
        }
        current.setWord(true);
    }

    public void buildFailureLinks() {
        Queue<AhoCorasickNode> queue = new LinkedList<>();
        for (AhoCorasickNode child : root.children) {
            if (child != null) {
                child.setFailureLink(root);
                queue.add(child);
            }
        }
        while (!queue.isEmpty()) {
            AhoCorasickNode current = queue.poll();
            for (char c = 'a'; c <= 'z'; c++) {
                AhoCorasickNode child = current.getChild(c);
                if (child != null) {
                    queue.add(child);
                    AhoCorasickNode failureLink = current.getFailureLink();
                    while (failureLink.getChild(c) == null && failureLink != root) {
                        failureLink = failureLink.getFailureLink();
                    }
                    child.setFailureLink(failureLink.getChild(c));
                    child.getOutputs().addAll(child.getFailureLink().getOutputs());
                }
            }
        }
    }

    public List<String> search(String text) {
        List<String> matches = new ArrayList<>();
        AhoCorasickNode current = root;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            while (current.getChild(c) == null && current != root) {
                current = current.getFailureLink();
            }
            current = current.getChild(c);
            if (current == null) {
                current = root;
            }
            for (String output : current.getOutputs()) {
                matches.add(output);
            }
        }
        return matches;
    }

    public static void main(String[] args) {
        AhoCorasick ac = new AhoCorasick();
        ac.addPattern("he");
        ac.addPattern("she");
        ac.addPattern("his");
        ac.addPattern("hers");

        ac.buildFailureLinks();

        String text = "ushers";
        List<String> matches = ac.search(text);

        System.out.println("Matches in '" + text + "':");
        for (String match : matches) {
            System.out.println(match);
        }
    }
}
