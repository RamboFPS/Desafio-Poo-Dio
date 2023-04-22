package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private boolean conclusao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new  HashSet<>();
    private int porcentagemConcluida = 0;
    
    
    
    public void atualizarPorcentagemConcluida() {
        int totalConteudos = conteudos.size();
        int totalConteudosConcluidos = 0;

        for (Conteudo conteudo : conteudos) {
            for (Dev dev : devsInscritos) {
                if (dev.getConteudosConcluidos().contains(conteudo)) {
                    totalConteudosConcluidos++;
                    break;
                }
            }
        }

        porcentagemConcluida = (int) ((double) totalConteudosConcluidos / totalConteudos * 100);
    }
    
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public boolean isConclusao() {
        return conclusao;
    }

    public double getPorcentagemConcluida() {
        return porcentagemConcluida;
    }

    

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (conclusao ? 1231 : 1237);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (conclusao != other.conclusao)
            return false;
        return true;
    }

    public void conclusao() {
        int totalConteudos = conteudos.size();
        int conteudosConcluidos = 0;
        for (Conteudo conteudo : conteudos) {
            if (conteudo.isConcluido()) {
                conteudosConcluidos++;
            }
        }
        if (conteudosConcluidos >= (totalConteudos * 2) / 3) {
            this.conclusao = true;
        }else {
            this.conclusao = false;
    }
}
}