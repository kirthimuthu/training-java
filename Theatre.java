class Theatre
{
public static void main(String[] args)
{
Theatre raja = new Theatre();
int balance = raja.bookTicket(200);
}
int bookTicket(int amount)
{
int ticket_price=120;
int balance = (int)amount-ticket_price;
System.out.println("After booking ticket" + balance);
return balance;
}
}
