package functions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import component.Node;
import java.util.ArrayList;

public class ReadDataFromFile {
	
	public static ArrayList<Node> readDataFromFile(String path,int numbers) throws IOException{
		
		ArrayList<Node> nodes=new ArrayList<>();
		
		BufferedReader r = new BufferedReader(new FileReader(path));
		String s = r.readLine();
		int num = 0;
		while (s != null && num < numbers) {
			String[] sourceStrArray = s.split("\\s{2,}|\t");
			Node node= new Node(Integer.parseInt(sourceStrArray[0]), Long.parseLong(sourceStrArray[1]),
					Long.parseLong(sourceStrArray[2]));
			nodes.add(node);
			num++;
			s = r.readLine();
		}
		r.close();
		return nodes;		
	}	

	public static ArrayList<Node> readDataFromFile(String path) throws IOException{
		
		ArrayList<Node> nodes=new ArrayList<>();		
		BufferedReader r = new BufferedReader(new FileReader(path));
		String s = r.readLine();
		int num = 0;
		while (s != null) {
			String[] sourceStrArray = s.split("\\s{2,}|\t");
			Node node= new Node(Integer.parseInt(sourceStrArray[0]), Long.parseLong(sourceStrArray[1]),
					Long.parseLong(sourceStrArray[2]));
			nodes.add(node);
			num++;
			s = r.readLine();
		}
		r.close();
		return nodes;		
	}

}
