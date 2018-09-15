package extras;
import javax.swing.JOptionPane;
public class DataValidation{
    public int string2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error al hacer la operacion");
            result = 0;
        }
        return result;
    }
   public float string2Float(String value){
       float result = 0.0f;
       try{
           result = Float.parseFloat(value);
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error al hacer la operacion");
           result = 0;
       }
       return result;
   }
   public float string2Double(String value){
       double result = 0;
       try{
           result = Double.parseDouble(value);
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error al hacer la operacion");
           result = 0;
       }
       return (float) result;
   }
   
}

