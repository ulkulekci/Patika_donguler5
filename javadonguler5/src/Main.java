import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {System.out.println("us alma");
        Scanner input=new Scanner(System.in);
        System.out.println("ussu alinacak sayiyi giriniz:");
        int a=input.nextInt();

        System.out.println("ussu olacak sayiyi giriniz:");
        int b=input.nextInt();
        int i, us=1;
        for (i=1; i<=b; i++){
            us*=a;}
            System.out.println("sayinin ussu:"+us);

    }
}
