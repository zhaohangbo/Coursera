package Princeton.Algorithm1.Heap;

public class MaxHeap<Key extends Comparable<Key>> {
	
	private Key[] pq;
	private int N;
	
	public MaxHeap(int capacity){
		pq = (Key[]) new Comparable[capacity+1];//because start from pq[1], not pq[0]
	}
	
	public Comparable delete( ){
		Key max = pq[1]; 
		exch(1,N--);	 // use the last ele to cover the max 
		sink(1,N);
		pq[N+1]=null;
		return max;
	}
	public void insert(Key x){
		pq[++N] =x;
		swim(N);
	}
	
	private  void swim(int k){
		while(k>1 && less(k/2,k)){
			exch(k/2,k);
			k=k/2;;
		}
	}
	
	public  void sort(){
		int N = pq.length;
		
		//Build the heap here
		for(int k=N/2; k>=1; k--){
			sink(k,N);
		}
		//Sort
		while(N >1){
			exch(1, N);
			sink(1, --N);
		}
	}
	
	private void sink(int k, int N){
		while(2*k <=N){ //2*k <=N means parent has child 
			int j=2*k;
			if(j+1 <=N && less(j,j+1)) j++;//choose bigger one in left and right
			if(!less(k,j)) break;//break when parent >= child
			exch(k,j);
			k=j;
		}
	}
	
	private boolean less(int i, int j){
		return pq[i].compareTo(pq[j])<0;
	}
	
	private void exch( int i, int j){
		Key tmp = pq[i];
		pq[i]   = pq[j];
		pq[j]	= tmp;
	}
}
