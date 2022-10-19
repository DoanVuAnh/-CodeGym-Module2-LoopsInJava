import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        for (int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}



