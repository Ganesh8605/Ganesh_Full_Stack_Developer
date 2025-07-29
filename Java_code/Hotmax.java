import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
class Hotmax
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		UIManager.put("OptionPane.messageFont",new Font("Arial",Font.BOLD,24));
		UIManager.put("OptionPane.buttonFont",new Font("Arial",Font.PLAIN,20));
		JOptionPane.showMessageDialog(null,"PLEASE LOGIN TO CONTINUE","Hotmax",JOptionPane.INFORMATION_MESSAGE);
		System.out.print("\t\tENTER YOUR USER ID : ");
		String username=sc.nextLine();
		System.out.print("\t\tENTER YOUR PASSWORD : ");
		int password=sc.nextInt();
		JOptionPane.showMessageDialog(null,"WELCOME TO HOTMAX\n PLEASE ORDER YOUR FOOD","welcome to Hotmax",JOptionPane.INFORMATION_MESSAGE);
	    System.out.println("\t\t\t***VANAKKAM CHENNAI***");
		System.out.println("\t\t\tENTER THE HOTEL NAME");
		System.out.println("\t\t<----------------------------->");
		System.out.println("\t\t1.BHUHARI\n\t\t2.A2B\n\t\t3.AMMA CANTEEN\n\t\t4.S.S.HYDERABAD");
		System.out.print("\t\tPRESS THE NUMBER : ");
		int a= sc.nextInt();
		double price;
		int qty;
		int response=JOptionPane.showConfirmDialog(null,"ARE YOU SURE TO ENTER ?","HOTMAX",JOptionPane.YES_NO_OPTION);
		if (response==JOptionPane.YES_OPTION)
		{
		  System.out.println("\t\tYOU'RE ENTERING INTO HOTEL SERVER");
		  System.out.println("\t\t **********************************");
		  System.out.println("\t\t ****please wait........***");
		  Thread.sleep(3000);
	   }
	   else
		{
		  System.out.println("\t\tYOUR CLOSED THE APPLICATION");
		  System.exit(0);
		}
		
		switch (a)
		{
		case 1: System.out.println("\t\t\t\t\t\t\t\t\tWELCOME TO BHUHARI");
		        System.out.println("\t\t\t\t\t\t\t\t\t*******************");
				System.out.println("\t\tSELECT THE MENU");
				System.out.println("\t\t---------------");
				System.out.println("\t1.CHICKEN BIRYANI - 80rs\n\t2.MUTTON BIRYANI -90rs\n\t3.CHICKEN FRIED RICE - 100rs\n\t4.FISH BIRYANI - 130rs");
				System.out.println("\t************************************************");
				System.out.print("\t\tSELECT THE FOOD BY PRESSING NUMBER : ");
				int b =sc.nextInt();
				switch(b)
			{
				case 1:System.out.println("\t\t***YOU'RE SELECTED CHICKEN BIRYANI***");
				       System.out.println("\t\t  <------------------------------->");
			           System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 80;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 2:System.out.println("\t\t***YOU'RE SELECTED MUTTON BIRYANI***");
				       System.out.println("\t\t  <------------------------------>");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 90;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 3:System.out.println("\t\t***YOU'RE SELECTED CHICKEN FRIED RICE***");
				       System.out.println("\t\t  <---------------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 100;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 4:System.out.println("\t\t***YOU'RE SELECTED FISH BIRYANI***");
				       System.out.println("\t\t  <---------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 130;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				default: System.out.println("\t\t\t****NO MENU****");
				System.exit(0);
			}
		break;
		case 2: System.out.println("\t\t\t\t\t\t\t\t\tWELCOME TO A2B");
		        System.out.println("\t\t\t\t\t\t\t\t\t*******************");
				System.out.println("\t\tSELECT THE MENU");
				System.out.println("\t\t---------------");
				System.out.println("\t1.CHICKEN BURGER - 50rs\n\t2.PIZZA - 99rs\n\t3.MOMOS - 45rs\n\t4.CHOCOLATE CAKE - 60rs");
				System.out.print("\t\tSELECT THE ITEM BY PRESSING NUMBER : ");
				int c =sc.nextInt();
				switch(c)
			{
				case 1:System.out.println("\t\t***YOU'RE SELECTED CHICKEN BURGER***");
				       System.out.println("\t\t  <------------------------------->");
			           System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 80;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 2:System.out.println("\t\t***YOU'RE SELECTED PIZZA***");
				       System.out.println("\t\t  <------------------------------>");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 90;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 3:System.out.println("\t\t***YOU'RE SELECTED MOMOS***");
				       System.out.println("\t\t  <---------------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 45;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 4:System.out.println("\t\t***YOU'RE SELECTED CHOCOLATE CAKE***");
				       System.out.println("\t\t  <---------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 60;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);	  
					   break;
			    default: System.out.println("\t\t\t****NO MENU****");
				System.exit(0);
			}
		break;
		case 3: System.out.println("\t\t\t\t\t\t\t\t\tWELCOME TO AMMA CANTEEN");
		        System.out.println("\t\t\t\t\t\t\t\t\t*******************");
				System.out.println("\t\tSELECT THE MENU");
				System.out.println("\t\t---------------");
				System.out.println("\t1.SET OF IDLY  - 10rs\n\t2.SET OF DOSA - 15rs\n\t3.POORI - 8rs\n\t4.PONGAL - 25rs");
				System.out.print("\t\tSELECT THE ITEM BY PRESSING NUMBER : ");
				int d =sc.nextInt();
				switch(d)
			{
				case 1:System.out.println("\t\t***YOU'RE SELECTED SET OF IDLY***");
				       System.out.println("\t\t  <------------------------------->");
			           System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 10;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 2:System.out.println("\t\t***YOU'RE SELECTED SET OF DOSA***");
				       System.out.println("\t\t  <------------------------------>");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 15;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 3:System.out.println("\t\t***YOU'RE SELECTED POORI***");
				       System.out.println("\t\t  <---------------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 8;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 4:System.out.println("\t\t***YOU'RE SELECTED PONGAL***");
				       System.out.println("\t\t  <---------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 25;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);	  
					   break;
				default: System.out.println("\t\t\t****NO MENU****");
				System.exit(0);
					   
			}
		break;
		case 4: System.out.println("\t\t\t\t\t\t\t\t\tS.S.HYDRABAD");
		        System.out.println("\t\t\t\t\t\t\t\t\t*******************");
				System.out.println("\t\tSELECT THE MENU");
				System.out.println("\t\t---------------");
				System.out.println("\t1.BUCKET CHICKEN BIRIYANI - 600rs\n\t2.PRAWN BIRIYANI - 150rs\n\t3.FISH CURRY - 180rs\n\t4.MUTTON BIRYANI - 160rs");
				System.out.print("\t\tSELECT THE ITEM BY PRESSING NUMBER : ");
				int e =sc.nextInt();
				switch(e)
			{
				case 1:System.out.println("\t\t***YOU'RE SELECTED BUCKET CHICKEN BIRIYANI***");
				       System.out.println("\t\t  <------------------------------->");
			           System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 600;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 2:System.out.println("\t\t***YOU'RE SELECTED PRAWN BIRIYANI***");
				       System.out.println("\t\t  <------------------------------>");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 150;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 3:System.out.println("\t\t***YOU'RE SELECTED FISH CURRY***");
				       System.out.println("\t\t  <---------------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 180;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);
					   break;
				case 4:System.out.println("\t\t***YOU'RE SELECTED MUTTON BIRYANI***");
				       System.out.println("\t\t  <---------------------------->");
					   System.out.print("\t\tSELECT THE QUANTITY : ");
					    price = 160;
					    qty=sc.nextInt();
					   System.out.println("\t\t\t TOTAL AMOUNT : "+price*qty);	  
					   Thread.sleep(3000);	
					   System.out.println("\t\t\tYOUR BILL IS : "+price*qty);
					   break;
				default: System.out.println("\t\t\t****NO MENU****");
				System.exit(0);
			}
		break;
		default:System.out.println("\t\t\t****THE HOTEL NOT AVAILABLE*****"); 
		        System.exit(0);
		}
		
		System.out.println("\t\t---------------------------------");
	    System.out.print("\t\t\tPRESS ANY KEY TO PLACE ORDER : ");
		String con=sc.next();
		int response1=JOptionPane.showConfirmDialog(null,"PLEASE CONFIRM YOUR ORDER ?","HOTMAX",JOptionPane.OK_CANCEL_OPTION);
		if (response1==JOptionPane.OK_OPTION)
		{
		  System.out.println("\t\t PLEASE SELECT YOUR PAYMENT MODE");
		  System.out.println("\t\t **********************************");
		  System.out.print("\t\t1.PHONE PAY\n\t\t2.GPAY\n\t\t3.PAYTM\n\t\t4.CASH : ");
		  int pay=sc.nextInt();
		  
		  switch (pay)
		  {
		  case 1,2,3:System.out.print("\t\t ENTER UPI MOBILE NUMBER : ");
		            long mob=sc.nextLong();
			        System.out.println("\t\t YOUR OTP IS GENERATING...");
		          Thread.sleep(4000);
				  int sys_otp=((int)(Math.random()*999+999));
				  int response2=JOptionPane.showConfirmDialog(null,"YOUR OTP IS : "+sys_otp,"HOTMAX",JOptionPane.OK_CANCEL_OPTION);
		          if (response2==JOptionPane.OK_OPTION)
			      {
				    System.out.print("\t\t ENTER YOUR OTP : ");  
		            int user_otp=sc.nextInt();
					
					if (sys_otp==user_otp)
					  {
						System.out.println("\t\t\tVERIFYING OTP PLEASE WAIT.... :");
						Thread.sleep(4000);
						System.out.println("\t\t\tVERIFICATION SUCCESS...:");
						System.out.println("\t\t\t---------------------");
				        System.out.println("\t\t\t-----YOUR ORDER IS CONFIRMED-----: ");
						System.out.println("\t\t\t-----HAVE A NICE DAY :) ----- ");
						System.exit(0);
					  }
					else
						System.out.println("\t\t\tYOU'RE ENTERED WRONG OTP :");
						System.out.println("\t\t\t****VERIFICATION FAILED :(**** ");
						
					
					    System.exit(0);
				  }
				break;
				default: System.out.println("\t\t\t****PAY YOUR CASH IN BILL COUNTER***");  
				         System.out.println("\t\t\t****HAVE A NICE DAY BUDDY***");  
		  }
		  
	   }
	   else
		{
		  System.out.println("\t\t<--------YOUR ORDER IS CANCELLED-------->");
		  System.exit(0);
		}
	}
}
