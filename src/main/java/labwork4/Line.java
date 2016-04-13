package labwork4;

import java.util.ArrayList;

public class Line {
	public char[] line = new char[8];
	public Line(){
		for(int i = 0; i < line.length; i++){
			line[i] = '.';
		}
	}
	double opacity;
	public void setOpacity(double op){
		this.opacity = op;
		System.out.print("Change opacity to: " + op);
	}
	
	public ArrayList<String> showHorizontal(){
		ArrayList<String> res = new ArrayList<>();
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < line.length; i++){
			str.append(line[i]);
			str.append(' ');
		}
		res.add(str.toString());
		return res;
	}
	public ArrayList<String> showVertical(){
		ArrayList<String> res = new ArrayList<>();
		for(int i = 0; i < line.length; i++){
			res.add(Character.toString(line[i]));
		}
		res.add("");
		return res;
	}
}
