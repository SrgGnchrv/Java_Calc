import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        double first, second ;
        char operator ;

        System.out.println("Enter first Value:");
        Scanner firstValue = new Scanner(System.in);
        first = firstValue.nextInt();

        System.out.println("Enter Second Value:");
        Scanner secondValue = new Scanner(System.in);
        second = secondValue.nextInt();

        System.out.println("Enter an Operator: +,-,*,/");
        Scanner op = new Scanner(System.in);
        operator = op.next().charAt(0);

        double result ;

        switch (operator){
            case '+' ->{
                result = first + second ;
                System.out.println(result);
            }
            case '-' ->{
                result = first - second ;
                System.out.println(result);
            }
            case '*' ->{
                result = first * second ;
                System.out.println(result);
            }
            case '/' ->{
                result = first / second ;
                System.out.println(result) ;
            }
        }

    }
}
