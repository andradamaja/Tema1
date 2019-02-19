import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printHelloName();

        printSum();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        float d1 = scan.nextFloat();

        float d2 = scan.nextFloat();

        float div = division(d1, d2);

        System.out.println(d1+ " / " + d2 + " = " + div);

        printOps();

    }

    //1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.

    public static void printHelloName() {
        System.out.println("Hello\r\nAndrada");
    }

    //2.Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the sum of the two numbers.

    public static void printSum() {
        System.out.println("The addition of 7 and 8 is: " + (7 + 8));
    }

    //3.Write a Java program to divide two numbers and print on the screen.

    public static float division(float x, float y){
        return x / y;
    }

//    4.Write a Java program to print the result of the following operations:
//    a. -5 + 8 * 6
//    b. (55+9) % 9
//    c. 20 + -3*5 / 8
//    d. 5 + 15 / 3 * 2 - 8 % 3

    public static void printOps(){
        short a = -5 + 8 * 6;
        byte b = (55 + 9) % 9;
        float c = 20 + -3f * 5 / 8;
        short d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("a. " + a + ";\n" + "b. " + b + ";\n" + "c. " + c + ";\n" + "d. " + d + ";");
    }

}
