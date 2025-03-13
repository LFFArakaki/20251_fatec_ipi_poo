class LivroDeNotas{

    private String nomeDaDisciplina;

    public LivroDeNotas(String nomeDaDisciplina){
        this.setNomeDaDisciplina(nomeDaDisciplina);
    }

    public void setNomeDaDisciplina(String nomeDaDisciplina){
        if(nomeDaDisciplina.len() >= 3)
        {
            this.nomeDaDisciplina = nomeDaDisciplina;
        }
    }
    public String getNomeDaDisciplina(){
        return nomeDaDisciplina;
    }
    public void exibirMensagem(){
        System.out.println("Bem vindo ao livro de " + nomeDaDisciplina);
    }
}