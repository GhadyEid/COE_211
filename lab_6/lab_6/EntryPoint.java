package lab_6;
import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
    	
    	Scanner jarvis = new Scanner(System.in);
    	String alfred;
    	
         do {
             System.out.println("Which service would you like to use? \n" +
                     "[1]: Basic week visualiser\n" +
                     "[2]: Advanced week visualizer\n" +
                     "[3]: Basic calculator\n" +
                     "[4]: Employee repertoire");
             int idx = Integer.parseInt(jarvis.nextLine());
             switch (idx) {
                 case 1:
                     BasicWeek basicWeek = new BasicWeek();
                     basicWeek.printDays();
                     break;
                 case 2:
                     AdvancedWeek advancedWeek = new AdvancedWeek();
                     advancedWeek.printDays();
                     break;
                 case 3:
                     Calculator jeff = new Calculator();
                     break;
                 case 4:
                     Employee employee = new Employee();
                     System.out.println(employee);
                     break;
                 default:
                     System.out.println("Please make sure you pick a number between 1 and 4");
                     break;

             }
             System.out.println("Would you like to perform another operation? (y/n)");
             alfred = jarvis.nextLine();
         }
         while (alfred.equals("y"));
     }
    	
    	
    }
