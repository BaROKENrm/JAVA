class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    Node head;
    Node tail;
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }
        else{
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            this.tail.next = node;
            this.tail = node;
        }
    }
    //打印
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(" ");
    }
    //找环
//    public Node isCycle(){
//        Node fast = this.head;
//        Node slow = this.head;
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(slow == fast){
//                break;
//            }
//        }
//        if(fast == null || fast.next ==null){
//            return null;
//        }
//        slow = this.head;
//        while(slow != fast){
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
    //判断环
    public boolean isCycle(){
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null & fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public Node del(){
        Node newHead = new Node(0);
        Node temp = newHead;
        Node cur = this.head;
        while(cur != null){
            if(cur.next != null && cur.data == cur.next.data){
                while(cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }
            else{
                temp.next = cur;
                temp = cur;
                cur = cur.next;
            }
        }
        temp.next = null;
        return newHead.next;
    }
    //回文
    public boolean checkPalindrome(){
        if(this.head == null){
            return false;
        }
        if(this.head.next == null){
            return true;
        }
        //找到中间结点
        Node fast = this.head;
        Node slow = this.head;
        Node cur = this.head;
        Node curNext = this.head;
        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //翻转
        cur = slow.next;
        curNext = cur.next;
        while(cur != null) {
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(this.head != slow){
            if(this.head.data != slow.data){
                return false;
            }
            if(this.head.next == slow){//实现偶数结点
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }
    public Node getIntersectionNode(Node A,Node B){
        if(A == null || B == null){
            return null;
        }
    }
}
