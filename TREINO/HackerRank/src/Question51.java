package parte2;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Question51{

	public static int getHeight(Node root){
      //Write your code here
		int heightLeft = 0;
		int heightRight = 0;
		if(root.left != null) {
			heightLeft = getHeight(root.left) + 1;
		}
		if(root.right != null) {
			heightRight = getHeight(root.right) + 1;
		}
		return (heightLeft > heightRight ? heightLeft : heightRight);
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
/*
                    Task
The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. 
You are given a pointer, root, pointing to the root of a binary search tree. Complete the getHeight function 
provided in your editor so that it returns the height of the binary search tree.
                    Input Format
The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
The first line contains an integer, n, denoting the number of nodes in the tree.
Each of the n subsequent lines contains an integer, data, denoting the value of an element that must be added 
to the BST.
                    Output Format
The locked stub code in your editor will print the integer returned by your getHeight function denoting the 
height of the BST.
                    Sample Input
7
3
5
2
1
4
6
7
                    Sample Output
3
                    Explanation
The input forms the following BST:
                03
               /  \
             02    05
             /    /  \
            01   04  06
                       \
                       07   
The longest root-to-leaf path is shown below:
                 03
                  \
                   05
                    \
                    06
                     \
                     07
There are 4 nodes in this path that are connected by 3 edges, meaning our BST's height = 3. Thus, we print 3 as our answer.
*/