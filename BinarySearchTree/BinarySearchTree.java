package p1;

public class BinarySearchTree {
	public static Node root;
	public BinarySearchTree(){
		BinarySearchTree.root= null;
	}
	public boolean find(int id){                         // find method
		Node current = root;
		while(current != null){
			if(current.data == id)
				return true;
			else if(current.data > id){
				current = current.left;	
			}
			else {
				current = current.right;
			}
		}
		return false;
	}
	
	
	
		public void insert(int id){                      // insert method
			Node newNode = new Node(id);
			if (root == null){
				root = newNode;
				return;
			}
			Node current = root;
			Node parent = null;
		
			while(true){
				parent = current;
				if(id < current.data ){
					current = current.left;
					if(current == null){
					   parent.left = newNode;
					   return;
					}
				}
				else {
					current = current.right;
					if (current == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}		
		
	public void display(Node root){                              // display method
		if(root!= null){
			display(root.left);
			System.out.println(" "+ root.data);
			display(root.right);
		}
	}
	
	public boolean delete(int id){                              // delete method
		Node current = root;
		Node parent = root;	
		Boolean isLeftChild= false;
		while (current.data!= id){
		  parent = current;
		  if(current.data> id){
			  isLeftChild = true;
			  current = current.left;
		  }
		  else{
			  isLeftChild = false;
			  current = current.right;
		  }
		  if (current == null){
			  return false;
		  }
		}
		
		                                                       //case 1: when delete node has no children
		if((current.left== null) &&(current.right== null) ){
			if(current == root){
		       root =null;
		    }
		    if (isLeftChild==true){
		    	parent.left= null;
		    }
		    else{
		    	parent.right = null;
		    }
		}
		                                                       //case 2:when node to be deleted has only one child
	    else if(current.right == null){
	    	if(current == root){
	    		root = current.left;
	    	}
	    	else if(isLeftChild){
	    		parent.left= current.left;
	    	}
	    	else{
	    		parent.right= current.left;
	    	}
	    }else if(current.left== null){
	    	if(current == root){
	    		root = current.right;
	    	}
	    	else if(isLeftChild){
	    		parent.left= current.right;
	    	}
	    	else{
	    		parent.right= current.right;
	    	}
	    }else if((current.left!= null) &&(current.right!= null) ){
	    	                                                    //we found the successor of node
	    	
	    	Node successor = getSuccesor(current);
	    	if(current == root){
	    		root = successor;
	    	}else if (isLeftChild){
	    		parent.left = successor;
	    		
	    	}else{
	    		parent.right = successor;
	    	}
	    	successor.left = current.left;
	    	
	    }return true;

      
}
	                                     // deleted node must be replaced with smallest node of right subtree
	public Node getSuccesor(Node deleteNode){                        // get successor method
		Node successor = null;
		Node parentsuccessor = null;
		Node current = deleteNode.right;
		while(current!=null){
			parentsuccessor= successor;
			successor = current; 
			current= current.left;
		}
	    if (successor!= deleteNode.right){
	    	parentsuccessor.left = successor.right;	
	    	successor.right = deleteNode.right;
	    }
		return successor;
					
		}
	   	
	}
	
	
		
		

		
		
	

	
	
	
	
	
