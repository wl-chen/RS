package component;

public class Node {
	
	//dimensions
	private int dimensions=Global.dimensions;
	
	//ID
	private int ID;
	
	//location
	private double[] coordinates=new double[dimensions];
	
	public Node(int ID,double x,double y){
		this.ID=ID;
		this.coordinates[0]=x;
		this.coordinates[1]=y;
	}
	
	public Node(Node node){
		this.ID=node.ID;
		for(int i=0;i<this.dimensions;i++){
			this.coordinates[i]=node.coordinates[i];
		}
	}
	
	public int getID(){return this.ID;}
	
	public double[] getCoordinates(){return this.coordinates;}
	
	public int getDimensions(){return this.dimensions;}
	
	@Override
	public String toString(){
		return "this Node: ID=" + this.ID + " x=" + this.coordinates[0] + " y=" + this.coordinates[1];		
	}

}
