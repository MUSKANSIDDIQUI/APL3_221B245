public class Le_8_221b245{
    public static void main(String args[]){
        Crow crow=new IndianCrow();
CrowAdapter crowadapter=new CrowAdapter(crow);
        client(crowadapter);
    }
    public static void client(Swan swan){
        swan.eat();
        swan.swim();
        swan.sing();
    }
}