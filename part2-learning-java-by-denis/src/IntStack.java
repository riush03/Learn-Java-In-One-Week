interface IntStack {
    void push(int item);//stores an item
    int pop();//retrieves an item

}

class FixedStack implements  IntStack{
    private int[] stck;
    private  int tos;


    //allocate and intialize stack
    FixedStack(int size)
    {
        stck = new int[size];
        tos = -1;
    }

    //push an item into the stack
    public void push(int item)
    {
        if(tos == stck.length-1)
            System.out.println("The stack is full");
        else
            stck[++tos] = item;
    }

    //pop an item from the stack
    public int pop()
    {
        if(tos<0)
        {
            System.out.println("Stack unnderflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class InterfaceTest{
    public static void main(String[] args)
    {
        FixedStack my_stack = new FixedStack(6);

        //push some numbers into the stack
        for(int i = 0; i<6; i++) my_stack.push(i);
        System.out.println("items in my stack");

        for (int i = 0;i<6; i++)
            System.out.println(my_stack.pop());
    }
}