import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1= new Curso("Curso Java",
                "Curso básico de Java",
                92);
        Curso curso2= new Curso("Curso Ruby",
                "O básico sobre ruby e a famosa framework Ruby on Rails",
                80);

        Mentoria mentoria1= new Mentoria("Mentoria Java",
                "Mentoria para tirar dúvidas sobre o curso de java",
                LocalDate.now());

        Bootcamp bootcamp= new Bootcamp("Bootcamp java",
                "Intensivão de aprendizagem Java e frameworks!!");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev("João");
        Dev devMaria = new Dev("Maria");

        devJoao.inscreverBootcamp(bootcamp);
        devMaria.inscreverBootcamp(bootcamp);

        devJoao.progredir();

        System.out.println("--- DEVS ---");
        System.out.println("João: ");
        System.out.println("Xp atual: " + devJoao.calcularTotalXP());
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("Maria ");
        System.out.println("Xp atual: " + devMaria.calcularTotalXP());
        System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devMaria.getConteudosConcluidos());

    }
}
