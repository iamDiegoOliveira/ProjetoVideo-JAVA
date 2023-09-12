
package ProjetoVideo;

public class App {


    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");
        

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Diego", 1, "diego", "M", 23);
        g[1] = new Gafanhoto("Tiago", 0, "Thiago", "M", 15);
        
        
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[1], v[2]);
        
        
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());
        
       
    }
}
