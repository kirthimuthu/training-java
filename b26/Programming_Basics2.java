class Programming_Basics2
{
public static void main(String[] args)
{
Programming_Basics2 pb = new Programming_Basics2(); 
pb.Security_count(1024); 
}
public void Security_count(int beats)
{
int Security = 0; 
while(beats>1)
{
beats = beats/2; 
System.out.println("security gets "+ beats ); 
Security = Security + 1; 
}
System.out.println("No. of Securities is "+ Security); 
}
}

