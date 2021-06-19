/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ahemd M. Abd El-Ghany
 */
public class Finals extends Application {
    Scene mainScene;
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        
        Text tx = new Text(50, 50, "Java");
        Button btContent = new Button("Test");
        btContent.setContentDisplay(ContentDisplay.RIGHT);
        mainScene = new Scene(root, 570, 320);


        root.getChildren().add(btContent);

        btContent.setOnAction(e -> {System.out.println("btOk clicked!");});

        primaryStage.setTitle("Testing");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    
    
    class btOkHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            System.out.println("btOk clicked");
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
