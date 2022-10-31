class Samsung extends FactoryDemo
{
public static void main(String[] args)
{
//Static int price = 5000;
Samsung sam = new Samsung();
sam.browse();
sam.sendMessage();
sam.providePattern();
Samsung.price=5000;
System.out.println(sam.price);
}
//System.out.println(sam.price);
public int call(int seconds)
{
return seconds;
}
public void sendMessage()
{
System.out.println("Samsung-massage");  
 
}
public void receiveCall()
{
System.out.println("samsung-receive call"); 
 
}
public void verifyFingerPrint()
{
System.out.println("samsung-Fingerprint");  
 
}
void providePattern() {
System.out.println("samsung-pattern"); 
}
}

