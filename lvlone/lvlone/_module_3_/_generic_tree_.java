package _module_3_;
import java.util.*;
public class _generic_tree_{
    public static void main(String[] args){
        int[] arr= new int[]{10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = construct(arr);
    }
    public static class Node{
        int data;
        ArrayList<Node> children= new ArrayList<>();
        Node(){
        }
        Node(int data){
            this.data = data;
        }
    }
    public static Node construct(int[] arr){
        Node root = null;
        Stack<Node> st= new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }
            else{
                Node t= new Node();
                t.data= arr[i];
                if(st.size()>0){
                    st.peek().children.add(t);
                }
                else{
                    root= t;
                }
                st.push(t);
            }
        }
        return root;
    }
    public static void display(Node node){
        String str= node.data + "->";
        for(Node child: node.children){
            str += child.data + ",";
        }
        str += "_";
        System.out.println(str);
        for(Node child: node.children){
            display(child);
        }
    }
    public static int size(Node node){
        int s = 0;
        for(Node child: node.children){
            int cs = size(child);
            s += cs;
        }
        s++;
        return s;
    }
    public static int max(Node node){
        int max = node.data;
        for(Node child: node.children){
            int m= max(child);
            if(m > max){
                max = m;
            }
        }
        return max;
    }
    public static int height(Node node){
         int ht = -1;
         for(Node child: node.children){
             int ch = height(child);
             if(ch > ht){
                 ht = ch;
             }
         }
         ht += 1;
         return ht;
    }
    public static void eulerTraversal(Node node){
        System.out.println("Node Pre " + node.data);
        for(Node child: node.children){
            System.out.println("Edge Pre " + node.data + "-" + child.data);
            eulerTraversal(child);
            System.out.println("Edge Post " + node.data + "-" + child.data);
        }
        System.out.println("Node Post " + node.data);
    }
    public static void levelOrderTraversal(Node node){
        Queue<Node> q = new ArrayDeque<>();
        Queue<Node> cq = new ArrayDeque<>();
        q.add(node);
        while(q.size()>0){
            Node p = q.remove();
            System.out.print(p.data + " ");
            for(Node child: p.children){
                cq.add(child);
            }
            if(q.size() == 0){
                q = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }
    public static void levelOrderZigZagTraversal(Node node){
        Queue<Node> q = new ArrayDeque<>();
        Stack<Node> cs = new Stack<>();
        q.add(node);
        int level = 1;
        while(q.size() > 0){
            Node p = q.remove();
            System.out.print(p.data + " ");
            if(level % 2 == 1){
                for(int i = 0;i < p.children.size();i++){
                    cs.push(p.children.get(i));
                }
            }
            else{
                for(int i = p.children.size()-1;i >= 0;i--){
                    cs.push(p.children.get(i));
                }
            }
            if(q.size() == 0){
                while(cs.size() != 0){
                    q.add(cs.pop());
                }
                level++;
                System.out.println();
            }
        }
    }
    public static void levelOrderTraversalOptimal(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        q.add(new Node(-1));
        while(q.size() > 0){
            Node p = q.remove();
            if(p.data != -1){
                System.out.print(p.data + " ");
                for(Node child: p.children){
                    q.add(child);
                }
            }else{
                if(q.size() > 0){
                    q.add(new Node(-1));
                    System.out.println();
                }
            }
        }
    }
    public static void levelOrderTraversalOptimal2(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(q.size() != 0){
            int qsize = q.size();
            for(int i = 0;i < qsize;i++){
                Node p = q.remove();
                System.out.print(p.data + " ");
                for(Node child: p.children){
                    q.add(child);
                }
            }
            System.out.println();
        }
    }
    public static void mirrorTree(Node node){
        Collections.reverse(node.children);
        for(Node child: node.children){
            mirrorTree(child);
        }
    }
    public static void removeLeaves(Node node){
       for(int i = node.children.size()-1;i >= 0;i--){
           Node child = node.children.get(i);
           if(child.children.size() == 0){
               node.children.remove(child);
           }
       }
       for(Node child: node.children){
           removeLeaves(child);
       }
    }
    public static void linearizeTree(Node node){
         for(Node child: node.children){
             linearizeTree(child);
         }
         while(node.children.size() > 1){
             Node last = node.children.remove(node.children.size()-1);
             Node secLast = node.children.get(node.children.size()-1);
             Node secLastTail = getTail(secLast);
             secLastTail.children.add(last);
         }
    }
    private static Node getTail(Node node){
        if(node.children.size() == 0){
            return node;
        }
        return getTail(node.children.get(0));
    }
    public static Node linearizeTreeOptimal(Node node){
        if(node.children.size() == 0){
            return node;
        }
        Node lastTail = linearizeTreeOptimal(node.children.get(node.children.size()-1));
        while(node.children.size() > 1){
            Node last = node.children.remove(node.children.size()-1);
            Node secLastTail = linearizeTreeOptimal(node.children.get(node.children.size()-1));
            secLastTail.children.add(last);
        }
        return lastTail;
    }
    public static boolean isPresent(Node node,int data){
        if(node.data==data){
            return true;
        }
        for(Node child: node.children){
            boolean ans = isPresent(child,data);
            if(ans){
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Integer> nodeToRootPath(Node node,int data){
        if(node.data == data){
            ArrayList<Integer> base = new ArrayList<>();
            base.add(node.data);
            return base;
        }
        for(Node child: node.children){
            ArrayList<Integer> ans = nodeToRootPath(child,data);
            if(ans.size() > 0){
                ans.add(node.data);
                return ans;
            }
        }
        return new ArrayList<>();
    }
    public static int loCmnAncestor(Node node,int data1,int data2){
        ArrayList<Integer> ans1 = nodeToRootPath(node,data1);
        ArrayList<Integer> ans2 = nodeToRootPath(node,data2);
        int ans = 0;
        int i = ans1.size()-1;
        int j = ans2.size()-1;
        while(i >= 0 && j >= 0 && ans1.get(i) == ans2.get(j) ){
            i--;
            j--;
        }
        i++;
        j++;
        return ans2.get(j);
    }
    public static boolean areSimilar(Node node1,Node node2){
        if(node1.children.size() != node2.children.size()){
            return false;
        }
        for(int i = 0;i < node1.children.size();i++){
            boolean ans = areSimilar(node1.children.get(i),node2.children.get(i));
            if(!ans){
                return false;
            }
        }
        return true;
    }
    public static boolean areMirror(Node node1,Node node2){
        if(node1.children.size() != node2.children.size()){
            return false;
        }
        for(int i = 0;i < node1.children.size();i++){
            int j = node2.children.size()-i-1;
            boolean ans = areMirror(node1.children.get(i),node2.children.get(j));
            if(!ans){
                return false;
            }
        }
        return true;
    }
    public static boolean isSymmetric(Node node){
        return areMirror(node,node);
    }
    static Node predecessor;
    static Node successor;
    static int state = 0;
    public static void getPreSuc(Node node,int data){
        if(state == 0){
            if(node.data == data){
                state = 1;
            }else{
                predecessor = node;
            }
        }else if(state == 1){
            successor = node;
            state = 2;
        }
        for(Node child: node.children){
            getPreSuc(child,data);
        }
    }
    static int ceil = Integer.MAX_VALUE;
    static int floor = Integer.MIN_VALUE;
    public static void getCeilFloor(Node node,int data){
        if(node.data < data){
            floor = Math.max(floor,node.data);
        }
        if(node.data > data){
            ceil = Math.min(ceil,node.data);
        }
        for(Node child: node.children){
            getCeilFloor(child,data);
        }
    }
    public static int kthLargest(Node node,int k){
        int lceil = Integer.MAX_VALUE;
        while(k > 0){
            getCeilFloor(node,lceil);
            lceil = floor;
            floor = Integer.MIN_VALUE;
            k--;
        }
        return lceil;
    }
    static int maxSum = Integer.MIN_VALUE;
    static int maxSumSubTree = 0;
    public static int getMaxSumSubTree(Node node){
        int sum = 0;
        for(Node child: node.children){
           int csum = getMaxSumSubTree(child);
           sum += csum;
        }
        sum += node.data;
        if(sum > maxSum){
            maxSum = sum;
            maxSumSubTree = node.data;
        }
        return sum;
    }
    static int diameter = 0;
    public static int getDiameter(Node node){
        int deepestChildHeight = -1;
        int secondDeepestChildHeight = -1;
        for(Node child: node.children){
            int ch = getDiameter(child);
            if(ch > deepestChildHeight){

            }else if(ch > secondDeepestChildHeight){


            }
        }
        return 4;
    }
    static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
    public static void printItr(Node node){
      Stack<Pair> st = new Stack<>();
      st.push(new Pair(node,-1));
      String pre = "";
      String post = "";
      while(st.size() != 0){
          Pair temp = st.peek();
          if(temp.state == -1){
              pre += temp.node.data + ",";
              temp.state++;
          }
          else if(temp.state == temp.node.children.size()){
              post += temp.node.data + ",";
              st.pop();
          }
          else{
              st.push(new Pair(temp.node.children.get(temp.state),-1));
              temp.state++;
          }
      }
      pre += "_";
      post += "_";
      System.out.println("PreOrder - " + pre);
      System.out.println("PostOrder - " + post);

    }

}

