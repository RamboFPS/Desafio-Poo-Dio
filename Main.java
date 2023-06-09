import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);
      
      
        
   

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição do Curso de JS");
        curso2.setCargaHoraria(4);
      

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());
      
        
      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");  
      bootcamp.setDescricao("Descrição do Bootcamp Java");
      bootcamp.getConteudos().add(curso1);  
      bootcamp.getConteudos().add(curso2);  
      bootcamp.getConteudos().add(mentoria); 
   
       

      Dev devJones = new Dev();
      devJones.setNome("Jones");
      devJones.inscreverBootcamp(bootcamp);
      System.out.println("Conteúdos inscritos Jones: " + devJones.getConteudosInscritos());
      devJones.progredir();
      
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
      System.out.println("Conteúdos Concluidos Jones: " + devJones.getConteudosConcluidos());
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
      System.out.println("Conteúdos inscritos Jones após Atualizar Sistema: " + devJones.getConteudosInscritos());
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
      System.out.println("XP = " + devJones.calcularTotalXp());
      bootcamp.atualizarPorcentagemConcluida();
      System.out.println("Porcentagem concluída do bootcamp: " + bootcamp.getPorcentagemConcluida() + "%");
      
      
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ==========> ==========> ");
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ==========> ==========> ");


      Dev devCamila = new Dev();    
      devCamila.setNome("Camila");
      devCamila.inscreverBootcamp(bootcamp);
      System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
      devCamila.progredir(); 
      devCamila.progredir(); 
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
      System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
      System.out.println("Conteúdos inscritos Camila após Atualizar Sistema: " + devCamila.getConteudosInscritos());
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
      System.out.println("XP = " + devCamila.calcularTotalXp ());
      bootcamp.atualizarPorcentagemConcluida();
      System.out.println("Porcentagem concluída do bootcamp: " + bootcamp.getPorcentagemConcluida() + "%");
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
      System.out.println("==========> ==========> ==========> ==========>==========> ==========> ==========> ");
    }
    
    
}
