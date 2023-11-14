public class BSTClass extends BTClass {
    BTNode root;

    public BSTClass(){
        super();
    }

    public BSTClass(BTNode root){
        super(root);
    }

    
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public void insertNode(int insertItem){
        BTNode newNode = new BTNode();
        newNode.Llink = null;
        newNode.info = insertItem;
        newNode.Rlink = null;

        BTNode current;
        BTNode trailcurrent = null;
        if (root == null) {
            root = newNode;
        } else {
            current = root;
            while (current != null) {
                trailcurrent = current;
                if (current.info == insertItem) {
                    System.out.println("Item already exists.");
                } else {
                    if (insertItem < current.info) {
                        current = current.Llink;
                    } else {
                        current = current.Rlink;
                    }
                }
                if (insertItem < trailcurrent.info) {
                    trailcurrent.Llink = newNode;
                } else {
                    trailcurrent.Rlink = newNode;
                }
            }
        }
    }
  
}
