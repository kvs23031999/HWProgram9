import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWProgram9 {


    public static void main(String[] args){
        Random random = new Random();
        int computerNum = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.println("введіть число в діапозоні до 10");
            int manualInt = scanner.nextInt();
         if ( manualInt == computerNum ){
             System.out.println("Ви вгадали число");
             break;

         }
            System.out.println("Ви не вгадали число");


        }
        System.out.println(computerNum);



        }



    }










