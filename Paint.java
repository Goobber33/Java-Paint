import java.util.Scanner;

public class Paint {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int height = 0;
      int width = 0;

      System.out.print("Enter wall height : ");
      height = scnr.nextInt();

      System.out.print("Enter wall width : ");
      width = scnr.nextInt();
      System.out.println();

      int area = height * width;
      double gallons = area / 350.0;
      int cans = (int)Math.ceil(gallons);

      System.out.println("Wall area : " + area + " square feet");
      System.out.printf("Paint needed : %.2f gallons\n", gallons);
      System.out.printf("Cans needed : %d can(s)\n", cans);
   
   }
}
