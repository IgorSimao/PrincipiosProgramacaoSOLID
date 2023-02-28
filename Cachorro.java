package substituicaoLiskovCerto;

public class Cachorro implements Animal{

    @Override
    public void mover() {
        System.out.println("Cachorro Anda.");
    }

    @Override
    public void som() {
        System.out.println("Cachorro Latindo...");
    }
    
}
