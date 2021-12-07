import java.util.*;
import java.math.*;
import java.security.KeyException;
import java.lang.*;
import java.io.*;

public class OnlineShopping 
{
    public static void main(String args[])
    {

        Scanner proname = new Scanner(System.in);
        System.out.println("Are u an EMPLOYEE or a CUSTOMER");
        System.out.println("| 1.EMPLOYEE | | 2.CUSTOMER |");
        System.out.print(">>>> ");
        int disgnation = proname.nextInt();
        switch (disgnation) 
        {
            case 1:
                System.out.println("please enter your id number=");
                int checkid=proname.nextInt();
            
                Emp a=new Emp();//an object of class Emp
                ArrayList<Integer> idno=a.getidno();
                a.assign();
                if(idno.contains(checkid))
                {		
                   int ans=1;
                   while(ans==1)
                   {
           
                   System.out.println("***********************************");
                   System.out.println("1.search for an employee");
                   System.out.println("2.add an employee");
                   System.out.println("3.remove an employee");
                   System.out.println("4.change salary employee");
                   System.out.println("5.details of employee");
                   System.out.println("6.exit");
                   System.out.println("***********************************");
                   System.out.println("enter your choice");
                   int choice=proname.nextInt();
           
                    switch(choice)
                    {
                        case 1: {a.search(); break;}
                        case 2:{a.add(checkid);break;}
                        case 3:{a.removes(checkid);break;}
                        case 4:{a.salary(checkid);break;}
                        case 5:{a.details();break;}
                        case 6:return;
                        default:System.out.println("please enter a valid option");
                    }
                    System.out.print("would you like to continue?(1 or 0)");
                    ans=proname.nextInt();
                    proname.nextLine();
                    }
                }
                else
                    System.out.print("you id has not been authorised");
                
                    //=========================EMPLOYEEE=================================
                break;
            case 2:
                System.out.print("Enter name : ");
                String welcomeCall = proname.next();
                System.out.println("Namah Shivaya!! Welcome to our online shop "+welcomeCall);
                project aa = new project();
                aa.newuser(args);
                //--------------------------------USER ACCOUNT CLASS--------------------------------
                System.out.println("The Available Types in our Onlineshopping\n | 1.ELECTRONINCS | | 2.FASION | | 3.HOUSEHOLD |");
                System.out.println("Which type of products u want :");
                System.out.print(">>>> ");
                int ProductSel = proname.nextInt();
                switch (ProductSel) 
                {
                    case 1:
                        ElectronicOperations Elec = new ElectronicOperations(); 
                        System.out.println("The available products in Electronics :\n\n| MOBILEs | LAPTOPs | TVs | SPEAKERs |\n\n| CAMARAs | POWERBANKs | HARDDISKs | REFRIGIRATORs |\n");
                        System.out.print("Which type of product u want: ");
                        String peru = proname.next();
                        Elec.oper(peru); 
                        proname.close();
                        
                        break;
                    case 2:
                        //-----------------------FASION------------------------
                		System.out.println(" what type of fashion u want");
                		System.out.println("\nmens\nwomens\n");
                		fasionOp k = new fasionOp();
                	    String y = proname.next();
                	    k.fashion(y);
                        break;
                    case 3:
                        //----------------------HouseHold----------------------
                        System.out.print("\nItems Available\n\nBed \nCupboard" + "\nTable \nSofa \nChair \nCurtains \nCarpets \nExit\n");
                        System.out.print("\nEnter required item : ");
                        houseH h=new houseH();
                        String name = proname.next();
                        h.household(name);
                        break;
                    default:
                        System.out.println("Sorry we don't have those type of products");
                        break;
                }
                break;
            default:
                break;
        }
        
    }
    public  void Shopping(int choice)
    {
        Scanner proname = new Scanner(System.in);
        ElectronicOperations Elec = new ElectronicOperations(); 
        System.out.println("The available products in Electronics :\n\n| MOBILEs | LAPTOPs | TVs | SPEAKERs |\n\n| CAMARAs | POWERBANKs | HARDDISKs | REFRIGIRATORs |\n");
        System.out.print("Which type of product u want: ");
        String peru = proname.next();
        Elec.oper(peru); 
        proname.close();
    }
    public void ReFashion(int choice)
    {
    	Scanner proname = new Scanner(System.in);
    	System.out.println(" what type of fashion u want");
		System.out.println("\nmens\nwomens\n");
		fasionOp k = new fasionOp();
        String y = proname.next();
        k.fashion(y);
    }
    public void shopping( int k) {
		Scanner Name = new Scanner(System.in);   	
	  	System.out.print("\nItems Available\n\nBed \nCupboard" +
	          " \nTable \nSofa \nChair \nCurtains \nCarpets \nExit\n");
	    System.out.print("\nEnter required item : ");
	    houseH z=new houseH();
	    String name = Name.next();
	    z.household(name); 
	    Name.close();
		
	}

    
}
