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
public class Display extends Application 
{

	 private String answer;
	 public static void main(String[] args) 
	 {
	        launch(args);
	    }
	    
	    @Override
	    public void start(Stage primaryStage) throws InterruptedException
	    {
	        primaryStage.setTitle("Hello World!");
	        Button btn = new Button();
	        Button btn1 = new Button ();
	        Button btn2 = new Button ();
	        TextField text = new TextField ();
	        StackPane root = new StackPane();
	        Canvas canvas = new Canvas (120, 180);
	        GraphicsContext gc = canvas.getGraphicsContext2D ();
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
	        primaryStage.setScene(new Scene(root, 650, 600));
	        primaryStage.show();
	        activate (gc, btn, btn1, btn2, text);
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	       	 
	            @Override
	            public void handle(ActionEvent event) {
	            	if (btn.getText().equals(getAnswer()))
	            	{
	            		text.setText("Correct!");
	            	}
	            	else
	            	{
	            		text.setText("Incorrect! Unfortunately the correct answer was: " + getAnswer());
	            	}
	            }
	        });
	        btn1.setOnAction(new EventHandler<ActionEvent>() {
		       	 
	            @Override
	            public void handle(ActionEvent event) {
	            	if (btn1.getText().equals(getAnswer()))
	            	{
	            		text.setText("Correct!");
	            	}
	            	else
	            	{
	            		text.setText("Incorrect! Unfortunately the correct answer was: " + getAnswer());
	            	}
	            }
	        });
	        btn2.setOnAction(new EventHandler<ActionEvent>() {
		       	 
	            @Override
	            public void handle(ActionEvent event) {
	            	if (btn2.getText().equals(getAnswer()))
	            	{
	            		text.setText("Correct!");
	            	}
	            	else
	            	{
	            		text.setText("Incorrect! Unfortunately the correct answer was: " + getAnswer());
	            	}
	            }
	        });
	    }
	    
	    private void activate (GraphicsContext gc, Button btn, Button btn1, Button btn2, TextField text)
	    {
	    	String [] brailleOptions = Braille.getChoices();
	    	gc.clearRect (0, 0, 120, 180);
	    	gc.setFill(Color.PLUM);
	        gc.setStroke(Color.BLUE);
	        gc.setLineWidth(5);
	    	if (brailleOptions[0].substring(0, 2).equals("00"))
	    	{
	    		gc.strokeOval(10, 5, 40, 40);
	    		gc.strokeOval(72, 8, 37, 37);
	    	}
	    	else if (brailleOptions[0].substring(0, 2).equals("01"))
	    	{
	    		gc.strokeOval(10, 5, 40, 40);
	    		gc.fillOval(72, 8, 37, 37);
	    	}
	    	else if (brailleOptions[0].substring(0, 2).equals("10"))
	    	{
	    		gc.fillOval(10, 5, 40, 40);
	    		gc.strokeOval(72, 8, 37, 37);
	    	}
	    	else
	    	{

		    	gc.fillOval(10, 5, 40, 40);
		    	gc.fillOval(72, 8, 37, 37);
	    	}
	    	if (brailleOptions[0].substring(2, 4).equals("00"))
	    	{
	    		gc.strokeOval(10, 65, 40, 40);
	    		gc.strokeOval(72, 68, 37, 37);
	    	}
	    	else if (brailleOptions[0].substring(2, 4).equals("01"))
	    	{
	    		gc.strokeOval(10, 65, 40, 40);
	    		gc.fillOval(72, 68, 37, 37);
	    	}
	    	else if (brailleOptions[0].substring(2, 4).equals("10"))
	    	{
	    		gc.fillOval(10, 65, 40, 40);
	    		gc.strokeOval(72, 68, 37, 37);
	    	}
	    	else
		    {
		    	gc.fillOval(10, 65, 40, 40);
		    	gc.fillOval(72, 68, 37, 37);
		    }
	    	if (brailleOptions[0].substring(4, 6).equals("00"))
	    	{
	    		gc.strokeOval(10, 125, 40, 40);
	    		gc.strokeOval(72, 128, 37, 37);
	    	}
	    	else if (brailleOptions[0].substring(4, 6).equals("01"))
	    	{
	    		gc.strokeOval(10, 125, 40, 40);
	    		gc.fillOval(72, 128, 37, 37);
	    	}
	    	else if (brailleOptions[0].substring(4, 6).equals("10"))
	    	{
	    		gc.fillOval(10, 125, 40, 40);
	    		gc.strokeOval(72, 128, 37, 37);
	    	}
	    	else
		    {
		    	gc.fillOval(10, 125, 40, 40);
		    	gc.fillOval(72, 128, 37, 37);
		    }
	    	btn.setText(Braille.convert(brailleOptions[1]));
	    	btn1.setText(Braille.convert(brailleOptions[2]));
	    	btn2.setText(Braille.convert(brailleOptions[3]));
	    	text.setText("What is your choice?");
	    	answer = Braille.convert(brailleOptions[0]);
	    }
	    
	    private String getAnswer ()
	    {
	    	return answer;
	    }
	  
/*	    private void drawShapes (GraphicsContext gc) 
	    {
	    	gc.setFill(Color.GREEN);
	        gc.setStroke(Color.BLUE);
	        gc.setLineWidth(5);
	        // distance between fill and stroke: (+2, +2, -3, -3) and width location + 60
	        gc.fillOval(10, 5, 40, 40);
	        gc.strokeOval(72, 8, 37, 37);
	        gc.fillOval(10, 65, 40, 40);
	        gc.strokeOval(72, 68, 37, 37);
	        gc.fillOval(10, 125, 40, 40);
	        gc.strokeOval(72, 128, 37, 37);
	    } */
}
