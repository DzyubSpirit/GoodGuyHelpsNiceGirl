package labwork4;

import java.util.ArrayList;

public class Image {
	public char[][] im = new char[4][4];
	public Image(){
		for(int i = 0; i < im.length; i++){
			for(int j = 0; j < im[i].length; j++){
				im[i][j] = '+';
			}
		}
	}
	double transparency;
	public void setTransparency(double tr){
		this.transparency = tr;
		System.out.print("Change transparency to: " + tr);
	}
	
	public ArrayList<String> show(){
		ArrayList<String> res = new ArrayList<>();
		for(int i = 0; i < im.length; i++){
			StringBuilder curLine = new StringBuilder();
			for(int j = 0; j < im[i].length; j++){
				curLine.append(im[i][j]);
			}
			res.add(curLine.toString());
		}
		return res;
	}
}
