package InversaoDeDependenciaCerto;

public class Sistema {
    private BancoDeDados bancoDeDados;
    
    public Sistema(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }
    
    public void salvarDadosNoBanco(String dados) {
        bancoDeDados.salvarDados(dados);
    }
}