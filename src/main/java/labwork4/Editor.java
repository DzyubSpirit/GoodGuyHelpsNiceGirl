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
		line[0].showHorizontal();
		line[1].showVertical();
		image.show();
		line[2].showVertical();
		line[3].showHorizontal();
		// add something for hide image
	}
	public void changeTypeOfFrame(){
		
	}
}
