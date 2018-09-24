import java.util.Scanner;

public class ArrPositiveAvg {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int check;


        System.out.println("Enter thr number...");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            check = sc.nextInt();
            if (check > 0) {
                arr[i] = check;
            } else {
                int sum = 0, cnt = 0;
                for (int j = 0; j < i; j++) {

                    sum = sum + arr[j];
                    cnt++;
                }
                System.out.println("Total is" + sum);
                System.out.println(cnt);
                System.out.println("Avg is" + sum/cnt);
            }
        }


    }
}
