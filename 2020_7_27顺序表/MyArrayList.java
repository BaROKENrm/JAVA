import java.util.Arrays;

public class MyArrayList {
    int[] elem;
    int useSize;

    public MyArrayList() {
        this.elem = new int[5];
        this.useSize = 0;
    }

    //插入数据
    public void add(int pos, int data) {
        if (pos < 0 || pos > this.useSize) {
            System.out.println("输出有误！");
            return;
        }
        if (this.useSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        for (int i = this.useSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.useSize++;
    }

    //打印数据
    public void display() {
        for (int i = 0; i < this.useSize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }

    //寻找数字
    public boolean contains(int toFind) {
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == toFind) {
                System.out.println("有这个数字");
                return true;

            }
        }
        System.out.println("没有这个数字");
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == toFind) {
                System.out.println(i);
                return i;

            }
        }
        System.out.println("没有这个数");
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if (pos < 0 || pos >= this.useSize) {
            System.out.println("查询地址有误！");
            return -1;
        }
        System.out.println(this.elem[pos]);
        return 1;
    }
    //获取顺序表的长度
    public int size(){
        System.out.println(this.useSize);
        return 1;
    }
    //清空顺序表
    public void clear(){
        this.useSize = 0;
    }
    //查找元素输出
    public int contains_1(int pos) {
        if(pos < -1 || pos >= this.useSize){
            System.out.println("输入有误！");
            return -1;
        }
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == this.elem[pos]) {
                return 1;
            }
        }
        return -2;
    }

    //删除元素
    public void delete(int pos) {
        int index = contains_1(pos);
        if (index == -1) {
            return;
        }
        if (index == -2) {
            System.out.println("输入数据有误1");
            return;
        } else if (index == 1) {
            for (int i = pos; i < this.useSize - 1; i++) {
                this.elem[i] = this.elem[i + 1];
            }
            this.useSize--;
        }
    }
}


























