package p1;

public class Node {
     int data;
     Node left;
     Node right;
     
     //Node constructor
    public  Node(int data) {
    	this.data= data;
    	left= null;
    	right = null;
    }
    
    public static void main(String[] args){
    	BinarySearchTree b = new BinarySearchTree();
    	b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
      	System.out.println(b.find(9));
    	System.out.println(b.find(0));
    	b.display(BinarySearchTree.root);	
    	System.out.println("Check whether Node with value 4 exists : " + b.find(4));
    	b.delete(2);	
    	b.display(BinarySearchTree.root);	
    	
		
    }
    
}
