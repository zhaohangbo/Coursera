package Princeton.Algorithm1.Sort;

public class Quicksort_Wrong {
	
	public static void quickSort(Comparable[] objs){
		sort(objs, 0, objs.length-1);
	}
	
	public static void sort(Comparable[] objs,int start,int end){
		if(start>=end){
			return;
		}
		int pos  = partition(objs, start, end);
		sort(objs,start ,pos-1);
		sort(objs,pos+1 ,end);
	}
	
	public static int partition(Comparable[] objs,int start,int end){

		int left = start+1;
		int right= end;
		//Most Critical
		if(left == right){
			if(objs[start].compareTo(end)==1){
				swap(objs, start, end);
			}
			return left;
		}
		
		while(true){
			
			while(left<end && (objs[left].compareTo(objs[start]) == -1||objs[left].compareTo(objs[start]) == 0)) {
				left++;
			}
			while(right>start+1 && (objs[right].compareTo(objs[start])== 1 ||objs[right].compareTo(objs[start])==0)){
				right--;
			}
			
			if(left==right){
				break;
			}

			swap(objs, left, right);
		}
		if(start+1==end){
			
		}
		else if(left==end ){//all <= start
			//swap(objs,start,end);  current left =end, so swap(objs, start, left); need do nothing.
		}
		else if(right==start+1){// all >= start
			//already sorted, need to do nothing.
			//So no swap, but left =start+1;
			//So
			left--; //left =start+1 -1; 
			//Otherwise, 
		}
		else{
		}
		swap(objs, start, left);
		return left;
	}
	
	private static void swap(Comparable<Object>[] objs, int i, int j) {
		Comparable<Object> temp = objs[i];
		objs[i] = objs[j];
		objs[j] = temp;
	}
	
	
	private static void print(Comparable<Object>[] objs){
		for(int i=0;i<objs.length;i++){
			System.out.println(objs[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] objs = {5,4,3,2,1,5,4,3,2,1};
		Quicksort_Wrong.quickSort(objs);
		print(objs);
	}

}
