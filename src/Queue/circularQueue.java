package Queue;

public class circularQueue {
  static class Queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;
    Queue(int n){
      arr=new int[n];
      size=n;
      rear=-1;
      front=-1;
    }
    static boolean isEmpty(){
      return rear==-1 && front==-1;
    }
    static boolean isFull(){
      return (rear+1)%size==front;
    }
    public static void add(int data){
      if(isFull()){
        System.out.println("full");
        return;
      }
      if(front==-1){
        front=0;
      }
      rear=(rear+1)%size;
      arr[rear]=data;
    }
    public static int remove(){  //o(1)
      if(rear==-1){return -1;
      }
     int res=arr[front];
      front=(front+1)%size;
      //last el delete
      if(rear==front){
        rear=front=-1;
      }

      return res;
    }
    public static int peek(){
      return arr[front];
    }
  }

    public static void main(String[] args) {
      Queue q=new Queue(3);
      q.add(1);
      q.add(2);
      q.add(3);
      System.out.println(q.remove());
      q.add(4);
      System.out.println(q.remove());
      q.add(5);
    }
}
