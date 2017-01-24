package eecs2311simulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Display extends Application {

	 public static void main(String[] args) {
	        launch(args);
	    }
	    
	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Hello World!");
	        Button btn = new Button();
	        Button btn1 = new Button ();
	        Button btn2 = new Button ();
	        TextField text = new TextField ("Correct!");
	        btn.setText("Option 1");
	        btn1.setText("Option 2");
	        btn2.setText("Option 3");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	             //   System.out.println("Hello World Today!");
	            	text.setText("Wrong");
	            }
	        });
	        
	        StackPane root = new StackPane();
	        Canvas canvas = new Canvas (120, 180);
	        GraphicsContext gc = canvas.getGraphicsContext2D ();
	        drawShapes (gc);
	        btn.setPrefSize(100, 100);
	        btn1.setPrefSize(100, 100);
	        btn2.setPrefSize(100, 100);
	        root.getChildren().add(btn);
	        root.getChildren().add(btn1);
	        root.getChildren().add(btn2);
	        root.getChildren().add(canvas);
	        root.getChildren().add(text);
	        StackPane.setAlignment(canvas,Pos.CENTER);
	        StackPane.setAlignment(btn,Pos.BOTTOM_LEFT);
	        StackPane.setAlignment(btn1,Pos.BOTTOM_CENTER);
	        StackPane.setAlignment(btn2, Pos.BOTTOM_RIGHT);
	        StackPane.setAlignment(text, Pos.TOP_CENTER);
	        primaryStage.setScene(new Scene(root, 600, 550));
	        primaryStage.show();
	    }
	    
	    private void drawShapes (GraphicsContext gc) 
	    {
	    	gc.setFill(Color.GREEN);
	        gc.setStroke(Color.BLUE);
	        gc.setLineWidth(5);
	        // distance between fill and stroke: (+2, +2, -3, -3) and width location + 60
	        gc.fillOval(10, 2, 40, 40);
	        gc.strokeOval(72, 4, 37, 37);
	        gc.fillOval(10, 62, 40, 40);
	        gc.strokeOval(72, 64, 37, 37);
	        gc.fillOval(10, 122, 40, 40);
	        gc.strokeOval(72, 124, 37, 37);
	    }
}
