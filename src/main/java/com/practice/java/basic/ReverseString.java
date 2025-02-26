package com.practice.java.basic;

public class ReverseString {

    static void printReverseWords(String s){
        int i=0,j=0;
        String result="";
         while(i<s.length()){
             int count=0;
             while(j<s.length() && s.charAt(j)!=' '){
                 j++;
                 count++;
             }
             result=s.substring(((i>0)?i-1:0),count+i)+" "+result;
             i=j+2;
             j=j+2;
         }
         System.out.println(result);

        }
static void reverseWordsSimpleVersion(String s){
        int i=0,j=0;
        String result="",word="";
        while(i<s.length()){
            word="";
            for ( j=i;j<s.length() && s.charAt(j)!=' ';j++){
                word=s.charAt(j)+word;
            }
            i=j+1;
            result=result+" "+word;
        }
        System.out.println(result);
}

    public static void main(String[] args) {
        reverseWordsSimpleVersion("I leave in Bangalore");
    }
}
