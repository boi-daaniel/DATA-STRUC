public class TestBSTClass {
    public static void main(String[] args) {
        BSTClass bst = new BSTClass();
        bst.insertNode(10);
        bst.insertNode(12);
        bst.insertNode(8);
        bst.insertNode(7);
        bst.insertNode(9);

        bst.inorder(bst.root);
        bst.preorder(bst.root);
    }
}
