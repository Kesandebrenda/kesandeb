// These are  the student details 

package university;
import java.util.Scanner;

public class brend {

	public static void main(String[] args) {
		
		String name;
        int roll, electroniccommerce, systemintergration, scriptinglanguage,objectorientedprogramming,informationsecurity;
         
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter  Name: ");
        name=SC.nextLine();
        System.out.print("Enter Regno: ");
        roll=SC.nextInt();
        System.out.print("Enter  other name: ");
        name=SC.next();
        System.out.print("Enter semester: ");
       name=SC.next();
       System.out.print("Enter  Course year: ");
       name=SC.next();
       
        System.out.print("Enter  Course unit: ");
        name=SC.next();
        System.out.print("Enter program: ");
       name=SC.next();
        System.out.print("Enter Roll: ");
        roll=SC.nextInt();
        
        System.out.print("Enter marks in electroniccommerce, systemintergrastion,scriptinglanguaage,objectorientedprogramming and informationsecurity: ");
        electroniccommerce=SC.nextInt();
        systemintergration=SC.nextInt();
        scriptinglanguage=SC.nextInt();
        objectorientedprogramming=SC.nextInt();
        informationsecurity=SC.nextInt();
        int total=+electroniccommerce+systemintergration+scriptinglanguage+objectorientedprogramming+informationsecurity;
        float perc=(float)total/300*100;
         
        System.out.println("Roll Number:" + roll +"\tName: "+name+"");
        System.out.println("Marks (electroniccommerce, systemintergration, scriptinglanguage,objectorientedprogramming,informationsecurity): " +electroniccommerce+","+systemintergration+","+scriptinglanguage+","+objectorientedprogramming+","+informationsecurity);
        System.out.println("Total: "+total +"\tPercentage: "+perc);

	}

}
