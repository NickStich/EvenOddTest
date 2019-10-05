package main.java;
/*Write a method that returns a comma separated string
based on a given list of integers.
Each element should be preceded by the letter 'e' if
the number is even, and preceded by the letter 'o' if
the number is odd.
For example, if the input list is (3,44,5,10),
the output should be 'o3 e44 o5 e10'.*/

import java.util.ArrayList;
import java.util.List;

public class EvenE_OddO {
  public static StringBuilder preceed(List<Integer> numbers){
    StringBuilder s=new StringBuilder();
    String even="e";
    String odd="o";
    for (int i=0;i<numbers.size();i++){
      if(numbers.get(i)%2==0){
        s.append(even+numbers.get(i)+" ");
      }
      else{
        s.append(odd+numbers.get(i)+" ");
      }
    }
   return s;
  }
    public static void main(String[] args) {
      List<Integer> numb=new ArrayList<>();
      numb.add(8);
      numb.add(17);
      numb.add(30);


      System.out.println(preceed(numb));
    }

}
