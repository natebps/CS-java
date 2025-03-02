
import java.util.Scanner;

public class SenL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int length = a.length();
        System.out.println("Length: "+length);
        if(length%2==0){
            System.out.println("Length is even");
        }
        else{
            System.out.println("Length is odd");
        }
    }
}
