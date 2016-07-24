package Princeton.Algorithm1.Sort;

public class Mergesort {

	private static final int CUTOFF = 0;//subarray lenth is less than 7 then, use insertion sort to improve
										//reduce the numbers of tiny subarray for mergesort
	
	public static void mergeSort(Comparable<Object>[] objs,Comparable<Object>[] temp,int start,int end){
		
		//Improvement 1
		//MergeSort has too much overhead for tiny subarrays 
		//Cutoff to InsertionSort(which is simple and efficient for tiny arrays ) for 7 items
		if(end<= start+CUTOFF-1){
			Insertion.sort(temp,start,end);
		}

		
		if(start<end){
			int mid = (start+end)/2;
			//Make sure the left subArrray is sorted
			mergeSort(temp,objs, start, mid);
			//Make sure the right subArrray is sorted
			mergeSort(temp,objs, mid+1, end);
			
			//Improvement 2  ---helpful for partially sorted arrays
			//If left subarray's biggest is less than right subarray's smallest.
			//The 2 sub arrays are already sorted, don't need to merge.
			if(temp[mid].compareTo(temp[mid+1])<0){
				return;
			}
			
			//switch objs and temp
			doMerge(objs,temp,start,mid, mid+1, end);
		}
		
	}
	
	private static void doMerge(Comparable<Object>[] objs,Comparable<Object>[] temp, int start1,int end1,int start2,int end2){
		//idea:
		//We can assert the left  subArrray[start1,end1] is sorted
		//We can assert the right subArrray[start2,end2] is sorted
		//Then merge the 2 sub arrays
		
		
		//Improvement 3
		//Pass a temp arr and swith the temp and objs every doMerge, then save time and space
//		Comparable<Object>[] temp = new Comparable[objs.length];
//		for(int i=start1;i<=end2;i++){
//			temp[i] = objs[i];
//		}
		
		int p1   = start1;
		int p2   = start2;
		
		int curP = start1;
		
		while(p1<=end1 && p2<=end2){
			if(temp[p1].compareTo(temp[p2])==-1){
				objs[curP] =temp[p1]; //switch objs and temp
//				temp[curP] =objs[p1];
				p1++;
				curP++;
			}
			else{
				objs[curP] =temp[p2];
//				temp[curP] =objs[p2];
				p2++;
				curP++;
			}

		}
		
		while(p1<=end1){
			objs[curP] =temp[p1];
//			temp[curP] =objs[p1];
			p1++;
			curP++;
		}
		while(p2<=end2){
			objs[curP] =temp[p2];
//			temp[curP] =objs[p2];
			p2++;
			curP++;
		}
	}
	
	private static void swap(Comparable<Object>[] objs,int p1,int p2){
		Comparable<Object> temp =objs[p1];
		objs[p1] =objs[p2];
		objs[p2]=temp;
	}
	
	private static void print(Comparable<Object>[] objs){
		for(int i=0;i<objs.length;i++){
			System.out.println(objs[i]);
		}
	}
	
	public static void main(String[] args){
		Comparable[] objs ={9,8,7,6,5,4,3,2,1};
		Comparable[] temp =new Comparable[objs.length];
		for(int i=0;i<objs.length;i++){
			temp[i] =objs[i];
		}
		mergeSort(objs,temp,0,objs.length-1);
		print(objs);
	}
}
