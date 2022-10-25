package ex4_var8;

public class Vowels implements Analyse {

    @Override
    public int analyse(String str) {
       int vow=0;
       for (int i=0;i<str.length();i++){
           if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='y'){
              vow++;
           }
       }
        return vow;
    }
}
