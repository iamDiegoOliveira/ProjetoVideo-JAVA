
package ProjetoVideo;


public class Video implements AcoesVideo {
    
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
    }

    
    
    
    //Sobreposição dos metódos de AcoesVideo
    @Override
    public void play() {  
        this.setReproduzindo(true);
        if (this.reproduzindo == true) {
            System.out.println("Play no vídeo");
        } 
        
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
        if (this.reproduzindo == false) {
            System.out.println("Video em Pause");
        } 
    }

    @Override
    public void like() {
        this.curtidas = this.curtidas ++;
    }

    
    
    
    
    //Metódos Acessores
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        
        this.avaliacao = nova;
 
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "Video{" + "titulo= " + titulo + ", avaliacao= " + avaliacao + ", views= " + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }

   

    
}
