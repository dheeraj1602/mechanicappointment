package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DetailsAppointment {

	public static void DetailsApp() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW PRINTING DETAILS OF AN APPOINTMENT ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con4=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
		Statement st4=con4.createStatement();
        
		System.out.println("Enter appointment id to print values:-");
		int a4=sc.nextInt();
		
		String selectQuery="select * from appointment where app_id= ?";
		PreparedStatement preparedStatement=con4.prepareStatement(selectQuery);
		preparedStatement.setInt(1, a4);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
            int appId = resultSet.getInt("app_id");
            int custId  = resultSet.getInt("cust_id");
            int mechId  = resultSet.getInt("mech_id");
            String appDate= resultSet.getString("app_date");
            String appSlot=resultSet.getString("app_slot");

            System.out.println("Appointment ID: " + appId);
            System.out.println("Customer ID: " + custId);
            System.out.println(" mechanic ID: " + mechId);
            System.out.println("appointment date:"+appDate);
            System.out.println("appointment slot: " + appSlot);
            
            
                               }
		st4.close();
		con4.close();

        resultSet.close();
        preparedStatement.close();

	}

}
