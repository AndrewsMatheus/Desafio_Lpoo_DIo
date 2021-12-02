import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1= new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso básico de Java");
        curso1.setCargaHoraria(92);

        Mentoria mentoria1= new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria para tirar dúvidas sobre o curso de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}
