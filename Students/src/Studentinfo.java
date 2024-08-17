/*3 class streams Form 1a,1b and 1c
 * view all class streams
 * view a single stream
 * student info(name,admin,class)
 * edit info
 * delete student
 * view a single student
 * view all the students
 * view students in one stream*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Studentinfo {
	
	String studentName;
	String adminNo;
	int id;
	
	List <String> Form1a = new ArrayList<String>();
	List <String> Form1b = new ArrayList<String>();
	List <String> Form1c = new ArrayList<String>();
	
	Scanner scan = new Scanner(System.in);
	
	
	
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
			 System.out.println("The form 1A update list is as follows " + Form1a);
			 System.out.println("=============================================");
			 try {
				  //Creates a java connection with mySQL database
				  
				  String myDriver = "com.mysql.cj.jdbc.Driver";
				  Class.forName(myDriver);
		          Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Student",
		              "root", "password");
		          System.out.println("Conection created");
		          System.out.println("============================");

		          // Insert the values in the db
		          
		          PreparedStatement st = (PreparedStatement) connection
		              .prepareStatement("insert into Form1a(id,studentName,adminNo)" + "values(?,?,?)");

		          st.setInt(1,0);
		          st.setString(2, studentName);
		          st.setString(3, adminNo);
		          
		          
		          st.execute();
		          
		          connection.close();
		          }
				  catch (Exception a)
				    {
				      System.err.println("Got an exception!");
				      System.err.println(a.getMessage());
				    }
			 student();
			 break;
		 case "B":
			 System.out.println("Student named: " + studentName + " with admin no: " + adminNo + " was added to form 1B");
			 System.out.println();
			 Form1b.add(studentName);
			 Form1b.add(adminNo);
			 System.out.println("The form 1B update list is as follows " + Form1b);
			 System.out.println("=============================================");
			 try {
				  //Creates a java connection with mySQL database
				  
				  String myDriver = "com.mysql.cj.jdbc.Driver";
				  Class.forName(myDriver);
		          Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Student",
		              "root", "password");
		          System.out.println("Conection created");
		          System.out.println("============================");

		          // Insert the values in the db
		          
		          PreparedStatement st = (PreparedStatement) connection
		              .prepareStatement("insert into Form1b(id,studentName,adminNo)" + "values(?,?,?)");

		          st.setInt(1,0);
		          st.setString(2, studentName);
		          st.setString(3, adminNo);
		          
		          
		          st.execute();
		          
		          connection.close();
		          }
				  catch (Exception a)
				    {
				      System.err.println("Got an exception!");
				      System.err.println(a.getMessage());
				    }
			 student();
			 break;
		 case "C":
			 System.out.println("Student named: " + studentName + " with admin no: " + adminNo + " was added to form 1C");
			 System.out.println();
			 Form1c.add(studentName);
			 Form1c.add(adminNo);
			 System.out.println("The form 1C update list is as follows " + Form1c);
			 System.out.println("=============================================");
			 try {
				  //Creates a java connection with mySQL database
				  
				  String myDriver = "com.mysql.cj.jdbc.Driver";
				  Class.forName(myDriver);
		          Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Student",
		              "root", "password");
		          System.out.println("Conection created");
		          System.out.println("============================");

		          // Insert the values in the db
		          
		          PreparedStatement st = (PreparedStatement) connection
		              .prepareStatement("insert into Form1c(id,studentName,adminNo)" + "values(?,?,?)");

		          st.setInt(1,0);
		          st.setString(2, studentName);
		          st.setString(3, adminNo);
		          
		          
		          st.execute();
		          
		          connection.close();
		          }
				  catch (Exception a)
				    {
				      System.err.println("Got an exception!");
				      System.err.println(a.getMessage());
				    }
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
