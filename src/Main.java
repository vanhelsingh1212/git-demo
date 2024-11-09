//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("venkatesh this is demo one please watch carefully");
     String word="Swiss";
     int[]  charCout=new int[26];
     for( char ch:word.toCharArray()){
         charCout[ch- 'a']++;
     }

     for(char ch:word.toCharArray()){
         if(charCout[ch-'a']==1){
             System.out.println("chat"+ch);
         }
     }

        System.out.println("venkatesh this is demo one please watch carefully new one tryied");
        System.out.println("new pull data");

    }
}
