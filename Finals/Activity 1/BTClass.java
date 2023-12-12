public class BTClass {
    BTNode root;

    public BTClass() {
        root = null;
    }

    public BTClass(BTNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inorder(BTNode root) {
        if (root != null) {
            inorder(root.Llink);
            System.out.println("\t" + root.info);
            inorder(root.Rlink);
        }
    }

    public void preorder(BTNode root) {
        if (root != null) {
            System.out.println("\t" + root.info);
            preorder(root.Llink);
            preorder(root.Rlink);
        }
    }

    public void postorder(BTNode root) {
        if (root != null) {
            postorder(root.Llink);
            postorder(root.Rlink);
            System.out.println("\t" + root.info);
        }
    }

}
