class Node{
  int data;
  Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;//单链表的头节点
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head= node;
    }
    //打印单链表
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("");
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }
        else{
            Node cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //中间插入
    public void addIndex(int index , int data){
        Node node = new Node(data);
        if(index < 0 || index > getLength()){
            System.out.println("输入的下标有误");
            return;
        }
        if(index == 0){
            addFirst(data);
        }
        if(index ==getLength()){
            addLast(data);
        }
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;

    }
    //查找index的前一个
    public Node searchPrev(int index){
        Node cur = this.head;
        int count = 0;
        while(count < index - 1){
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //获取链表的长度
    public int getLength(){
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count ++;
            cur = cur.next;
        }
        return count;
    }
    //删除第一次出现的data
    public void deleteData(int data){
        if(this.head ==null){
            return;
        }
        if(this.head.data == data){
            this.head = this.head.next;
            return;
        }
        Node cur= searchPrevNode(data);
        if(cur == null){
            System.out.println("没找到该值");
            return;
        }
        Node del = cur.next;
        cur.next = del.next;
    }
    //寻找data的前驱
    public Node searchPrevNode(int data){
        Node cur = this.head;
        while(cur.next != null){
            if(cur.next.data == data){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
}
