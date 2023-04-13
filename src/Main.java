import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java Básico.");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Curso JS Básico.");
        curso2.setCargaHoraria(25);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Poo voltado ao Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();

        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Poo voltado ao Js");
        mentoria2.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);

    }
}