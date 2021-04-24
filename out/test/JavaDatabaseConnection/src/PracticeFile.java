import java.util.Scanner;

public class PracticeFile {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("Input a: ");
                int a = input.nextInt();
                System.out.print("Input b: ");
                int b = input.nextInt();
                System.out.print("Input c: ");
                int c = input.nextInt();

                if (a>b)
                    if (a>c)
                        System.out.println("The greatest number is " + a);

                if (b>a)
                    if (b>c)
                        System.out.println("The greatest number is " + b);

                if (c>a)
                    if(c>b)
                    System.out.println("The greatest number is ");


    }
}

