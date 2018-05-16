package component;

import java.util.Random;
import java.util.ArrayList;

public class EuclideanHash {
	
	private ArrayList<Bucket> buckets=null;
	private double[] randomProjection=new double[Global.dimensions];
	private int offset;//Æ«ÒÆÁ¿
	private int w;//·ÖÄ¸
	
	public EuclideanHash(int dimensions,int w){
		Random rand=new Random();
		this.offset=rand.nextInt(w+1);
		
		for(int i=0;i<dimensions;i++){
			this.randomProjection[i]=rand.nextGaussian();
		}
	}
	
	public double[] getrandomProjection(){
		return this.randomProjection;
	}
	
	public String toString(){
		return "the EuclideanHash: offset="+this.offset+" w="+this.w+" randomProjection="+this.randomProjection[0]+","+this.randomProjection[1];
	}

}
