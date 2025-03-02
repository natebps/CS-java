
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.trim().equals(s2.trim())){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
