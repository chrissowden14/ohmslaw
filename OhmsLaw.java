import java.io.*;  
import java.util.*;  
  
public class OhmsLaw {  
   public static void main(String[] args) {  
      Scanner in = new Scanner(System.in);  
      System.out.print("Voltage: ");  
      int voltage = in.nextInt();  
      System.out.print("Resistance: ");  
      int resistance = in.nextInt();  
      double current = (voltage+0.00000)/resistance; //Have to add 0.0 to convert the integers  
                                                 //to doubles  
      System.out.println("Current: "+current +" amps");  
   }  
}  
