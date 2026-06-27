class LRUCache {
    HashMap<Integer, Node> map = new HashMap<>();
    int size = 0;
    int cpcty;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1,null,head);
    public LRUCache(int capacity) {
        cpcty = capacity;
        head.next = tail;
        head.prev = null;
    }
   
    public int get(int key) {
        if(map.get(key) == null || map.get(key).val == -1)return -1;
        Node node = map.get(key);
        deleteNode(node);
        insertNode(node);
        // System.out.println(key+" "+node.val);
        return map.get(key).val;
    }
  
    private void insertNode(Node node) {
        tail.prev.next = node;
        node.prev = tail.prev;
        node.next = tail;
        tail.prev = node;
    }

    private void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

public void put(int key, int value) {
        if(map.get(key) == null || map.get(key).val == -1){
        Node node = new Node(key,value);
        insertNode(node);
        map.put(key,node);
        if (++size > cpcty) {
            Node lru = head.next;
            lru.val = -1;
            deleteNode(lru);
            map.put(lru.key,new Node(lru.key,-1));
            size--;
        }
        }
        else{
            map.get(key).val = value;
            deleteNode(map.get(key));
            insertNode(map.get(key));
        }
        // Display(head);
    }
    public void Display(Node head){
        while(head != null){
            System.out.print("("+head.key+" ,"+head.val+")"+"<--->");
            head = head.next;
        }
        System.out.println("END");
    }
}
 class Node{
        Node next;
        Node prev;
        int key;
        int val;

        Node() {

        }

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        Node(int key, int val, Node next, Node prev) {
            this.key = key;
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
