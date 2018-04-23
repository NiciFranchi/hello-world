import java.util.Scanner;
import java.io.*;

class Calculator
{
    public static void main (String[]args) throws Exception
    {
        int choice;
        int x=0;
        int y=0;
        int sum;

        PrintStream out;

        Scanner input;

        Calculator calc=new Calculator();

        try
        {
            out=new PrintStream ("calclog.txt");

            do
            {
            System.out.print("Calculator Program\n");
            System.out.print("----------------------\n\n");

            System.out.print("1. Add\n");
            System.out.print("2. Substract\n");
            System.out.print("3. Multiply\n");
            System.out.print("4. Divide\n");
            System.out.print("5. Mod\n");
            System.out.print("6. Power\n");
            System.out.print("99. End Program\n");

            System.out.print("Enter choice: ");
            input=new Scanner(System.in);
            choice=input.nextInt();

            while((choice<1 || choice>6) && choice != 99);
            {
            System.out.print("\nPlease enter 1, 2, 3, 4, 5, 6");
            choice=input.nextInt();
            }

            if (choice != 99)
            {
            System.out.print("Please enter 2 numbers only:\n");
            x=input.nextInt();
            //5
            y=input.nextInt();
            //3
            }

            switch(choice)
            {
                
            case 1:
            sum=calc.add(x, y);
            System.out.printf("The sum is %d\n\n", sum);
            out.print(x + "+" + y + "=" + sum);

            break;

            case 2:
            sum=calc.sub(x, y);
            System.out.printf("The sum is %d\n\n", sum);
            out.print(x + "-" + y + "=" + sum);

            break;

            case 3:
            sum=calc.multi(x, y);
            //15
            System.out.printf("The sum is %d\n\n", sum);
            out.print(x + "*" + y + "=" + sum);

            break;

            case 4:
            try
            {
            sum=calc.div(x, y);
            System.out.printf("The sum is %d\n\n", sum);
            out.print(x + "/" + y + "=" + sum);
            }

            catch (Exception e)
            {
            System.out.print("Error: cannot divide by zero");
            }

            break;

            case 5:
            sum=calc.mod(x, y);
            //2
            System.out.printf("The sum is %d\n\n", sum);
            out.print(x + "%" + y + "=" + sum);

            break;

            case 6:
            sum=calc.pow(x, y);
            //5
            System.out.printf("The sum is %d\n\n", sum);
            out.print(x + "^" + y + "=" + sum);

            break;
            }
        }

            while(choice != 99);
            input.close();
            System.out.print("Ending program…");
            }
        }

    public int add(int num1, int num2)
    {
        int sum;
        sum=num1 + num2;

        return sum;
    }

    public int sub(int num1, int num2)
    {
        int sum;
        sum=num1 - num2;

        return sum;
    }

    public int multi(int num1, int num2)
    {
        int sum;
        sum=num1 * num2;
        //3 * 5

        return sum;
        //15
    }

    public int div(int num1, int num2)
    {
        int sum;
        sum=num1 / num2;

        return sum;
    }

    public int mod(int num1, int num2)
    {
        int sum;
        sum=num1 % num2;
        //5 % 3

        return sum;
        //2
    }

    public int pow(int base, int exp)
    {
        int sum=1;

        if(exp==0)
        {
            sum=1;
        }

        while(exp>0)
        {
            sum=sum*base;
            exp--;
        }

        return sum;
    }

}
        
    
