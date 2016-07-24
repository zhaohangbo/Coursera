package Princeton.Algorithm1.Sort;

public class Selection {
	//Select minimun sort
	
	public static void sort(Comparable<Object>[] objs){
		for(int i=0;i<objs.length;i++){
			int min = i;
			for(int j=i+1;j<objs.length;j++){
				if(objs[min].compareTo(objs[j])>0){
					min = j;
				}
			}
			swap(objs, i, min);
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] objs = {5,4,3,2,1};
		Selection.sort(objs);
		Selection.print(objs);
	}

}
