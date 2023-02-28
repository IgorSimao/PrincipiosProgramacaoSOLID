package abertoEFechadoCerto;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    public void desenhar() {
        //metódo para desenhar o Circulo

    }
}