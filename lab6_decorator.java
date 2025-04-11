abstract class Offering{
abstract int getPrice();
abstract String getName();
}
class Coffee extends Offering{
int getPrice(){
return 30;
}
String getName(){
return "Coffee ";
}
}
class IceCream extends Offering{
int getPrice(){
return 35;
}
String getName(){
return "Ice Cream ";
}
}
class Tea extends Offering{
int getPrice(){
return 25;
}
String getName(){
return "Tea ";
}
}
abstract class Decorator extends Offering{
Offering offering;
}
class Rum extends Decorator{
Rum(Offering offering){
this.offering=offering;
}
String getName(){
return offering.getName()+" with Rum";
}
int getPrice(){
return offering.getPrice()+55;
}
}
class Gin extends Decorator{
Gin(Offering offering){
this.offering=offering;
}
String getName(){
return offering.getName()+" with Gin";
}
int getPrice(){
return offering.getPrice()+45;
}
}
class Soda extends Decorator{
Soda(Offering offering){
this.offering=offering;
}
String getName(){
return offering.getName()+" with Soda";
}
int getPrice(){
return offering.getPrice()+15;
}
}
class lab6_decorator{
public static void main(String[] args)
{
Offering offering = new Coffee();
offering=new Rum(offering);
offering=new Rum(offering);
System.out.println(offering.getName() + "  " + offering.getPrice());
}
}