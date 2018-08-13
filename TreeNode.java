
public class TreeNode {
	private int item;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int newitem) {
		item = newitem;
		left = null;
		right = null;
	}
	
	public TreeNode(int newItem, TreeNode newLeft, TreeNode newRight){
		item = newItem;		
	}
	
	public int getItem() {
		return item;
	}
	
	public void setItem(int newItem) {
		item = newItem;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	public void setLeft(TreeNode newLeft) {
		left = newLeft;
	}
	
	public void setRight(TreeNode newRight) {
		right = newRight;
	}
	
}
