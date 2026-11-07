package E1;
public class Oportunidade {
    
    private String titulo;
    private int vagas = 1;
    private int classificados = 0;
    private boolean aberta = true;
    private Professor responsavel;


    public Oportunidade(String titulo, int vagas, Professor responsavel) {
        if (vagas < 1){
            this.vagas = 1;
        }
        this.titulo = titulo;
        this.vagas = vagas;
        this.responsavel = responsavel;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getVagas(){
        return this.vagas;
    }

    public int getClassificados(){
        return this.classificados;
    }

    public boolean  getAberta(){
        return this.aberta;
    }

    public Professor getResponsavel(){
        return this.responsavel;
    }

    public void encerrar(){
        this.aberta = false;
    }

    public Inscricao inscrever(Estudante estudante){
        if (aberta == true){
            System.out.println("Estudante Inscrito");
            Oportunidade p = new Oportunidade(this.titulo, this.vagas, this.responsavel);
            this.vagas--;
            return new Inscricao(estudante, p);
        }
        return null;
    }
    
    public boolean registrarClassificacao(){
        if (this.classificados < this.vagas ){
            this.classificados++;
            return true;
        }
        return false;
    }

    @Override 
    public String toString() {
        return "Oportunidade{" +
                "titulo='" + this.titulo + '\'' +
                ", vagas='" + this.vagas + '\'' +
                ", classificados='" + this.classificados + '\'' +
                ", aberta='" + this.aberta + '\'' +
                ", responsavel='" + this.responsavel.getNome() + '\'' +
                '}';
    }
}
