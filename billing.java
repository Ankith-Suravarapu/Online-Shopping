import java.util.ArrayList;
import java.util.Scanner;

class details{

private String name;
private String address;
private String housenum;
private String state;
private String distic;
private long phonenum ;
private double pincode ;
	
ArrayList<String> names = new ArrayList<String>(6);
ArrayList<String> addressofhouse = new ArrayList<String>(6);
ArrayList<String> housenumber = new ArrayList<String>(6);
ArrayList<String> distics = new ArrayList<String>(6);
ArrayList<Double> phonenumbers = new ArrayList<Double>(6);
ArrayList<Double> pincodes = new ArrayList<Double>(6);


public void setaddress(String Name)
{
    this.address=Name;
}
public String getname()
{
    return address;
}
public void sethousenum (String houseNum)
{
    this.housenum=houseNum;
}
public String gethousenum()
{
    return housenum;
}
public void setstate(String State)
{
    this.state=State;
}
public String getstate()
{
    return state;
}
public void setdistic(String Dis)
{
    this.distic=Dis;
}
public String getdistic()
{
    return distic;
}
public void phonenum(Long PN)
{
    this.phonenum=PN;
}
public double getphonenum()
{
    return phonenum;
}
public void pincode (Long pinc) 
{
	   this.pincode=pinc;
}
public double getpincode()
{
    return pincode;
}

class address extends details{
	  public void addressitems (String name,String address,String housenum,String state,String distic,long phonenum)
	    {
		  super.names.add(getname());
	      super.addressofhouse.add(gethousenum());
	      super.housenumber.add(getstate());
	      super.distics.add(getdistic());
	      super.phonenumbers.add(getphonenum());
	      super.pincodes.add(getpincode());
	       for(int i=0; i<1;i++) {
	       
	       System.out.println("the delivery address of of your order ");
           System.out.println("name: "+names.get(i));
           System.out.println("house number: "+housenumber.get(i));
           System.out.println("city: "+distics.get(i));
           System.out.println("pin code: "+pincodes.get(i));
           
           System.out.println("phone no: "+phonenumbers.get(i));
           
	        
}
}
}
}

class billing extends ShoppingCartManager{
	public void paymentprocess(double sum) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The delaviary Address   ");
		System.out.print("name : ");
		String username = input.next();
		System.out.print("house number: ");
		String housenum = input.next();
		System.out.print("state: ");
	    String state= input.next();
		System.out.print("city: ");
	    String city= input.next();
	    System.out.print("pin code: ");
	    int pincode= input.nextInt();
	    System.out.print("phone no:");
	    long phonenum1= input.nextLong();
	    
	    System.out.println("Mode of Payment"+"\n"+
		           "Select the Choice You Want"+"\n"+
		           "1. online banking"+"\n"+
		           "2. debit/credit/Atm cards"+"\n"+
		           "3. cod"+"\n"+
		           "4. EMI"+"\n"+
	               "5. UPI"+"\n");
	    
int Choice=input.nextInt();

		switch (Choice)
		{
		case 1://online banking
			System.out.print("Enter the bank name:" );
			String Bankname= input.next();
			System.out.println("enter the phone num linked to "+Bankname);
			long linkednum= input.nextLong();
		    System.out.println("enter the 6 digit otp sent to "+ linkednum);
		    int obotp= input.nextInt();
			System.out.println(
 		           "Select the Choice You Want"+"\n"+
 		           "1. to continue payment"+"\n"+
 		           "2. return to home page"+"\n");
			int conchoice=input.nextInt();
			switch (Choice)
			{
			case 1:
 			if (conchoice==1) {
 				System.out.println("-----------your is order succuss----------" );
 		System.out.println("your is payment refference no:823432445565" );
 			}
 			else {
 	   System.out.println("your is order is cancled" );
 	        
 		}
 			
 		}
			break;
		
 case 2://debit/credit/Atm cards
			System.out.print("Enter the name of the card hoalder" );
			String cardname= input.next();
			System.out.print("enter the card number" );
			long cardnum= input.nextLong();
			System.out.print("enter the expiry MM" );
			int expmon= input.nextInt();
			System.out.print("enter the expiry YYYY" );
			int expyear= input.nextInt();
			System.out.print("Enter the otp which linked to card" );
			int otpcard= input.nextInt();
			System.out.println(
 		           "Select the Choice You Want"+"\n"+
 		           "1. to continue payment"+"\n"+
 		           "2. to stop payment"+"\n");
			int cardopp=input.nextInt();
			
 		if(cardopp==1) {
 			System.out.println("-----------your is order succuss----------" );
 		System.out.println("your is payment refference no:675767567556" );
			}
 		else
 	   System.out.println("your is order is cancled" );
			break;
			
			
		case 3:// COD
			System.out.println(
	 		           "Select the Choice You Want"+"\n"+
	 		           "1. to continue the cod"+"\n"+
	 		           "2. to stop the cod"+"\n");
				int codinput=input.nextInt();
			
	 			if (codinput==1) {
	 				System.out.println("-----------your is order succuss----------" );
	 	  System.out.println("your is payment refference no:847324587652" );
	 			}
	 			else
	 	   System.out.println("your is order is cancled" );
	 			
	 		
			break;	
			
		case 4://emi
			System.out.print("Name of the card holder : ");
			String emicad = input.next();
			System.out.print(" Card number : ");
			long emicadno = input.nextLong();
			System.out.print("Enter the expiry MM :"  );
			int emiexpmon= input.nextInt();
			System.out.print("enter the expiry YYYY :" );
			int emiexpyear= input.nextInt();
			System.out.print("the number of months do u want to pay:");
		    int emimonths =input.nextInt();
		    System.out.println("the payment you are paying in the months of : "+emimonths);
			System.out.println(
			           "Select the Choice You Want"+"\n"+
			           "1. to continue payment"+"\n"+
			           "2. to stop payment"+"\n");
				int Emichoice =input.nextInt();
				

				if (Emichoice==1) {
			System.out.println("-----------your is order succuss----------" );
			System.out.println("your is payment refference no:6546755675764" );
				     }
				
				else 
		 System.out.println("-------------Your is order is cancled-----------" );
			
			
				break;	
				
		case 5://upi
			System.out.print("Enter the UPI id: ");
			String upiid=input.next();
			System.out.print("Enter the mobile number linked to "+upiid);
			long upilinkednum=input.nextInt();
			System.out.print("Enter the otp which sent to "+upilinkednum);
			long upiotp=input.nextInt();
			System.out.println(
			           "Select the Choice You Want"+"\n"+
			           "1. to continue payment"+"\n"+
			           "2. to stop payment"+"\n");
				int upichoice =input.nextInt();
				

				if (upichoice==1) {
			System.out.println("-----------your is order succuss----------" );
			System.out.println("your is payment refference no:9345251595764" );
				     }
				
				else 
		 System.out.println("-------------Your is order is cancled-----------" );
						
				break;	
				
}	    
}
}