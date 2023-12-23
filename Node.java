
public class Node {
 private int data;
 private Node next;
  
 static Node head = null;
  
  public static void insertLast(int data){
    Node node = new Node();
    node.data = data;

    if (head == null){
      head = node;
    } else {
      Node n = head;
      while (n.next != null){
       n = n.next;
     } n.next = node;
    }
  } 
  public static void insertFirst(int data){
    Node node = new Node();
    node.data = data;
    Node temp = head;
    head = node;
    node.next = temp;
    
}
  public static void add(int position, int data){
    Node node = new Node();
    node.data = data;
    Node temp = head;
    while (temp.data != position){
      temp = temp.next;
    } Node temp1 = temp.next;
    temp.next = node;
    node.next = temp1;
  }

  public static void remove(int data){
    if (data == head.data){
      head = head.next;
    } else {
     Node temp = head;
     Node before = null;
     while (temp.data != data){
       before = temp;
       temp = temp.next;
       
     } Node after = temp.next;
       before.next = after; 
  }
}

  
  public static void show() {
    Node showNode = head;
    while (showNode.next != null){
      System.out.print(showNode.data +  "->");
      showNode = showNode.next;
    } System.out.print(showNode.data);
     System.out.println();
   }  
}
  
