package main.java;

public class NumbersBetweenWords {
    public static int findWords(String str1, String str2, String str3){
String cuvinte[]=str3.split("\\s");
int poz1=0;
int poz2=0;
int rez=-1;
for (int i=0;i<cuvinte.length;i++){
    if (cuvinte[i].equals(str1)){
        poz1=i;
    }else if (cuvinte [i].equals(str2)){
        poz2=i;
    }else{
        continue;
    }
    if (poz1!=0&&poz2!=0){
        rez=Math.abs(poz1-poz2)-1;
    }
}
return rez;
    }
    public static void main(String[] args) {
        System.out.println(findWords("hello","world","dog cat hello cat dog dog hello cat jjj world cat cat hello"));
    }
}
