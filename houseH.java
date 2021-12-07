import java.util.*;
import java.util.jar.Attributes.Name;

 class Household
{

    private double unitprice;
    private String Type,Material,iname;
    ArrayList<String> iName = new ArrayList<String>(4);
    ArrayList<String> Types = new ArrayList<String>(4);
    ArrayList<String> MaterialOf = new ArrayList<String>(4);
    ArrayList<Double> Prices = new ArrayList<Double>(4);
    static ArrayList<String> CartItem= new ArrayList<String>(4);
	static ArrayList<Double> CartPrices= new ArrayList<Double>(4);
    
    public void setprice(Double Pr)
    {
        this.unitprice=Pr;
    }
    public Double getprice()
    {
        return unitprice;
    }
    public void setType(String B)
    {
        this.Type=B;
    }
    public String getType()
    {
        return Type;
    }
    public void setMaterial(String M)
    {
        this.Material=M;
    }
    public String getMaterial()
    {
        return Material;
    }
    public void setName(String NA)
    {
        this.iname=NA;
    }
    public String getName() {
        return iname;
    }
    public void addcart() {
    	Scanner Name = new Scanner(System.in);
        OnlineShopping xx = new OnlineShopping();
    		System.out.print("");
            System.out.println("To conform to add the cart enter : 1 \nTo continue shopping enter :0 ");
            System.out.print(">>> ");
            int x = Name.nextInt();
    		if(x==1)
            {
                System.out.print("~Item added to cart~\n");
                CartItem.add(getName()+""+getType());
    		    CartPrices.add(getprice());
                System.out.println("Did you want to go to the cart or continue shopping");
                System.out.println("To conform to go to the cart for checkout enter : 1 \nTo continue shopping enter :0 ");
                int y = Name.nextInt();
                if (y==1)
                {
                    ShoppingCartManager SCM=new ShoppingCartManager();
                    SCM.Cart(CartItem,CartPrices);
                    
                }
                else
                {
                
                    
                    xx.shopping( 1);
                }
            }
            else if(x ==0)
            {
                System.out.print("please continue your shopping");
            
			    
                xx.shopping( 1);
            }
    	    
            
    }
}
class Bed extends Household {
    public void BedItem(String name,String Type, String Material, double Price) {
        super.iName.add(name);
        super.Types.add(getType());
        super.MaterialOf.add(getMaterial().toUpperCase());
        super.Prices.add(getprice());
        for (int i=0;i<1;i++) {
        	System.out.println("\n___The Details of the "+Types.get(i)+" "+MaterialOf.get(i)+" Bed____");
            System.out.println("Type : " + Types.get(i));
            System.out.println("Material : " + MaterialOf.get(i));
            System.out.println("Price : " + Prices.get(i));
        }
        System.out.print("\nEnter 1 to add item to cart\nEnter 0 to continue shopping : ");
        Scanner Name = new Scanner(System.in);
        int ch=Name.nextInt();
        if(ch==1) {
        	super.addcart();
        }
        else {
        	System.out.print("\nPlease continue shopping");
        	OnlineShopping xx = new OnlineShopping();
            xx.shopping( 1);
        }
    }
}
class Cupboard extends Household {
    public void CupItem(String name,String Type, String Material, double Price) {
        super.iName.add(name);
        super.Types.add(getType());
        super.MaterialOf.add(getMaterial().toUpperCase());
        super.Prices.add(getprice());
        for (int i=0;i<1;i++) {
        	System.out.println("\n___The Details of the "+Types.get(i)+" "+MaterialOf.get(i)+" Cupboard____");
            System.out.println("Type : " + Types.get(i));
            System.out.println("Material : " + MaterialOf.get(i));
            System.out.println("Price : " + Prices.get(i));
        }
        System.out.print("\nEnter 1 to add item to cart\nEnter 0 to continue shopping : ");
        Scanner Name = new Scanner(System.in);
        int ch=Name.nextInt();
        if(ch==1) {
        	super.addcart();
        }
        else {
        	System.out.print("Please continue shopping");
        	OnlineShopping xx = new OnlineShopping();
            xx.shopping( 1);
        }
    }
    }

class Table extends Household {
    public void TableItem(String name,String Type, String Material, double Price) {
        super.iName.add(name);
        super.Types.add(getType());
        super.MaterialOf.add(getMaterial().toUpperCase());
        super.Prices.add(getprice());
        for (int i=0;i<1;i++) {
        	System.out.println("\n___The Details of the "+Types.get(i)+" "+MaterialOf.get(i)+" Table____");
            System.out.println("Type : " + Types.get(i));
            System.out.println("Material : " + MaterialOf.get(i));
            System.out.println("Price : " + Prices.get(i));
        }
        System.out.print("\nEnter 1 to add item to cart\nEnter 0 to continue shopping : ");
        Scanner Name = new Scanner(System.in);
        int ch=Name.nextInt();
        if(ch==1) {
        	super.addcart();
        }
        else {
        	System.out.print("Please continue shopping");
        	OnlineShopping xx = new OnlineShopping();
            xx.shopping( 1);
        }
    }
    }

class Sofa extends Household {
    public void SofaItem(String name,String Type, String Material, double Price) {
        super.iName.add(name);
        super.Types.add(getType());
        super.MaterialOf.add(getMaterial().toUpperCase());
        super.Prices.add(getprice());
        for (int i=0;i<1;i++) {
        	System.out.println("\n___The Details of the "+Types.get(i)+" "+MaterialOf.get(i)+" Sofa____");
            System.out.println("Type : " + Types.get(i));
            System.out.println("Material : " + MaterialOf.get(i));
            System.out.println("Price : " + Prices.get(i));
        }
        System.out.print("\nEnter 1 to add item to cart\nEnter 0 to continue shopping : ");
        Scanner Name = new Scanner(System.in);
        int ch=Name.nextInt();
        if(ch==1) {
        	super.addcart();
        }
        else {
        	System.out.print("Please continue shopping");
        	OnlineShopping xx = new OnlineShopping();
            xx.shopping( 1);
        }
    }
    }

class Chair extends Household {
    public void ChairItem(String name,String Type, String Material, double Price) {
        super.iName.add(name);
        super.Types.add(getType());
        super.MaterialOf.add(getMaterial().toUpperCase());
        super.Prices.add(getprice());
        for (int i=0;i<1;i++) {
        	System.out.println("\n___The Details of the "+Types.get(i)+" "+MaterialOf.get(i)+" Chair____");
            System.out.println("Type : " + Types.get(i));
            System.out.println("Material : " + MaterialOf.get(i));
            System.out.println("Price : " + Prices.get(i));
        }
        System.out.print("\nEnter 1 to add item to cart\nEnter 0 to continue shopping : ");
        Scanner Name = new Scanner(System.in);
        int ch=Name.nextInt();
        if(ch==1) {
        	super.addcart();
        }
        else {
        	System.out.print("Please continue shopping");
        	OnlineShopping xx = new OnlineShopping();
            xx.shopping( 1);
        }
    }
    }

class Curtains extends Household {
    public void CurtItem(String name,String Type, String Material, double Price) {
        super.iName.add(name);
    	super.Types.add(getType());
        super.MaterialOf.add(getMaterial().toUpperCase());
        super.Prices.add(getprice());
        for (int i=0;i<1;i++) {
        	System.out.println("\n___The Details of the "+Types.get(i)+" "+MaterialOf.get(i)+" Curtain____");
            System.out.println("Type : " + Types.get(i));
            System.out.println("Material : " + MaterialOf.get(i));
            System.out.println("Price : " + Prices.get(i));
        }
        System.out.print("\nEnter 1 to add item to cart\nEnter 0 to continue shopping : ");
        Scanner Name = new Scanner(System.in);
        int ch=Name.nextInt();
        if(ch==1) {
        	super.addcart();
        }
        else {
        	System.out.print("Please continue shopping");
        	OnlineShopping xx = new OnlineShopping();
            xx.shopping( 1);
        }
    }
    }
class Carpets extends Household {
    public void CarpItem(String name,String Type, String Material, double Price) {
        super.iName.add(name);
        super.Types.add(getType());
        super.MaterialOf.add(getMaterial().toUpperCase());
        super.Prices.add(getprice());
        for (int i=0;i<1;i++) {
        	System.out.println("\n___The Details of the "+Types.get(i)+" "+MaterialOf.get(i)+" Carpet____");
            System.out.println("Type : " + Types.get(i));
            System.out.println("Material : " + MaterialOf.get(i));
            System.out.println("Price : " + Prices.get(i));
        }
        System.out.print("\nEnter 1 to add item to cart\nEnter 0 to continue shopping : ");
        Scanner Name = new Scanner(System.in);
        int ch=Name.nextInt();
        if(ch==1) {
        	super.addcart();
        }
        else {
        	System.out.print("Please continue shopping");
        	OnlineShopping xx = new OnlineShopping();
            xx.shopping( 1);
        }
    }
    }


public class houseH{
    private static final ArrayList<String> Items = null;
    public void household(String x) {
        OnlineShopping xx = new OnlineShopping();
            
        Scanner Name = new Scanner(System.in);
        switch (x.toLowerCase()) {
            case "bed":

            	Bed bed = new Bed();
            	System.out.print("Types available :\nSingle \nDouble \nFamily\n");
            	System.out.print("\nEnter required type : ");		
                String TypeName = Name.next();
                bed.setName(x);
                bed.setType(TypeName.toUpperCase());

                switch (TypeName.toLowerCase()) {
                    case "single":
                    	System.out.print("Materials available :\nFoam\nLatex\nInnerspring\n");
                    	System.out.print("\nEnter required material : ");
                        String MaterialName = Name.next();
                        bed.setMaterial(MaterialName);
                        switch (MaterialName.toLowerCase()) {
                            case "latex":
                            	System.out.print("Thank you for choosing an Eco-friendly product :)\n");
                                bed.setprice(18000.0);
                                bed.BedItem(bed.getName(),bed.getType(), bed.getMaterial(), bed.getprice());                                
                                break;

                            case "foam" :
                                bed.setprice(12000.0);
                                bed.BedItem(bed.getName(),bed.getType(), bed.getMaterial(), bed.getprice());
                                break;
                                
                            case "innerspring" :
                                bed.setprice(14000.0);
                                bed.BedItem(bed.getName(),bed.getType(), bed.getMaterial(), bed.getprice());
                                break;

                            default:
                                System.out.print("Sorry the Material "+MaterialName+" is not available");
                                xx.shopping( 1);
                                break;
                        }
                        break;
                    case "double":
                    	System.out.print("Materials available :\nFoam\nLatex\n");
                        System.out.print("\nEnter required material : ");
                        String MaterialName1 = Name.next();
                        bed.setMaterial(MaterialName1);
                        switch (MaterialName1.toLowerCase()) {
                            case "latex":
                            	System.out.print("Thank you for choosing an Eco-friendly product :)\n");
                                bed.setprice(36000.0);
                                bed.BedItem(bed.getName(),bed.getType(), bed.getMaterial(), bed.getprice());
                                break;
                            case "foam":
                            	bed.setprice(25000.0);
                                bed.BedItem(bed.getName(),bed.getType(), bed.getMaterial(), bed.getprice());
                                break;
                            default:
                                System.out.print("Sorry the material " + MaterialName1 + " is not available");
                                xx.shopping( 1);
                                break;
                        }
                        break;
                    case "family":
                    	System.out.print("Materials available :\nFoam\nLatex\n\nEnter required material : ");
                        String MaterialName2 = Name.next();
                        bed.setMaterial(MaterialName2);
                        switch (MaterialName2.toLowerCase()) {
                            case "latex":
                            	System.out.print("Thank you for choosing an Eco-friendly product :)\n");
                                bed.setprice(45000.0);
                                bed.BedItem(bed.getName(),bed.getType(), bed.getMaterial(), bed.getprice());
                                break;
                            case "foam":
                            	bed.setprice(35000.0);
                                bed.BedItem(bed.getName(),bed.getType(), bed.getMaterial(), bed.getprice());
                                break;
                            default:
                                System.out.print("Sorry the material " + MaterialName2 + " is not available");
                                xx.shopping( 1);
                                break;
                        }
                }
                break;
                
            case "cupboard":
                    	Cupboard cup = new Cupboard();
                    	System.out.print("Types available :\nSmall \nMedium \nLarge\n");
                    	System.out.print("\nEnter required type : ");		
                        String TypeName1 = Name.next();
                        cup.setName(x);
                        cup.setType(TypeName1.toUpperCase());
                        
                        switch (TypeName1.toLowerCase()) {
                        case "small":
                        	System.out.print("Materials available :\nWood\nPlywood\nParticleboard\n");
                        	System.out.print("\nEnter required material : ");
                            String MaterialName3 = Name.next();
                            cup.setMaterial(MaterialName3);
                            switch (MaterialName3.toLowerCase()) {
                                case "wood":
                                    cup.setprice(20000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                case "plywood" :
                                    cup.setprice(12000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                case "particleboard":
                                    cup.setprice(18000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                default:
                                    System.out.print("Sorry the Material "+MaterialName3+" is not available");
                                    xx.shopping( 1);
                                    break;
                            }
                            break;
                        case "medium":
                        	System.out.print("Materials available :\nWood\nPlywood\nParticleboard\n");
                        	System.out.print("\nEnter required material : ");
                            String MaterialName4 = Name.next();
                            cup.setMaterial(MaterialName4);
                            switch (MaterialName4.toLowerCase()) {
                                case "wood":
                                    cup.setprice(28000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                case "plywood" :
                                    cup.setprice(19000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                case "particleboard":
                                    cup.setprice(24000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                default:
                                    System.out.print("Sorry the Material "+MaterialName4+" is not available");
                                    xx.shopping( 1);
                                    break;
                            }
                            break;
                        case "large":
                        	System.out.print("Materials available :\nWood\nPlywood\nParticlboard\n");
                        	System.out.print("\nEnter required material : ");
                            String MaterialName5 = Name.next();
                            cup.setMaterial(MaterialName5);
                            switch (MaterialName5.toLowerCase()) {
                                case "wood":
                                    cup.setprice(36000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                case "plywood" :
                                    cup.setprice(28000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                case "particleboard":
                                    cup.setprice(30000.0);
                                    cup.CupItem(cup.getName(),cup.getType(), cup.getMaterial(), cup.getprice());
                                    break;
                                default:
                                    System.out.print("Sorry the Material "+MaterialName5+" is not available");
                                    xx.shopping( 1);
                                    break;
                            }
                        }
                        break;
                        
            case "table":
            	Table tab = new Table();
            	System.out.print("Types available :\nDining \nStudy \nCoffee\n");
            	System.out.print("\nEnter required type : ");		
                String TypeName2 = Name.next();
                tab.setName(x);
                tab.setType(TypeName2.toUpperCase());
                
                switch (TypeName2.toLowerCase()) {
                case "dining":
                	System.out.print("Materials available :\nWood\nGlass\n");
                	System.out.print("\nEnter required material : ");
                    String MaterialName6 = Name.next();
                    tab.setMaterial(MaterialName6);
                    switch (MaterialName6.toLowerCase()) {
                        case "wood":
                            tab.setprice(20000.0);
                            tab.TableItem(tab.getName(),tab.getType(), tab.getMaterial(), tab.getprice());
                            break;
                        case "glass" :
                            tab.setprice(15000.0);
                            tab.TableItem(tab.getName(),tab.getType(), tab.getMaterial(), tab.getprice());
                            break;
                        default:
                            System.out.print("Sorry the Material "+MaterialName6+" is not available");
                            xx.shopping( 1);
                            break;
                    }
                    break;
                case "study":
                	System.out.print("Material available :\nWood\n");                	         
                    tab.setMaterial("Wood");                   
                    tab.setprice(9000.0);
                    tab.TableItem(tab.getName(),tab.getType(),tab.getMaterial(),tab.getprice());
                    break;
                    
                case "coffee":
            	   System.out.print("Material available :\nGlass\n");                	         
                   tab.setMaterial("Glass");                   
                   tab.setprice(6000.0);
                   tab.TableItem(tab.getName(),tab.getType(),tab.getMaterial(),tab.getprice());
                   break;
                }
                break;
                
            case "sofa":
            	Sofa sof = new Sofa();
            	System.out.print("Types available :\n3-seat\n2-seat\n");
            	System.out.print("\nEnter required type : ");		
                String TypeName3 = Name.next();
                sof.setName(x);
                sof.setType(TypeName3.toUpperCase());
                
                switch (TypeName3.toLowerCase()) {
                case "3-seat":
                	System.out.print("Materials available :\nCotton\nLinen\n");
                	System.out.print("\nEnter required material : ");
                    String MaterialName7 = Name.next();
                    sof.setMaterial(MaterialName7);
                    switch (MaterialName7.toLowerCase()) {
                        case "cotton":
                            sof.setprice(50000.0);
                            sof.SofaItem(sof.getName(),sof.getType(), sof.getMaterial(), sof.getprice());
                            break;
                        case "linen" :
                            sof.setprice(60000.0);
                            sof.SofaItem(sof.getName(),sof.getType(), sof.getMaterial(), sof.getprice());
                            break;
                        default:
                            System.out.print("Sorry the Material "+MaterialName7+" is not available");
                            xx.shopping( 1);
                            break;
                    }
                    break;
                case "2-seat":
                	System.out.print("Materials available :\nCotton\nLinen\n");
                	System.out.print("\nEnter required material : ");
                    String MaterialName8 = Name.next();
                    sof.setMaterial(MaterialName8);
                    switch (MaterialName8.toLowerCase()) {
                        case "cotton":
                            sof.setprice(20000.0);
                            sof.SofaItem(sof.getName(),sof.getType(), sof.getMaterial(), sof.getprice());
                            break;
                        case "linen" :
                            sof.setprice(28000.0);
                            sof.SofaItem(sof.getName(),sof.getType(), sof.getMaterial(), sof.getprice());
                            break;
                        default:
                            System.out.print("Sorry the Material "+MaterialName8+" is not available");
                            xx.shopping( 1);
                            break;
                    }
                }
                break;
                
            case "chair":
                Chair cha = new Chair();
            	System.out.print("Types available :\nDeskchair\nArmchair\nSidechair\n");
            	System.out.print("\nEnter required type : ");		
                String TypeName4 = Name.next();
                cha.setName(x);
                cha.setType(TypeName4.toUpperCase());
                
                switch (TypeName4.toLowerCase()) {
                case "deskchair":
                	System.out.print("Material available :\nLeather\n");
                    cha.setMaterial("Leather");
                    cha.setprice(6000.0);
                    cha.ChairItem(cha.getName(),cha.getType(), cha.getMaterial(), cha.getprice());
                    break;
                case "armchair":
                	System.out.print("Material available :\nWood\n");
                    cha.setMaterial("Wood");
                    cha.setprice(9000.0);
                    cha.ChairItem(cha.getName(),cha.getType(), cha.getMaterial(), cha.getprice());
                    break;
                case "sidechair":
                	System.out.print("Material available :\nWood\n");
                    cha.setMaterial("Wood");
                    cha.setprice(7500.0);
                    cha.ChairItem(cha.getName(),cha.getType(), cha.getMaterial(), cha.getprice());
                    break;
                    }
                break;
                
            case "curtains":
                Curtains curt = new Curtains();
            	System.out.print("Types available :\nSheer\nSemisheer\nBlackout\n");
            	System.out.print("\nEnter required type : ");		
                String TypeName5 = Name.next();
                curt.setName(x);
                curt.setType(TypeName5.toUpperCase());
                
                switch (TypeName5.toLowerCase()) {
                case "sheer":
                	System.out.print("Material available :\nPolyester\n");
                    curt.setMaterial("Polyester");
                    curt.setprice(1399.0);
                    curt.CurtItem(curt.getName(),curt.getType(), curt.getMaterial(), curt.getprice());
                    break;
                case "semisheer":
                	System.out.print("Material available :\nSilk\n");
                    curt.setMaterial("Silk");
                    curt.setprice(1199.0);
                    curt.CurtItem(curt.getName(),curt.getType(), curt.getMaterial(), curt.getprice());
                    break;
                case "blackout":
                	System.out.print("Material available :\nCotton\n");
                    curt.setMaterial("Cotton");
                    curt.setprice(999.0);
                    curt.CurtItem(curt.getName(),curt.getType(), curt.getMaterial(), curt.getprice());
                    break;
                    }
                break;
            case "carpets":
                Carpets carp = new Carpets();
            	System.out.print("Types available :\nWoven\nTufted\nFlatweave\n");
            	System.out.print("\nEnter required type : ");		
                String TypeName6 = Name.next();
                carp.setName(x);
                carp.setType(TypeName6.toUpperCase());
                
                switch (TypeName6.toLowerCase()) {
                case "woven":
                	System.out.print("Materials available :\nNylon\nWool\nCotton\n");
                	System.out.print("\nEnter required material : ");
                    String MaterialName9 = Name.next();
                    carp.setMaterial(MaterialName9);
                    switch (MaterialName9.toLowerCase()) {
                        case "cotton":
                            carp.setprice(900.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());
                            break;
                        case "nylon" :
                            carp.setprice(850.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());
                            break;
                        case "wool" :
                            carp.setprice(1200.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());
                            break;
                        default:
                            System.out.print("Sorry the Material "+MaterialName9+" is not available");
                            xx.shopping( 1);
                            break;
                    }
                    break;
                case "tufted":
                	System.out.print("Materials available :\\nWool\nCotton\n");
                	System.out.print("\nEnter required material : ");
                    String MaterialName10 = Name.next();
                    carp.setMaterial(MaterialName10);
                    switch (MaterialName10.toLowerCase()) {
                        case "cotton":
                            carp.setprice(1250.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());                       
                        case "wool" :
                            carp.setprice(1800.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());
                            break;
                        default:
                            System.out.print("Sorry the Material "+MaterialName10+" is not available");
                            xx.shopping( 1);
                            break;
                    }
                    break;
                case "flatweave":
                	System.out.print("Materials available :\nNylon\nWool\nCotton\n");
                	System.out.print("\nEnter required material : ");
                    String MaterialName11 = Name.next();
                    carp.setMaterial(MaterialName11);
                    switch (MaterialName11.toLowerCase()) {
                        case "cotton":
                            carp.setprice(1300.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());
                            break;
                        case "nylon" :
                            carp.setprice(970.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());
                            break;
                        case "wool" :
                            carp.setprice(1620.0);
                            carp.CarpItem(carp.getName(),carp.getType(), carp.getMaterial(), carp.getprice());
                            break;
                        default:
                            System.out.print("Sorry the Material "+MaterialName11+" is not available");
                            xx.shopping( 1);
                            break;
                    }
                }
                break;
                
                case "exit":
                	System.exit(0);
                               
                default:
                    System.out.print("Sorry the Type " + x + " is not available");
                    xx.shopping( 1);
                    break;
        }  
    }
}  