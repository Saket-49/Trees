package basicsOfTrees;

import java.util.Scanner;

public class implementationBT {
    static class BinaryTree {
        public BinaryTree(){

        }
        private class Node{
            int value;
            Node left;
            Node right;

            public Node(int value){
                this.value = value;
            }
        
        }
        private Node root;

        public void insert(Scanner sc){
            System.out.println("Enter the value of the root node");
            int value = sc.nextInt();
            root = new Node(value);
            populate(root, sc);
        }
        public void populate(Node node, Scanner sc){
            System.out.println("would you like to enter left to the node: "+ node.value+ " true / false ?");
            boolean leftBool = sc.nextBoolean();
            if(leftBool){
                System.out.println("Enter the value you want at the left of the node "+ node.value);
                int value = sc.nextInt();
                node.left = new Node(value);
                populate(node.left, sc);
            }
            System.out.println("would you like to enter right to the node: \"+ node.value+ \" true / false ?");
            boolean rightBool = sc.nextBoolean();

            if(rightBool){
                System.out.println("Enter the value you want at the right of the node "+ node.value);
                int value = sc.nextInt();
                node.right = new Node(value);
                populate(node.right, sc);
            }

        }
        public void display(Node node, String indent) {
        if (node == null) return;
        System.out.println(indent + node.value);
        display(node.left, indent + "  ");
        display(node.right, indent + "  ");
    }

    public void displayTree() {
        display(root, "");
    }

   
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(sc);
        sc.close();
        tree.displayTree();
    }
}
