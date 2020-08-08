//class Node{
//    public int data;
//    public Node next;
//    public Node prev;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}
//public class RealLinkedList {
//    Node head;
//    Node tail;
//
//    //头插法
//    public void addFirst(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {//第一次插入
//            this.head = node;
//        } else {
//            node.next = this.head;
//            head.prev = node;
//            head = node;
//        }
//    }
//
//    //尾插法
//    public void addLast(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {
//            this.head = node;
//            this.tail = node;
//        } else {
//            this.tail.next = node;
//            node.prev = this.tail;
//            this.tail = node;
//        }
//    }
//
//    //打印链表
//    public void display() {
//        Node cur = this.head;
//        while (cur != null) {
//            System.out.print(cur.data + " ");
//            cur = cur.next;
//        }
//        System.out.println(" ");
//    }
//
//    //获取链表的长度
//    public int getLength() {
//        Node cur = this.head;
//        int count = 0;
//        while (cur != null) {
//            cur = cur.next;
//            count++;
//        }
//        return count;
//    }
//
//    //寻找index位置
//    public Node searchIndex(int index) {
//        Node cur = this.head;
//        while (index != 0) {
//            cur = cur.next;
//            index--;
//        }
//        return cur;
//    }
//
//    //任意位置插入元素 第一个元素的位置是0号
//    public void inputIndex(int index, int data) {
//        Node node = new Node(data);
//        Node cur = searchIndex(index);
//        if (index > getLength() || index < 0) {//判断位置是否正确
//            System.out.println("你的输入有误！");
//            return;
//        }
//        if (index == getLength() - 1) {//在最后一个位置插入元素
//            addLast(data);
//        }
//        if (index == 0) {
//            addFirst(data);
//        } else {
//            node.next = cur;
//            node.prev = cur.prev;
//            cur.prev.next = node;
//            cur.prev = node;
//        }
//    }
//
//    //删除key值的节点
//    public void delKey(int key) {
//        Node cur = this.head;
//        while (cur != null) {
//            if (cur.data == key) {
//                if(cur == this.head){//删除的值刚好是头结点
//                    this.head = this.head.next;
//                    this.head.prev = null;
//                }
//                else{
//                    cur.prev.next = cur.next;
//                    if(cur.next != null){//判断删除的值刚好是尾结点
//                        cur.next.prev = cur.prev;
//                    }
//                    else{
//                        this.tail = cur.prev;
//                    }
//                }
//                return;
//            }
//            else{
//                cur = cur.next;
//            }
//        }
//    }
//    //清除单链表
//    public void clear(){
//        Node cur = this.head;
//        while(cur != null){
//            Node nodeNext = cur.next;
//            cur.next = null;
//            cur.prev = null;
//            cur = nodeNext;
//        }
//        this.head = null;
//        this.tail = null;
//    }
//}