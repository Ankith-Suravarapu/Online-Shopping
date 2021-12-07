import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

//ELECTRONICS CLASS
class Electronics
{
    Scanner Item = new Scanner(System.in);
    //main class constructer
    //OnlineShopping OS=new OnlineShopping ();
    //variables used
    private double unitprice;
    private String Brand,Model,color,CAMProperties,Highlights,Generation,Processor;
    
    //ArrayList's used
    ArrayList<String> Brands = new ArrayList<String>(4);
    ArrayList<String> ModelOfB = new ArrayList<String>(4);
    ArrayList<String> Colors = new ArrayList<String>(4);
    ArrayList<String> CAMSpecs = new ArrayList<String>(4);
    ArrayList<String> Specs = new ArrayList<String>(4);
    ArrayList<Double> Prices = new ArrayList<Double>(4);
    ArrayList<String> name = new ArrayList<String>(4);
    ArrayList<Double> finalP = new ArrayList<Double>(4);
    ArrayList<String> Procees = new ArrayList<String>(4);
    ArrayList<String> Gen = new ArrayList<String>(4);
    static ArrayList<String> CartItem = new ArrayList<String>(4);
    static ArrayList<Double> CartPrices = new ArrayList<Double>(4);    

    //Getters and setters for 
    //|price | Brand | MODEL | Color |CAMProperties | Overview | Generations | Processors |
    public void setprice(Double Pr)
    {
        this.unitprice=Pr;
    }
    public Double getprice()
    {
        return unitprice;
    }
    public void setBrand(String B)
    {
        this.Brand=B;
    }
    public String getBrand()
    {
        return Brand;
    }
    public void setModel(String M)
    {
        this.Model=M;
    }
    public String getModel()
    {
        return Model;
    }
    public void setColor(String c)
    {
        this.color=c;
    }
    public String getColor()
    {
        return color;
    } 
    public void setCAMProperties(String P)
    {
        this.CAMProperties=P;
    }
    public String getCAMProperties()
    {
        return CAMProperties;
    }
    public void setOverview(String P)
    {
        this.Highlights=P;
    }
    public String getOverview()
    {
        return Highlights;
    }
    public void setGeneration(String G)
    {
        this.Generation=G;
    }
    public String getGeneration()
    {
        return Generation;
    }
    public void setProcessor(String Proc)
    {
        this.Processor=Proc;
    }
    public String getProcessor()
    {
        return Processor;
    }
    //Adding the selcted items to cart class
    public void addcart()
    {
        OnlineShopping OS=new OnlineShopping ();
        System.out.println("DID u want to add to cart the Item: ");
        System.out.println("To conform to the cart enter : 1 \nTo continue shopping enter :0 ");
        System.out.print(">>> ");
        int x = Item.nextInt();
        if (x ==1)
        {
            System.out.println("ADDING to the CART\n---------------loading-------------------\n### Successfully added to cart ###");
            System.out.println("");
            CartItem.add(getBrand()+" "+getModel());
            CartPrices.add(getprice());
            ShoppingCartManager SCM=new ShoppingCartManager();
            System.out.println("Did you want to go to the cart or continue shopping");
            System.out.println("To conform to go to the cart for checkout enter : 1 \nTo continue shopping enter :0 ");
            System.out.print(">>> ");
            int y = Item.nextInt();
            if (y==1)
            {
                SCM.Cart(CartItem,CartPrices);
                //OS.CartAdd(CartItem,CartPrices);
            }
            else
            {
                
                OS.Shopping(1);
            }
            
        }
        else if(x ==0)
        {
            System.out.print("please continue your shopping");
            
			OS.Shopping(x);
        }
    }
    
}
//Mobile sub class of Elctronics
class Mobile extends Electronics
{
    //method for passing all the aurguments
    public void MobileItem(String Brand,String Model, String color,String CAMProperties,String highlights,double Price)
    {
        try
        {
            //setting all the details to ArrayList
            super.Brands.add(getBrand());
            super.ModelOfB.add(getModel());
            super.Colors.add(getColor());
            super.CAMSpecs.add(getCAMProperties());
            super.Specs.add(getOverview());
            super.Prices.add(getprice());
        }
        catch (ArrayIndexOutOfBoundsException x)
        {
            System.out.println("No Space In the array");
        }

        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" mobile_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Color : "+Colors.get(i));
            System.out.println("Camara specifications : "+CAMSpecs.get(i));
            System.out.println("Highlights of the mobile : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
            
        }
        try
        {
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
        }
    }
}
//Laptop sub class of Elctronics
class Laptop extends Electronics
{
    //method for passing all the aurguments
    public void LaptopItem(String Brand,String Model,String color,String Processor, String Generation,String highlights,double Price)
    {
        try
        {
            //setting all the details to ArrayList
            super.Brands.add(getBrand());
            super.ModelOfB.add(getModel());
            super.Colors.add(getColor());
            super.Procees.add(getProcessor());
            super.Gen.add(getGeneration());
            super.Specs.add(getOverview());
            super.Prices.add(getprice());
        }
        catch (ArrayIndexOutOfBoundsException x)
        {
            System.out.println("No Space In the array");
        }
        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" Laptop_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Color : "+Colors.get(i));
            System.out.println("Processor core : "+Procees.get(i));
            System.out.println("Generation Model: "+Gen.get(i)+" Gen");
            System.out.println("Highlights of the Laptop : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
        }
        try
        {
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
            
        }
        
    }
}
//Tv sub class of Electronics
class Tv extends Electronics
{
    //method for passing all the aurguments
    public void TvItems(String Brand,String Model,String color,String Processor, String Generation,String highlights,double Price)
    {
        try 
        {
            //setting all the details to ArrayList
            super.Brands.add(getBrand());
            super.ModelOfB.add(getModel());
            super.Colors.add(getColor());
            super.Procees.add(getProcessor());
            super.Gen.add(getGeneration());
            super.Specs.add(getOverview());
            super.Prices.add(getprice());
            
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.print("No Space In the array");            
        }
        
        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" Tv_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Color : "+Colors.get(i));
            System.out.println("Processor core : "+Procees.get(i));
            System.out.println("series Model: "+Gen.get(i));
            System.out.println("Highlights of the Laptop : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
        }
        try
        {            
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
            
        }
    }
}
//speaker sub class of Electronics
class Speakers extends Electronics
{
    //method for passing all the aurguments
    public void speakerItem(String Brand,String Model,String color,String Processor, String Generation,String highlights,double Price)
    {
        try 
        {
            //setting all the details to ArrayList
        super.Brands.add(getBrand());
        super.ModelOfB.add(getModel());
        super.Colors.add(getColor());
        super.Procees.add(getProcessor());
        super.Gen.add(getGeneration());
        super.Specs.add(getOverview());
        super.Prices.add(getprice());
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            
            System.out.print("No Space In the array");    

        }
        
        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" Speaker_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Color : "+Colors.get(i));
            System.out.println("Power capacity : "+Procees.get(i));
            System.out.println("series Model: "+Gen.get(i));
            System.out.println("Highlights of the Laptop : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
        }
        try
        {            
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
            
        }
    }
}
//camara sub class of Electronics
class Camara extends Electronics
{
    //method for passing all the aurguments
    public void CamaraItem(String Brand,String Model,String color,String CAMProperties, String Generation,String highlights,double Price)
    {
        try 
        {
            //setting all the details to ArrayList
        super.Brands.add(getBrand());
        super.ModelOfB.add(getModel());
        super.Colors.add(getColor());
        super.CAMSpecs.add(getCAMProperties());
        super.Gen.add(getGeneration());
        super.Specs.add(getOverview());
        super.Prices.add(getprice());
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
            System.out.print("No Space In the array"); 
        }
        
        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" Camara_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Color : "+Colors.get(i));
            System.out.println("series Model: "+Gen.get(i));
            System.out.println("Camara properties: "+CAMSpecs.get(i));
            System.out.println("Highlights of the Laptop : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
        }
        try
        {          
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
            
        }
    }
}
//powerbank sub class of Electronics
class Powerbank extends Electronics
{
    //method for passing all the aurguments
    public void PowerBankItem(String Brand,String Model,String color,String highlights,double Price)
    {
        try 
        {
            super.Brands.add(getBrand());
            super.ModelOfB.add(getModel());
            super.Colors.add(getColor());
            super.Specs.add(getOverview());
            super.Prices.add(getprice());
        
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
            System.out.print("No Space In the array");
        }
        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" Power Bank_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Color : "+Colors.get(i));
            System.out.println("Specifications of the Power Bank : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
        }
        try
        {            
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
            
        }
    }
}
//powerbank sub class of Electronics
class hardDisk extends Electronics
{
    //method for passing all the aurguments
    public void HardDiskItem(String Brand,String Model,String highlights,double Price)
    {
        try 
        {
            super.Brands.add(getBrand());
            super.ModelOfB.add(getModel());
            super.Specs.add(getOverview());
            super.Prices.add(getprice());
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
            System.out.print("No Space In the array");
        }
        
        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" Hard Disk_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Specifications of the Power Bank : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
        }
        try
        {           
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
            
        }
    }
}
//Refrigirators sub class of Electronics
class Refrigerators extends Electronics
{
    //method for passing all the aurguments
    public void fridgeItem(String Brand,String Model,String highlights,double Price)
    {
        try 
        {
            super.Brands.add(getBrand());
            super.ModelOfB.add(getModel());
            super.Specs.add(getOverview());
            super.Prices.add(getprice());
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            //TODO: handle exception
            System.out.print("No Space In the array");

        }
        
        //Printing all the details
        for (int i=0; i < 1; i++)
        {
            System.out.println("_________The Details of the "+Brands.get(i)+" "+ModelOfB.get(i)+" Refrigerator_________");
            System.out.println("Brand Name : "+Brands.get(i));
            System.out.println("Model Name : "+ModelOfB.get(i));
            System.out.println("Specifications of the Power Bank : "+Specs.get(i));
            System.out.println("Price : "+Prices.get(i));
        }
        try
        {            
            super.addcart();
        }
        catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.print("The cart is Full");
            
        }
        
    }

}
//Electronics class which is a sub class of Onlineshopping
class ElectronicOperations extends OnlineShopping
{  
    //accepting aurguments from main class
    public void oper(String X)
    {
        //variables used in this class
        String CAMProp;
        String Highlights;
        String ModelName;
        String CoreProcessor;
        String Gen;
        String series;
        String PowerCapacity;
        String color;
        
        Scanner Name = new Scanner(System.in);
        //initialising all the constructors
        Mobile mobile = new Mobile();
        Laptop Lapi = new Laptop();
        Tv tv = new Tv();
        Speakers Spec = new Speakers();
        Camara cam = new Camara();
        Powerbank PoweB = new Powerbank();
        hardDisk disk = new hardDisk();
        Refrigerators fridge = new Refrigerators();
        OnlineShopping ELC = new OnlineShopping();
        //using switch case to slide to what item the customer what's
        switch (X.toLowerCase()) 
        {
            //mobiles case
            case "mobiles":
                System.out.println("The available Mobile Brands :\n\n|MOTOROLA| APPLEIPHONE | ONEPLUS |\n ");
                System.out.print("Which Mobile Brand u want: ");
                String BrandName = Name.next();//user choosing brand

                mobile.setBrand(BrandName.toUpperCase()); //setting that  brand to super class

                switch (BrandName.toLowerCase()) //converting all the characters to lower case
                {
                    case "motorola"://motoraola
                    System.out.println("The available Models in MOTOROLA Brand :\n\n| ONEFUSIONPLUS | RAZR |\n ");
                        System.out.print("which Model u want: ");//user choosing model
                        ModelName = Name.next();
                        mobile.setModel(ModelName.toUpperCase());//setting the model to super class
                        switch (ModelName.toLowerCase()) 
                        {
                            case "onefusionplus":
                                mobile.setprice(17000.0); //setting a default price
                                color = "Blue";
                                CAMProp = "64MP + 8MP + 5MP + 2MP | 16MP Popup Front Camara"; //CAM properties
                                Highlights = "6.5\" FHD+ Display, 5000mAh battery, 128GB Storage"; //highlights
                                mobile.setCAMProperties(CAMProp); //setting CAM prps to super class
                                mobile.setOverview(Highlights); //setting heighlisghts of the item to super class
                                mobile.setColor(color);
                                //Invoking method in super class
                                mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                                break;
                            case "razr":
                                mobile.setprice(17000.0); //setting a default price
                                color = "Black";
                                CAMProp = "16MP Rear Camera | 5MP Front Camera";
                                Highlights = "6 GB RAM | 128 GB ROM, 15.75 cm (6.2 inch) Display, 2510 mAh Battery, SDM710 Processor, Flippable and Pocket-Ready Design";
                                mobile.setCAMProperties(CAMProp);
                                mobile.setOverview(Highlights);
                                mobile.setColor(color);
                                //Invoking method in super class
                                mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                                break;
                        
                            default://seting a default value if the model no found
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("mobiles");
                                break;
                                
                        }
                        break;

                    case "appleiphone"://appleiphone
                        System.out.println("The available Models in APPLE Brand :\n\n| XR | 12PROMAX | 11PROMAX |\n ");
                        System.out.print("which Model u want: ");//user choosing model
                        ModelName = Name.next();
                        mobile.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "xr":
                                mobile.setprice(43999.0);//setting a default price
                                color="Black";
                                CAMProp = "12MP Rear Camera | 7MP Front Camera";//CAM properties
                                Highlights = "|64 GB ROM | 15.5 cm (6.102 inch) Display | A12 Bionic Chip Processor";//highlights
                                mobile.setCAMProperties(CAMProp);//setting CAM prps to super class
                                mobile.setColor(color);
                                mobile.setOverview(Highlights);//setting heighlisghts of the item to super class
                                //Invoking method in super class
                                mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                                break;
                            case "12promax":
                                mobile.setprice(129900.0);//setting a default price
                                color="white";
                                CAMProp = "12MP + 12MP + 12MP | 12MP Front Camera";//CAM properties
                                Highlights = "|128 GB ROM | 17.02 cm (6.7 inch) Super Retina XDR Display All Screen OLED Display |A14 Bionic Chip with Next Generation Neural Engine Processor";
                                mobile.setCAMProperties(CAMProp);
                                mobile.setOverview(Highlights);
                                mobile.setColor(color);
                                //Invoking method in super class
                                mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                                break;
                        
                            case "11pro":
                                mobile.setprice(84900.0);//setting a default price
                                color="Blue";
                                CAMProp = "12MP + 12MP + 12MP | 12MP Front Camera";//CAM properties
                                Highlights = "|64 GB ROM | 14.73 cm (5.8 inch) Super Retina XDR Display | A13 Bionic Chip Processor";
                                mobile.setCAMProperties(CAMProp);
                                mobile.setOverview(Highlights);
                                mobile.setColor(color);
                                //Invoking method in super class
                                mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                                break;

                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("mobiles");
                                break;
                            
                        }
                        break;
                    
                    //next case
                    case "oneplus"://oneplus
                    System.out.println("The available Models in ONEPLUS Brand :\n\n| 7t | 8 | 8t |\n ");
                    System.out.print("which Model u want: ");//user choosing model
                    ModelName = Name.next();
                    mobile.setModel(ModelName.toUpperCase());
                    switch (ModelName.toLowerCase()) 
                    {

                        case "8":
                            mobile.setprice(41999.0);//setting a default price
                            color="Sky Blue";
                            CAMProp = "48 MP + 16 MP + 2 MP | 16MP Front Camara";//CAM properties
                            Highlights = "| Display : 6.55-inch (1080x2400) | Processor : Qualcomm Snapdragon 865 | Storage : 256GB | RAM : 12GB";  
                            mobile.setCAMProperties(CAMProp);//setting CAM prps to super class
                            mobile.setOverview(Highlights);//setting heighlisghts of the item to super class
                            mobile.setColor(color);
                            //Invoking method in super class
                            mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                            break;
                        case "7t":
                            mobile.setprice(37999.0);//setting a default price
                            color="Blue";
                            CAMProp = "Camera: 48 MP + 12 MP + 16 MP | Front Camara : 16 MP";
                            Highlights = "| Display : 6.55-inch (1080x2400) | Processor : Qualcomm Snapdragon 855+ | Storage : 128GB | Battery Capacity : 3800mAh";
                            mobile.setCAMProperties(CAMProp);
                            mobile.setOverview(Highlights);
                            mobile.setColor(color);
                            //Invoking method in super class
                            mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                            break;
                    
                        case "8t":
                            mobile.setprice(42000.0);//setting a default price
                            color="black";
                            CAMProp = "Rear Camera : 48MP + 16MP + 5MP + 2MP | Front Camera : 16MP";
                            Highlights = "| Display : 6.55-inch (1080x2400) | RAM : 12GB | Storage : 256GB | OS : Android 11";
                            mobile.setCAMProperties(CAMProp);
                            mobile.setOverview(Highlights);
                            mobile.setColor(color);
                            //Invoking method in super class
                            mobile.MobileItem(mobile.getBrand(),mobile.getModel(),mobile.getColor(),mobile.getCAMProperties(),mobile.getOverview(),mobile.getprice());
                            break;

                        default:
                            System.out.println("Sorry the model "+ModelName+" is not available");
                            System.out.println("Please select the available Model");
                            oper("mobiles");
                            break;
                        
                    }
                    break;    
                    default:
                        System.out.println("Sorry the model"+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("mobiles");
                        break;
                }
                break;
            //laptops case
            case "laptops":
                System.out.println("The available Brand's in laptops:\n\n| DELL | APPLEMACBOOK |\n ");
                System.out.print("Which Brand u want: ");
                BrandName = Name.next();

                Lapi.setBrand(BrandName.toUpperCase());

                switch (BrandName.toLowerCase()) 
                {
                    case "dell":
                        System.out.println("The available model's in DELL laptops:\n\n| G3 | G7 |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        Lapi.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "g3":
                                Lapi.setprice(71000.0);//setting a default price
                                color="Black";
                                CoreProcessor = "i5"; //core procesor of the laptop
                                Gen = "10th"; //generation of the laptop
                                Highlights = "8 GB|512 GB SSD|Windows 10 Home|4 GB Graphics/NVIDIA GeForce GTX 1650| \n\t\t\t| 15.6 inch, 2.34 kg, With MS Office| \n\t\t\t| Battery Backup : Upto 8 hours | Power Supply : 130 W AC Adapter|\n\t\t\t|Processor Brand:Intel|";
                                Lapi.setGeneration(Gen); //setting the generation details to super class
                                Lapi.setProcessor(CoreProcessor); //setting the processor details to super classs
                                Lapi.setOverview(Highlights);//setting heighlisghts of the item to super class
                                Lapi.setColor(color);
                                //Invoking method in super class
                                Lapi.LaptopItem(Lapi.getBrand(),Lapi.getModel(),Lapi.getColor(),Lapi.getProcessor(),Lapi.getGeneration(),Lapi.getOverview(),Lapi.getprice());
                                break;
                            case "g7":
                                Lapi.setprice(207990.0);//setting a default price
                                color="White";
                                CoreProcessor = "i9";
                                Gen = "10th";
                                Highlights = "16 GB|1 TB SSD|Windows 10 Home|8 GB Graphics|NVIDIA GeForce RTX 2070|\n\t\t\t|15.6 inch|2.56 kg, With MS Office|\n\t\t\t| Battery Backup : Upto 10 hours | Clock Speed : 2.4 GHz with Turbo Boost Upto 5.3 GHz|\n\t\t\t| Processor Brand:Intel|";
                                Lapi.setGeneration(Gen);
                                Lapi.setProcessor(CoreProcessor);
                                Lapi.setOverview(Highlights);
                                Lapi.setColor(color);
                                //Invoking method in super class
                                Lapi.LaptopItem(Lapi.getBrand(),Lapi.getModel(),Lapi.getColor(),Lapi.getProcessor(),Lapi.getGeneration(),Lapi.getOverview(),Lapi.getprice());
                                break;
                        
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("laptops");
                                break;
                        }
                        break;
                    case "applemacbook":
                        System.out.println("The available model's in APPLEMACBOOK laptops:\n\n| AIRM1 | PROM1 |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        Lapi.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {
                            case "airm1":
                                Lapi.setprice(142900.0);//setting a default price
                                color="Silver";
                                CoreProcessor = "M1";//core procesor of the laptop
                                Gen = "MacBook Air";//generation of the laptop
                                Highlights = "8 GB | 256 GB SSD | Mac OS Big Sur | MGND3HN/A  | 13.3 inch diaplay | 1.29 kg|\n\t\t\t | Stylish & Portable Thin and Light Laptop| \n\t\t\t |Quad LED Backlit IPS Display (227 PPI, 400 nits Brightness | Wide Colour (P3)";
                                Lapi.setGeneration(Gen);//setting the generation details to super class
                                Lapi.setProcessor(CoreProcessor);//setting the processor details to super classs
                                Lapi.setOverview(Highlights);//setting heighlisghts of the item to super class
                                Lapi.setColor(color);
                                //Invoking method in super class
                                Lapi.LaptopItem(Lapi.getBrand(),Lapi.getModel(),Lapi.getColor(),Lapi.getProcessor(),Lapi.getGeneration(),Lapi.getOverview(),Lapi.getprice());
                                break;
                            case "prom1":
                                Lapi.setprice(142900.0);//setting a default price
                                color="Black";
                                CoreProcessor = "M1";
                                Gen = "MacBook Pro";
                                Highlights = "8 GB|512 GB SSD|Mac OS Big Sur | MYDC2HN/A | 13.3 inch, Silver, 1.4 kg | \n\t\t\t |13.3 inch Quad LED Backlit IPS Display (227 PPI, 500 nits Brightness, Wide Colour (P3), True Tone Technology)\n\t\t\t| Battery Backup : Upto 17 hours";
                                Lapi.setGeneration(Gen);
                                Lapi.setProcessor(CoreProcessor);
                                Lapi.setOverview(Highlights);
                                Lapi.setColor(color);
                                //Invoking method in super class
                                Lapi.LaptopItem(Lapi.getBrand(),Lapi.getModel(),Lapi.getColor(),Lapi.getProcessor(),Lapi.getGeneration(),Lapi.getOverview(),Lapi.getprice());
                                break;
                        
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("laptops");
                                break;
                        }
                        break;
                    default://giving a default vlue if the brand is not found
                        System.out.println("Sorry the model"+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("laptops");
                        break;
                }
                break;
            //Tv's case
            case "tvs":
                System.out.println("The available BRAND'S in TV's:\n\n| Mi | SONY |\n ");
                System.out.print("Which Brand u want: ");
                BrandName = Name.next();

                tv.setBrand(BrandName.toUpperCase());

                switch (BrandName.toLowerCase()) 
                {
                    case "mi":
                        System.out.println("The available Model's in Mi TV's:\n\n| 4APRO |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        tv.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "4apro":
                                tv.setprice(14900.0);//setting a default price
                                color="Black";
                                series = "4A PRO"; //seried of the TV
                                CoreProcessor="Amlogic 64-bit Quad-core"; //processor used in it
                                Highlights="|80 cm (32)| LED | Built In Wi-Fi | HDMI:3 Side USB :2 x Side | \n\t\t\t |Supported App - Others:Disney+Hotstar,Zee5 + 5000 apps, prime videos | \n\t\t\t |Sound Technology:DTS-HD Surround Sound :Stereo Sound| \n\t\t\t |Width x Height x Depth:733 mm x 435 mm x 80 mm| ";
                                tv.setGeneration(series); //setting the series details yo super class
                                tv.setProcessor(CoreProcessor); //setting the processor details to super class
                                tv.setOverview(Highlights);//setting heighlisghts of the item to super class
                                tv.setColor(color);
                                //Invoking method in super class
                                tv.TvItems(tv.getBrand(),tv.getModel(),tv.getColor(),tv.getProcessor(),tv.getGeneration(),tv.getOverview(),tv.getprice());
                                break;
                        
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("tvs");
                                break;
                        }
                        break;
                    
                    case "sony":
                        System.out.println("The available Model's in SONY TV's:\n\n| BRAVIA |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        tv.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "bravia":
                                tv.setprice(60900.0);//setting a default price
                                color="Black";
                                series = "W672G";
                                CoreProcessor="Linux based";
                                Highlights="|Display Size:108 cm (43)| LED | HD Technology & Resolution:Full HD, 1920 x 1080|\n\t\t\t | Netflix and YouTube |Built In Wi-Fi|\n\t\t\t|Width x Height x Depth:97.4 cm x 57.2 cm x 6.8 cm";
                                tv.setGeneration(series);
                                tv.setProcessor(CoreProcessor);
                                tv.setOverview(Highlights);
                                //Invoking method in super class
                                tv.TvItems(tv.getBrand(),tv.getModel(),tv.getColor(),tv.getProcessor(),tv.getGeneration(),tv.getOverview(),tv.getprice());
                                break;
                        
                            default:
                                System.out.print("Sorry the model"+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("tvs");
                                break;
                        }
                        break;
                    default://setting a default vlue if the brand not found
                        System.out.println("Sorry the model "+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("tvs");
                        break;
                }
                break;
            //speakers
            case "speakers":
                System.out.println("The available Model's in BOAT SPEAKER'S :\n\n| AAVANTEBAR |\n ");
                System.out.print("Which Brand u want: ");
                BrandName = Name.next();

                Spec.setBrand(BrandName.toUpperCase());

                switch (BrandName.toLowerCase()) 
                {
                    case "boat":
                        System.out.println("The available Model's in BOAT SPEAKER'S :\n\n| AAVANTEBAR |\n ");//the available models
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        Spec.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "aavantebar":
                                Spec.setprice(8799.0);//setting a default price
                                color="Black";
                                series = "2000";
                                PowerCapacity="160 W"; //power capacity of the speaker
                                Highlights="| Wireless music streaming via Bluetooth| Multiple connectivity- usb,optic,aux,remote| 3D stereo surround sound from two channel sources|\n\t\t\t |Configuration: 2.1 Channel";
                                Spec.setGeneration(series);
                                Spec.setProcessor(PowerCapacity);//setting the power capacity
                                Spec.setOverview(Highlights);//setting heighlisghts of the item to super class
                                Spec.setColor(color);
                                //Invoking method in super class
                                Spec.speakerItem(Spec.getBrand(),Spec.getModel(),Spec.getColor(),Spec.getProcessor(),Spec.getGeneration(),Spec.getOverview(),Spec.getprice());
                                break;
                    
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("speakers");
                                break;
                        }
                        break;
                
                    case "jbl":
                        System.out.println("The available Model's in JBL SPEAKER'S :\n\n| MOVIEBAR |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        Spec.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "moviebar":
                                Spec.setprice(13499.0);//setting a default price
                                color="Army color";
                                series = "100 Dolby Digital With Wireless Subwoofer";
                                PowerCapacity= "220 W";
                                Highlights="| Bluetooth Version: 4.2| Wireless range: 10 m| Frequency Response:40 Hz - 20 kHz|\n\t\t\t | USB Ports : 1 USB Ports| Signal to Noise Ratio: 80dB|";
                                Spec.setGeneration(series);
                                Spec.setProcessor(PowerCapacity);
                                Spec.setOverview(Highlights);
                                Spec.setColor(color);
                                //Invoking method in super class
                                Spec.speakerItem(Spec.getBrand(),Spec.getModel(),Spec.getColor(),Spec.getProcessor(),Spec.getGeneration(),Spec.getOverview(),Spec.getprice());
                                break;
                    
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("speakers");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Sorry the model "+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("speakers");
                        break;
                }
                break;
            //camara
            case "camaras":
                System.out.println("The available BRAND'S in CAMARA'S :\n\n| CANON| SONY |\n ");
                System.out.print("Which Brand u want: ");
                BrandName = Name.next();

                cam.setBrand(BrandName.toUpperCase());

                switch (BrandName.toLowerCase()) 
                {
                    case "canon":
                        System.out.println("The available MODEL'S in CANON camara's :\n\n| EOS |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        cam.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "eos":
                                cam.setprice(94999.0);//setting a default price
                                color="Army color";
                                series = "80D"; 
                                //camara specifications
                                CAMProp="| Effective Pixels: 24 MP | Vodeo quality :1080p at 60p + Time-Lapse|\n\t\t\t| Video Quality:1080p at 60p + Time-Lapse | Continuous Shots:7fps shooting | Focus Points:45-Point+Dual Pixel CMOS AF |";
                                Highlights="| Sensor Type: CMOS | SLR Variant:Body with Single Lens: EF-S 18-135 IS USM (16 GB SD Card)";//highlights
                                cam.setGeneration(series);
                                cam.setCAMProperties(CAMProp);
                                cam.setOverview(Highlights);//setting heighlisghts of the item to super class
                                cam.setColor(color);
                                //Invoking method in super class
                                cam.CamaraItem(cam.getBrand(),cam.getModel(),cam.getColor(),cam.getCAMProperties(),cam.getGeneration(),cam.getOverview(),cam.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("camaras");
                                break;
                        }
                        break;
            
                    case "sony":
                        System.out.println("The available MODEL'S in SONY camara's :\n\n| ALPHA |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        cam.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "alpha":
                                cam.setprice(102490.0);//setting a default price
                                color="Black";
                                series = "ILCE-6400M Mirrorless Camera ";
                                CAMProp="|Mirrorless Camera with 18-135mm Zoom Lens | 4K, FULL HD, HD | Effective Pixels: 24.2 MP|\n\t\t\t |SLR Variant : with 18-135mm Zoom Lens |\n\t\t\t| Ports:USB 2.0 Micro-B, HDMI D (Micro) Port, Microphone Port, Wired Remote Port|\n\t\t\t | Focal Length:Comparable 35mm Focal Length: 27 to 202.5 mm, 18 to 135mm| \n\t\t\t | Video Resolution:1920 x 1080";
                                Highlights="| Bluetooth Version: 4.2| Wireless range: 10 m| Frequency Response:40 Hz - 20 kHz|\n\t\t\t | USB Ports : 1 USB Ports| Signal to Noise Ratio: 80dB|";
                                cam.setGeneration(series);
                                cam.setCAMProperties(CAMProp);
                                cam.setOverview(Highlights);//setting heighlisghts of the item to super class
                                cam.setColor(color);
                                //Invoking method in super class
                                cam.CamaraItem(cam.getBrand(),cam.getModel(),cam.getColor(),cam.getCAMProperties(),cam.getGeneration(),cam.getOverview(),cam.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("camaras");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Sorry the model "+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("camaras");
                        break;
                }
                break;
            //powebank
            case "powerbanks":
                System.out.println("The available BRAND'S in PowerBank's :\n\n| REALME | AMBRANE |\n ");
                System.out.print("Which Brand u want: ");
                BrandName = Name.next();

                PoweB.setBrand(BrandName.toUpperCase());

                switch (BrandName.toLowerCase()) 
                {
                    case "realme":
                        System.out.println("The available MODEL'S in REALME PowerBank's :\n\n| POWERBANK |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        PoweB.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case"powerbank":
                                PoweB.setprice(1600.0);//setting a default price
                                color="Grey";
                                //highlights of the power bank  
                                Highlights="|Quick Charge 2.0, Power Delivery 2.0, 18 W|Lithium Polymer Battery | Micro, Type-C Connector| Power Source: AC Adapter|\n\t\t\t | Weight: 495 g |Capacity: 20000 mAh|";
                                PoweB.setOverview(Highlights);//setting heighlisghts of the item to super class
                                PoweB.setColor(color);
                                //Invoking method in super class
                                PoweB.PowerBankItem(PoweB.getBrand(),PoweB.getModel(),PoweB.getColor(),PoweB.getOverview(),PoweB.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("powerbanks");
                                break;
                        }
                        break;
            
                    case"ambrane":
                        System.out.println("The available MODEL'S in AMBRANE PowerBank's :\n\n| POWERLITXL|\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        PoweB.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "powerlitxl":
                                PoweB.setprice(1600.0);//setting a default price
                                color="Black";
                                Highlights="Weight: 317 g | Capacity: 20000 mAh| 2 x USB (5V4.5A, 4.5V5A, 9V2A, 12V1.5A) & 1 x Type C (5V3A, 9V2A, 12V1.5A)";
                                PoweB.setOverview(Highlights);//setting heighlisghts of the item to super class
                                PoweB.setColor(color);
                                //Invoking method in super class
                                PoweB.PowerBankItem(PoweB.getBrand(),PoweB.getModel(),PoweB.getColor(),PoweB.getOverview(),PoweB.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("powerbanks");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Sorry the model "+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("powerbanks");
                        break;
                }
                break;
            //storage
            case "harddisks":
                System.out.println("The available BRAND'S in HARD DISK's :\n\n| THOSHIBHA(HDD) | WD(HDD) | CRUCICAL(SSD) |\n ");
                System.out.print("Which Brand u want: ");
                BrandName = Name.next();

                disk.setBrand(BrandName.toUpperCase());

                switch (BrandName.toLowerCase()) 
                {
                    case "thoshiba":
                        System.out.println("The available MODEL'S in Thosibha HardDisk's :\n\n| CANVIO |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        disk.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case"canvio":
                                disk.setprice(3699.0);//setting a default price
                                Highlights="1 TB External Hard Disk Drive| ystem Requirements:Formatted NTFS for Microsoft Windows 7 and Above, Requires Reformatting for Mac OS|\n\t\t\t |Rotational Speed:5400 RPM|Data Transfer Rate:Upto 5 Gbps|\n\t\t\t|Shock Resistant:Yes|";
                                disk.setOverview(Highlights);//setting heighlisghts of the item to super class
                                //Invoking method in super class
                                disk.HardDiskItem(PoweB.getBrand(),PoweB.getModel(),PoweB.getOverview(),PoweB.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("harddisks");
                                break;
                        }
                        break;
            
                    case"wd":
                        System.out.println("The available MODEL'S in WD HardDisk's :\n\n| ELEMENTS |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        disk.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "elements":
                                disk.setprice(5199.0);//setting a default price
                                Highlights=" 2 TB Wired External Hard Disk Drive| System Requirements:Windows 7, Windows 8, Windows 8.1, Windows 10|\n\t\t\t|Connectivity: USB 3.0, USB 2.0|Portable Hard Drive|";
                                disk.setOverview(Highlights);
                                //Invoking method in super class
                                disk.HardDiskItem(PoweB.getBrand(),PoweB.getModel(),PoweB.getOverview(),PoweB.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("harddisks");
                                break;
                        }
                        break;
                    case"crucical":
                        System.out.println("The available MODEL'S in CRUCICAL SSD :\n\n| P2 |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        disk.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {

                            case "p2":
                                disk.setprice(4064.0);//setting a default price
                                Highlights="Type: SSD| Interface: PCIe NVMe 2280| Form Factor: M.2| Capacity: 250 GB| \n\t\t\t| Average Seek Time:2100 (Read)";
                                disk.setOverview(Highlights);
                                //Invoking method in super class
                                disk.HardDiskItem(PoweB.getBrand(),PoweB.getModel(),PoweB.getOverview(),PoweB.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("harddisks");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Sorry the model "+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("harddisks");
                        break;
                }
                break;
            //fridge
            case "refrigirators":
                System.out.println("The available BRAND'S in REFRIGIRATOR'S :\n\n| WHIRLPOOL |\n ");
                System.out.print("Which Brand u want: ");
                BrandName = Name.next();
                fridge.setBrand(BrandName.toUpperCase());

                switch (BrandName.toLowerCase()) 
                {
                    case "whirlpool":
                        System.out.println("The available MODEL'S in Whirlpool refrigirator's :\n\n| INTELLIFRESHPRO |\n ");
                        System.out.print("which Model u want: ");
                        ModelName = Name.next();
                        fridge.setModel(ModelName.toUpperCase());
                        switch (ModelName.toLowerCase()) 
                        {
                            case"intellifreshpro":
                                fridge.setprice(35490.0);//setting a default price
                                Highlights="|325 L Frost Free Double Door Bottom Mount 2 Star|Steel Onyx, IFPRO BM INV 340 ELT+ STEEL ONYX (2S)-N|\n\t\t\t| Cooling Refrigerant:R600a|\n\t\t\t|Adaptive Intelligence Technology|Avant Garde Design|3D Airflow Technology|\n\t\t\t|Extended Freshness|Prevents Excessive Ripening|";
                                fridge.setOverview(Highlights);//setting heighlisghts of the item to super class
                                //Invoking method in super class
                                fridge.fridgeItem(PoweB.getBrand(),PoweB.getModel(),PoweB.getOverview(),PoweB.getprice());
                                break;
                
                            default:
                                System.out.println("Sorry the model "+ModelName+" is not available");
                                System.out.println("Please select the available Model");
                                oper("refrigirators");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Sorry the model "+BrandName+" is not available");
                        System.out.println("Please select the available Brands");
                        oper("refrigirators");
                        break;
                }
                break;

            default:
                System.out.println("Sorry the Product "+X+" is not available");
                System.out.println("Please select the available Products");
                ELC.Shopping(1);
                break;
        
            }
        Name.close();
    }
}