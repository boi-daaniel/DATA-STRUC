public class BTNode{
   int info;
   BTNode Llink;
   BTNode Rlink;
   
   public BTNode(){
      info = 0;
      Llink = null;
      Rlink = null;
   }

   public BTNode(BTNode Llink, int info, BTNode Rlink){
      this.Llink = Llink;
      this.info = info;
      this.Rlink = Rlink;
   }

}