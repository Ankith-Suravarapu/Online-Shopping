import java.util.ArrayList;
import java.util.Scanner;

class fashion{
	Scanner in=new Scanner(System.in);
	private String brand;
	private String Type;
	private int size;
	private Double price;
	private String sizes;
	ArrayList<String> brands= new ArrayList<String>(2);
    ArrayList<Integer> Sizes = new ArrayList<Integer>(3);
    ArrayList<Double> Prices = new ArrayList<Double>(3);
    ArrayList<String> Size = new ArrayList<String>(3);
   static ArrayList<String> CartItem = new ArrayList<String>(4);
   static ArrayList<Double> CartPrices = new ArrayList<Double>(4);
    public String getbrand()
	{
		return brand;
	}
	public void setbrand(String Brand) {
		this.brand=Brand;
	}
	
	public void setType(String B)
	 {
	        this.Type=B;
	 }
	 public String getType()
	 {
	  return Type;
	 }
	
	public int getsize()
	{
		return size;
	}
	public void setsize(int Size) {
		this.size=Size;
	}
	
	public Double getprice()
	{
		return price;
	}
	public void setprice(double i) {
		this.price=i;
	}
	
	
	public String getsizes()
	{
		return sizes;
	}
	public void setsizes(String Sizes) {
		this.sizes=Sizes;
	}
	public void addcart(int x)
    {
    	 if (x ==1)
         {
         	OnlineShopping OS=new OnlineShopping ();
             System.out.println("To conform to the cart enter : 1 \nTo continue shopping enter :0 ");
             System.out.print(">>> ");
             int x1 = in.nextInt();
             if (x1 ==1)
             {
                 System.out.println("ADDING to the CART\n### Successfully added to cart ###");
                 System.out.println("");
                 CartItem.add(getbrand()+" "+getsize());
                 CartPrices.add(getprice());
                 ShoppingCartManager SCM=new ShoppingCartManager();
                 System.out.println("Did you want to go to the cart or continue shopping");
                 System.out.println("To conform to go to the cart for checkout enter : 1 \nTo continue shopping enter :0 ");
                 System.out.print(">>> ");
                 int y = in.nextInt();
                 if (y==1)
             {
                 SCM.Cart(CartItem,CartPrices);
             }
             else
 {
                 
                 OS.ReFashion(1);
             }
             
         }
         else if(x1 ==0)
         {
             System.out.print("please continue your shopping");
             
             OS.ReFashion(x1);
         }
     }
    }
}
class shirts extends fashion
{
	public void shirtproperties(String brand,int size,Double double1) {
		super.brands.add(getbrand());
		super.Sizes.add(getsize());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the shirt is :" + getbrand());
		System.out.println("The size of the shirt is :" + getsize());
		System.out.println("The price of the shirt is :" + getprice());
		System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
        int cart = in.nextInt();
        super.addcart(cart);
    }
}

class pants extends fashion{
	public void pantproperties(String brand,int size,Double double1) {
		super.brands.add(getbrand());
		super.Sizes.add(getsize());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the pant is :" + getbrand());
		System.out.println("The size of the pant is :" + getsize());
		System.out.println("The price of the pant is :" + getprice());
		System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
		int cart = in.nextInt();
        super.addcart(cart);
	}
}
class tshirts extends fashion{
	public void tshirtproperties(String brand, String sizes,Double double1) {
		super.brands.add(getbrand());
		super.Size.add(getsizes());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the tshirt is :" + getbrand());
		System.out.println("The size of the tshirt is :" + getsizes());
        System.out.println("The price of the tshirt is :" + getprice());
        System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
		int cart = in.nextInt();
        super.addcart(cart);
	}
}
class jackets extends fashion{
	public void jacketproperties(String brand,String sizes,Double double1) {
		super.brands.add(getbrand());
		super.Size.add(getsizes());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the jacket is :" + getbrand());
		System.out.println("The size of the jacket is :" + getsizes());
		System.out.println("The price of the jacket is :" + getprice());
		System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
		int cart = in.nextInt();
        super.addcart(cart);
	}
}
class shoes extends fashion{
	public void shoeproperties(String brand,int size,Double double1) {
		super.brands.add(getbrand());
		super.Sizes.add(getsize());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the shoe is :" + getbrand());
		System.out.println("The size of the shoe is :" + getsize());
		System.out.println("The price of the shoe is :" + getprice());
		System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
		int cart = in.nextInt();
        super.addcart(cart);
	}
}
class backpacks extends fashion{
	public void backpackproperties(String brand,Double double1) {
		super.brands.add(getbrand());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the backpack is :" + getbrand());
		System.out.println("The price of the backpack is :" + getprice());
		System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
		int cart = in.nextInt();
        super.addcart(cart);
	}
}
class shorts extends fashion{
	public void shortproperties(String brand,String sizes,Double double1) {
		super.brands.add(getbrand());
		super.Size.add(getsizes());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the shorts is :" + getbrand());
		System.out.println("The size of the shorts is :" + getsizes());
		System.out.println("The price of the shorts is :" + getprice());
		System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
		int cart = in.nextInt();
        super.addcart(cart);
	}
}
class sarees extends fashion{
	public void sareeproperties(String brand,Double double1) {
	super.brands.add(getbrand());
	super.Prices.add(getprice());
	System.out.println("__The Details of the product_");
	System.out.println("The brand of the saree is :" + getbrand());
	System.out.println("The price of the saree is :" + getprice());
	System.out.println("") ;
	System.out.println("Do you want the item add to cart  ");
    System.out.println("To confirm to the cart enter : 1") ;
    System.out.println ("To continue shopping enter :0 ");
	int cart = in.nextInt();
    super.addcart(cart);
	}
}
class leggings extends fashion{
	public void leggingproperties(String brand,String sizes,Double double1) {
		super.brands.add(getbrand());
		super.Size.add(getsizes());
		super.Prices.add(getprice());
		System.out.println("__The Details of the product_");
		System.out.println("The brand of the legging is :" + getbrand());
		System.out.println("The size of the legging is :" + getsizes());
		System.out.println("The price of the legging is :" + getprice());
		System.out.println("") ;
		System.out.println("Do you want the item add to cart  ");
        System.out.println("To confirm to the cart enter : 1") ;
        System.out.println ("To continue shopping enter :0 ");
		int cart = in.nextInt();
        super.addcart(cart);
	}
}
public class fasionOp extends OnlineShopping
   {
	public  void fashion(String x)
	   {
        OnlineShopping OS=new OnlineShopping ();
        Scanner in=new Scanner(System.in);
		shirts shirt = new shirts();  
		pants pant = new pants();
		shoes shoe = new shoes();
		backpacks backpack = new backpacks();
		jackets jacket = new jackets();
		tshirts tshirt = new tshirts();
		shorts shorts = new shorts();
		sarees saree = new sarees();
		leggings legging = new leggings();
		
		switch(x.toLowerCase()) {
		case "mens":
		    System.out.println("what type of product do you want");
			System.out.println("\nThe available products are\nshirts\npants\ntshirts\njackets\nshorts\nshoes\nbackpacks\n");
            String type = in.next();
        switch (type.toLowerCase()) 
        {
            case "shirts":
            	System.out.println("Which brand do you want: ");
            	System.out.println("\nThe available brands are\n1.spykar\n2.uspolo\n");
                String brand = in.next();
                shirt.setbrand(brand);
                switch (brand.toLowerCase()) 
                {
                    case "spykar":
                    case"uspolo":
                    	System.out.println("which size you want in cm: ");
                    	System.out.println("\nThe available sizes are\n42\n44\n46\n");
                    int sizes = in.nextInt();
                    shirt.setsize(sizes);
                        
                switch(sizes) 
                {
                case 42 :
                	shirt.setprice(1999);
                	shirt.shirtproperties(shirt.getbrand(), shirt.getsize(),shirt.getprice());
                	break;
                case 44:
                	shirt.setprice(2299);
                	shirt.shirtproperties(shirt.getbrand(), shirt.getsize(),shirt.getprice());
                	break;
                case 46:
                	shirt.setprice(2499);
                	shirt.shirtproperties(shirt.getbrand(), shirt.getsize(),shirt.getprice());
                	break;
            	}
                break;
            } 
        break; 
      }
         switch(type.toLowerCase()) {
        case "pants":
        	System.out.println("which brand do you want");
        	System.out.println("\nThe available brands are\nspykar\nuspolo\n");
        	String brand = in.next();
            pant.setbrand(brand);
        	switch (brand.toLowerCase()) 
            {
                case "spykar":
                case "uspolo":
                   System.out.println("which size you want in : "); 
                   System.out.println("\nThe available sizes are\n28\n30\n32\n");
                   int sizes = in.nextInt();
                   pant.setsize(sizes);
            switch(sizes) 
            {
            case 28 :
            	pant.setprice(1999);
            	pant.pantproperties(pant.getbrand(), pant.getsize(),pant.getprice());
            	break;
           case 30:
            	pant.setprice(2299);
            	pant.pantproperties(pant.getbrand(), pant.getsize(),pant.getprice());
            	break;
           case 32:
            	pant.setprice(2499);
            	pant.pantproperties(pant.getbrand(), pant.getsize(),pant.getprice());
            	break;
              }
            break;
             } 
         break;  
      }
        switch (type.toLowerCase()) 
        {
            case "tshirts":
                System.out.println("Which Brand you want: ");
                System.out.println("\nThe available brands are\nspykar\nuspolo\n");
                String brand = in.next();
                tshirt.setbrand(brand);
                switch (brand.toLowerCase()) 
                {
                    case "spykar":
                    case"uspolo":
                    System.out.println("which size you want in cm: ");
                    System.out.println("\nThe available sizes are\nm\nl\nxl\n");
                    String sizes = in.next();
                    tshirt.setsizes(sizes);
                switch(sizes) 
                {
                case "m" :
                	tshirt.setprice(1999);
                	tshirt.tshirtproperties(tshirt.getbrand(), tshirt.getsizes(),tshirt.getprice());
                	break;
               case "l":
                	tshirt.setprice(2499);
                	tshirt.tshirtproperties(tshirt.getbrand(), tshirt.getsizes(),tshirt.getprice());
                	break;
               case "xl":
                	tshirt.setprice(2999);
                	tshirt.tshirtproperties(tshirt.getbrand(), tshirt.getsizes(),tshirt.getprice());
                	break;
            	}
                break;
             } 
        break; 
      }
        switch (type.toLowerCase()) 
        {
            case "jackets":
                System.out.println("Which Brand you want: ");
                System.out.println("\nThe available brands are\nspykar\nuspolo\n");
                String brand = in.next();
                jacket.setbrand(brand);
                switch (brand.toLowerCase()) 
                {
                    case "spykar":
                    case"uspolo":
                    System.out.println("which size you want in cm: ");
                    System.out.println("\nThe available sizes are\nm\nl\nxl\n");
                    String sizes = in.next();
                    jacket.setsizes(sizes);
                switch(sizes) 
                {
                case "m" :
                	jacket.setprice(1599);
                	jacket.jacketproperties(jacket.getbrand(),jacket.getsizes(),jacket.getprice());
                	break;
               case "l":
                	jacket.setprice(1999);
                	jacket.jacketproperties(jacket.getbrand(),jacket.getsizes(),jacket.getprice());
                	break;
                case "xl":
                	jacket.setprice(2599);
                	jacket.jacketproperties(jacket.getbrand(),jacket.getsizes(),jacket.getprice());
                	break;
            	}
                break;
              } 
        break; 
      }
         switch (type.toLowerCase()) 
        {
            case "shoes":
                System.out.println("Which Brand you want: ");
                System.out.println("\nThe available brands are\nSketchers\nnike\n");
                String brand = in.next();
                shoe.setbrand(brand);
                switch (brand.toLowerCase()) 
                {
                case "sketchers":
                case"nike":
                   System.out.println("which size you want in uk system: ");
                   System.out.println("\nThe available sizes are\n8\n9\n10\n");
                    int sizes = in.nextInt();
                    shoe.setsize(sizes);
                    switch(sizes) 
                {
                case 8 :
                	shoe.setprice(2999);
                	shoe.shoeproperties(shoe.getbrand(), shoe.getsize(),shoe.getprice());
                	break;
                case 9:
                	shoe.setprice(4999);
                	shoe.shoeproperties(shoe.getbrand(), shoe.getsize(),shoe.getprice());
                	break;
                case 10:
                	shoe.setprice(4999);
                	shoe.shoeproperties(shoe.getbrand(), shoe.getsize(),shoe.getprice());
                	break;
                }
                break;
             } 
        break; 
      }
        switch (type.toLowerCase()) 
        {
            case "shorts":
                System.out.println("Which Brand you want: ");
                System.out.println("\nThe available brands are\nspykar\nuspolo\n");
                String brand = in.next();
                shorts.setbrand(brand);
                switch (brand.toLowerCase()) 
                {
                    case "spykar":
                    case"uspolo":
                    System.out.println("which size you want in cm: ");
                    System.out.println("\nThe available sizes are\nm\nl\nxl\n");
                    String sizes = in.next();
                    shorts.setsizes(sizes);
                    switch(sizes) 
                {
                case "m" :
                	shorts.setprice(799);
                	shorts.shortproperties(shorts.getbrand(), shorts.getsizes(),shorts.getprice());
                	break;
               case "l":
                	shorts.setprice(999);
                	shorts.shortproperties(shorts.getbrand(), shorts.getsizes(),shorts.getprice());
                	break;
               case "xl":
                	shorts.setprice(1199);
                	shorts.shortproperties(shorts.getbrand(), shorts.getsizes(),shorts.getprice());
                	break;
                	}
                break;
         } 
        break; 
   }
         switch (type.toLowerCase()) 
        {
            case "backpacks":
                System.out.println("Which Brand you want: ");
                System.out.println("\nThe available brands are\namerican tourister\nskybags");
                String brand = in.next();
                backpack.setbrand(brand);
                switch (brand.toLowerCase()) 
                {
                case "americantourister":
                case"skybags":
               backpack.setprice(1599);
               backpack.backpackproperties(backpack.getbrand(),backpack.getprice());
               break;
            }
           break; 
        }
        break;
		case"womens":     
			System.out.println("what type of product do you want");
			System.out.println("\nThe available products are\nsarees\nleggings\n");
            String type1 = in.next();
            switch (type1.toLowerCase()) 
            {
                case "sarees":
                	System.out.println("Which brand do you want: ");
                	System.out.println("\nThe available brands are\nchennaisilksarees\nkanchipuramsarees\n");
                    String brand = in.next();
                    saree.setbrand(brand);
                    switch (brand.toLowerCase()) 
                    {
                     case"chennaisilksarees":
                     case"kanchipuramsarees":
                    saree.setprice(15999);
                    saree.sareeproperties(saree.getbrand(),saree.getprice());
                    break;
                }
		     }
            switch (type1.toLowerCase()) 
            {
                case"leggings":
                    System.out.println("Which Brand you want: ");
                    System.out.println("\nThe available brands are\naurelia\ndrop\n");
                    String brand = in.next();
                    legging.setbrand(brand);
                    switch (brand.toLowerCase()) 
                    {
                        case "aurelia":
                        case"drop":
                        System.out.println("which size you want in cm: ");
                        System.out.println("\nThe available sizes are\nm\nl\nxl\n");
                        String sizes = in.next();
                        legging.setsizes(sizes);
                            
                    switch(sizes) 
                    {
                    case "m" :
                    	legging.setprice(799);
                    	legging.leggingproperties(legging.getbrand(), legging.getsizes(),legging.getprice());
                    	break;
                    case "l":
                    	legging.setprice(999);
                    	legging.leggingproperties(legging.getbrand(), legging.getsizes(),legging.getprice());
                    	break;
                    case "xl":
                    	legging.setprice(1199);
                    	legging.leggingproperties(legging.getbrand(), legging.getsizes(),legging.getprice());
                    	break;
                    	}
                    break;
                    } 
                break; 
            }
            
		}
		
	}

}