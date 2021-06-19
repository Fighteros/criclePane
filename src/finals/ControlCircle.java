/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ahemd M. Abd El-Ghany
 */
public class ControlCircle extends Application {
    private CirclePane circlePane = new CirclePane();
    private HBox hbox;
    private BorderPane mainPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        hbox = getHbox();
        addUi(hbox);
        mainPane = getMainPane();
        primaryStage.setScene(new Scene(mainPane, 200, 150));
        primaryStage.show();
    }
    
    // creates the HBOx
    public HBox getHbox(){
        hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        return hbox;
    }
    
    // add ui to HBOX
    public void  addUi(HBox hbox){
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrnik");
        
        btEnlarge.setOnAction(e -> {circlePane.enlarge();});
        btShrink.setOnAction((ActionEvent e) -> {circlePane.shrink();});
        
        // anonmous inner class
        btShrink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked on shrink!");
            }
        });
        
        hbox.getChildren().addAll(btEnlarge, btShrink);
    }
    
    // inner classes
    private class A{
        void handle(){
            System.out.println("print");
        }
    }
    
    protected class B{
    
    }
    
     static class c {
        void canbeDefaultMethod(){
            
        }
    }
    
    
    // creates a borderpane 
    public BorderPane getMainPane(){
        mainPane = new BorderPane();
        mainPane.setCenter(circlePane);
        mainPane.setBottom(hbox);
        mainPane.setAlignment(hbox, Pos.CENTER);
        return mainPane;
    } 
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
