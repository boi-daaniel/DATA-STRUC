public class BTClass {
    BTNode root;

    public BTClass(){
        root = null;
    }

    public BTClass(BTNode root){
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void inorder(BTNode root){
        if(root != null){
            inorder(root.Llink);
            System.out.println("\t" + root.info);
            inorder(root.Rlink);
        }
    }

    public void preorder(BTNode root){
        if(root != null){
            System.out.println("\t" + root.info);
            preorder(root.Llink);
            preorder(root.Rlink);
        }
    }

    public void postorder(BTNode root){
        if(root != null){
            postorder(root.Llink);
            postorder(root.Rlink);
            System.out.println("\t" + root.info);
        }
    }

    public int getHeight() {
        return calculateHeight(root);
    }

    private int calculateHeight(BTNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = calculateHeight(node.Llink);
            int rightHeight = calculateHeight(node.Rlink);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public int getNodeCount() {
        return countNodes(root);
    }

    private int countNodes(BTNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.Llink) + countNodes(node.Rlink);
        }
    }

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(BTNode node, int value) {
        if (node == null) {
            return false;
        }

        if (node.info == value) {
            return true;
        } else if (value < node.info) {
            return searchNode(node.Llink, value);
        } else {
            return searchNode(node.Rlink, value);
        }
    }
}
