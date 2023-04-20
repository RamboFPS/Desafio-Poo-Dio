import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
        System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição do Curso de JS");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);
        System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
        
        
    }
    
}
