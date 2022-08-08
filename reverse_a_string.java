public class cfg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String rstr="";
        char ch;

        for(i=0;i<str.length();i++){
            ch=charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("reverse string: " + nstr);
    }
}