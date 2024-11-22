package org.example;

public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode mLeft;
    private BinaryTreeNode mRight;

    public BinaryTreeNode(int value) {
        this.mValue = value;
    }

    public int getValue() {
        return this.mValue;
    }
    public void setValue(int value) {
        this.mValue = value;
    }
    public BinaryTreeNode getLeft() {
        return this.mLeft;
    }
    public BinaryTreeNode getRight() {
        return this.mRight;
    }
    public void setLeft(BinaryTreeNode left) {
        this.mLeft = left;
    }
    public void setRight(BinaryTreeNode right) {
        this.mRight = right;
    }
}
