import java.util.*;
class Swiggy1
{
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) throws Exception{
	System.out.println("\t\t\t*******Welcome to Swiggy Application*******");
	System.out.println("\t\t\t-------------------------------------------");
	System.out.println("Select the Hotel");
	System.out.println("----------------");
	System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen");
	System.out.print("\t\t\tSelect the Hotel:");
	int hotel=sc.nextInt();
	System.out.println("\t\t\tprocessing.........");
    Thread.sleep(3000);
	switch (hotel)
	{
	case 1:{
		System.out.println("\t\t\tGreetings From Buhari");
		System.out.println("\t\t\t-------------------");
		System.out.println("Select the Menu");
		System.out.println("---------------");
		System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.Prawn Briyani");
		System.out.print("Select the Food :");
		int food=sc.nextInt();
		switch (food)
		{
		case 1:{
			double price=380;
			System.out.println("\t\t\tMutton briyani price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		case 2:{
			double price=180;
			System.out.println("\t\t\tChicken briyani price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		case 3:{
			double price=280;
			System.out.println("\t\t\tPrawn briyani price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		default:{
			System.out.println("\t\t\tInvalid food Selection");
			break;}
		
		}
		
		break;
		}
		case 2:{
			System.out.println("\t\t\tGreetings From A2B");
		System.out.println("\t\t\t-------------------");
		System.out.println("Select the Menu");
		System.out.println("---------------");
		System.out.println("1.Meals\n2.Veg Briyani\n3.Sambar rice");
		System.out.print("Select the Food :");
		int food=sc.nextInt();
		switch (food)
		{
		case 1:{
			double price=150;
			System.out.println("\t\t\tMeals price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		case 2:{
			double price=100;
			System.out.println("\t\t\tVeg briyani price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		case 3:{
			double price=80;
			System.out.println("\t\t\tSambar rice price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		default:{
			System.out.println("\t\t\tInvalid food Selection");
			break;}
		
		}
		
		break;
			
		}
		case 3:{
			System.out.println("\t\t\tGreetings From Amma Canteen");
		System.out.println("\t\t\t-------------------");
		System.out.println("Select the Menu");
		System.out.println("---------------");
		System.out.println("1.Sambar rice\n2.Lemon rice\n3.Curd rice");
		System.out.print("Select the Food :");
		int food=sc.nextInt();
		switch (food)
		{
		case 1:{
			double price=40;
			System.out.println("\t\t\tSambar Rice price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		case 2:{
			double price=40;
			System.out.println("\t\t\tLemon rice price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		case 3:{
			double price=35;
			System.out.println("\t\t\tCurd rice price:"+price);
			System.out.print("\t\t\tEnter the Quantity :");
			int qty=sc.nextInt();
			double bill=qty*price;
			System.out.println("\t\t\tTotal bill value is:"+bill);
			System.out.print("\t\t\tEnter 'S' to Conform 'N' to Cancel:");
			char order_conformation=sc.next().charAt(0);
			if(order_conformation=='S' || order_conformation=='s'){
				System.out.println("\t\t\tRedirecting to Payment GateWay");
				 Thread.sleep(3000);
				System.out.println("\t\t\tSelect the Payment Mode");
				System.out.println("\t\t\t1.Gpay\n\t\t\t2.Phonepay\n\t\t\t3.Cash on delivery");
				System.out.print("\t\t\tGive your payment Option :");
				int pay=sc.nextInt();
				switch (pay)
				{
				case 1:{
					System.out.println("\t\t\t*****Gpay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 2:{
					System.out.println("\t\t\t*****Phonepay*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.print("\t\t\tPlease enter the bill:");
					double user_enter_bill=sc.nextDouble();
					if(user_enter_bill==bill){
						System.out.println("\t\t\tSending otp to register mobile number......");
						Thread.sleep(3000);
						int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Placed");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				case 3:{
					System.out.println("\t\t\t*****Cash On Delivery*****");
					System.out.println("\t\t\tYour Total bill is :"+bill);
					System.out.println("\t\t\tYour order number is sending to register mobile number......");
					Thread.sleep(3000);
					int sys_ord_num=(int)(Math.random()*1234+1234);
					Thread.sleep(3000);
					System.out.print("\t\t\tYour Order number  is :");
					Thread.sleep(3000);
					System.out.println(sys_ord_num);
					System.out.print("\t\t\tEnter the order_number :");
					int user_order_num=sc.nextInt();
					if(user_order_num==sys_ord_num){
						System.out.println("\t\t\tYou have yo pay the bill to delivery partner After the delivery");
						Thread.sleep(3000);
						System.out.print("\t\t\tEnter the amount:");
						int amount=sc.nextInt();
						
						
						if(amount==bill){
							System.out.println("\t\t\tthe payment is success....");
							System.out.println("\t\t\totp will generate to registered number....");
							int sys_otp=(int)(Math.random()*1234+1234);
						Thread.sleep(3000);
						System.out.print("\t\t\tYour otp is :");
						Thread.sleep(3000);
						System.out.println(sys_otp);
						System.out.print("\t\t\tEnter the otp :");
						int user_otp=sc.nextInt();
						if(user_otp==sys_otp){
							System.out.println("\t\t\tVerifying.....");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tOrder Delivered");
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						}
						else{
							System.out.println("\t\t\tOrder failed");
						}
						
						
						
					}
					else{
						System.out.println("\t\t\tYour bill amount is Not Match");
					}
					
					
					break;
				}
				default:{
					System.out.println("\t\t\tInvalid payment Option");
					break;}
				
				}
				
				
			}
			else if(order_conformation=='N' || order_conformation=='n'){
				System.out.println("\t\t\tOrder Failed");
			}
			else{
				System.out.println("\t\t\tInvalid Selection");
			}
			break;
		}
		default:{
			System.out.println("\t\t\tInvalid food Selection");
			break;
			}
		
		}
		
		break;
		}
		default:{
			System.out.println("\t\t\tInvalid hotel Selection");
			break;
		}
	
	}
	
}
}
