class Calculator2
{
public static void main(String[] args)
{
Calculator2 calc = new Calculator2(); 
calc.add(70,90);
calc.add(30,20); // Arguments Passing
calc.add(50,20,30); 
calc.add(5.5f, 6.5f); 

}
void add(float no1, float no2)
{
System.out.println(no1+no2); 
}
void add(int no1, int no2, int no3)  //Parameter Passing
{ // Code Reusability
System.out.println(no1+no2+no3);
}

void add(int no1, int no2)  //Parameter Passing
{ // Code Reusability
System.out.println(no1+no2);
}

}
