package component;

import java.util.ArrayList;

public class Bucket implements Comparable<Bucket>{
	
	private int hash;
	
	private ArrayList<Node> bucket=null;
	
	public Bucket(int hash){
		this.hash=hash;
	}
	
	public Bucket(int hash,Node node){
		this.hash=hash;
		bucket.add(node);
	}
	
	@Override
	public int compareTo(Bucket bucket) {
		return Integer.compare(this.hash, bucket.getHash());
	}
	
	public ArrayList<Node> getBucket(){return this.bucket;}
	
	public void setHash(int hash){this.hash=hash;}
	
	public int getHash(){return this.hash;}
	
	public void addNode(Node node){bucket.add(node);}
	
	public Node getNode(int i){return bucket.get(i);}
	
	public void removeNode(int i){bucket.remove(i);}
	
	public void removeNode(Node node){bucket.remove(node);}
 
}
