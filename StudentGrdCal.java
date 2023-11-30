import java.util.Scanner;

public class StudentGrdCal {
   public static void main(String[] args) {
      float[] marks = new float[8];
      float sum = 0, avg ,perc;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Marks Obtained in 8 Subjects:");
      for( int i = 0; i < 8; i++){
         marks[i] = scan.nextFloat();
         sum = sum + marks[i];
         avg = sum/8;
         perc = avg;
      
         System.out.println("Average Mark =" + avg);
         System.out.println("Percentage Mark =" + perc +"%");
	  
         if(avg>=94) {
             System.out.println(" Grade is: A");
         } else if(avg>=90 && avg<94) {
             System.out.println("Grade is: A-");
         } else if(avg>=87 && avg<90) {
             System.out.println("Grade is: B+");
         } else if(avg>=83 && avg<87) {
             System.out.println("Grade is: B");
         } else if(avg>=80 && avg<83) {
             System.out.println("Grade is: B-");
         } else if(avg>=77 && avg<80) {
             System.out.println("Grade is: C+");
         } else if(avg>=73 && avg<77) {
             System.out.println("Grade is: C");
         } else if(avg>=70 && avg<73) {
             System.out.println("Grade is: C-");
         } else if(avg>=67 && avg<70) {
             System.out.println("Grade is: D+");
         } else if(avg>=63 && avg<67) {
             System.out.println("Grade is: D");
         } else if(avg>=60 && avg<63) {
             System.out.println("Grade is: D-");
         } else {
             System.out.println("Grade is: F");
            }  
        }
           
        
    }
        
    
}
