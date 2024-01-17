package Strings;

public class shortestPath {
  public static void main(String[] args) {
    String s="WNEENESENNN";
    //N-> y+1
    //S->y-1
    //W->x-1
    //E->x+1
    int x=0,y=0;
    for (int i = 0; i < s.length(); i++) {
      char d=s.charAt(i);
      switch (d){
        case 'W':
          x=x-1;
          break;
        case 'N':
          y=y+1;
          break;
        case 'E':
          x=x+1;
          break;
        case 'S':
          y=y-1;
          break;

      }
    }
    System.out.println(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));

  }
}
