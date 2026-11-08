package E1;
public class Professor extends Usuario{
    private String siape;
    private String titulacao;

    public Professor(String nome, String email, String senha, String siape, String titulacao) {
        super(nome, email, senha);
        this.siape = siape;
        this.titulacao = titulacao;
    }

    public String getSiape(){
        return this.siape;
    }
    public String getTitulacao(){
        return this.titulacao;
    }

    @Override 
    public String toString(){
        return "Professor{nome='" + getNome() + "', siape='" + siape + "', titulacao='" + titulacao + "'}";
    }

}    