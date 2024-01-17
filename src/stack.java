import java.util.Stack;

public class stack {
  static class Node{
    int data;
    Node next;
    Node (int data){
      this.data=data;
      this.next=null;
    }
    static class Stack{
      static Node head;
      public static boolean isEmpty(){
        if(head==null){
          return true;
        }
        return false;
      }
      public static void push(int data){
//        if(isEmpty())
      }
    }
  }
  public static int postfix(String s) {
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        st.push(s.charAt(i) - '0');
      } else {
        int op2 = st.peek();
        st.pop();
        int op = st.peek();
        st.pop();

        switch (s.charAt(i)) {
          case '+':
            st.push(op + op2);
            break;
          case '-':
            st.push(op - op2);
            break;
          case '*':
            st.push(op * op2);
            break;
          case '/':
            st.push(op / op2);
            break;
        }
      }
    }
    return st.peek();

  }


  public static void main(String[] args) {
    System.out.println(postfix("46+2/5*7+"));
  }
}
