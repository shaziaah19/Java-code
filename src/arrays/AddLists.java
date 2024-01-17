package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddLists {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first comma-separated list: ");
    String input1 = scanner.nextLine();

    System.out.print("Enter the second comma-separated list: ");
    String input2 = scanner.nextLine();

    List<Integer> result = addLists(input1, input2);

    System.out.println("Result: " + result);
  }

  public static List<Integer> addLists(String list1, String list2) {
    List<Integer> result = new ArrayList<>();

    List<String> nums1 = Arrays.asList(list1.split(","));
    List<String> nums2 = Arrays.asList(list2.split(","));

    int max_length = Math.max(nums1.size(), nums2.size());

    for (int i = 0; i < max_length; i++) {
      int num1 = i < nums1.size() ? Integer.parseInt(nums1.get(i)) : 0;
      int num2 = i < nums2.size() ? Integer.parseInt(nums2.get(i)) : 0;

      result.add(num1 + num2);
    }

    return result;
  }
}
