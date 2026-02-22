import java.util.Scanner;
import java.util.Stack;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList crud = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of inputs:");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int val = scanner.nextInt();
            crud.insert(val);
        }

        // int[] arr ={1,2,3,4,5};
        // crud.conventor(arr);
        // crud.display();
        // System.out.println("Search");
        // n = scanner.nextInt();
        // crud.search(n);
        // System.out.println("Deletion:");
        // n = scanner.nextInt();
        // crud.deletion(n);
        // System.out.println("Update");
        // n = scanner.nextInt();
        // crud.update(n, 25);
        // System.out.println("Display:");
        // crud.display();
        // crud.insert_k(45, 7);
        // crud.display();
    
        // Stack<Integer> res = crud.reverse_Stack(crud.head);
        // while(!res.isEmpty()){
        //     System.out.println(res.pop());
        // }

        crud.middle();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
class LinkedList{
    Node head;

    //insert at the end
    public void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

       Node temp = head;
       while(temp.next != null){
        temp = temp.next;
       }
       temp.next = newnode;
    }

    //insert in start
    public void insert_start(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    //insert in end 
    public void insert_end(int val){
        if(head == null) head = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
    }

    //insert at K index
    public void insert_k(int data,int k){
        if(k == 1){
            insert_start(data);
        }
        Node temp = head;
        int count = 1;
        while(temp != null && count < k - 1){
            temp = temp.next;
            count++;
        }
        Node mover = temp.next;
        temp.next = new Node(data);
        temp.next.next = mover;
    }
     
    // display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Null");
    }

    //search
    public void search(int data){
        if(head == null){
            System.err.println("List is empty");
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                System.out.println("Element found");
                return;
            }
            temp = temp.next;
        }
    }

    //indexed based searching
    public int k_search(int k){
        if(k == 1){
            return head.data;
        }
        int count = 1;
        Node temp = head;
        while (temp != null) {
            if(k == count){
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }
    // count the elements
    public int counter(){
        if(head == null) return 0;
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //delete
    public void deletion(int data){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Element not found");
            return;
        }
        else{
            temp.next = temp.next.next;
        }
    }
    //deletion at the end
    public void del_last(){
        if(head == null ||head.next == null){
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = temp.next.next; // temp.next = null;
    }
    // Deletion at kth element
    public void del_K(int k){
        int count = 1;
        if(k == 1){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp != null && count < k - 1){
            temp = temp.next;
            count++;
        }
        if(temp == null || temp.next == null) return;
            temp.next = temp.next.next;
    }

    //update
    public void update(int oldval,int newval){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        while(temp != null){
            if(temp.data == oldval){
                temp.data = newval;
                return;
            }
            temp = temp.next;
        }
    }
    //Array to LL
    public void conventor(int[] arr){

        head = new Node(arr[0]);
        Node temp = head;
        for(int i =1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
    }
    public void m2(int[] arr){
        head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
    }
    //Reverse an LL
    public Stack<Integer> reverse_Stack(Node head){
        if(head == null){
            return null;
        }
        Node temp = head;
        Stack<Integer> st  = new Stack<>();
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        return st;
    }

    // 3 poniters approach 
    public void reversal(){
        if(head == null){
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    // Find middle in linked list
    public int middle(){
        if(head == null){
            return 0;
        }
        int k = (counter() / 2) + 1;
        int result = k_search(k) ;
        System.out.println(result);
        return 0;
    }
}

class Listnode{
    Listnode next;
    Listnode prev;
    int data;
    Listnode(int data){
        this.data = data;
    }
    Listnode(int data,Listnode next,Listnode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
}



