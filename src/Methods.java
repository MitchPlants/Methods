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

        String Word1;
        String Word2;
        Word1 = "Cool";
        Word2 = "Cat";
        System.out.println(Word1+Word2);
        change(Word1,Word2);






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
        else if(number1 < number2){
            return number2;

        }
        else {
            return number1;
        }
    }
    public static String change(String word1, String word2){
        System.out.println(word2+word1);


        return word2+word1;


    }


}
