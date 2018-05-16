package test;

import functions.ReadDataFromFile;
import java.util.ArrayList;
import java.io.IOException;

import component.Node;
import functions.*;

//the result of test is the file includes 1374420 locations

public class ReadDataFromFileTest{

	public static void main(String[] args) throws IOException{
		
		ArrayList<Node> nodes=ReadDataFromFile.readDataFromFile("F://wl//RangeSearch//data//base.txt",10000);
		
		for(Node node:nodes){
			System.out.println(node.toString());
		}
		
		System.out.println(nodes.size());
		// TODO Auto-generated method stub

	}

}
