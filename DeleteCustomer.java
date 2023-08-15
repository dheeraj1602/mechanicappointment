package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteCustomer {

	public static void DeleteCus() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW DELETING A CUSTOMER DETAIL");
		System.out.println("  DO YOU  REALLY WANT TO DELETE");
		System.out.println(" PRESS 1 TO DELETE ");
		System.out.println("PRESS ANY OTHER KEY TO CANCEL");
		
		 int S= sc.nextInt();
		 if(S == 1)
		 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con2=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
		Statement st2=con2.createStatement();
        
		System.out.println("Enter customer id to delete:-");
		int a=sc.nextInt();
		
		String deleteQuery="delete from customers where cust_id= '"+a+"'";
		
		int res2=st2.executeUpdate(deleteQuery);
		//System.out.println("hello world")
		if(res2==0)
		{
			System.out.println("Record not deleted");
		}
		else
		{ 
			System.out.println("Record  deleted");
		}	
			
		
		st2.close();
		con2.close();

		       }
		


	}

}
