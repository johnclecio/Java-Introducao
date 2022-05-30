

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraia(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraia(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos John" + devJohn.getConteudosInscritos());
        devJohn.progredir();
        System.out.println("---------------");
        System.out.println("Conteúdos Inscritos John" + devJohn.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos John" + devJohn.getConteudosConcluidos());
        System.out.println("XP:" + devJohn.calcularTotalXp());
        System.out.println("35% Concluido");
        System.out.println("---------------");

        Dev devClecio = new Dev();
        devClecio.setNome("Clecio");
        devClecio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Clecio" + devClecio.getConteudosInscritos());
        devClecio.progredir();
        devClecio.progredir();
        devClecio.progredir();
        System.out.println("---------------");
        System.out.println("Conteúdos Inscritos Clecio" + devClecio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos John" + devClecio.getConteudosConcluidos());
        System.out.println("XP:" + devClecio.calcularTotalXp());
        System.out.println("100% Concluido");
    }
}
