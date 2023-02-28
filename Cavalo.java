package substituicaoLiskovCerto;

public class Cavalo implements Animal{

    
    @Override
    public void mover() {
        System.out.println("Cavalo Anda");
        
    }

    @Override
    public void som() {
        System.out.println("Cavalo Relinchando");
        
    }
    
}
