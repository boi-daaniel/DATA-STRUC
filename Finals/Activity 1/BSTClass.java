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
            return -1;
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
    
    public void deleteNode(int value) {
      root = delete(root, value);
    }

   private BTNode delete(BTNode root, int value) {
       if (root == null) {
           return root;
       }
   
       if (value < root.info) {
           root.Llink = delete(root.Llink, value);
       } else if (value > root.info) {
           root.Rlink = delete(root.Rlink, value);
       } else {
           if (root.Llink == null) {
               return root.Rlink;
           } else if (root.Rlink == null) {
               return root.Llink;
           }
   
           root.info = minValue(root.Rlink);
           root.Rlink = delete(root.Rlink, root.info);
       }
       return root;
   }

   private int minValue(BTNode root) {
       int minValue = root.info;
       while (root.Llink != null) {
           minValue = root.Llink.info;
           root = root.Llink;
       }
       return minValue;
   }

   public int leavesCount() {
       return countLeaves(root);
   }
   
   private int countLeaves(BTNode root) {
       if (root == null) {
           return 0;
       }
       if (root.Llink == null && root.Rlink == null) {
           return 1;
       }
       return countLeaves(root.Llink) + countLeaves(root.Rlink);
   }
    
}// end of class
