
public class BinaryTree {
	private TreeNode root;
	private int size;
	
	public BinaryTree() {
		root=null;
	}
	
	public void startInorder() {
		inorder(root);
	}
	
	public void inorder(TreeNode r) {
		if(r!=null) {
			inorder(r.getLeft());
			System.out.print(r.getItem()+ " ");
			inorder(r.getRight());
		}
	}
	
	public void startPreorder() {
		preorder(root);
	}
	
	
	public void preorder(TreeNode r) {
		if(r!=null) {
			System.out.print(r.getItem()+ " ");
			preorder(r.getLeft());
			preorder(r.getRight());			
		}
	}
	
	public void startPostorder() {
		Postorder(root);
	}
	
	public void Postorder(TreeNode r) {
		if(r!=null) {
			preorder(r.getLeft());
			preorder(r.getRight());
			System.out.print(r.getItem()+ " ");
		}
	}
	
	
	public void destroyTree() {
		root=null;
	}

	
	public void startSearch(int x) {
		System.out.println(search(x, root));
		
	}
	
	public String search(int x, TreeNode t) {
		if(t!=null) {
			if(x == t.getItem()) return "found";
			else if(x < t.getItem()) return search(x, t.getLeft());
			else return search(x, t.getRight());
		}
		else return "not found"; //not found
	}
	
	public void startInsert(int x) {
		size++;
		root= insert(x,root);
	}
	
	public TreeNode insert (int x, TreeNode t) {
		if(t==null) {
			return new TreeNode(x, null,null);
		}
		else if(x<t.getItem()) {
			t.setLeft(insert(x, t.getLeft()));
			return t;
		}
			else {
				t.setRight(insert(x,t.getRight()));
				return t;	
			}
	}
	
	public void startDepth() {
		System.out.print(maxDepth(root));
	}
	
    public int maxDepth(TreeNode node) 
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.getLeft());
            int rDepth = maxDepth(node.getRight());
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
	
	public int sizeCheck() {
		return size;
	}
	
	public int getHeight() {
		return 0;
	}
	
	public void startDelete (int x) {
		size--;
		delete(x, root);
	}
	public TreeNode delete(int x, TreeNode t) {
		if(t==null) {
			System.out.println("Error" + x + "not found");
			return null;
		}
		else if(t.getItem()==x) {
			if(t.getLeft()==null) {
				return t.getRight();
			}
			else if (t.getRight()==null) {
				return t.getLeft();
			}
			
			else {
				TreeNode temp = t.getRight();
				while(temp.getLeft()!=null) { 
					temp = temp.getLeft();
				}
				t.setItem(temp.getItem());
				t.setRight(delete(temp.getItem(), t.getRight()));
				return t;
			}
		}
		else {
			if(x<t.getItem()) {
				t.setLeft(delete(x, t.getLeft()));
				return t;
			}
			else {
				t.setRight(delete(x, t.getRight()));
				return t;
			}
		}	
	}
}
