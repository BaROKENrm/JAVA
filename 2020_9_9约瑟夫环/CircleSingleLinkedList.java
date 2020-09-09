class Node {
    int no;
    Node next;
    public Node (int no){
        this.no = no;
    }
}
class CircleSingleLinkedList {
    Node first = new Node(0);
    Node curFirst;
    //创建循环单链表
    public void addNode(int num){
        if(num < 1){
            System.out.println("输入有误");
            return;
        }
        else{
            for (int i = 1; i <= num; i++) {
                Node newHead = new Node(i);
                if(i == 1){
                    this.first = newHead;
                    this.first.next = first;
                    curFirst = first;//保存头节点
                }
                else{
                    this.first.next = newHead;
                    this.first = newHead;
                    this.first.next = curFirst;
                }
            }
        }
    }
    //打印循环单链表
    public void Display(){
        Node curNode = this.curFirst;
        while(curNode.next != curFirst){
            System.out.println(curNode.no);
            curNode = curNode.next;
        }
        System.out.println(curNode.no);
    }
    //寻找第index个结点
    public Node findIndex(int index){
        Node cur = this.curFirst;
        while(cur.no != index){
            cur = cur.next;
        }
        return cur;
    }
    //寻找最后一个结点
    public Node findLastNode(){
        Node cur = this.curFirst;
        while(cur.next != curFirst){
            cur = cur.next;
        }
        return cur;
    }
}
