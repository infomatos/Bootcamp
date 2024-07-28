import br.com.dio.desafio.dominio.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conteudo curso = new Curso();
        curso.setTitulo("POO");
        curso.setDescricao("Primeiros passos em POO e lógica");
        ((Curso) curso).setCargaHoraria(20);

        Conteudo curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Olá, mundo!");
        ((Curso) curso2).setCargaHoraria(40);

        Conteudo mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria POO");
        mentoria.setDescricao("Mentoria da matéria de POO para alunos do primeiro ano.");
        ((Mentoria) mentoria).setData(LocalDate.now());
        System.out.println(mentoria);
        System.out.println("");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso de Java e POO - iniciante ao avançado");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElias = new Dev();
        devElias.setNome("Elias Matos");
        devElias.inscreverBootcamp(bootcamp);
        Dev devCamila = new Dev();
        devCamila.setNome("Camila Veras Motta");
        devCamila.inscreverBootcamp(bootcamp);

        //Imprimir conteúdos inscritos

        System.out.println("Consteúdos inscritos: " + devElias.getConteudosInscritos());
        System.out.println("------------------------------------------\n");
        //Progredir
        devCamila.progredir();
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devElias.progredir();
        devCamila.progredir();
        System.out.println("---------------------------------------------\n");
        System.out.println("Conteúdos inscritos de Camila: \n" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos inscritos de Elias: \n" + devElias.getConteudosInscritos());
    }
}