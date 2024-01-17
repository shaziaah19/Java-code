package Strings;

public class mS {
  public static String modifyString(String input) {
    StringBuilder output = new StringBuilder();

    for (char ch : input.toCharArray()) {
      if (Character.isLetter(ch)) {
        if (ch == 'z') {
          output.append('a');
        } else if (ch == 'Z') {
          output.append('A');
        } else {
          output.append((char)(ch + 1));
        }
      } else {
        output.append(ch);
      }
    }
    for (int i = 0; i <output.length() ; i++) {
      char ch=output.charAt(i);
      if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
       output.setCharAt(i, Character.toUpperCase(ch));
      }
    }

    return output.toString();
  }

  public static void main(String[] args) {
    String input = "genius student";
    String modifiedString = modifyString(input);
    System.out.println("Modified String: " + modifiedString);
  }
}
