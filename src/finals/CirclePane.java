/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Ahemd M. Abd El-Ghany
 */
public class CirclePane extends StackPane {
    
    private Circle circle;
    
    public CirclePane(){
       circle = new Circle(50);
       getChildren().add(circle);
       circle.setStroke(Color.BLACK);
       circle.setFill(Color.GREEN);
    }
    
    public void enlarge(){
        circle.setRadius(circle.getRadius() + 2);
    }
    
    public void shrink(){
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }
    
}
