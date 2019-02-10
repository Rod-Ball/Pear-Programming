package application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Welcome {
	public HBox welcome() {
		HBox  hbox = new HBox();
	//Image for welcoming 
		
		
		Image pear = new Image("https://pbs.twimg.com/media/DzA91xJXcAA5qen.jpg");
		ImageView pear2 = new ImageView(pear);
		pear2.setFitHeight(625);
		pear2.setFitWidth(375);
		
		
		hbox.getChildren().add(pear2);
		
	
		return hbox;
	}
}
