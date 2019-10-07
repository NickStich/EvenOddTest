package main.java;

public class Paranteze {
   public static int parant(String str) {
       int x = str.length();
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == '(') {
               for (int j = i + 1; j < str.length(); j++) {
                   if (str.charAt(i) == ')')
                       x = x - 2;
               }
           }
       }
       return x;
   }
    public static void main(String[] args) {
        System.out.println(parant(")))((("));
    }
}
