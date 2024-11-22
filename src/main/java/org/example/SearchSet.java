package org.example;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
        this.mElements = 0;
        this.mHead = null;
    }
    public void insert(int value){
        if(mHead == null){
            this.mElements = 1;
            mHead = new BinaryTreeNode(value);
            return;
        }
        BinaryTreeNode parent = mHead;
        BinaryTreeNode current = mHead;
        while(current != null){
            parent = current;
            if(current.getValue() == value){
                return;
            }else if(current.getValue() > value){
                current = current.getLeft();
            } else{
                current = current.getRight();
            }
        }
        this.mElements++;
        if(parent.getValue() > value){
            parent.setLeft(new BinaryTreeNode(value));
        }else{
            parent.setRight(new BinaryTreeNode(value));
        }
    }

    public int getNumberElements(){
        return mElements;
    }
    public boolean contains(int value){
        BinaryTreeNode current = mHead;
        while(current != null){
            if(current.getValue() == value){
                return true;
            }else if(current.getValue() > value){
                current = current.getLeft();
            }else{
                current = current.getRight();
            }
        }
        return false;

    }


}
