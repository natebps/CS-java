
import java.util.Scanner;

public class Fascinating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String num1 = String.valueOf(num);
        String num2 = String.valueOf(2 * num);
        String num3 = String.valueOf(3 * num);
        String str = num1 + num2 + num3;
        //char[] ch = str.toCharArray();
        //Arrays.sort(ch);
        boolean flag = true;
        for (int i = 1; i <= 9; i++) {
            if (!str.contains(Integer.toString(i))) {
                flag = false;
                break; 
            }
        }

    }
}
