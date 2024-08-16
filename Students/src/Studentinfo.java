/*3 class streams Form 1a,1b and 1c
 * view all class streams
 * view a single stream
 * student info(name,admin,class)
 * edit info
 * delete student
 * view a single student
 * view all the students
 * view students in one stream*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Studentinfo {
	String studentName;
	String adminNo;
	int id;
	
	List <String> Form1a = new ArrayList<String>();
	List <String> all1a = new ArrayList<String>();
	
	List <String> Form1b = new ArrayList<String>();
	List <String> Form1c = new ArrayList<String>();
	
	Scanner scan = new Scanner(System.in);
	
	String uri = "mongodb+srv://brianmuchira001:<password>@cluster0.c8atalq.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
	
	Studentinfo(){
		
	student();

	 String option;
		
	 do {
		 System.out.println("Please choose a stream to assign the students");
		 System.out.println("=============================================");
		 System.out.println("A: Form 1A");
		 System.out.println("B: Form 1B");
		 System.out.println("C: Form 1C");
		 System.out.println();
		  
		 option= scan.next();
		 
		 switch(option) {
		 case "A":
			 System.out.println("Student named: " + studentName + "with admin no: " + adminNo + "was added to form 1A");
			 System.out.println();
			 Form1a.add(studentName);
			 Form1a.add(adminNo);
			 all1a.addAll( Form1a);
			 System.out.println("The form 1A update list is as follows " + Form1a);
			 System.out.println("=============================================");
			 student();
			 break;
		 case "B":
			 System.out.println("Student named: " + studentName + " with admin no: " + adminNo + " was added to form 1B");
			 System.out.println();
			 Form1b.add(studentName);
			 Form1b.add(adminNo);
			 System.out.println("The form 1B update list is as follows " + Form1b);
			 System.out.println("=============================================");
			 student();
			 break;
		 case "C":
			 System.out.println("Student named: " + studentName + " with admin no: " + adminNo + " was added to form 1C");
			 System.out.println();
			 Form1c.add(studentName);
			 Form1c.add(adminNo);
			 System.out.println("The form 1C update list is as follows " + Form1c);
			 System.out.println("=============================================");
			 student();
			 break;
			 
			 default:
				 System.out.println("Invalid option please select correct option");
				 System.out.println("=============================================");
				 break;
		 }
		 
		 
		 		}
	 	while(option!="X");
	 		
	}
	
	public void student(){
		System.out.println("Welcome");
		System.out.println("==================================");
		System.out.println("Please enter the student name below");
		String name = scan.next();
		studentName  = name;
		
		System.out.println();
		
		System.out.println("==================================");
		System.out.println("Please enter the admission number for the student");
		String admin = scan.next();
		adminNo = admin;
	
		System.out.println();
	}
	
	
}
