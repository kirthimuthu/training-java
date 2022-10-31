class ActorSivakumar implements Actor
{

static String address = "Coimbatore";


int age;
String car;
ActorSivakumar()
	{
		System.out.println("Actor Sivakumar");
	}
	
ActorSivakumar(int age, String car)
{

}
public static void main(String[] args) {
ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println(address);

Actor ac = new ActorSivakumar();
ac.act();
ac.dance();
ac.sing();
System.out.println(ac.address);

}
public void act()
{
System.out.println("Acting");
}
public void dance()
{
System.out.println("Dancing");
}
public void sing()
{
System.out.println("Singing");
}
void speaking()
{
System.out.println("speaking");
}
}

