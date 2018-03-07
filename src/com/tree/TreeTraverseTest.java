package com.tree;

import com.graph.Graph;
import org.junit.jupiter.api.Test;

public class TreeTraverseTest {
    @Test
    public void Test(){
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre order traverse ");
        tree.printPreorder(tree.root);
        System.out.println();
        System.out.println("In order traverse ");
        tree.printInorder(tree.root);
        System.out.println();
        System.out.println("Post order traverse ");
        tree.printPostorder(tree.root);
        System.out.println();
        System.out.println("Level order traverse ");
        System.out.println("Height: "+tree.height(tree.root));
        tree.printLevel();
        System.out.println();
        System.out.println("Level order traverse via queue ");
        tree.printLevelViaQueue();
        System.out.println();
    }
}
