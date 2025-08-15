package basicsOfTrees;

import java.util.Scanner;

class BinaryTree {

    public BinaryTree(){

    }
        private static class Node{
            int value;
            Node left;
            Node right;

            public Node(int value){
                this.value = value;
            }
        }

    private Node root;

    public void insert(Scanner scanner){
        System.out.println("Enter the root node value");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root);
    }
    public void populate(Node node){
        Scanner sc = new Scanner(System.in);
        privPopulate(node, sc);
    }
    private void privPopulate(Node node, Scanner sc){
        System.out.println("Do you want to enter a value at left to "+ node.value + " true/ false ?");
        boolean leftInsert = sc.nextBoolean();
        if(leftInsert){
            System.out.println("Enter the value you want at left of the node"+ node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            privPopulate(node.left, sc);
        }
        System.out.println("Do you want to enter at right to " + node.value +" true / false ?");
        boolean rightInsert = sc.nextBoolean();
        if(rightInsert){
            System.out.println("Enter the value you want at right of the node : " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            privPopulate(node.right, sc);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(sc);
        sc.close();
        tree.displayTree();
    }
    
}
