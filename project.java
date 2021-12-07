import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 class project
{
	    public void newuser(String[] args)
	    {  
	String email;   String nmail;
	int password;   int repassword;  int npassword;
	int phonenum;   int newnum;      int edit;
	int date;	    int year;	     int month;
	int ndate;	    int nyear; 	     int nmonth;
		
	ArrayList<String> emails = new ArrayList<String>(30);
    ArrayList<Integer> passwords = new ArrayList<Integer>(30);
    ArrayList<Integer> repasswords = new ArrayList<Integer>(30);
    ArrayList<Integer>phonenumbers = new ArrayList<Integer>(30);
    ArrayList<Integer>dates =  new ArrayList<Integer>(41);
    ArrayList<Integer>ndates =  new ArrayList<Integer>(30);
    ArrayList<Integer>years =  new ArrayList<Integer>(41);
    ArrayList<Integer>nyears =  new ArrayList<Integer>(30);
    ArrayList<Integer>months =  new ArrayList<Integer>(15);
    ArrayList<Integer>nmonths =  new ArrayList<Integer>(30);
  //  ArrayList<Integer>contacts = new ArrayList<Integer>(10);
   
emails.add("javagmail.com");    emails.add("pavan@gmail.com");   emails.add("ankith@gmail.com");
passwords.add(999999);          passwords.add(66666);            passwords.add(555555);
phonenumbers.add(111111);       phonenumbers.add(123456);        phonenumbers.add(333333);

                         dates.add(11);
    dates.add(1);        dates.add(12);      dates.add(22); 
    dates.add(2);        dates.add(13);      dates.add(23);
    dates.add(3);        dates.add(14);      dates.add(24);
    dates.add(4);        dates.add(15);      dates.add(25);
    dates.add(5);        dates.add(16);      dates.add(26);
    dates.add(6);        dates.add(17);      dates.add(27);
    dates.add(7);        dates.add(18);      dates.add(28);
    dates.add(8);        dates.add(19);      dates.add(29);
    dates.add(9);        dates.add(20);      dates.add(30);
    dates.add(10);       dates.add(21);      dates.add(31);
    
                         years.add(2020);
    years.add(1990);     years.add(2000);    years.add(2010);
    years.add(1991);     years.add(2001);    years.add(2011);
    years.add(1992);     years.add(2002);    years.add(2012);
    years.add(1993);     years.add(2003);    years.add(2013);
    years.add(1994);     years.add(2004);    years.add(2014);
    years.add(1995);     years.add(2005);    years.add(2015);
    years.add(1996);     years.add(2006);    years.add(2016);
    years.add(1997);     years.add(2007);    years.add(2017);
    years.add(1998);     years.add(2008);    years.add(2018);
    years.add(1999);     years.add(2009);    years.add(2019);
                         
    months.add(1);   months.add(7);
    months.add(2);   months.add(8);
    months.add(3);   months.add(9);
    months.add(4);   months.add(10);
    months.add(5);   months.add(11);
    months.add(6);   months.add(12);
    
    Scanner scan = new Scanner(System.in);  
    System.out.println("=> ENTER (1) TO CREATE ACCOUNT");
    System.out.println("=> ENTER (2) TO LOGIN VIA EMAIL ADDRESS");
    System.out.println("=> ENTER (3) TO LOGIN VIA PHONE NUMBER");
    System.out.println("=> ENTER (4) TO EDIT PERSONAL INFORMATION");
    System.out.println("-> CHOOSE ANY OPERATION :");
    int select = scan.nextInt();
switch(select) 
{ 
 case 1 :
    	  System.out.println("=> Enter your EMAIL here :");
    	  email = scan.next();
    	  boolean ans = emails.contains(email);
    	  if (ans) 
    	  {
    		System.out.println("Email exist already");             	  
    	  }
    	  else 
    	  emails.add(email);
    	  System.out.println("=> Enter your date of birth :");
    	  date = scan.nextInt();
    	  if(dates.contains(date))
    	  {   
    		  dates.add(date); 		  
    		  System.out.println("=> Enter your year :");
    		  year = scan.nextInt();
    	  
    		  if(years.contains(year))
    	      {
    			years.add(year);
    			System.out.println("Enter month : "); 
    			month = scan.nextInt();
    	      
    			if(months.contains(month))
 			    {			  
 				  System.out.println("=> Enter your password :");
     	    	  password = scan.nextInt();    	  
     	    	  System.out.println("=> Enter again your password :");
     	    	  repassword = scan.nextInt();		      
     	    	  if (password == repassword)
   	    	      {
   	    		    passwords.add(password);
   	    		    System.out.println("Please Accept terms and conditions");
   	    	        System.out.println("=> Enter deny or allow");
   	    		    String privacy = scan.next();
   	    		    switch(privacy)
   	    		     {
   	    		       case "allow" :
   	    			   System.out.println("");
   	    		       System.out.println("! :) Account created Successfully :) !");
   	    		       break;
   	    		       case "deny" :
   	    			   System.out.println("Please accept terms and conditions to create an account");
   	    			   break;
   	    		     }
   	    		  }
     	    	      else
   	    		      System.out.println("Entered password didn't matched "); 
 			    }
    			   else
    	    	   System.out.println("Entered month didn't matched ");
    	     }  
    		    else
    			System.out.println("year not found");
    	  }
    	    else	  
			System.out.println("Entered date of birth didn't matched "); 	   		    		   
  break; 
	
 case 2 :
    	   System.out.println("Enter email id ");
    	     email=scan.next();
    	   if(emails.contains(email))
        {
    		  System.out.println("Enter your password");
    		  password = scan.nextInt();
    		    if(passwords.contains(password)) 
    		    {
    			  System.out.println("Welcome back for shopping");  
    		    }
    	        else
    	        {  System.out.println("Incorrect password");
    	          System.out.println("Enter your password agian");
    	           password = scan.nextInt();
    		    if(passwords.contains(password))
    		      {
    		       System.out.println("Welcome back for shopping");
    		      }
    		    else
    		     {System.out.println("User not found");
    		      System.out.println("Create an account");
          }}}
    	     
    	   else
    	    System.out.println("Account doesn't exist");
 break;
 
 case 3:
    	  System.out.println("Enter your phone number");
    	  phonenum = scan.nextInt();
    	  System.out.println("Enter your password");
    	  password = scan.nextInt();
    	  if(phonenumbers.contains(phonenum) && passwords.contains(password))
    	  {
    		  System.out.println("Welcome back for shopping");
    	  }
    	  else
    	  {  System.out.println("Incorrect phone number or password");  
    	  System.out.println("Enter your phone number");
    	  phonenum = scan.nextInt();
    	  System.out.println("Enter your password");
    	  password = scan.nextInt();
    	  if(phonenumbers.contains(phonenum) && passwords.contains(password))
    	  {
    		  System.out.println("Welcome back for shopping");
    	  }       
          else
           System.out.println("Account not found");
    	  }break;
    	 
 case 4: 
	      System.out.println("Edit Information");
	      System.out.println("||1) CHANGE EMAIL||2) CHANGE DATE OF BIRTH||3) CHANGE PASSWORD||");
	      edit = scan.nextInt();
	      switch(edit) 
	      {
	      case 1:
	    	  int index = emails.indexOf("pavan@gmail.com");
	    	   System.out.println("Enter your Existing Email");
	    	   email = scan.next();
	    	   if(emails.contains(email))
	    	   {
	    		   System.out.println("Enter your New Email here"); 
	    		   nmail = scan.next();	
	    		   if(nmail.equals(email))
	    		   {
	    			   System.out.println("New and old emails can't be same");
	    			   System.out.println("use another email");
	    		   }
	    		   else {
	    			   emails.set(index,nmail);
				   System.out.println(emails);
				   System.out.println("new mail added");}  
	    	   }	    		   
	    	   else
	    	   System.out.println("please check old email"); 	      
	    		   break;
	      case 2:
	    	  System.out.println("Enter your Existing date");	    	
	    	  date = scan.nextInt();
	    	  if(dates.contains(date))
	    	  {
	    		System.out.println("Enter your New date here"); 
	    	     ndate = scan.nextInt();
	    	     if(date == ndate) 
	    	     {
	    	    	 System.out.println("new and old date cant be same");
	    	     }
	    	     else
	    	     { ndates.add(ndate);
	    	    	 System.out.println(ndates);
	    	    	 System.out.println("date of birth changed");}
	    	  }
	    	  else
	    	  System.out.println("enter the date correctly");
	  	  
	    	  System.out.println("Enter your Existing year");		    	
		    	  year = scan.nextInt();
		    	  if(years.contains(year))
		    	  {
		    		System.out.println("Enter your New birth year "); 
		    	     nyear = scan.nextInt();
		    	     if(nyear == year) 
		    	     {
		    	    	 System.out.println("new and old can't be same");
		    	     }
		    	     else
		    	     { nyears.add(nyear);
		    	    	 System.out.print(nyears);}
		    	  }
		    	  else
		    	  System.out.println("enter the year correctly");
		    	  		    	  
		    	  System.out.println("Enter your Existing month");			    	
			    	  month = scan.nextInt();
			    	  if(months.contains(month))
			    	  {
			    		System.out.println("Enter your New month of birth here"); 
			    	     nmonth = scan.nextInt();
			    	     if(nmonth == month) 
			    	     {
			    	        System.out.println("new and old can't be same");
			    	     }
			    	     else
			    	     { nmonths.add(nmonth);
			    	    	 System.out.print(nmonths);
			    	    	 System.out.println("birth month changed");}
			    	  }
			    	  else
			    	  System.out.println("enter the year correctly");
                      break;
	      case 3 :
	    	  System.out.println("enter the existing password");
	    	  password = scan.nextInt();
	    	  if(passwords.contains(password)) 
	    	  {
	    		  System.out.print("enter new password");
	    		npassword = scan.nextInt(); 
	    		if(npassword == (password))
	    		   {
	    			   System.out.println("new and old cant be same");			  
	    		   }
	    		else
	    		{ passwords.set(0,npassword);
	    		 System.out.print("password changed");
	    		 System.out.print(passwords);
	    		 }
	    	   }
	    	  else
	    		  System.out.print("no match found");	    	  
	    	  break;
          }
		 	System.out.println("you have edited your personal in fo.");
			System.out.println("login to continue shopping");
			newuser(args);	
            break;
        }
		 
		
    }
}