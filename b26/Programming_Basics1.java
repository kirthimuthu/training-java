class Programming_Basics1
{
public static void main(String[] args)
{
Programming_Basics1 pb = new Programming_Basics1(); 
pb.calculate_amount(); 
}
public void calculate_amount()
{
int amount = 0; 
int day = 1; 
while(day<=10)
{
amount = amount + day; 
day = day +1;
}
System.out.println(amount); 
}
}

