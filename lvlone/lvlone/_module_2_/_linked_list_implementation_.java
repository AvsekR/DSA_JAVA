package _module_2_;
public class _linked_list_implementation_{
    public static void main(String[] args){
        linkedList l1= new linkedList();
        l1.addFirst(9);
        l1.addFirst(8);
        l1.addFirst(7);
        linkedList l2= new linkedList();
        l2.addFirst(8);
        l2.addFirst(8);
        linkedList l3= l1.addLL(l1,l2);
        l3.addLL(l1,l2);
        l3.display();
    }
}
class Node{
    int data;
    Node next;
}
class linkedList{
    Node head;
    Node tail;
    int size;
    void addLast(int val){
        Node temp= new Node();
        temp.data= val;
        temp.next= null;
        if(size==0) {
            head= tail= temp;
        }
        else{
            tail.next= temp;
            tail= temp;
        }
        size++;
    }
    void display(){
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public int size(){
        return size;
    }
    public void removeFirst(){
        if(size==0) {
            System.out.println("No node present in LL");
        }
        else if(size==1){
            head= tail= null;
            size--;
        }
        else{
            head= head.next;
            size--;
        }
    }
    public int getLast(){
        if(size==0) {
            System.out.println("No node present in LL");
            return -1;
        }
        else{
            return tail.data;
        }
    }
    public int getFirst(){
        if(size==0){
            System.out.println("No node present in LL");
            return -1;
        }
        else{
            return head.data;
        }
    }
    public int getAt(int idx){
        if(size==0){
            System.out.println("No node present in LL");
            return -1;
        }
        else if(idx<0 || idx>=size){
            System.out.println("Wrong index");
            return -1;
        }
        else{
            Node temp= head;
            for(int i= 0;i<idx;i++){
                temp= temp.next;
            }
            return temp.data;
        }
    }
    public void addFirst(int val){
        Node temp= new Node();
        temp.next= head;
        temp.data= val;
        head= temp;
        if(size==0){
            tail= temp;
        }
        size++;
    }
    public void addAt(int idx,int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid index");
        }
        else if(idx==0){
            addFirst(val);
        }
        else if(idx==size){
            addLast(val);
        }
        else{
            Node temp= new Node();
            temp.data= val;
            Node temp1= head;
            for(int i= 0;i<idx-1;i++){
                temp1= temp1.next;
            }
            temp.next= temp1.next;
            temp1.next= temp;
            size++;
        }
    }
    public void removeLast(){
        if(size==0){
            System.out.println("No node present in LL");
        }
        else if(size==1){
            head= tail= null;
            size--;
        }
        else{
            Node temp= head;
            for(int i= 0;i<size-2;i++){
                temp= temp.next;
            }
            temp.next= null;
            tail= temp;
            size--;
        }
    }
    public void removeAt(int idx){
        if(idx==0){
            removeFirst();
        }
        else if(idx==size-1){
            removeLast();
        }
        else if(idx<0 || idx>=size){
            System.out.println("Invalid Argument");
        }
        else{
            Node temp= head;
            for(int i= 0;i<idx-1;i++){
                temp= temp.next;
            }
            temp.next= temp.next.next;
            size--;
        }
    }
    private Node getNodeAt(int idx){
        Node temp= head;
        for(int i= 0;i<idx;i++){
            temp= temp.next;
        }
        return temp;
    }
    public void reverseDI(){
       int li= 0;
       int ri= size-1;
       while(li<ri){
           Node left= getNodeAt(li);
           Node right= getNodeAt(ri);
           int temp= left.data;
           left.data= right.data;
           right.data= temp;
           li++;
           ri--;
       }
    }
    public void reversePI(){
       Node prev= null;
       Node curr= head;
       while(curr!=null){
           Node ocn= curr.next;
           curr.next= prev;
           prev= curr;
           curr= ocn;
       }
       Node temp= head;
       head= tail;
       tail= temp;
    }
    public int kthElementFromLast(int k){
        Node slo= head;
        Node fast= head;
        for(int i=0;i<k;i++){
            fast= fast.next;
        }
        while(fast!=tail){
            fast= fast.next;
            slo= slo.next;
        }
        return slo.data;
    }
    public int middleElement(){
        Node slo= head;
        Node fast= head;
        while(fast!=tail && fast.next!=tail){
            slo= slo.next;
            fast= fast.next.next;
        }
        return slo.data;
    }
    public linkedList mergeTwoSortedLists(linkedList list1,linkedList list2){
        linkedList list= new linkedList();
        Node a= list1.head;
        Node b= list2.head;
        while(a!=null && b!=null){
            if(a.data>b.data){
                list.addLast(b.data);
                b= b.next;
            }
            else{
                list.addLast(a.data);
                a= a.next;
            }
        }
        if(a!=null){
            while(a!=null){
                list.addLast(a.data);
                a= a.next;
            }
        }
        else{
            while(b!=null){
                list.addLast(b.data);
                b= b.next;
            }
        }
        return list;
    }
    public linkedList mergeSortList(Node head,Node tail){
        if(head==tail){
            linkedList base= new linkedList();
            base.addLast(head.data);
            return base;
        }
        Node mid= new Node();
        Node slo= head;
        Node fast= head;
        while(fast!=tail && fast!=null){
            slo= slo.next;
            fast= fast.next.next;
        }
        mid= slo;
        linkedList first= mergeSortList(head,mid);
        linkedList second= mergeSortList(mid.next,tail);
        linkedList res= mergeTwoSortedLists(first,second);
        return res;
    }
    public linkedList rmDuplicates(linkedList list){
        Node a= head;
        Node b= head.next;
        while(b!=null){
            if(b.data==a.data){
                a.next= b.next;
                b= b.next;
            }
            else{
                a= a.next;
                b= b.next;
            }
        }
        return list;
    }
    public void oddEvenList(){
        linkedList odd= new linkedList();
        linkedList even= new linkedList();
        while(this.size()>0){
            int val= this.getFirst();
            this.removeFirst();
            if(val%2==0){
                even.addLast(val);
            }
            else{
                odd.addLast(val);
            }
        }
        if(odd.size>0 && even.size>0){
            odd.tail.next= even.head;
            this.head= odd.head;
            this.tail= even.tail;
            this.size= odd.size + even.size;
        }
        else if(odd.size==0){
            this.head= even.head;
            this.tail= even.tail;
            this.size= even.size;
        }
        else{
            this.head= odd.head;
            this.tail= odd.tail;
            this.size= odd.size;
        }
    }
    public void kElementsReverse(int k){
        linkedList prev= null;
        while(this.size>0){
            linkedList curr= new linkedList();
            if(this.size>=k){
                for(int i=0;i<k;i++){
                    int val= this.getFirst();
                    this.removeFirst();
                    curr.addFirst(val);
                }
            }
            else{
                int os= this.size;
                for(int i=0;i<os;i++){
                    int val= this.getFirst();
                    this.removeFirst();
                    curr.addLast(val);
                }
            }
            if(prev==null){
                prev= curr;
            }
            else{
                prev.tail.next= curr.head;
                prev.tail= curr.tail;
                prev.size= prev.size + curr.size;
            }
        }
        if(prev==null){
            return;
        }
        this.head= prev.head;
        this.tail= prev.tail;
        this.size= prev.size;
    }
    public void displayReverseRecursive(Node head){
        if(head==null){
            return;
        }
        displayReverseRecursive(head.next);
        System.out.println(head.data);
    }
    private void reversePRmain(Node head){
        if(head.next==null){
            return;
        }
        reversePRmain(head.next);
        head.next.next= head;
    }
    public void reversePR(){
        reversePRmain(head);
        head.next= null;
        Node temp= head;
        head= tail;
        tail= temp;
    }
    private void reverseDRmain(Node right,int floor){
        if(right==null){
            return;
        }
        reverseDRmain(right.next,floor+1);
        if(floor>= size/2){
            int temp= right.data;
            right.data= rLeft.data;
            rLeft.data= temp;
            rLeft= rLeft.next;
        }
    }
    Node rLeft;
    public void reverseDR(){
        rLeft= head;
        reverseDRmain(head,0);
    }
    private boolean isPalindromeMain(Node right,int floor){
        if(right==null){
            return true;
        }
        boolean rres= isPalindromeMain(right.next,floor+1);
        if(floor>=size/2){
            if(right.data!=rLeft.data){
                return false;
            }
            else if(rres==false){
                return false;
            }
            else{
                rLeft= rLeft.next;
                return true;
            }
        }
        return rres;
    }
    public boolean isPalindrome(){
        rLeft= head;
        return isPalindromeMain(head,0);
    }
    private void foldMain(Node right,int floor){
        if(right==null){
            return;
        }
        foldMain(right.next,floor+1);
        if(floor>size/2){
            Node temp= rLeft.next;
            rLeft.next= right;
            right.next= temp;
            rLeft= temp;
        }
        else if(floor==size/2){
            tail= right;
            tail.next= null;
        }
    }
    public void fold(){
        rLeft= head;
        foldMain(head,0);
    }
    private int addLLmain(Node one,int pv1,Node two,int pv2,linkedList res){
        if(one==null && two==null){
            return 0;
        }
        int data= 0;
        if(pv1>pv2){
            int oc= addLLmain(one.next,pv1-1,two,pv2,res);
            data= one.data+oc;
        }
        else if(pv1<pv2){
            int oc= addLLmain(one,pv1,two.next,pv2-1,res);
            data= two.data+oc;
        }
        else{
            int oc= addLLmain(one.next,pv1-1,two.next,pv2-1,res);
            data= one.data+two.data+oc;
        }
        int nd= data%10;
        int nc= data/10;
        res.addFirst(nd);
        return nc;
    }
    public linkedList addLL(linkedList one,linkedList two){
        linkedList res= new linkedList();
        int oc= addLLmain(one.head,one.size,two.head,two.size,res);
        if(oc>0){
            res.addFirst(oc);
        }
        return res;
    }
}
