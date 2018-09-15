
package main;
import models.ModelOperacion;
import views.ViewOperacion;
import controllers.ControllerOperacion;

public class Main {
    private static ViewOperacion viewOperacion;
    private static ModelOperacion modelOperacion;
    private static ControllerOperacion controllerOperacion;
  
    public static void main(String[] args) {
        ModelOperacion modelOperacion = new ModelOperacion();
        ViewOperacion viewOperacion = new ViewOperacion();
        ControllerOperacion controllerOperacion = new ControllerOperacion(modelOperacion, viewOperacion);
    }
    
}
