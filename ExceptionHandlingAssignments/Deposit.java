package Generics;
import java.util.Scanner;

public class Deposit {
int amt= 0;
    
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
        if(amt<=0)
        {
            Invalid depositnegativeError = new Invalid("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }else{   
            return amt;
        }
        return amt;
        
    }

}
