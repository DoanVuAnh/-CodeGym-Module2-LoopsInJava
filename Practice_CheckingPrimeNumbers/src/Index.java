import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int check;
        if (number < 2){
            System.out.print(number + " is not a prime");
        } else {
           for (int i = 2; i < number; i++){
               if (number % i != 0) {
                   System.out.print(number + " is a prime");
               }else {
                   System.out.print(number + " is not a prime");
               }
           }
        }
    }
}
