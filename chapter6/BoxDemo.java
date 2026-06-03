import java.util.Scanner;
class Box{
    int width;
    int length;
    int depth;
}
class BoxDemo{
   public static void main(String[] args){

        double vol;
        Box mybox=new Box();
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the width = ");
    mybox.width=in.nextInt();
        System.out.println("Enter the length = ");
    mybox.length=in.nextInt();
        System.out.println(" Enter the depth = ");
    mybox.depth=in.nextInt();
     vol=mybox.depth*mybox.length*mybox.width;
        System.out.println("Volume of Box = "+vol);
 }
}