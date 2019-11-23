/*
import java.util.List;

class Listnode{
    public int data;
    public Listnode next;
    public Listnode(int data){
        this.data = data;
        this.next = null;
    }
}
class MyList{
    public Listnode head;
    public MyList() {
        this.head = null;
    }


    //头插法
    public void addFirst(int data){
        Listnode node = new Listnode(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        Listnode node = new Listnode(data);
        Listnode prev = this.head;
        if(this.head == null) {//判断是否是第一次插入
            this.head = node;
        }while (prev.next != null){//找尾巴
            prev = prev.next;
        }
        prev.next = node;//进行插入
    }
    //任意位置插入,第一个数据节点为0号下标
    public Listnode Serchindex(int index){
        Listnode prev = this.head;
        for (int i = 0; i < index -1 ; i++) {
            prev = prev.next;
        }return prev;
    }
    public boolean addIndex(int index,int data){
        Listnode node = new Listnode(data);
        if (index < 0 || index > size()){
            System.out.println("超范围插入");
            return false;
        }
        if (index == 0){
            addFirst(data);
            return true;
        }
        Listnode prev = Serchindex(index);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    public void display(){
        Listnode cur = this.head;
         if (this.head == null){
             return;
         }
         while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(" ");
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Listnode prev = this.head;
        while(prev != null){
            if(prev.data == key){
                return true;
            }
            prev = prev.next;
        }
        return false;
    }
    public Listnode contains2(int key){
        Listnode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //得到单链表的长度
    public int size(){
        Listnode prev = this.head;
        int count = 0;
        while(prev != null){
            count++;
            prev = prev.next;
        }
        return count;
    }
    //删除第一次出现关键字为key的节点
    public Listnode Serchprev(int key){
        Listnode prev = this.head;
        while(prev.next != null){
            if (prev.next.data == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int key){
        //Listnode prev = this.head;
        if(this.head.data == key){//1.判断是否是头结点
            this.head = this.head.next;
            return;
        }
        Listnode prev = Serchprev(key);//2.找到删除的节点的前驱  如果找不到  返回null
        if (prev == null){
            System.out.println("没有你要找的节点");
            return;
        }
        Listnode node = prev.next;
        prev.next = node.next;//进行删除
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Listnode prev = this.head;
        Listnode cur = this.head.next;
        while(cur != null){
            if (cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //最后处理
        if(this.head.data == key){
            this.head = this.head.next;
        }

    }
    public void clear(){
        this.head = null;
    }
    //反转
    public  Listnode reverList(){
        Listnode prev = null;
        Listnode cur  = this.head;
        Listnode newHead = null;
        while (cur != null){
            Listnode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
            }
        return newHead;
    }
    //打印反转单链表
    public void display2(Listnode newHead){
        Listnode cur = newHead;
        if (newHead == null){
            return;
        }
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(" ");
    }
    //找单链表中间节点
    public Listnode  middleNode(){
        Listnode fast = this.head;
        Listnode slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //链表中倒数第k个节点
    public Listnode findKthTOTail(int k) {
        Listnode fast = this.head;
        Listnode slow = this.head;
        if(k < 0 || head ==null){
            return null;
        }
        for (int i = 0; i < k - 1; i++) {
            if (fast.next != null){
                fast = fast.next;
            }else {
                System.out.println("没有这个节点");
                return null;
            }

        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}*/

class Listnode {
    public int data;
    public Listnode next;

    public Listnode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyList {
    public Listnode head;

    public MyList() {
        this.head = null;
    }

    //头插
    public void addFirst(int data) {
        Listnode node = new Listnode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void display() {
        Listnode prev = this.head;
        if (this.head == null){
            return;
        }
        while (prev != null) {
            System.out.print(prev.data + " ");
            prev = prev.next;
        }
        System.out.println(" ");
    }

    //尾插法
    public void addLast(int data) {
        Listnode node = new Listnode(data);
        Listnode prev = this.head;
        if (this.head == null) {
            this.head = node;
        }
        while (prev.next != null) {
            prev = prev.next;
        }
        prev.next = node;
    }


    //任意位置插入,第一个数据节点为0号下标
    public Listnode Serchindex(int Index) {
        Listnode prev = this.head;
        for (int i = 0; i < Index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }

    public boolean addIndex(int index, int data) {
        Listnode node = new Listnode(data);
        Listnode prev = Serchindex(index);
        if (index < 0 || index > size()) {
            System.out.println("不合法位置");
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        node.next = prev.next;
        prev.next = node;
        return true;
    }

    public int size() {
        int count = 0;
        Listnode prev = this.head;
        while (prev != null) {
            count++;
            prev = prev.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Listnode prev = this.head;
        while (prev != null) {
            if (prev.data == key) {
                return true;
            }
            prev = prev.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public Listnode Serchprev(int key) {
        Listnode prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
        public void remove ( int key){
          if (this.head.data == key){
              this.head = this.head.next;
              return;
          }
          Listnode prev = Serchprev(key);
          if (prev == null){
              System.out.println("没有你要找的节点");
              return;
          }
          //Listnode node = prev.next;
          prev.next = prev.next.next;
        }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Listnode prev = this.head;
        Listnode cur = this.head.next;
        while (cur != null){
            if (cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                cur = cur.next;
                prev = prev.next;
            }

        }
        if (this.head.data == key){
            this.head = this.head.next;
        }
    }
    public void clear(){

    }
    //反转
    public Listnode rivelist(){
        Listnode prev = null;
        Listnode cur = this.head;
        Listnode newhead = null;
        while(cur != null){
            Listnode curNext = cur.next;
            if (curNext == null){
                newhead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newhead;
    }
    //打印反转单链表
    public void display2(Listnode newHead){
        Listnode cur = newHead;
        if (newHead == null){
            return;
        }
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(" ");
    }

    //寻找中间数
    public Listnode middleNode(){
        Listnode slow = this.head;
        Listnode fast = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //寻找倒数第k个节点
    public Listnode findKthToTail(int k){
       Listnode fast = this.head;
       Listnode slow = this.head;
       if (k < 0 || head == null){
           System.out.println("违法k值");
           return null;
       }
       while(k-1>0){
           if (fast.next != null){
               fast = fast.next;
               k--;
           }else{  System.out.println("未找到");
           return null;
           }
       }
       while (fast.next != null){
           fast = fast.next;
           slow = slow.next;
       }
       return slow;
    }


    //以x为基准分割链表
     public Listnode partition(int x) {
         Listnode bs = null;
         Listnode be = null;
         Listnode as = null;
         Listnode ae = null;
         Listnode cur = this.head;
         while (cur != null) {
             if (cur.data < x) {
                 //是不是第一次插入
                 if (bs == null) {
                   bs = cur;
                   be = cur;
                 } else {
                     be.next = cur;
                     be = be.next;
                 }
             } else {
                 //是不是第一次插入
                 if (as == null) {
                     as = cur;
                     ae = cur;
                 } else {
                     ae.next = cur;
                     ae = ae.next;
                 }
             }
             cur = cur.next;
         }
         //第一个区间没有数据
         if(bs == null) {
             return as;
         }
         be.next = as;
         if(as != null) {
             ae.next = null;
         }
         return bs;
     } 

     //删除相同连续节点
    public Listnode deleteDuplication(){
        Listnode cur = this.head;
        Listnode newHead = new Listnode(-1);
        Listnode tmp = newHead;
        while (cur != null) {
            //重复的节点
            if(cur.next != null
                    && cur.data == cur.next.data) {
                //每一次都要判断cur.next
                 while (cur.next != null && cur.data == cur.next.data){

                     cur = cur.next;
                 }
                 cur = cur.next;
            }else {
             tmp.next = cur;
             tmp = tmp.next;
             cur = cur.next  ;
            }
        }
        tmp.next = null;//最后一个节点也是重复的，将tmp置为空
        return newHead.next;
    }
    //判断回文
    public boolean chkPalindrome() {
        //1、找到单链表的中间节点
        Listnode fast = this.head;
        Listnode slow = this.head;
        if(head == null){
            return true;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、反转后半部分单链表
        Listnode cur = slow.next;
        while (cur != null) {
            Listnode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、fast/slow往前    head往后走
        while(slow != this.head){
            if (slow.data != this.head.data){
                return false;
            }
            //偶数情况
            if (this.head.next == slow){
                return  true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
    //给定一个链表，判断是否有环
    public boolean haveCycle(){
        Listnode slow = this.head;
        Listnode fast = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
    // 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Listnode detectctCycle(){
        Listnode fast = this.head;
        Listnode slow = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        //如果有环，slow指向链表头，此时fast指向相遇点，同时开始
        slow = this.head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}