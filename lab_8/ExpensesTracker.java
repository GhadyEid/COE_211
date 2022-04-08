
import java.io.*;  // Import the FileWriter class
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      Scanner jarvis = new Scanner(System.in);
      FileWriter fw = new FileWriter(new File("expenses.txt"));
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter outToFile = new PrintWriter(bw);
      String name, purchase, input, answer, again, summary;
      Double price;
      
      do {
    	  System.out.println("Input your name: ");
    	  name = jarvis.nextLine();
    	  
    	  System.out.println("What did you purchase?");
    	  purchase = jarvis.nextLine();
    	  
    	  System.out.println("How much did you pay? (in USD)");
    	  price = jarvis.nextDouble();
    	  answer = jarvis.nextLine();
    	 
    	  input = name + " purchased " + purchase + " for " + price + " US Dollars";
    	  
    	  outToFile.println(input);
    	  
    	  System.out.println("Would you like to log another purchase? (y/n)");
    	  answer = jarvis.nextLine();
    	  
    	  if(answer.equalsIgnoreCase("n")) {
    		  System.out.println("Get off of ZoodMall!"); 
    	  } else {
    		  continue;
    	  }
    	  
      }while(answer.equalsIgnoreCase("y"));
      
      outToFile.close();
      
      	System.out.println("Would you like to read a summary of your purchases? (y/n)");
		again = jarvis.next();
		
		File newFile = new File("expenses.txt");
		Scanner scanFile = new Scanner(newFile);	
		
		if (again.equalsIgnoreCase("y")) {
			
			while(scanFile.hasNext()) {
				
				summary = scanFile.nextLine();
				System.out.print(summary);
				
			}
			
		}
		
		scanFile.close();
		jarvis.close();
  }
}