package review.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    void insert(int value) {
        TNode newNode = new TNode(value);
        if(root == null) {
            root = newNode;
            return;
        }
        TNode current = root;

        while(true) {
            if(value < current.value) {
                if(current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if(current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }
    //Depth-first traversal
    //pre-order: root, left, right
    void preOrderTraversal(TNode root) {
        if(root == null) return;
        System.out.println(root.value + ",");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    //in-order - left, root, right
    void inOrderTraversal(TNode root) {
        if(root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.value +",");
        inOrderTraversal(root.rightChild);
    }
    //post-order - left, right, root
    void postOrderTraversal(TNode root) {
        if(root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value + ",");
    }

    //Breadth-first traversal
    //level-order
    void levelOrderTraversal(TNode root) {
        if(root == null) return;

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.println(toVisit.value + "'");
            if(toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild != null) queue.add(toVisit.rightChild);

        }




    }



}
