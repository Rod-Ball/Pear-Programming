package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

	public class QuestionsText {
		private String age;
		Welcome wel = new Welcome();
		public Group questionGroup= new Group();
		private boolean isq2 = true; 
		private boolean isqW = true; 
		private boolean isqJ = false; 
		private boolean isqC = false; 
		private boolean isqP = false; 
		private boolean isqH = false; 
	    
		// THis creates the hbox for the first question
		public HBox q1() {	
			Text q = new Text("What is your age?");
			q.setFill(Color.DARKBLUE);
			HBox textBox = new HBox(q);
			q.setStyle("-fx-font: 48 serif;");
			
			
			
			RadioButton hs = new RadioButton("High School");
			
			RadioButton ug = new RadioButton("Undergraduate School");
			
			RadioButton grad = new RadioButton("Graduate School");
			
			RadioButton other = new RadioButton("Other");
			
			Button ok = new Button("NEXT");
			ok.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {  
					questionGroup.getChildren().clear();
					restart();
				}
		    });;
			
		
			
					
			HBox hbox1 = new HBox();
			hbox1.getChildren().addAll(hs,ug);
			hbox1.setPadding(new Insets(150, 50, 100, 0));
			
			HBox hbox2 = new HBox();
			hbox2.getChildren().addAll(grad, other, ok);
			
			
			
			VBox vbox = new VBox();
			vbox.getChildren().addAll(textBox,hbox1, hbox2);
			
			vbox.setPadding(new Insets(100, 20, 100, 20));
			
			
			
			HBox hbox = new HBox();
			
			hbox.getChildren().add(vbox);
			
			return hbox;
		}
		
		public HBox q2() {
			Text q = new Text("What languages do you know?");
			q.setFill(Color.DARKBLUE);
			HBox textBox = new HBox(q);
			q.setStyle("-fx-font: 28 serif;");
					
			RadioButton java = new RadioButton("Java");
			java.setOnAction(event -> isqJ = true);
			RadioButton html = new RadioButton("HTML");
			html.setOnAction(event -> isqH =true);
			RadioButton cSharp = new RadioButton("C#");
			cSharp.setOnAction(event -> isqC=true);
			RadioButton python = new RadioButton("Python");
			python.setOnAction(event -> isqP =true);
			
			Button ok = new Button("NEXT");
			ok.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {  
					questionGroup.getChildren().clear();
					isq2=false;
					restart();
				}
		    });;
			
			
			
			HBox hbox1 = new HBox();
			hbox1.getChildren().addAll(java,html);
			hbox1.setPadding(new Insets(150, 50, 100, 0));
			
			HBox hbox2 = new HBox();
			hbox2.getChildren().addAll(cSharp, python, ok);
			
			

			VBox vbox = new VBox();
			vbox.getChildren().addAll(textBox,hbox1, hbox2);
			
			vbox.setPadding(new Insets(100, 20, 100, 20));
			
			HBox hbox = new HBox();		
			hbox.getChildren().add(vbox);
			
			return hbox;
		}
		
		public HBox qW(String lang) {
			Text q = new Text("How confident are you in " + lang + "?");
			q.setFill(Color.DARKBLUE);
			HBox textBox = new HBox(q);
			q.setStyle("-fx-font: 28 serif;");
			
			RadioButton conf = new RadioButton("Confidently");
			//conf.setOnAction(event -> System.out.println("CHANGE SCENE"));
			RadioButton m = new RadioButton("Moderate");
			//m.setOnAction(event -> System.out.println("CHANGE SCENE"));
			RadioButton easy = new RadioButton("Can only write Hello World");
			//easy.setOnAction(event -> System.out.println("CHANGE SCENE"));
			
			
			Button ok = new Button("NEXT");
			ok.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {  
					questionGroup.getChildren().clear();
					restart();
					showInfo();
				}
		    });;
			
			
			HBox hbox1 = new HBox();
			hbox1.getChildren().addAll(conf, m);
			hbox1.setPadding(new Insets(150, 50, 100, 0));
			
			HBox hbox2 = new HBox();
			hbox2.getChildren().addAll(easy, ok);
			

			VBox vbox = new VBox();
			vbox.getChildren().addAll(textBox,hbox1, hbox2);
			
			vbox.setPadding(new Insets(100, 20, 100, 20));
			
			
			HBox hbox = new HBox();		
			hbox.getChildren().add(vbox);
			
			return hbox;
		}
		
		// Switches hboxes that are displayed and therefore switching the scene
		
		
		private void restart() {
			if(isq2) {
	    	questionGroup.getChildren().add(q2());
				}else
			if(isqJ){
		    questionGroup.getChildren().add(qW("Java"));
		    isqJ=false;
				}else
			if(isqP){
				    questionGroup.getChildren().add(qW("Python"));
				    isqP=false;
						}else
			if(isqC){
							questionGroup.getChildren().add(qW("C#"));
							isqC=false;
						}else
			if(isqH){
						    questionGroup.getChildren().add(qW("HTML"));
						    isqH=false;
			}	
				}
		
		//this sets the group which holds the hboxes
			
		public void setGroup() {
			questionGroup.getChildren().add(wel.welcome());
			questionGroup.getChildren().add(q1( ));
		}
		public Group getGroup() {
			return questionGroup;
		}
		
		// shows the last graph slide of information
		private void showInfo() {
			Image graph = new Image("https://pbs.twimg.com/media/DzA-CMbWoAA84Qw.jpg");
			ImageView graph2 = new ImageView(graph);
			//graph2.setFitHeight(625);
			//graph2.setFitWidth(375);
			 questionGroup.getChildren().add(graph2);
			
		}
		
		
		
	}


