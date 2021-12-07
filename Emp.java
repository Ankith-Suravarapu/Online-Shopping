import java.util.ArrayList;
import java.util.Scanner;


public class Emp 
{
	Scanner in=new Scanner(System.in);
	
	private ArrayList<Integer> idno=new ArrayList<Integer>();
	public ArrayList<Integer> getidno()
	{
	    return idno;
	}
	
	private ArrayList<String> name= new ArrayList<String>();
	public ArrayList<String> getname()
	{
	    return name;
	}
	
	private ArrayList<Long> contactinfo= new ArrayList<Long>();
	public ArrayList<Long> getcontactinfo()
	{
	    return contactinfo;
	}
	
	private ArrayList<String> position= new ArrayList<String>();
	public ArrayList<String> getposition()
	{
	    return position;
	}
	
	private ArrayList<Integer> salary=new ArrayList<Integer>();
	public ArrayList<Integer> getsalary()
	{
	    return salary;
	}
	
	
	public void assign()
	{
	idno.add(0, 111);
	idno.add(1, 222);
	idno.add(2, 333);
	idno.add(3, 444);
	idno.add(4, 555);
	idno.add(5, 666);
	
	name.add(0, "raj");
	name.add(1, "sam");
	name.add(2, "han");
	name.add(3, "krish");
	name.add(4, "hari");
	name.add(5, "biju");
	
	contactinfo.add(0,9567654564L);
	contactinfo.add(1,9654654544L);
	contactinfo.add(2,9986565885L);
	contactinfo.add(3,9986776685L);
	contactinfo.add(4,9948093285L);
	contactinfo.add(5,9435454665L);
	
	position.add(0,"manager");
	position.add(1,"accountant");
	position.add(2,"business strategist");
	position.add(3,"digital marketer");
	position.add(4,"customer service");
	position.add(5,"accountant");
	
	salary.add(0,30000);
	salary.add(1,24000);
	salary.add(2,10000);
	salary.add(3,45000);
	salary.add(4,9000);
	salary.add(5,30000);
	}
	
	
	public void search()
	{
		System.out.println("please enter the id number of employee");
     	int num=in.nextInt();//id number of staff to be searched
     	
   	    if(idno.contains(num))//if the arraylist idno contains num, continue
   	        {
   		      int addr=idno.indexOf(num);//index of num in arralist 
   		      System.out.println("staff member found. name is:"+name.get(addr));
   		      System.out.println("Would you like to access the details of staff member?(y/n)");
   		      String yn=in.next();
   		         
   		      switch(yn)
   		      {
   		      case "y":  {   System.out.println("------------Details Of Employee----------");
   		    	            System.out.println("id number:"+idno.get(addr)+"||name:"+name.get(addr)+"||salary:"+salary.get(addr));
   		    	            break;
   		    	         }
   		      case "n":  {
   		    	            return;
   		                 }
   		      }
   	        }
   	    else
   		      System.out.println("Staff member with id number"+num+"found is not found"); 
   	 }
	
	
	public void add(int checkid)
	{
		int x=idno.indexOf(checkid);//index number of checkid is assigned to x
	    String nameposi=position.get(x);//name present at that index is assigned to m
	    
		     if(nameposi.equals("manager"))//if the person is manager, continue
		     {
		     System.out.println("please enter the new id number of employee");
		     int newidno=in.nextInt();
		          if(idno.contains(newidno))
		          {
		        	  System.out.println("id number already exists");
		        	  return;
		          }
		     System.out.println("please enter the name of employee");
		     String newname=in.next();
		     System.out.println("please enter contact information employee");
		     long newci=in.nextLong();
		     System.out.println("please position");
		     String newpos=in.next();
		     System.out.println("please enter salary of new staff member");
		     int newsal=in.nextInt();

		     idno.add(newidno);//add newidno to arraylist idno
		     name.add(idno.indexOf(newidno),newname);//add newname to arraylist name, at index of idno.indexOf(newidno)
		     contactinfo.add( idno.indexOf(newidno),newci);//add newci to arraylist contactinfo, at index  idno.indexOf(newidno)
		     position.add(idno.indexOf(newidno),newpos);//add newpos to arraylist position, at index  idno.indexOf(newidno)
		     salary.add(idno.indexOf(newidno),newsal);//add newsal to arraylist salary, at index  idno.indexOf(newidno)
		    
		        System.out.println("------------Details Of New Employee----------");
			    System.out.println("id number:"+idno.get(idno.indexOf(newidno))+"|| name:"+name.get(idno.indexOf(newidno))+"|| salary:"+salary.get(idno.indexOf(newidno)));
		      
		     }
		     else
				
					System.out.println("You do not have permission to remove staff");	
				
		
	}
	public void removes(int checkid)
	{
		
		int x=idno.indexOf(checkid);
	    String m=position.get(x);
		
		if(m.contains("manager"))//if the person is manager, continue
		{
		System.out.println("please enter the  id number of employee=");
		int remidno=in.nextInt();
		if(idno.contains(remidno))
		{ 
			int roo=idno.indexOf(remidno);
			idno.remove(idno.indexOf(remidno));
			name.remove(roo);
			contactinfo.remove(roo);
			position.remove(roo);
			salary.remove(roo);
			System.out.println("the employee has been removed");	
			
		}
		else
			{
			System.out.println("no staff member found,with the id number");	
			}
		}
		else
		{
			System.out.println("you do not have the authority to remove staff");	
		}
	}
	
	public void details()
	{
		int j;
		int num=idno.size();
		System.out.println("-----------------------------------------------------------------------------------------");
	    System.out.printf("%5s %15s %20s %20s %20s", "STAFF ID", "NAME", "CONTACT INF", "POSITION", "SALARY");
	    System.out.println();
	    System.out.println("-----------------------------------------------------------------------------------------");
		for(j=0;j<num;j++)
		{    
			System.out.format("%5s %15s %20s %20s %20s",idno.get(j),name.get(j),contactinfo.get(j),position.get(j),salary.get(j));
			System.out.println();
			
		}
	}
	public void salary(int checkid)
	{   	
		
		int x=idno.indexOf(checkid);
	    String m=position.get(x);
		
		if(m.contains("manager"))//if the person is manager, continue
		{
			System.out.println("please enter id number of staff");
			int salidno=in.nextInt();//idno of staff whos salary to be changed
			if(idno.contains(salidno))
			{
			    int indexofsalidno=idno.indexOf(salidno);//index on idno, found in arraylist idno
			    System.out.println("details of employee whos salary is to be changed:");
			    System.out.println("idno:"+idno.get(indexofsalidno)+" || name:"+name.get(indexofsalidno)+" || contactinfo:"+contactinfo.get(indexofsalidno)+" || position:"+position.get(indexofsalidno)+" || salary:"+salary.get(indexofsalidno));
			    System.out.println("Please neter new salary of staff=");
			    int newsal=in.nextInt();
			    salary.set(indexofsalidno, newsal);
			}
			else
				System.out.println("staff memeber not found");
		
		}
		else
		{
			System.out.println("You do not have permission to remove staff");
		}
		
	}
}


