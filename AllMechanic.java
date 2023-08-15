package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AllMechanic {

	public static void AllMech() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW VIEWING DETAILS OF ALL MECHANICS");
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mech_db", "root", "Dm16021@");

        String selectQuery1 = "SELECT * FROM mechanic";
        PreparedStatement preparedStatement1 = con5.prepareStatement(selectQuery1);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        while (resultSet1.next()) 
        {
                int mechId = resultSet1.getInt("mech_id");
                String mechName = resultSet1.getString("mech_name");
                String mechemail=resultSet1.getString("mech_email");
                String mechmobno= resultSet1.getString("mech_mob_no");
                String exp=resultSet1.getString("mech_exp");
                String time=resultSet1.getString("mech_time");

                System.out.println("Mechanic ID: " + mechId);
                System.out.println("Mechanic Name: " + mechName);
                System.out.println("Mechanic email: " + mechemail);
                System.out.println("Mechanic mobile number:"+mechmobno);
                System.out.println("Mechanic expertise address: " + exp);
                System.out.println("Mechanic availability time: " + time);
                
                System.out.println("  ");
                System.out.println("  ");
          }

        resultSet1.close();
        preparedStatement1.close();
		con5.close();

	}

}
