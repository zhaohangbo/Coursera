package Princeton.Algorithm2;

public  class HuffmanNode implements Comparable<HuffmanNode>{ 
	private char ch;  //Used for internal nodes;
	private int  freq;//Used for expand
	private final HuffmanNode left, right;
	
	public HuffmanNode(char ch, int freq, HuffmanNode left, HuffmanNode right){
		this.ch	  =ch;
		this.freq =freq;
		this.left =left;
		this.right=right;
	}
	
	public boolean isLeaf(){
		return left==null && right ==null; //is a leaf ?
	}
	
	public int compareTo(HuffmanNode that){
		return this.freq - that.freq;	//compare HuffmanNode by frequency ( stay tuned)
	}
	
	
}
