class Mobile extends Telephone{
int price = 15000;
String name="Mobile";
public void sms()
{
System.out.println("Messaging Facility");
}
public static void main(String[] args)
{
Mobile samsung = new Mobile();
 samsung.call();
 samsung.receive_call();
 System.out.println(samsung.price);
 System.out.println(samsung.name);
Telephone bsnl = new Telephone();
 System.out.println(bsnl.name);
 System.out.println(bsnl.price);
 bsnl.call();
 bsnl.receive_call();
}
}

