package Strings;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class playingDates {

  public static void main(String[] args) {
    ArrayList <String> dates= new ArrayList<>();
    dates.add("11nd Jul 1974");

    HashMap<String,Integer> map=new HashMap<>();
    map.put("Jan",1);
    map.put("feb",2);
    map.put("Mar",3);
    map.put("apr",4);
    map.put("may",5);
    map.put("Jun",6);
    map.put("Jul",7);
    map.put("aug",8);
    map.put("sep",9);
    map.put("oct",10);
    map.put("nov",11);
    map.put("dec",12);


    String day="";
    String mon="";
    String temp="";
    for(String d: dates){
   String splt[]=d.split(" ");

   //for date
      if(splt[0].length()==3){
       day="0"+ splt[0].substring(0,1);

      }else{
        day= splt[0].substring(0,2);
      }
      //month
      if(map.get(splt[1])<=9){
        mon+="0"+ map.get(splt[1]);
      }
      else{
        mon+= map.get(splt[1]);
      }
      temp=temp+splt[2]+"-"+mon+"-"+day;

    }
    System.out.println(temp);


  }
}
