package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SingleCustomer {

	public static void SingleCus() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW PRINTING ALL DETAILS OF A CUSTOMER ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con4=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
		Statement st4=con4.createStatement();
        
		System.out.println("Enter customer id to print values:-");
		int a4=sc.nextInt();
		
		String selectQuery="select * from customers where cust_id= ?";
		PreparedStatement preparedStatement=con4.prepareStatement(selectQuery);
		preparedStatement.setInt(1, a4);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
            int custId = resultSet.getInt("cust_id");
            String custName = resultSet.getString("cust_name");
            String vehicleNo=resultSet.getString("vehicle_no");
            String custmobno= resultSet.getString("cust_mob_no");
            String addr=resultSet.getString("cust_address");

            System.out.println("Customer ID: " + custId);
            System.out.println("Customer Name: " + custName);
            System.out.println(" vehicle Number: " + vehicleNo);
            System.out.println("customer mobile number:"+custmobno);
            System.out.println("Customer address: " + addr);
            
            
                               }
		st4.close();
		con4.close();

        resultSet.close();
        preparedStatement.close();

	}

}
