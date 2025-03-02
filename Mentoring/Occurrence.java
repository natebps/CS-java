import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char find = sc.next().charAt(0);

        int first=0;
        int last=0;

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==find){
                first = i;
                break;
            }
        }
        for(int i=str1.length()-1;i>=0;i--){
            if(str1.charAt(i)==find){
                last = i;
                break;
            }
        }
        System.out.println("First: "+first);
        System.out.println("Last: "+last);
    }
}
