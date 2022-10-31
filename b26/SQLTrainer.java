class SQLTrainer extends Trainer
{

public static void main(String[] args)
{
SQLTrainer ram = new SQLTrainer();

System.out.println(ram.dept);
System.out.println(ram.Institute);
ram.training();
int sal = ram.getSalary();
System.out.println(sal);

}
SQLTrainer()
{
super("CSE","Payilagam");
//System.out.println(“This is child class constructor”);

}
}
