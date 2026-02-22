import java.util.Scanner;

public class Double_LinkedList {

    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sca.nextInt();
        }
        Doublylinkedlist dll = new Doublylinkedlist();  
        dll.conventor(arr);
        dll.del_head();
        dll.display();
        dll.del_tail();
        System.out.println();
        dll.display();

    }
}

class Listnode{
    Listnode next;
    Listnode prev;
    int data;
    Listnode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Listnode(int data,Listnode next,Listnode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class Doublylinkedlist{
    Listnode head;
    // Array to DLL
    public void conventor(int[] arr){
        head = new Listnode(arr[0]);
        Listnode prev = head;
    for(int i = 1;i< arr.length;i++){
        Listnode temp = new Listnode(arr[i],null, prev);
        prev.next = temp;
        prev= temp;
    }
    }

    //display
    public void display(){
        Listnode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    //Delete head
    public void del_head(){
        if(head == null || head.next == null) return;
        Listnode first = head;
        head = head.next;
        head.prev = null;
        first.next = null;
    }
    // Delete tail
    public void del_tail(){
        Listnode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Listnode temp = tail.prev;
        temp.next = null;
        tail.prev = null;
    }
}

