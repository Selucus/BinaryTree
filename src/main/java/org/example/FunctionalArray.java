package org.example;


public class FunctionalArray {
    private BinaryTreeNode root;
    private final int size;

    public FunctionalArray(int size) {
        this.size = size;
        this.root = new BinaryTreeNode(0);
        constructionHelper(this.root, 0, size-1);
    }
    private void constructionHelper(BinaryTreeNode current, int i, int max) {
        BinaryTreeNode l = new BinaryTreeNode(0);
        BinaryTreeNode r = new BinaryTreeNode(0);
        if(i*2 + 2 <= max){
            current.setLeft(l);
            current.setRight(r);
            constructionHelper(l, i*2 + 1, max);
            constructionHelper(r, i*2 + 2, max);
        }else if(max == i * 2 + 1){
            current.setLeft(l);
            constructionHelper(r, i*2 + 2, max);
        }

    }

    public void set(int index, int value) {
        if(index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        getSetHelper(root,index+1).setValue(value);
    }
    public int get(int index){
        if(index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        return getSetHelper(root,index+1).getValue();
    }
    private BinaryTreeNode getSetHelper(BinaryTreeNode current, int i) {
        if(i == 1){
            return current;
        }else if(i % 2 == 0){
            return getSetHelper(current.getLeft(), i/2);
        }else {
            return getSetHelper(current.getRight(), i/2);
        }
    }

}
