public class LinkedList {
  public static class Node{
    int data;
    Node next;
    public Node (int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
   public static Node tail;
   public static int size;

  public void addFirst(int data){
    size++;
    Node newNode = new Node(data);
    if(head==null){
      head=tail=newNode;
      return ;
    }
    newNode.next=head;
    head=newNode;
  }
  public void addLast(int data){
    size++;
    Node newNode = new Node(data);
    if(head==null){
      head=tail=newNode;
      return ;
    }
    tail.next=newNode;
    tail=newNode;


  }
  public void add(int data,int idx){
    size++;
    Node newNode =new Node(data);
    if(head==null){
      head=tail=newNode;
    }

    Node temp=head;
    int i=0;
    while (i<idx-1){
      temp=temp.next;
      i++;
    }
    newNode.next=temp;


  }
  public int removeFirst(){
    size--;
    if(head==null){
      return -1;
    }
    int val=head.data;
    head=head.next;
    return val;
  }
  public int removeLast(){
    size--;
    if(head==null){
      return -1;
    }
    int val=tail.data;
    Node prev=head;
    for (int i = 0; i < size-2; i++) {
      prev=prev.next;
    }
   prev.next =null;
    tail=prev;

    return val;
  }
  public int search(int key){
    Node temp=head;
    int i=0;
    while (temp!=null){
      if(temp.data==key){
        return i;
      }
      temp=temp.next;
      i++;
    }
    return 0;
  }
  public int helper(Node head,int key){
    if(head==null){
      return -1;
    }
    if(head.data==key) return 0;
    int idx=helper(head.next,key);
    if(idx==-1){
      return -1;
    }
    return idx+1;
  }
  public int recSearch(int key){
    return helper(head,key);
  }
  public void reverse(){
    Node prev=null;
    Node curr=head;
    Node next;
    while (curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;

  }



  public static void print(){
    Node temp=head;
    while (temp!=null){
      System.out.println( temp.data);
      temp=temp.next;
    }
  }
  public static void main(String[] args) {
   LinkedList ll=new LinkedList();
   ll.addFirst(3);
   ll.addFirst(2);
   ll.addFirst(1);
   ll.addLast(4);
   ll.addLast(5);
//   ll.removeFirst();
//    System.out.println(ll.removeLast());
//   ll.print();
//    System.out.println(ll.recSearch(2));
//   ll.search(2);
   ll.reverse();
   ll.print();
  }
}
