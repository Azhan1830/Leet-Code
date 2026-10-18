class ListNode {
    int val;
    ListNode prev;
    ListNode next;
    public ListNode (int val) {
        this.val = val;
    }
}


class MyLinkedList {
    int size;
    ListNode dummyHead;
    ListNode dummyTail;

    public MyLinkedList() {
        size = 0;
        dummyHead = new ListNode(-1);
        dummyTail = new ListNode(-1);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    private ListNode getNode(int index) {
        ListNode curr;
        if (index < size/2) {
            curr = dummyHead.next;
            for (int i=0; i<index; i++) {
                curr = curr.next;
            }
        } else {
            curr = dummyTail.prev;
            for (int i=0; i<size - index - 1; i++) {
                curr = curr.prev;
            }
        }
        return curr;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return getNode(index).val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;

        ListNode succ;
        if (index == size) {
            succ = dummyTail;
        } else {
            succ = getNode(index);
        }
        ListNode pred = succ.prev;
        ListNode newNode = new ListNode(val);

        newNode.prev = pred;
        newNode.next = succ;
        pred.next = newNode;
        succ.prev = newNode;

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        ListNode curr = getNode(index);
        ListNode pred = curr.prev;
        ListNode succ = curr.next;

        pred.next = succ;
        succ.prev = pred;

        size--;
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