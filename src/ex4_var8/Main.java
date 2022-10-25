package ex4_var8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner console = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter your string: ");
        str = console.next();

        while (flag) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i])) {
                    System.out.println("Enter string without numbers!");
                    str = console.next();
                    flag=true;
                    break;

                }else {
                    flag=false;
                }
            }

        }
            Vowels vow = new Vowels();
            Consonants con = new Consonants();

            System.out.println("Vowels in a string - " + vow.analyse(str));
            System.out.println("Consonants in a string - " + con.analyse(str));


    }

}
