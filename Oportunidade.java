public class Oportunidade {
    
    private String titulo;
    private int vagas = 1;
    private int classificados = 0;
    private boolean aberta = true;
    private Professor responsavel;


    public Oportunidade(String titulo, int vagas, int classificados, boolean aberta, Professor responsavel) {
        if (vagas < 1){
            this.vagas = 1;
        }
        this.titulo = titulo;
        this.vagas = vagas;
        this.classificados = classificados;
        this.aberta = aberta;
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

    public void inscrever(estudante){
        if (aberta == true){

        }

    }

    public void registrarClassificacao(){
        if (classificados < vagas ){
            
        }
    }
}
