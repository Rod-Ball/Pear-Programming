package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Main extends Application {
	public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Welcome to Pear Programming! ");
        StackPane root = new StackPane();
        
        Welcome welcome = new Welcome();
       Tables table = new Tables();
       QuestionsText qt = new QuestionsText();
        
       qt.setGroup();
        //root.getChildren().add(welcome.welcome());
        root.getChildren().add(qt.getGroup());
        
        Scene s = new Scene(root, 375, 625);
        
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
