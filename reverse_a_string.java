import java.util.Scanner;

public class reverse_a_string{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        String rstr="";
        char ch;

        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rstr=ch+rstr;
        }
        System.out.println("reverse string: " + rstr);
    }

}