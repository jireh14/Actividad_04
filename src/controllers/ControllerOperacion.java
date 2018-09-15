
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelOperacion;
import views.ViewOperacion;
import extras.DataValidation;

public class ControllerOperacion implements ActionListener{
    ModelOperacion modelOperacion;
    ViewOperacion viewOperacion;
    DataValidation dataValidation = new DataValidation();

    public ControllerOperacion(ModelOperacion modelOperacion, ViewOperacion viewOperacion) {
        this.modelOperacion = modelOperacion;
        this.viewOperacion = viewOperacion;
        this.viewOperacion.jB_suma.addActionListener(this);
        this.viewOperacion.jB_resta.addActionListener(this);
        this.viewOperacion.jB_multiplicacion.addActionListener(this);
        this.viewOperacion.jB_division.addActionListener(this);
        this.viewOperacion.jB_modulo.addActionListener(this);
        InitComponets();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == viewOperacion.jB_suma){ 
           jb_suma_action_performed();
       }
       if(e.getSource() == viewOperacion.jB_resta){
           jb_resta_action_performed();     
       }
       if(e.getSource() == viewOperacion.jB_multiplicacion){ 
           jb_multiplicacion_action_performed();
       }
       if(e.getSource() == viewOperacion.jB_division){ 
           jb_division_action_performed();
       }
       if(e.getSource() == viewOperacion.jB_modulo){ 
           jb_modulo_action_performed();
       }
    }
    
    private void jb_suma_action_performed(){
        modelOperacion.setNumero_uno(dataValidation.string2Float(viewOperacion.jTF_numero_uno.getText()));
        modelOperacion.setNumero_dos(dataValidation.string2Float(viewOperacion.jTF_numero_uno.getText()));
        modelOperacion.suma();
        viewOperacion.jL_resultado.setText(String.valueOf(modelOperacion.getResultado()));
        
    }
    private void jb_resta_action_performed(){
        modelOperacion.setNumero_uno(Float.parseFloat(viewOperacion.jTF_numero_uno.getText()));
        modelOperacion.setNumero_dos(Float.parseFloat(viewOperacion.jTF_numero_dos.getText()));
        modelOperacion.resta();
        viewOperacion.jL_resultado.setText(String.valueOf(modelOperacion.getResultado()));
    }
    private void jb_multiplicacion_action_performed(){
        modelOperacion.setNumero_uno(Float.parseFloat(viewOperacion.jTF_numero_uno.getText()));
        modelOperacion.setNumero_dos(Float.parseFloat(viewOperacion.jTF_numero_dos.getText()));
        modelOperacion.multiplicacion();
        viewOperacion.jL_resultado.setText(String.valueOf(modelOperacion.getResultado()));
    }
    private void jb_division_action_performed(){
        modelOperacion.setNumero_uno(Float.parseFloat(viewOperacion.jTF_numero_uno.getText()));
        modelOperacion.setNumero_dos(Float.parseFloat(viewOperacion.jTF_numero_dos.getText()));
        modelOperacion.division();
        viewOperacion.jL_resultado.setText(String.valueOf(modelOperacion.getResultado()));
    }
    private void jb_modulo_action_performed(){
        modelOperacion.setNumero_uno(Float.parseFloat(viewOperacion.jTF_numero_uno.getText()));
        modelOperacion.setNumero_dos(Float.parseFloat(viewOperacion.jTF_numero_dos.getText()));
        modelOperacion.modulo();
        viewOperacion.jL_resultado.setText(String.valueOf(modelOperacion.getResultado()));
    }
   
    private void InitComponets(){
        viewOperacion.setVisible(true);
        viewOperacion.jTF_numero_uno.setText(String.valueOf(modelOperacion.getNumero_uno()));
        viewOperacion.jTF_numero_dos.setText(String.valueOf(modelOperacion.getNumero_dos()));
    }
}

