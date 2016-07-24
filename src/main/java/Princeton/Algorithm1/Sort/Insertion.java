package Princeton.Algorithm1.Sort;

import java.util.Objects;

public class Insertion {
	//Unsorted insert into sorted.

	public static void sort(Comparable<Object>[] objs){
		int N =objs.length;
		for(int i=0;i<N;i++){
			for(int j=i;j>0;j--){
				if(objs[j].compareTo(objs[j-1])<0){
					swap(objs, j, j-1);
				}
				else{
					break;
				}
			}
		}
	}
	public static void sort(Comparable<Object>[] objs,int start_index ,int end_index){
		for(int i=start_index;i<=end_index;i++){
			for(int j=i;j>0;j--){
				if(objs[j].compareTo(objs[j-1])<0){
					swap(objs, j, j-1);
				}
				else{
					break;
				}
			}
		}
	}
	
	
	private static boolean less (Comparable<Object> obj1,Comparable<Object> obj2){
		if(obj1.compareTo(obj2)<0)
			return true;
		else
			return false;
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
	
	
	public static void main(String[] args){
		Comparable[] objs = {5,4,3,2,1};
		Insertion.sort(objs);
		Insertion.print(objs);
	}
	
}
