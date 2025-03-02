
import java.util.Scanner;

public class ConvertS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";

        for(int i = 0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                ans += str.substring(i,i+1).toLowerCase();
            }
            else{
                ans += str.substring(i,i+1).toUpperCase();
            }
        }
        System.out.println(ans);
    }
}
