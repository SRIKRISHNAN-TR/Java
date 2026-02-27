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
        // dll.rev();
        // dll.display();
        // Doublylinkedlist dll1 = new Doublylinkedlist();
        // for(int i=0;i<n;i++){
        //     arr[i] = sca.nextInt();
        // }
        // dll1.conventor(arr);
        dll.sorting();
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
    //Delete kth
    public void del_k(int k)
    {
        // int count = 1;
        // if(k == 1){
        //     Listnode temp = head;
        //     head = head.next;
        //     temp.next = null;
        //     head.prev = null;
        // }
        // if(k == 5){
        //     del_tail();
        // }
        // Listnode temp = head;
        // while(temp.next!=null){
        //     if(count == k - 1){
        //         Listnode nod = temp;
        //         temp.next = temp.next.next;
        //         temp.next.next.prev =nod;
        //     }
        //     count++;
        //     temp = temp.next;
        // }

        // Option 2 

        int count =0;
        Listnode temp = head;
        while(temp != null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Listnode back = temp.prev;
        Listnode front = temp.next;
        if(back == null) del_head();
        if(front == null) del_tail();
        if(front == null || back == null) {
        return;
        }
        back.next = front;
        front.prev = back;
        temp.prev = null;
        temp.next = null;
    }
    // insert at head
    public void insert_head(){
    Listnode temp = new Listnode(0);
    temp.next = head;
    head.prev = temp;
    temp.prev = null;
    head = temp;
    }

    // Reversal of ddl
    // Reversal of DLL
public void rev() {
    if (head == null || head.next == null) return;

    Listnode temp = head;
    Listnode last = null;

    while (temp != null) {
        // swap prev and next
        last = temp.prev;
        temp.prev = temp.next;
        temp.next = last;

        // move forward (which is temp.prev after swap)
        temp = temp.prev;
    }

    // set new head
    if (last != null) {
        head = last.prev;
    }
}

// Add 2 numbers
// public Doublylinkedlist addnos(Listnode l1,Listnode l2){

// }

// Sort alll the 0's 1's 2's
public void sorting(){
    Listnode temp = head;
    int cnt1=0,cnt2=0,cnt3=0;
    while(temp != null){
        if(temp.data == 0) cnt1++;
        else if(temp.data == 1) cnt2++;
        else if(temp.data == 2) cnt3++;
        temp = temp.next;
    }
    temp = head;

    while(temp != null){
        if(cnt1 > 0){ temp.data = 0; cnt1--;}
        else if(cnt2 > 0) { temp.data = 1; cnt2--;}
        else if(cnt3 > 0) { temp.data = 2; cnt3--;}
        temp = temp.next;
    }

}
}

