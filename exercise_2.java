import java.util.Scanner;
import java.util.Random;
class exercise_2
{
  public static void main (String[]args)
  {   
      Scanner input = new Scanner(System.in);
      System.out.println("enter number(0 for stone,1 for paper,2 for scissor):");
      int number=input.nextInt();
      
      if(number==0){
       System.out.println("you select stone");   
      }
      else if(number==1){
       System.out.println("you select paper");   
      }
      else{
        System.out.println("you select scissor"); 
      }
      
      Random random = new Random();
      int r_no = random.nextInt(3);
      System.out.println(r_no);
      
      if(r_no==0){
       System.out.println("pc select stone");   
      }
      else if(r_no==1){
       System.out.println("pc select paper");   
      }
      else{
        System.out.println("pc select scissor"); 
      }
      
      
      if(number==1 && r_no==1){
          System.out.println("draw");
      }
      else if(number==0 && r_no==0){
          System.out.println("draw");
      }
      else if(number==2 && r_no==2){
          System.out.println("draw");
      }
      else if(number==0 && r_no==0){
          System.out.println("draw");
      }
      else if(number==0 && r_no==1){
          System.out.println("you lost!");
      }
      else if(number==0 && r_no==2){
          System.out.println("you win!");
      }
      else if(number==1 && r_no==0){
          System.out.println("you win!");
      }
      else if(number==1 && r_no==2){
          System.out.println("you lost!");
      }
      else if(number==2 && r_no==0){
          System.out.println("you lost!");
      }
      else if(number==2 && r_no==1){
          System.out.println("you win!");
      }
  }
}
