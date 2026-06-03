// This class defines an integer can hold 10 values
class Stack{
    int stck[]= new int [10];
    int tos;
    
    //Initalize top of stack
    Stack(){
        tos=-1;
    }
    
    //Push an item onto the stack
    void push(int item){
        if(tos==9){
            System.out.println("Stack is FULL");
        }
        else{
            stck[++tos] = item;
        }
    }

    //Pop an item from the stack
    int pop(){
        if(tos<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}
class TestStack{
    public static void main(String arg[]){
        Stack mystack1=new Stack();
        Stack mystack2=new Stack();
            //Push Some Number on to the stack
        for(int i=0;i<10;i++){
              mystack1.push(i);
        } 
        for(int i=10;i<20;i++){
             mystack2.push(i);
        }
         //POP this number of the Stack  
        System.out.println("Stack in Mystack1 ");
        for(int i=0;i<10;i++){
            System.out.println(mystack1.pop());
        }  
        System.out.println("Stack in Mystack2 ");
        for(int i=0;i<10;i++){
            System.out.println(mystack2.pop());
        }
    }
}