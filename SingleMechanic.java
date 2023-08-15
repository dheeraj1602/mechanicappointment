package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SingleMechanic {

	public static void SingleMech() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("YOU ARE NOW VIEWING RECORD OF A MECHANIC");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con4=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
		Statement st4=con4.createStatement();
        
		System.out.println("Enter Mechanic id to print values:-");
		int a4=sc.nextInt();
		
		String selectQuery="select * from mechanic where mech_id= ?";
		PreparedStatement preparedStatement=con4.prepareStatement(selectQuery);
		preparedStatement.setInt(1, a4);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
            int mechId = resultSet.getInt("mech_id");
            String mechName = resultSet.getString("mech_name");
            String mechemail=resultSet.getString("mech_email");
            String mechmobno= resultSet.getString("mech_mob_no");
            String exp=resultSet.getString("mech_exp");
            String time=resultSet.getString("mech_time");

            System.out.println("Mechanic ID: " + mechId);
            System.out.println("Mechanic Name: " + mechName);
            System.out.println("Mechanic email: " + mechemail);
            System.out.println("Mechanic mobile number:"+mechmobno);
            System.out.println("Mechanic expertise address: " + exp);
            System.out.println("Mechanic availability time: " + time);
            
            
                               }
		st4.close();
		con4.close();

        resultSet.close();
        preparedStatement.close();

	}

}
