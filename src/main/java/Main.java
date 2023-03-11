import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //a palavra new instancia a classe Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        /*
        Polimorfismo: criar um curso a partir de conteúdo
        tudo que tem dentro de curso, tem dentro de conteúdo, mas não necessariamente funciona o contrário
        Conteudo conteudo = new Curso();
         */

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKauan = new Dev();
        devKauan.setNome("Kauan");
        devKauan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Daniela" + devKauan.getConteudosInscritos());
        devKauan.progredir();
        devKauan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Daniela" + devKauan.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos concluídos de Daniela" + devKauan.getConteudosConcluidos());
        System.out.println("XP: " + devKauan.calcularTotalXp());



        System.out.println("----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de João" + devJoao.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos concluídos de João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
