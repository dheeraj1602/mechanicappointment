package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModifyAppointment {

	public static void ModifyApp() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW MODIFYING APPOINTMENT DETAILS");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        
		System.out.println("Enter appointment id to update:-");
		int a2=sc.nextInt();
		int I7;
		do {
			
			
			System.out.println("                  1.MODIFY CUSTOMER ID");
			System.out.println("                  2.MODIFY MECH ID");
			System.out.println("                  3.MODIFY APPLICATION DATE");
			System.out.println("                  4.APPLICATION SLOT");
			System.out.println("                  0. EXIT FROM MODIFYING MENU");
		I7=sc.nextInt();
		switch(I7)
		{
		
		case 1:
            System.out.println(" YOU ARE NOW MODIFYING CUSTOMER ID");
            System.out.println(" PLEASE ENTER CUSTOMER ID ");
            Connection con4=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
			Statement st4=con4.createStatement();
            int newname = sc.nextInt();
            String updateQuery = "UPDATE appointment SET cust_id = '" + newname + "' WHERE app_id = " + a2;
            int resMobile = st4.executeUpdate(updateQuery);
            
            if (resMobile == 0) {
                System.out.println("Customer id not updated");
            } else {
                System.out.println("Customer id updated");
            }
            
            st4.close();
			con4.close();
            break;
            
        case 2:
        	 System.out.println(" YOU ARE NOW MODIFYING MECHANIC ID");
             System.out.println(" PLEASE ENTER THE NEW MECHANIC ID");
             Connection con5=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
				Statement st5=con5.createStatement();
             int newveh = sc.nextInt();
             String updateQuery1 = "UPDATE appointment SET mech_id = '" + newveh + "' WHERE app_id = " + a2;
             int resMobile1 = st5.executeUpdate(updateQuery1);
             
             if (resMobile1 == 0) {
                 System.out.println("MECHANIC ID NOT UPDATED");
             } else {
                 System.out.println("MECHANIC ID UPDATED");
             }
             st5.close();
				con5.close();
            break;
            
        case 3:
       	 System.out.println(" YOU ARE NOW MODIFYING APPOINTMENT DATE");
            System.out.println(" PLEASE ENTER THE  NEW APPOINTMENT DATE");
            Connection con6=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
			Statement st6=con6.createStatement();
            String newnum = sc.next();
            String updateQuery2 = "UPDATE appointment SET app_date = '" + newnum + "' WHERE app_id = " + a2;
            int resMobile2 = st6.executeUpdate(updateQuery2);
            
            if (resMobile2 == 0) {
                System.out.println("APPOINTMENT DATE NOT MODIFIED");
            } else {
                System.out.println("APPOINTMENT DATE MODIFIED");
            }
           
            st6.close();
			con6.close();
           break;
        case 4:
          	 System.out.println(" YOU ARE NOW MODIFYING APPOINTMENT SLOT");
               System.out.println(" PLEASE ENTER THE  NEW SLOT");
               Connection con7=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
				Statement st7=con7.createStatement();
               String newadd = sc.next();
               String updateQuery3 = "UPDATE appointment SET app_slot = '" + newadd + "' WHERE app_id = " + a2;
             
               int resMobile3 = st7.executeUpdate(updateQuery3);
               
               if (resMobile3 == 0) {
                   System.out.println("APPOINTMENT SLOT NOT MODIFIED");
               } else {
                   System.out.println("APPOINTMENT SLOT MODIFIED");
               }
              
              break;
        
        case 0:
			System.out.println(" YOU ARE NOW EXITING APPOINTMENT MODIFYING MENU ");
			
			break;
			
		default:
			 System.out.println(" Invalid input.Please enter valid key");
			   break;
			   
		}
		
		}while(I7!=0);

	}

}
