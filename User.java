import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner in=new Scanner(new File("prog4in3.txt")); //grabs file from file Java project folder
		int size=in.nextInt(); //Uses the first int in the txt file to get the number of items to be added to the array
		int i;
		BinaryTree Tree;
		Tree = new BinaryTree();
		int[] array = new int[size];
		
		for(i=0;i<size;i++) {
			array[i]=in.nextInt(); //Creates an array of the ints from the file
			Tree.startInsert(array[i]); //inserts the items from the array into the Tree
		}

		System.out.print("size:"+ Tree.sizeCheck() + " height:" ); Tree.startDepth(); //Prints the size and starting depth of the tree
		System.out.print("\nPreorder: "); Tree.startPreorder();//Prints Preorder 
		System.out.print("\nInorder:");  Tree.startInorder();  //Prints Inorder
		System.out.print("\nPostorder:");  Tree.startPostorder(); //Prints in Postorder 
		System.out.print("\n");
		
		//deletes every third element of the array from the tree. Prints the int that will be deleted and deletes the int and prints the new size and height of the tree
		for(i=0; i<size; i=i+4) {
			System.out.print("Deleting " + array[i]);
			Tree.startDelete(array[i]);
			System.out.print(" size:"+ Tree.sizeCheck() + " height:" );
			Tree.startDepth(); System.out.print("\n");
		}
		
		//Searches for every 5th value in the original array
		for(i=0; i<size; i=i+5) {
			System.out.print(array[i] + " ");
			Tree.startSearch(array[i]);
		}
		
		//prints the new orders, height and size with the values removed 
		System.out.print("Preorder:"); Tree.startPreorder();
		System.out.print("\nInorder:");  Tree.startInorder();
		System.out.print("\nPostorder:");  Tree.startPostorder();
		System.out.print("\n");
		System.out.print("size:"+ Tree.sizeCheck() + " height:" ); Tree.startDepth();
	}
}
