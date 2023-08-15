package mech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ModifyCustomer {

	public static void ModifyCus() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("YOU ARE NOW MODIFYING CUSTOMER DETAILS");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        
		System.out.println("Enter customer id to update:-");
		int a2=sc.nextInt();
		int I6;
		do {
			
			
			System.out.println("                  1.MODIFY CUSTOMER NAME");
			System.out.println("                  2.MODIFY CUSTOMER VEHICLE NUMBER");
			System.out.println("                  3.MODIFY CUSTOMER MOBILE NUMBER");
			System.out.println("                  4.MODIFY CUSTOMER ADDRESS");
			System.out.println("                  0. EXIT FROM MODIFYING MENU");
		I6=sc.nextInt();
		switch(I6)
		{
		
		case 1:
            System.out.println(" YOU ARE NOW MODIFYING CUSTOMER NAME");
            System.out.println(" PLEASE ENTER THE CUSTOMER NAME");
            Connection con4=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
			Statement st4=con4.createStatement();
            String newname = sc.next();
            String updateQuery = "UPDATE customers SET cust_name = '" + newname + "' WHERE cust_id = " + a2;
            int resMobile = st4.executeUpdate(updateQuery);
            
            if (resMobile == 0) {
                System.out.println("Customer name not updated");
            } else {
                System.out.println("Customer name updated");
            }
            
            st4.close();
			con4.close();
            break;
            
        case 2:
        	 System.out.println(" YOU ARE NOW MODIFYING VEHICLE NUMBER");
             System.out.println(" PLEASE ENTER THE  NEW VEHICLE NUMBER");
             Connection con5=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
				Statement st5=con5.createStatement();
             String newveh = sc.next();
             String updateQuery1 = "UPDATE customers SET vehicle_no = '" + newveh + "' WHERE cust_id = " + a2;
             int resMobile1 = st5.executeUpdate(updateQuery1);
             
             if (resMobile1 == 0) {
                 System.out.println("Vehicle number not updated");
             } else {
                 System.out.println("Vehicle number updated");
             }
             st5.close();
				con5.close();
            break;
            
        case 3:
       	 System.out.println(" YOU ARE NOW MODIFYING CUSTOMER MOBILE NUMBER");
            System.out.println(" PLEASE ENTER THE  NEW MOBILE NUMBER");
            Connection con6=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
			Statement st6=con6.createStatement();
            String newnum = sc.next();
            String updateQuery2 = "UPDATE customers SET cust_mob_no = '" + newnum + "' WHERE cust_id = " + a2;
            int resMobile2 = st6.executeUpdate(updateQuery2);
            
            if (resMobile2 == 0) {
                System.out.println("customer mobile number not updated");
            } else {
                System.out.println("customer mobile number updated");
            }
           
            st6.close();
			con6.close();
           break;
        case 4:
          	 System.out.println(" YOU ARE NOW MODIFYING CUSTOMER ADDRESS");
               System.out.println(" PLEASE ENTER THE  NEW ADDRESS");
               Connection con7=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/mech_db", "root","Dm16021@");
				Statement st7=con7.createStatement();
               String newadd = sc.next();
               String updateQuery3 = "UPDATE customers SET cust_address = '" + newadd + "' WHERE cust_id = " + a2;
             
               int resMobile3 = st7.executeUpdate(updateQuery3);
               
               if (resMobile3 == 0) {
                   System.out.println("customer address not updated");
               } else {
                   System.out.println("customer address updated");
               }
              
              break;
        
        case 0:
			System.out.println(" YOU ARE NOW EXITING FROM MODIFYING CUSTOMER DETAILS MENU ");
			
			break;
			
		default:
			 System.out.println(" Invalid input.Please enter valid key");
			   break;
			   
		}
		
		}while(I6!=0);

	}

}
