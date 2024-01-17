package Queue;

import java.util.Objects;

public class QueueUsingArray {
  static class Queue{
    static int arr[];
    static int size;
    static int rear;
    Queue(int n){
      arr=new int[n];
     size=n;
     rear=-1;
    }
    static boolean isEmpty(){
      return rear==-1;
    }
   public static void add(int data){
      if(rear==size-1){
        System.out.println("full");
      }
      rear++; //-1 ->0
      arr[rear]=data;
    }
    public static int remove(){  //o(n)
     if(rear==-1){return -1;
    }
      for (int i = 0; i < rear; i++) {
        arr[i]=arr[i+1];
      }
     int front=arr[0];
     return front;
  }
   public static int peek(){
    return arr[0];
    }
  }
    public static void main(String[] args) {
  Queue q=new Queue(5);
  q.add(1);
  q.add(2);
  q.add(3);
      System.out.println(q.peek());
      q.remove();
      System.out.println(q.peek());
  }
}
