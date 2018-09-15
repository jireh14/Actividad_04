
package models;

public class ModelOperacion {
    private float Numero_uno = 3.0f;
    private float Numero_dos = 2.8f;
    private float resultado = 0.0f;

    public float getNumero_uno() {
        return Numero_uno;
    }

    public void setNumero_uno(float Numero_uno) {
        this.Numero_uno = Numero_uno;
    }

    public float getNumero_dos() {
        return Numero_dos;
    }

    public void setNumero_dos(float Numero_dos) {
        this.Numero_dos = Numero_dos;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    public void suma(){
        resultado = Numero_uno + Numero_dos;
    }
    public void resta(){
        resultado = Numero_uno - Numero_dos;
    }
    public void multiplicacion(){
        resultado = Numero_uno * Numero_dos;
    }
    
        public void division(){
        resultado = Numero_uno / Numero_dos;
    }
        public void modulo(){
        resultado = Numero_uno % Numero_dos;
    }
}
