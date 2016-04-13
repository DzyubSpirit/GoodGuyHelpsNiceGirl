package labwork4;

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
	
	public void showHorizontal(){
		for(int i = 0; i < line.length; i++){
			System.out.print(line[i] + " ");
		}
	}
	public void showVertical(){
		for(int i = 0; i < line.length; i++){
			System.out.println(line[i]);
		}
		System.out.println();
	}
}
