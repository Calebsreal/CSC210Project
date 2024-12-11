public class PizzaStore {
    //Fields
    private String [][] usernamePassword = {{"username" , "password"},{"Baskin", "100 Chambers"}} ;
    private String [] itemNames = {"Margherita" , "Pepperoni" , "BBQ Chicken" , "Veggie"};
    private double [] itemPrices = {8.99 , 9.99 , 10.99 , 7.99} ;
    private final double Tax_Rate = 0.08 ;

    //Methods
    public String getUserName(String x)
    {
        return usernamePassword[1][0] ;
    }
    public String getPassword(String y)
    {
        return usernamePassword[1][1] ;
    }
    public String getItemNames()
    {
        for (int i = 0; i < itemNames.length; i++)
        {
            return itemNames[i] ;
        }

    }
    public double getPrice(String itemname)
    {
        for(int i = 0; i < itemNames.length; i++)
        {
            if(itemNames[i].equalsIgnoreCase(itemNames[i]))
            {
                return itemPrices[i] ;
            }
        }
        return 0.0 ;

    }
    public double calculateCost(int quantity , double price)
    {
        return quantity * price ;
    }
    public double calculateTax(double Cost)
    {
        return Cost * Tax_Rate ;
    }
    public double calculateTotalCost(int quantity , double price , double Cost )
    {
        return calculateCost(quantity , price) + calculateTax(Cost) ;
    }
}
