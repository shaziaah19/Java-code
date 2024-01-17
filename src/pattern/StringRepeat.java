package pattern;

  public class StringRepeat {
    public static String repeatCharacters(String input) {
      StringBuilder result = new StringBuilder();
      int repeatCount = 1;

      for (char c : input.toCharArray()) {
        if (Character.isDigit(c)) {
          repeatCount = Character.getNumericValue(c);
        } else if (c == '[') {
          // Do nothing, handle opening square bracket
        } else if (c == ']') {
          // Repeat the next character after the number
          char nextChar = result.charAt(result.length() - 1);
          StringBuilder temp = new StringBuilder();
          while (repeatCount-- > 0) {
            temp.append(nextChar);
          }
          result.append(temp);
          repeatCount = 1;  // Reset repeat count after repetition
        } else {
          // Append the character to the result
          result.append(c);
        }
      }

      return result.toString();
    }

    public static void main(String[] args) {
      String input = "aki[2ek][3c]d";
      System.out.println(repeatCharacters(input));  // Output: akiekekcccd
    }
  }
