public class main {
    public static void main(String[] args) {
//        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
//        circleSingleLinkedList.addNode(9);
//        circleSingleLinkedList.Display();
        Josephus(9,2,3);
    }


        /**
         *
         * @param num 共有多少个人
         * @param start 从第几个人开始
         * @param count 数多少次
         */
        public static void Josephus ( int num, int start, int count){
            CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
            circleSingleLinkedList.addNode(num);
            if (num < 1 || start > num || count < 0) {
                System.out.println("输入参数有误");
                return;
            }
            Node cur = circleSingleLinkedList.findIndex(start);
            Node helper = start == 1 ? circleSingleLinkedList.findLastNode():circleSingleLinkedList.findIndex(start - 1);
            while(true){
                if(cur == helper){  //当前链表只有一个结点
                    System.out.println(cur.no);
                    break;
                }
                while(count - 1 != 0){
                    cur = cur.next;
                    helper.next = cur;
                }
                System.out.printf("%d ",cur.no);
                cur = cur.next;
                helper.next = cur;
            }
    }
}
