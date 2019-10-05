package main.java;

public class Isbn {
    public static boolean verifISBN(String str){
   String str1=new String();
    str1=str.replaceAll("-","");
    int sum=0;
    for (int i=0;i<str1.length();i++){


        if(str1.charAt(str1.length()-1)=='x'){
            for (int j=i;j<=9;j++)
                sum=sum+Character.getNumericValue(str1.charAt(j))*(10-j)+10;


        }else{
            sum=sum+Character.getNumericValue(str1.charAt(i))*(10-i);
        }
    }
    if (sum%11==0){
        return true;
    }
    return false;
    }

    public static void main(String[] args) {
        System.out.println(verifISBN("3598-2150-88"));
    }
}
