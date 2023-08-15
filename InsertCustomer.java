package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertCustomer {

	public static void CusInsert() throws  Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW REGISTERING A CUSTOMER");
		System.out.println("Enter user id:-");
		int cust_id=sc.nextInt();
		System.out.println("Enter user name");
		String cust_name =sc.next();
		System.out.println("Enter vehicle number");
		String vehicle_no= sc.next();
		System.out.println("Enter phone number");
		String cust_mob_no=sc.next();
		System.out.println("Enter customer address");
		String cust_address= sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
		Statement st=con.createStatement();

		String insertQuery="insert into customers values('"+cust_id+"','"+cust_name+"','"+vehicle_no+"','"+cust_mob_no+"','"+cust_address+"')";
		
		int res=st.executeUpdate(insertQuery);
		
		if(res==0)
		{
			System.out.println("RECORD NOT INSERTED");
		}
		else
		{ 
			System.out.println("RECORD INSERTED");
		}	

		
		st.close();
		con.close();

	}

}
