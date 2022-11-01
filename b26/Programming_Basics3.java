class Programming_Basics3
{
public static void main(String[] args)
{
Programming_Basics3 pb = new Programming_Basics3(); 
pb.dosai_count(8); 
}
public void dosai_count(int dosai)
{
int count = 3; 
while(count>=1)
{
dosai = dosai + dosai/2; 
count = count -1; 
}
System.out.println("Total no. of dosais is "+ dosai); 
} 
}

