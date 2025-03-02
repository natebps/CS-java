
import java.util.Scanner;

public class ScoreString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        int ans =0;

        for(int i=0;i<str.length()-1;i++){
            ans += Math.abs(str.charAt(i)-str.charAt(i+1));
        }
        System.out.println(ans);
    }
}