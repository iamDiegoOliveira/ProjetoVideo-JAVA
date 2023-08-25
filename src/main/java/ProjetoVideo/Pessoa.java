
package ProjetoVideo;


public abstract class  Pessoa {
    
    protected String nome, sexo;
    protected int idade, experiencia;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }
    
    
    
    
    
    
    
    
    
    protected void ganharExp(int experiencia){
    this.setExperiencia(this.getExperiencia() + experiencia);
        System.out.println("Você ganhou experiência, agora é: " + this.getExperiencia());
    
    }
    
    
    
    
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", experiencia=" + experiencia + '}';
    }
    
    
    
    
}
