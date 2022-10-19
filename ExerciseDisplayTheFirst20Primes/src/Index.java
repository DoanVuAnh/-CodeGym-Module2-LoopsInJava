import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int countPrimes =0;
        int sum = 0;
        System.out.print("The prime number you want to display: ");
        int numbers = input.nextInt();
        for (int i =2 ; i < 1000; i++){
            if ( countPrimes < numbers){
                for (int j =1; j <= i; j++){
                    if (i % j ==0){
                        count += 1;
                    }
                }
                if (count ==2){
                    System.out.print(i + "\n");
                    countPrimes +=1;
                }
                count =0;
                sum += i;
            } else {
                break;
            }
            }
        }
    }
