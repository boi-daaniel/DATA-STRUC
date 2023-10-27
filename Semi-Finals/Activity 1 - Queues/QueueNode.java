public class QueueNode{
   QueueNode previous;
   int info;
   QueueNode next;
   
   public QueueNode(QueueNode previous, int info, QueueNode next){
      this.previous = previous;
      this.info = info;
      this.next = next;
   }
}