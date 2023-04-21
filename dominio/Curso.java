package dominio;

/**
 * Curso
 */
public class Curso extends Conteudo {

    
    int cargaHoraria;

    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria;
        
    }   
    
    
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Titulo = '" +  getTitulo() + "', Descricao = '" + getDestricao() + "', cargaHoraria = '" + cargaHoraria + "'}";
    }
    
}