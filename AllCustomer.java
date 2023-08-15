package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AllCustomer {
	
	 public static void AllCus() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW PRINTING ALL CUSTOMER DETAILS");
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mech_db", "root", "Dm16021@");

        String selectQuery1 = "SELECT * FROM customers";
        PreparedStatement preparedStatement1 = con5.prepareStatement(selectQuery1);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        while (resultSet1.next()) {
            int custId = resultSet1.getInt("cust_id");
            String custName = resultSet1.getString("cust_name");
            String vehicleNo = resultSet1.getString("vehicle_no");
            String custMobNo = resultSet1.getString("cust_mob_no");
            String addr = resultSet1.getString("cust_address");

            System.out.println("Customer ID: " + custId);
            System.out.println("Customer Name: " + custName);
            System.out.println("Vehicle Number: " + vehicleNo);
            System.out.println("Customer Mobile Number: " + custMobNo);
            System.out.println("Customer Address: " + addr);
            System.out.println();
                                     }

        resultSet1.close();
        preparedStatement1.close();
  
		
		con5.close();

	}

}
