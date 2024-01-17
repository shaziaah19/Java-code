package TwoD;

public class searchInSorted {
  public static void main(String[] args) {
    int [][]matrix={{10,20,30,40},
        {15, 25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
    int key=33;
    int row=0,col=matrix.length-1;
    while (row< matrix.length && col>=0){
     if(matrix[row][col]==key){
       System.out.println("found "+ row+" "+ col);
       return;
     } else if (key<matrix[row][col]) {
       col--;
     }else {
       row++;
     }
    }
  }
}
