class Car{
    
   int speed;
   String engine;
   @Override
   public String toString() {
       // TO DO Auto-generated method stub
       return "Speed"+ speed +" Engine: "+engine;
   }
}
class Practice{
    public static void main(String[] args){
        Car c1 =new Car(),c2=new Car();
        c1.engine="XE";
        c1.speed=200;
        
        System.out.println(c1.toString());
        System.err.println(c2.toString());
        c2=c1;

        System.out.println(c1.toString());
        System.err.println(c2.toString());
        
    }
}