import java.util.Scanner;

public class Methods {
    public static void main(String[]args){
        String Name;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        helloWorld();
        System.out.println("Your Name?");
        Name = Keyboard.nextLine();

        greeting(Name);
        greeting("People");


        int x = 20;
        int y = 10;
        System.out.println(multiply(x,y));
        System.out.println(devide(x,y));
        System.out.println(max(x,y));






    }
    public static void helloWorld(){

        System.out.println("Hello World");

    }
    public static void greeting(String noun){
        System.out.println("Hello " +noun);
    }
    public static int multiply(int number1, int number2){
        int answer = number1*number2;

        return answer;

    }
    public static double devide(double number1, double number2){
        double answer = number1/number2;

        return answer;
    }
    public static double max(double number1, double number2){
        if(number1 > number2){
            return number1;

        }
        else{
            return number2;
        }
    }

}
