package abertoEFechadoCerto;

public class Quadrado implements Forma{
    private double lado;
    

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void desenhar() {
        //metódo para desenhar o quadrado
        
    }
    
}
