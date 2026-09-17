import java.util.*;
public class TASK2 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int[] Number = new int[5]; //declaration of array


      //input
      System.out.print("Enter 5 Different Numbers:-");
      for (int i=0;i<5;i++){ //initialization of array 0 to 4
         Number[i]=sc.nextInt();
      }
      
      // Now Sort The Array Using Bubble Sort
      System.out.println("The Sorted Array Is:-");
      for (int i = 0; i < 4; i++) {
         for(int j =0;j<4-i;j++){
           if(Number[j] > Number[j+1]){
            int temp = Number[j];
            Number[j] = Number[j+1];
            Number[j+1] = temp;
           }  
         }
      } 

      //output
      for (int i=0;i<5;i++){
         System.out.print(Number[i] + " ");
      }

      // Now Find The Second Largest Number In The Array
      int secondSmaller = Number[1];
      int SecondLargest = Number[3];

      System.out.println("\nSecond Smallest: " + secondSmaller);
      System.out.println("Second Largest: " + SecondLargest);

   }
}
      
