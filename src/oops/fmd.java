package oops;

//class Solution {
//  public boolean isValid(String str) {
//    Stack<Character> s = new Stack<>();
//    for (int i = 0; i < str.length(); i++) {
//      char ch = str.charAt(i);
//
//      if (ch == ')' && s.peek() == '('
//          || ch == '}' && s.peek() == '{'
//          || ch == ']' && s.peek() == '[') {
//        s.pop();
//
//      } else if (ch == '(' || ch == '{' || ch == '[') {
//        s.push(ch);
//
//      } else {
//        return false;
//      }
//    }
//
//    if (s.isEmpty()) {
//      return true;
//    } else {
//      return false;
//    }
//  }
//
//
//}
