import java.util.Scanner;
public class Linkedlist{

    static class Node{
        int data;
        Node next;
            Node(int data){                                        
                this.data = data;
                this.next = null;        
        }
    }
    Node head = null;

    void creation(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if( head == null){
                head = new_node;
            }
            else{
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do u want to add more data...Press 1 for Yes or other for NO");
            n = sc.nextInt();
        }
        while(n == 1);    
    }
    void insertion(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if( head == null){
                head = new_node;
            }
            else{
                System.out.println("Enter 1 to insert at Beginning.. Enter 2 to insert at the End...  Enter 3 for specific location"); 
                int m = sc.nextInt();
                switch(m){
                    case 1:
                             new_node.next = head;
                             head = new_node;
                             break;
                    case 2: 
                            Node temp = head;
                            while (temp.next != null){
                                temp = temp.next;
                            }
                            temp.next = new_node;
                            break;
                    case 3:
                            System.out.print("Enter the location where u want to add the data : ");
                            int p = sc.nextInt();
                            Node temp1 = head;
                            for (int i = 0; i < p-2; i++){
                                temp1 = temp1.next;
                            }
                            new_node.next = temp1.next;
                            temp1.next = new_node;
                            break;                            
                }
            }
            System.out.println("Do u want to add more data...Press 1 for Yes or other for NO");
            n = sc.nextInt();
        }
        while(n == 1);    
    }
    void delete(){
       int confirmation;
       Scanner sc = new Scanner(System.in);
       do{
        if(head == null){
            System.out.println("LL is already empty");
        }
        else{
            System.out.println("Press 1 for delete at Front....Press 2 for End...Press 3 for specific location");
            int input = sc.nextInt();
            switch(input){
                case 1 :
                    Node temp = head;
                    head = temp.next;
                    break;
                case 2 :
                    Node temp1 = head;
                    Node ptr = temp1.next;
                    while(ptr.next != null){
                        temp1 = ptr;
                        ptr = ptr.next;
                       }
                    temp1.next = null;
                    break;
                case 3 :
                    System.out.print("Enter position of node to be deleted : ");
                    int input1 = sc.nextInt();
                    Node temp2 = head;
                    Node ptr1 = temp2.next;
                    for (int i = 0; i < input1 - 2; i++){
                        temp2 = ptr1;
                        ptr1 = ptr1.next;  
                    } 
                    temp2.next = ptr1.next;
                    break;
            }
        }
        System.out.print("Do you want to delete more item. If Yes Press 1 : ");
        confirmation = sc.nextInt();
       }
       while( confirmation == 1);
    }
    void traverser(){
        Node temp = head;
        if(head == null){
            System.out.println("Linkedlist does not exist");
        }
        else{
            while( temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertion();
        ll.traverser();
    }
    
}

