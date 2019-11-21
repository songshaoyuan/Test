class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;
    public ListNode(int data) {
        this.data = data;
    }
}

public class DoubleList {
    public ListNode head;
    public ListNode last;//尾巴

    //头插法
    public void addFirst(int data){
      ListNode node = new ListNode(data);
      if(this.head == null ){
            this.head = node;
            this.last = node;
      }else{
          node.next = head;
          head.prev = node;
          this.head = node;
      }

    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null ){
            this.head = node;
            this.last = node;
        }else{
            last.next = node;
            node.prev = last;
            this.last = node;
        }
    }
    public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index == 0){
            addFirst(data);
            return true;
        }
        if(index == size()){
            addLast(data);
            return true;
        }
        //中间插入
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (index < 0 || index > size()){
            System.out.println(
                    "不合法"
            );
        }
        while (index > 0){
            cur = cur.next;
            index --;
        }
         /*cur.prev.next = node;
         node.prev = cur.prev;
         node.next = cur;
         cur.prev = node;*/

        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
        return true;
    }

    public int size(){
    ListNode cur = this.head;
    int count = 0;
    while (cur != null){
        cur  = cur.next;
        count++;
    }
    return count;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
     ListNode cur = this.head;
     while (cur != null){
         if (cur.data == key){
             return true;
         }
         cur = cur.next;
     }
     return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        while (cur != null){
            if (cur.data == key){
               //三种情况
                if (cur == this.head){//头
                    this.head = this.head.next;
                    this.head.prev = null;
                    return;
                }
                 else{//中间和尾巴
                   cur.prev.next = cur.next;
                   if (cur.next != null){
                       cur.next.prev = cur.prev;
                       return;
                   }else {
                       this.last = cur.prev;
                       return;
                   }

                }

            }
            cur = cur.next;

        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //清除
    public void clear(){
        while (this.head != null){
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last =null;
    }
/*//尾插法
    public void addpublic void clear();Last(int data);
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data);



    //得到单链表的长度
    public int size();
    public void display();
    */
    }