package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AllAppointmentDetails {

	public static void AllAppDet() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW PRINTING ALL APPOINTMENT DETAILS");
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mech_db", "root", "Dm16021@");

        String selectQuery1 = "SELECT * FROM appointment";
        PreparedStatement preparedStatement1 = con5.prepareStatement(selectQuery1);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        while (resultSet1.next()) {
            int appId = resultSet1.getInt("app_id");
            int custId = resultSet1.getInt("cust_id");
            int mechId = resultSet1.getInt("mech_id");
            String appdate = resultSet1.getString("app_date");
            String appslot = resultSet1.getString("app_slot");

            System.out.println("Appointment Id: " + appId);
            System.out.println("Customer Id: " + custId);
            System.out.println("Mechanic Id: " + mechId);
            System.out.println("Appointment date: " + appdate);
            System.out.println("Appointment slot: " + appslot);
            System.out.println();
                                     }

        resultSet1.close();
        preparedStatement1.close();
  
		
		con5.close();

	}

	}


