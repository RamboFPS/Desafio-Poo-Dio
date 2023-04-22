package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    
    private LocalDate data;

    @Override
    public Double calcularXp() {
        return XP_PADRAO + 20d;
        
    }

    

   
    public Mentoria(){

    }
    
    
    public LocalDate getData() {
        return data;
    }
    @Override
    public String toString() {
        return "Mentoria Titulo = '" + getTitulo() + "', Descricao = '" + getDestricao() + "', Data = '" + data + "'}";
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    
        
    }


    

