import java.util.Scanner;

public class Quiz1_Zeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int j = year / 100;
        int k = year % 100;

        if (m == 1 || m == 2) {
            year = year - 1;
        }
        if (m == 1 || m == 2) {
            m = m + 12;
        }

        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        switch (h) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;

            default:
                System.out.println();
                break;
        }

    }
}