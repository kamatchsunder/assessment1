import java.util.ArrayList;
import java.util.Scanner;


public class BalancedStrings {

    private static ArrayList<Character> characterList = new ArrayList(){{add('a');add('b');add('c');add('d');}};
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String  s = sc.nextLine();

        for (int i = 0; i <s.length() ; i++) {

           char a = s.charAt(i);

           if(!characterList.contains(a)){
               System.out.println("false");
           }
        }


        System.out.println(isBalancedString(s));
    }

    private static boolean isBalancedString(String str){

        int asSum = 0;
        int bsSum = 0;
        for (char a : characterList) {

            int cc = count(str, a + "");

            switch (a) {

            case 'a': {
                asSum += cc;
                break;
            }
            case 'c': {
                asSum += cc;
            }
            case 'b': {

                bsSum += cc;
            }

            case 'd': {
                bsSum += cc;
            }
            default:
                break;
            }
        }

        return asSum % 2 == 0 && bsSum % 2 == 0;

    }


    private static int count(String str,String subStr){

        int count=0;
        int j=0;
        while( (j = str.indexOf(subStr,j))!=-1){

            count++;
            j+=subStr.length();
        }

        return count;
    }
}
