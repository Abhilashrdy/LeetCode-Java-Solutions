class MyLinkedList {
    private Node head ;
    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        if(index == 0){
           return (head == null)?-1:head.val;
        }
        Node node = head;
        while(index > 0 && node != null){
            node = node.next;
            index--;
        }
        return (node == null)?-1:node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        Node node = head;
        while(node != null && node.next != null){
            node = node.next;
        }
        if(node == null){
            head = new Node(val);
            return ;
        }
        node.next = new Node(val);
    }

    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node node = head;
        for(int i = 0 ; node != null && i < index-1 ; i++){
            node = node.next;
        }
        if(node == null)return;
        Node temp = new Node(val);
        temp.next = node.next;
        node.next = temp;
    }

    public void deleteAtIndex(int index) {
        if(index == 0){
            if(head == null)return;
            head = head.next;
            return;
        }
        Node node = head;
        for(int i = 0 ; node != null && i < index-1 ; i++)node = node.next;
        if(node == null || node.next == null){
            return;
        }
        node.next = node.next.next;
    }
    public void Display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("End");
    }
    public class Node{
        int val;
        Node next;
        Node(){
            this.next = null;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
}
class Main{
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3,0);
        list.Display();
        list.deleteAtIndex(2);
        list.Display();
        list.addAtHead(6);
        list.Display();
        list.addAtTail(4);
        list.Display();
        System.out.println(list.get(4));
        list.addAtHead(4);
        list.addAtIndex(5,0);
        list.addAtHead(6);
        list.Display();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
