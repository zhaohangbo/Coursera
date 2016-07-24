package Princeton.Algorithm1.StacksAndQueues;

import java.util.Iterator;
import java.util.ListIterator;

public class Stack <Item_Zhb> implements Iterable<Item_Zhb> {
	//Every operation  takes constant time in the worst case
	private Node first;

	private class Node{
		Node     next;
		Item_Zhb item_Zhb;
		
		private Node(Item_Zhb item_Zhb){
			this.item_Zhb =item_Zhb;
		}
	}

	public void push(Item_Zhb s){
		Node oldFirst = first;
		first         = new Node(s);
		first.next    = oldFirst;
	}
	
	public Item_Zhb pop(){
		Item_Zhb output =first.item_Zhb;
		first = first.next;
		return output;
	}
	
	public boolean isEmapty(){
		return first==null;
	}

	public Iterator<Item_Zhb> iterator() {
		// TODO Auto-generated method stub
		return new listIterator<Item_Zhb>();
	}
	
	private class listIterator<Item_Zhb> implements Iterator<Item_Zhb>{

		private Node current =first;
		
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		public Item_Zhb next() {
			// TODO Auto-generated method stub
			Item_Zhb item =(Item_Zhb) current.item_Zhb;
			current   =current.next;
			return item;
		}

		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}