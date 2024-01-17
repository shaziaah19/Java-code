package Heaps;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class PQ {

   static class Student implements Comparable<Student>{
    String name;
    int rank;

   public Student(String name,int rank){
   this.name=name;
   this.rank=rank;
    }
    @Override
    public int compareTo(Student s2){
     return this.rank-s2.rank;
    }
  }
  public static void main(String[] args) {
   PriorityQueue<Integer> pq=new PriorityQueue<>();
   pq.add(3); //O(log(n)
   pq.add(4);
   pq.add(1);
   pq.add(5);
   while (!pq.isEmpty()){
     System.out.println(pq.peek());  //O(1)
     pq.remove();   //O(logN)

//    PriorityQueue<String> pq = new PriorityQueue<>();
//    pq.add(new Student("A", 4));
//    pq.add(new Student("r", 3));
//    pq.add(new Student("k", 2));
//    pq.add(new Student("h", 1));
//    while (!pq.isEmpty()) {
//      System.out.println(pq.peek().name + " " + pq.peek().rank);  //O(1)
//      pq.remove();   //O(logN)

    }
  }
  }

