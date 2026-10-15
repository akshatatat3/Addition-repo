

import java.util.Scanner;

public class program34
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);
        System.out.println("Enter frist number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = scanner.nextInt();

        iResult = iValue1 + iValue2 ;  // bussiness logic 

        System.out.println("Addition is  : "+iResult);
        
    }

}