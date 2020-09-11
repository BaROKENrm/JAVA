class ArrayStack {
    private int maxSize;
    private int[] arrayStack;
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.arrayStack = new int[maxSize];
    }
    public boolean isFull(){ //判断栈满 如果满  返回false
        if(top == maxSize - 1){
            return false;
        }
        return true;
    }
    public boolean isEmpty(){ //判断栈空 如果空 返回true
        if(top == -1){
            return true;
        }
        return false;
    }
    //进栈
    public void push(int data){
        if(isFull() == false){
            System.out.println("栈已满，无法插入");
        }
        top++;

        arrayStack[top] = data;

    }
    //出栈
    public void pop(){
        if(isEmpty() == true){
            System.out.println("栈空，无法出栈");
        }
        top--;
    }
    //遍历栈
    public void displayStack(){
        if(isEmpty() == true){
            System.out.println("栈中没有数据");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("%d\t",arrayStack[i]);
        }
    }
}


