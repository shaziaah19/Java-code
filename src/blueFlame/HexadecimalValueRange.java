package blueFlame;

import java.util.Scanner;

public class HexadecimalValueRange {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first character: ");
    char startChar = scanner.next().charAt(0);

    System.out.print("Enter the second character: ");
    char endChar = scanner.next().charAt(0);

    printHexValuesInRange(startChar, endChar);
  }

  public static void printHexValuesInRange(char startChar, char endChar) {
    if (startChar > endChar) {
      char temp = startChar;
      startChar = endChar;
      endChar = temp;
    }

    for (char c = startChar; c <= endChar; c++) {
      String hexValue = Integer.toHexString(c);
      System.out.println(hexValue.toUpperCase());
    }
  }
}


