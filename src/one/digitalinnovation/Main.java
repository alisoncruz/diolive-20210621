package one.digitalinnovation;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setCargaHoraria(8);

        Curso cursoNet = new Curso();
        cursoJava.setTitulo(".NET");
        cursoJava.setCargaHoraria(8);

        Curso cursoJavaAvancado = new Curso();
        cursoJava.setTitulo("Java Avançado");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orientacao a Objetos com Java");
        mentoria.setDescricao("Imersão sobre os pilares da Orientação a Objetos");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setDataInicio(LocalDate.now());
        bootcamp.setDataFim(bootcamp.getDataInicio().plusDays(45));
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJava, cursoJavaAvancado, mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev alison = new Dev();
        alison.setNome("Alison");

        Dev fred  = new Dev();
        fred.setNome("Fred");

        alison.inscrever(bootcamp);

        fred.inscrever(bootcamp);

        alison.progredir();
        alison.progredir();
        alison.progredir();


        fred.progredir();


        System.out.printf("XP de Alison %.2f \n", alison.calcularTotalXP());
        System.out.printf("XP de Fred %.2f \n", fred.calcularTotalXP());

        List<Dev> ranking = Arrays.asList(fred,alison).stream()
                .sorted((dev1,dev2) -> Double.compare(dev1.calcularTotalXP(), dev2.calcularTotalXP())).
                        collect(Collectors.toList());

        ranking.stream().forEach(dev -> System.out.println(dev.getNome()));




    }
}
