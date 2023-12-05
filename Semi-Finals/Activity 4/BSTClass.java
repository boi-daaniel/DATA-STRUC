public class BSTClass extends BTClass {
    BTNode root;

    public BSTClass() {
        super();
    }

    public BSTClass(BTNode root) {
        super(root);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean search(int value) {
        return searchValue(root, value);
    }

    private boolean searchValue(BTNode root, int value) {
        if (root == null) {
            return false;
        } else if (root.info == value) {
            return true;
        } else if (value < root.info) {
            return searchValue(root.Llink, value);
        } else {
            return searchValue(root.Rlink, value);
        }
    }

    public int getNodeCount() {
        return countNodes(root);
    }

    private int countNodes(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.Llink) + countNodes(root.Rlink);
    }

    public int height() {
        return calculateHeight(root);
    }

    private int calculateHeight(BTNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = calculateHeight(root.Llink);
        int rightHeight = calculateHeight(root.Rlink);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void insertNode(int insertItem) {
        BTNode newNode = new BTNode();
        newNode.info = insertItem;
        newNode.Llink = null;
        newNode.Rlink = null;

        BTNode current;
        BTNode trailCurrent = null;

        if (root == null) {
            root = newNode;
        } else {
            current = root;
            while (current != null) {
                trailCurrent = current;
                if (insertItem == current.info) {
                    System.out.println("Item already exists.");
                    return;
                } else if (insertItem < current.info) {
                    current = current.Llink;
                } else {
                    current = current.Rlink;
                }
            }

            if (insertItem < trailCurrent.info) {
                trailCurrent.Llink = newNode;
            } else {
                trailCurrent.Rlink = newNode;
            }
        }
    }
}
