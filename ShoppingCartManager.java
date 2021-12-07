import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class ShoppingCartManager 
{
	  public  void Cart(ArrayList S, ArrayList D) //items will be added to this class now
	    {
	    	 ArrayList<String> CartItem = new ArrayList<String>();
	    	 ArrayList<Double> CartPrices = new ArrayList<Double>();
	    	 //created arraylist to store the items in cart
			
			CartItem = S;
			CartPrices = D;//adding the items to cart
			billing kk = new billing(); // connecting to bill class

			Scanner in=new Scanner(System.in);

			//printing the items and total amount
			 for(int i=0;i<CartItem.size();i++) //printing the items and total amount
			{
				System.out.println(CartItem.get(i)+"  ----  "+CartPrices.get(i)); //printing the item and the price simultaneously
			 	System.out.println();
			}
			 double sum = 0;           //an value to store the total amount
				for(int i = 0; i < CartPrices.size(); i++) 
				{
					sum=sum+CartPrices.get(i);
				}
				System.out.println("Total Amount:-- " +sum); // print the total Amount
			 System.out.println("Select the options you want in the cart"+"\n"
	                 +"1.To print the bill"+"\n"                        //to continue to billing class
			         +"2.Remove the any item"+"\n"                    //remove any item from the class
	                 +"3.if you want to delete all items in cart and shop different type"+"\n"
	                 + "or add the product from same type of the shop(contiue to shopping)");         // to return to the main class or item classes
			 int Choice=in.nextInt(); 
			 // reading  the choice of the costumer
			 switch(Choice) 
			 {
		 case 1:

				System.out.println("sending to billing");
				kk.paymentprocess(sum);
				//Continue to bill...... class
			break;
			 case 2:
				 System.out.println("Enter price of the item You want to delete (as showen above) ");
				 double delete =in.nextDouble();//reading the price of the item user want to delete
				 for(int i=0;i<CartPrices.size();i++) 
				 {
					 if(CartPrices.contains(delete)) 
						 // Find the index of the item in the array list which user want to delete
					  {
						 int index=i; //  index  of the item in the array list
						 CartPrices.remove(index); CartItem.remove(index); 
						 // deleted the items form the arraylist
						 System.out.println("The item was deleted from the cart Successfully!!!!"+"\n"
						                   +"The Upgraded Cart is ");
						 for(int i1=0;i1<CartItem.size();i1++) 
							 System.out.println(CartItem.get(i1)+"  ----  "+CartPrices.get(i1)+"\n"
							 +"Enter 1 to go to bill or Enter 0 to go shopping back");
						 int C = in.nextInt();
						 if (C==1)			{	
							 for(int i1 = 0; i1 <= CartPrices.size(); i1++) 
							{				
								double	sum1=0;sum1=sum1+CartPrices.get(i1);         
								System.out.println("Total Amount:-- " +sum1);
								System.out.println("sending to billing");	
								kk.paymentprocess(sum1);	
								 //Continue to bill......class
							}
						 if (C==0) 
						 {
							 Cart(CartItem, CartPrices);
							 System.out.println("if you surely want to return to shopping press any other number");
							 //will return to the cart again then cost costumer can select the option to back to shopping
						 }
					 }
						 }
					 // if the item with that price is not their in the cart 
					 else System.out.println("Sorry!!!! The item you want to delete is not found in the cart");
				//	 Diverting to the top of the cart to select the options again 
					 Cart(CartItem, CartPrices);

					// SCM.oper(Choice);
				 }
				 break;
				 
			 default:
				 // if the costumer want to continue shopping
				 System.out.println("Enter were you want to go"+"/n"+"\\n | 1.ELECTRONINCS | | 2.FASION | | 3.HOUSEHOLD |");
				 int Re=in.nextInt();
				 switch (Re) 
				 {
				 case 1:
					 // diverting to the electronics class
					 
			     ElectronicOperations Elec = new ElectronicOperations(); 
                 System.out.println("The available products in Electronics :\n\n| MOBILEs | LAPTOPs | TVs | SPEAKERs |\n\n| CAMARAs | POWERBANKs | HARDDISKs | REFRIGIRATORs |\n");
                 System.out.print("Which type of product u want: ");
                 String peru = in.next();
                 Elec.oper(peru); 
                 in.close();
					 break;
				 case 2:
					 // diverting to the Fashion class
					 System.out.println(" what type of fashion u want");
					 System.out.println("\nmens\nwomens\n");
					 fasionOp k = new fasionOp();
					 String y = in.next();
					 k.fashion(y);
                     break; 
				 case 3:
					// diverting to the Household class
					System.out.print("\nItems Available\n\nBed \nCupboard" +
					" \nTable \nSofa \nChair \nCurtains \nCarpets \nExit\n");
			  		System.out.print("\nEnter required item : ");
			  		houseH z=new houseH();
			  		String name = in.next();
			  		z.household(name); 
			  		in.close();
                       break;
					
				 }
				 break;
		}
    }
}