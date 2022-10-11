class PhoenixMall
{
public static String address = "12, Vivekanandar Street, Dubai"; 
static int openingTime = 9; 
static boolean ac = true; 
String movieName;  
int movieTime; 
boolean movieHit; 
public static void main(String[] args)
{
PhoenixMall screen1 = new PhoenixMall();
screen1.movieName = "Ponniyin Selvan";  
screen1.movieTime = 10; 
screen1.movieHit = true; 
PhoenixMall screen2 = new PhoenixMall();
screen2.movieName = "Nane Varuven"; 
screen2.movieTime = 1030;  
screen2.movieHit = false; 
PhoenixMall screen3 = new PhoenixMall();
screen3.movieName = "Kantara"; 
screen3.movieTime = 11; 
screen3.movieHit = true; 
 
PhoenixMall screen4 = new PhoenixMall();
System.out.println("Movie Name: " + screen1.movieName + " Movie Time -> "+ screen1.movieTime + " Hit: -> "+ screen1.movieHit);
System.out.println(screen1.movieName); 
System.out.println(screen2.movieName); 
System.out.println(screen3.movieName); 
System.out.println(screen4.movieName); 
System.out.println(screen1.movieTime); 
System.out.println(screen2.movieTime); 
System.out.println(screen3.movieTime); 
System.out.println(screen4.movieTime); 
System.out.println(screen1.movieHit); 
System.out.println(screen2.movieHit); 
System.out.println(screen3.movieHit); 
System.out.println(screen4.movieHit); 
System.out.println(PhoenixMall.address); 
System.out.println(screen3.address); 
System.out.println(address);
}

}
