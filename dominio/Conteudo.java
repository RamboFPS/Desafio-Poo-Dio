package dominio;

public  abstract class Conteudo {

      protected static final double XP_PADRAO = 10d;

      private String titulo;
      private String descricao;

      public abstract Double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDestricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
