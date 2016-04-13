package labwork4;

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
	
	public void show(){
		for(int i = 0; i < im.length; i++){
			for(int j = 0; j < im[i].length; j++){
				System.out.print(im[i][j]);
			}
			System.out.println();
		}
	}
}
