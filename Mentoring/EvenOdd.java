
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String even="";
        String odd="";

        for(int i=1;i<=n;i++){
            if(i%2==0){
                even =even+ i+" ";
            }
            else if (i%2!=0){
                odd += i+" ";
            }
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);  
    }
}
