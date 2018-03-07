package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root=null;
    }

    public void printPostorder(Node node){
        if(node==null) return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key+" ");
    }

    public void printPreorder(Node node){
        if(node==null) return;
        System.out.print(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printInorder(Node node){
        if(node==null) return;
        printInorder(node.left);
        System.out.print(node.key+" ");
        printInorder(node.right);
    }

    public int height(Node node){
        if(node==null){
            return 0;
        }
        else{
            int lHeight=height(node.left);
            int rHeight=height(node.right);
            if(lHeight>rHeight){
                return 1+lHeight;
            }else{
                return 1+rHeight;
            }
        }
    }

    private void printLevel(Node node, int level){
        if(node==null) return;
        if(level==1)
        {
            System.out.print(node.key+" ");
        }else{
            printLevel(node.left,level-1);
            printLevel(node.right,level-1);
        }
    }

    public void printLevel(){
        int height=height(this.root);
        for(int i=0;i<=height;i++){
            printLevel(this.root,i);
        }
    }

    public void printLevelViaQueue(){
        Queue<Node> queue=new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            Node tempNode=queue.poll();
            System.out.print(tempNode.key+" ");
            if(tempNode.left!=null){
                queue.add(tempNode.left);
            }
            if(tempNode.right!=null){
                queue.add(tempNode.right);
            }
        }

    }
}
