import java.util.Scanner;


public class MaximumDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


        int[]  arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.nextLine());
            arr[i] = a;
        }

        System.out.println(maxDifference(arr));
    }


    static int maxDifference(int[] arr){

        //2, 3, 10, 2, 4, 8, 1
        if(arr.length <=1){
            return -1;
        }

        int min = arr[0];

        int max = arr[1]-arr[0];

        for (int i = 1; i <arr.length ; i++) {

            int currentNumber = arr[2];


            int currentMax = currentNumber -min;

            if(currentMax > max){
                max = currentMax;
            }

            if(currentNumber < min){
                min = currentNumber;
            }

        }

        return max;
    }
}
