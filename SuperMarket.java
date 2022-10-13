class SuperMarket
{ // non-static variables
//global - Default values:
int price, discount; 
String brand; 
static String name = "Raja SuperMarket";
// Constructor


SuperMarket(String brand, int price, int discount)
{                  
this.brand = brand; //brand = s; 
this.price = price; // price = a; 
this.discount = discount;// discount = b; 
}

public static void main(String[] args)
{
SuperMarket brush = new SuperMarket("Pepsodent", 30, 5); 
SuperMarket soap = new SuperMarket("Lux", 25, 2);
brush.purchase(); 
soap.purchase();
}
void purchase()
{
System.out.println("Customer is buying product "+ brand + " for Rs. "+ price + " with discount "+ discount); 
}

}
