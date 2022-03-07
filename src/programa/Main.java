package programa;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJullian = new Dev();
        devJullian.setNome("Jullian");
        devJullian.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jullian:" + devJullian.getConteudosInscritos());
        devJullian.progredir();
        devJullian.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jullian:" + devJullian.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jullian:" + devJullian.getConteudosConcluidos());
        System.out.println("XP:" + devJullian.calcularTotalXp());

        System.out.println("-------");

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bruna:" + devBruna.getConteudosConcluidos());
        System.out.println("XP:" + devBruna.calcularTotalXp());

    }

}