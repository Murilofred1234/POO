import java.time.LocalDate;
import java.util.Currency;

import dominio.Curso;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descricao curso java");
        curso.setCargaHoraria(8);


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Descricao curso js");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("decrição java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);


    }
}
