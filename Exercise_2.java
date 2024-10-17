// Time Complexity : O(1)
// Space Complexity : O(n)
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode new_node = new StackNode(data);

        // link new_node to the current top node
        new_node.next = root;

        //update the top to the new node
        root=new_node;

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if (root == null){
        system.out.println("Stack Underflow");
        return 0;
    } else {
        //Write code to pop the topmost element of stack.
	    //Also return the popped element
        int x = root.data; // value

        // update the top to the next node
        root = root.next;
    }
    return x;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if isEmpty(){
            system.out.println("\n Stack is Empty");
            return 0;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
