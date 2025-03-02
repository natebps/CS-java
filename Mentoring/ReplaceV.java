
import java.util.Scanner;

public class ReplaceV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        str = str.replace('a', 'A');
        str = str.replace('e', 'E');
        str = str.replace('i', 'I');
        str = str.replace('o', 'O');
        str = str.replace('u', 'U');

        System.out.println(str);

    }
}
