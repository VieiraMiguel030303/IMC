import java.util.Scanner;

public class IMC
{
    public static void main (String[] args)
    {
       Scanner input = new Scanner (System.in);
       float p,
             a,
             cIMC;

        System.out.print("Enter your peso prisi: ");
        p= input.nextFloat();

        System.out.print("Enter your altura prisi: ");
        a= input.nextFloat();

        cIMC= (p /(a*a));
        System.out.printf("cIMC %.1f", cIMC);
    }          
}
