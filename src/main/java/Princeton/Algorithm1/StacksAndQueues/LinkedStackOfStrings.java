package Princeton.Algorithm1.StacksAndQueues;


public class LinkedStackOfStrings<Item_Zhb> {
	//Every operation  takes constant time in the worst case
	private Node first;

	private class Node{
		Node   next;
		Item_Zhb value;
		
		private Node(Item_Zhb value){
			this.value =value;
		}
	}
	
	
	public void push(Item_Zhb s){
		Node oldFirst = first;
		first         = new Node(s);
		first.next    = oldFirst;
	}
	
	public Item_Zhb pop(){
		Item_Zhb output =first.value;
		first = first.next;
		return output;
	}
	
	public boolean isEmapty(){
		return first==null;
	}

}
