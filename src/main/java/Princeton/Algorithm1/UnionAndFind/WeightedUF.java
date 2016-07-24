package Princeton.Algorithm1.UnionAndFind;

public class WeightedUF {
//	private int[] id;
//	
//	public WeightedUF(int N){
//		id =new int[N];
//		for(int i=0;i<N;i++)id[i]=i;
//	}
//	//find (root) method
//	private int root(int i){
//		while(i != id[i]) i=id[i];
//		return i;
//	}
//	
//	public boolean connected(int p,int q){
//		return root(p) == root(q);
//	}
//	
//	public void union(int p, int q){
//		int i =root(p);
//		int j =root(q);
//		id[i] =j;
//	}

}
//    algorithn                     initialize      union                              find
//   1.quick-find                       N             N                                  1
//   2.quick-find                       N             N(including cost of find root)     1      worst case
//   3.Weighted quick-union             N            logN  						     logN


//Quick-find defect
//		Union too expensive(N array accesses)
//		Trees are flat, but too expensive to keep them flat.

//Quick-union defect
//		Trees can get tall.
//		Find too expensive,could be N Array accesses.

//========================SUMMARY========================
//Problem:
//M union-find operations on a set of N objects.

//algorithn                     worst case time
//1.quick-find                       N*M             
//2.quick-find                       N*M              
//3.Weighted quick-union             N+M log N         
//4.QU + path compression            N+M log N
//5.weighted QU + path compression   N+M lg*N   (lg star N)  
//                                  any sequence of M Find or Union operations on N objects makes array accesses <= c(N+Mlg*N)
//									any sequence of M Find or Union operations on N objects will touch the array at most c(N+Mlg*N) times
//========================================================
// log*N is kind of a funny function: it's the number of times you have to take the log of N to get to 1.
// log*N is kind of a funny function: it's the number of times log must be iterated to reach a constant
//                                      log(log(logN))
//http://stackoverflow.com/questions/5212628/meaning-of-lg-n-in-algorithmic-analysis
