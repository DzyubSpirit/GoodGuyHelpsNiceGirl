package labwork4;

import java.util.ArrayList;

public class Editor {
	private Image image;
	private Line[] line;
	public boolean visability = true;
	// for default editor have image and frame of 4 lines
	public Editor(){
		image = new Image();
		line = new Line[4];
		for (int i = 0; i < 4; i++){
		     line[i] = new Line();
		}
	}
	public void show(boolean vis){
		this.visability = vis;
		showArrayList(line[0].showHorizontal());
		showArrayList(line[1].showVertical());
		showArrayList(image.show());
		showArrayList(line[2].showVertical());
		showArrayList(line[3].showHorizontal());
		// add something for hide image
	}
	public void changeTypeOfFrame(){
		
	}

	private static void showArrayList(ArrayList<String> lines) {
		for (String line:lines) {
			System.out.println(line);
		}
	}
}
