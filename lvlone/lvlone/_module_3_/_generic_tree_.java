package _module_3_;
import java.util.*;
public class _generic_tree_{
    public static void main(String[] args){
        Node root = null;
        int[] arr= new int[]{10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,40,100,-1,-1,-1};
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
        levelOrderTraversalOptimal(root);
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
    public static void display(Node node){
        String str= node.data + "->";
        for(Node child: node.children){
            str += child.data + ",";
        }
        str += ".";
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
}

