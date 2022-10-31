class TamilNadu extends SouthIndia
{
static String capital="Chennai";
void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}
void livingStyle()
{
System.out.println("Above Average development");
}
void speakLanguage(){
    System.out.println("speak");
}
void eat(){
    System.out.println("eat");
}
void dress(){
    System.out.println("dress code");
}
 TamilNadu(String primeMinister){
    super(primeMinister);
    }
 public static void main(String[] args){ 
System.out.println(India.capital);
System.out.println(TamilNadu.capital);
SouthIndia si=new TamilNadu("Modi");   
    si.speakLanguage();
    si.eat();
    si.dress();
    si.cultivate();
    si.livingStyle();

}
}


