package Queue;


public class QueueUsingLL {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {
    static Node head;
    static Node tail;

    static boolean isEmpty() {
      return head == null && tail == null;
    }

    public static void add(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }

    public static int remove() {  //o(1)
      if (isEmpty()) {
        return -1;
      }
      int res = head.data;
      if (tail == head) {
        tail = head = null;
      }
      head = head.next;
      return res;
    }

    public static int peek() {
      return head.data;
    }
  }

    public static void main(String[] args) {
      Queue q = new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      System.out.println(q.remove());
      q.add(4);
      System.out.println(q.remove());
      q.add(5);
    }

}