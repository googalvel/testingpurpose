public class palindrome_number{
    public static void main(String args[]){

        int n=121;
        int temp,sum=0,r;

        temp =n;

        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("palindorme");
        }
        else
        System.out.println("Not a palindrome");

    }
}