package TwoD;

public class Spiral_Matrix {
  public static void print(int[][] matrix) {
    int sc = 0, sr = 0, ec = matrix[0].length - 1, er = matrix.length - 1;
    while (sr <= er && sc <= ec) {
      //top
      for (int j = sc; j <= ec; j++) {
        System.out.print(matrix[sr][j] + " ");
      }
      //right
      for (int i = sr + 1; i <= er; i++) {
        System.out.print(matrix[i][ec] + " ");
      }
      //bottom
      for (int j = ec - 1; j >= sc; j--) {
        if (sr == er) {
          break;
        }
        System.out.print(matrix[er][j] + " ");
      }
      //left
      for (int i = er - 1; i >= sr + 1; i--) {
        if (sc == ec) {
          break;
        }

        System.out.print(matrix[i][sc] + " ");
      }
      sc++;
      er--;
      sr++;
      ec--;
      System.out.println();

    }
  }

  public static void main(String[] args) {

    int[][] matrix = {{1, 2, 3,4},
        { 5, 6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
    print(matrix);

  }
}
