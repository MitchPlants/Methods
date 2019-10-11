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


        int x = 10;
        int y = 5;
        System.out.print(multiply(x,y));
        System.out.print(devide(x,y));






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
    public static int devide(int number1, int number2){
        int answer = number1/number2;

        return answer;
    }

}
