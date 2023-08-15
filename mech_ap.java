package mech;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class mech_ap {

	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in); 
		int I;
		do {
		
		System.out.println("YOU ARE NOW IN THE MAIN MENU");
		System.out.println("PLEASE SELECT ANY ONE OF THE FOLLOWING");
		System.out.println("1.CUSTOMER");
		System.out.println("2.MECHANIC");
		System.out.println("3.APPOINTMENT");
		System.out.println("0.EXIT");
		
		
		I=sc.nextInt();
		switch(I)
		{
		case 1:
			int I1;
			do {
			System.out.println("YOU ARE NOW IN CUSTOMER MENU");
			System.out.println("PLEASE SELECT ANY ONE FROM THE FOLLOWING");
			System.out.println("1.REGISTER CUSTOMER");
			System.out.println("2.MODIFY CUSTOMER DETAILS");
			System.out.println("3.DELETE CUSTOMER RECORD");
			System.out.println("4.VIEW SINGLE RECORD");
			System.out.println("5.VIEW ALL RECORDS");
			System.out.println("6.EXIT FROM CUSTOMER MENU");
			
			
			
			 I1=sc.nextInt();
			switch(I1)
			      {
			case 1:
			
				InsertCustomer.CusInsert();
			 break;
				
			case 2:
		
				ModifyCustomer.ModifyCus();
							
				break;
				
			case 3:
			
				DeleteCustomer.DeleteCus();
				 break;
			case 4:
			
				SingleCustomer.SingleCus();
	             break;
			case 5:
			
				AllCustomer.AllCus();
				break;
			case 6:
				break;
			 default:
				 System.out.println("INVALID INPUT.PLEASE ENTER VALID KEY");
				   break;
				
			      }
			}while(I1 !=6);
		     break;
			
			
		case 2:
			int I2;
			do {
			System.out.println("YOU ARE NOW IN MECHANIC MENU");
			System.out.println("PLEASE SELECT ANY ONE FROM THE FOLLOWING");

			System.out.println("1.VIEW SINGLE RECORD     ");
			System.out.println("2.VIEW ALL RECORDS       ");
			System.out.println("0.EXIT FROM MECHANIC MENU");
			
			
			
			I2 =sc.nextInt();
			switch(I2)
			{
							
			case 1:
				
				SingleMechanic.SingleMech();
	             break;
			case 2:
			
				AllMechanic.AllMech();
				break;
			   
			case 0:
				System.out.println("YOU ARE NOW EXITING FROM MECHANIC MENU");
				break;
			 default:
				 System.out.println(" INVALID INPUT.PLEASE ENTER VALID KEY");
				   break;
				
			      }
				
			
			}while(I2 !=0);
			 break;
			
		case 3:
			int I3;
			do {
			
			System.out.println("YOU ARE NOW IN APPOINTMENT MENU");
			System.out.println("PLEASE SELECT ANY ONE FROM THE FOLLOWING");
			System.out.println("1.BOOK AN APPOINTMENT");
			System.out.println("2.MODIFY APPOINTMENT DETAILS");
			System.out.println("3.DELETE AN APPOINTMENT");
			System.out.println(" 4.VIEW SINGLE RECORD");
			System.out.println(" 4.VIEW ALL RECORDS");
			System.out.println("0.EXIT FROM APPOINTMENT MENU");	
			
			I3=sc.nextInt();
			switch(I3)
			{
			case 1:
			
				BookingAppointment.BookingApp();
			 break;
			case 2:
			
					ModifyAppointment.ModifyApp();		
				break;
			
			case 3:
				
			
				DeleteAppointment.DeleteApp();
				 break;
				
			 case 4:
						
					 DetailsAppointment.DetailsApp();
			             break;
			 case 5:
				 AllAppointmentDetails.AllAppDet();
				 break;
				 
			 case 0:
					 System.out.println("EXITING FROM APPOINTMENT MENU");
					 break;
					 
			  default:
			    	 System.out.println("INVALID INPUT.PLEASE ENTER VALID INPUT");
			    	 break;
			
			}
			
			}while(I3!=0);
			break;
		     
		case 0:
			System.out.println(" THANKYOU FOR CHOOSING OUR PLATFORM");
			
			break;
			
		default:
			 System.out.println(" INVALID INPUT.PLEASE ENTER VALID KEY");
			   break;
			
		
		   }
		
		}while(I!=0);
		     
		    
		
               }
	

	}