package main.java;

public class ReverseArray {
    public static String invers(String str){
        String cuvinte[]=str.split("\\s");

        for (int i=cuvinte.length-1;i>=0;i--) {
            System.out.print(cuvinte[i]+"\t");
        }
        return "";
    }

    public static void main(String[] args) {
        invers("hello world");
    }
}
