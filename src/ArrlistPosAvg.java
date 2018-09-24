import java.util.ArrayList;
import java.util.Scanner;

public class ArrlistPosAvg {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int sum = 0;
        while (true) {
            int check = sc.nextInt();
            if (check > 0) {
                al.add(check);
                sum = sum + check;
            } else {
                System.out.println(al);
                System.out.println("avg is " + sum / al.size());
            }
        }

    }
}
