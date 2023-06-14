package com.company.backjoon.algorithm;
import java.util.*;

public class AhoCorasickNode {
    private static final int ALPHABET_SIZE = 26;
    private static final char FIRST_CHAR = 'a';

    private boolean isWord;
    public AhoCorasickNode[] children;
    private AhoCorasickNode failureLink;
    private List<String> outputs;

    public AhoCorasickNode() {
        this.isWord = false;
        this.children = new AhoCorasickNode[ALPHABET_SIZE];
        this.failureLink = null;
        this.outputs = new ArrayList<>();
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean isWord) {
        this.isWord = isWord;
    }

    public AhoCorasickNode getChild(char c) {
        return children[c - FIRST_CHAR];
    }

    public void setChild(char c, AhoCorasickNode node) {
        children[c - FIRST_CHAR] = node;
    }

    public AhoCorasickNode getFailureLink() {
        return failureLink;
    }

    public void setFailureLink(AhoCorasickNode failureLink) {
        this.failureLink = failureLink;
    }

    public List<String> getOutputs() {
        return outputs;
    }

    public void addOutput(String output) {
        outputs.add(output);
    }
}
