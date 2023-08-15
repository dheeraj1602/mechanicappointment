package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class BookingAppointment {

	public static void BookingApp() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW BOOKING AN APPOINTMENT ");
		System.out.println("Enter appointment id:-");
		int app_id=sc.nextInt();
		System.out.println("Enter customer id");
		int cust_id =sc.nextInt();
		System.out.println("Enter mechanic id");
		int mech_id= sc.nextInt();
		System.out.println("Enter appointment date");
		String app_date=sc.next();
		System.out.println("Enter appointment slot");
		String app_slot= sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
		Statement st=con.createStatement();

		String insertQuery="insert into appointment values('"+app_id+"','"+cust_id+"','"+mech_id+"','"+app_date+"','"+app_slot+"')";
		
		int res=st.executeUpdate(insertQuery);
		//System.out.println("hello world")
		if(res==0)
		{
			System.out.println("Record not inserted");
		}
		else
		{ 
			System.out.println("Record  inserted");
		}	
			
		//ResultSet rs=st.executeQuery("select * from customer");
		
		st.close();
		con.close();
	}

}
