
package ProjetoVideo;


public class Gafanhoto extends Pessoa{
    
    //Atributos
    private String login;
    private int totAssistido;

    
    // metódo Construtor 
    public Gafanhoto(String login, int totAssistido, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }


    
    //Método
    public void viuMaisUm(){
    this.setTotAssistido(this.getTotAssistido() + 1);
    
    }
    
  
    
    //Metódos Acessores
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    
    //toString
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    
    
    
}
