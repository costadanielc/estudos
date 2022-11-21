package Aula_01;

public class Desafio {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Daniel Costa", "12345678911");
        aluno.setTurma("Acelera Senior");
        aluno.setAdvertencia("Aluno sem advertências");
        
        Professor professor = new Professor("Luciano", "22222222222");
        professor.setSalario(15000.99);
        professor.setDisciplina("Java");

        System.out.println("Nome do aluno: " + aluno.getNomeCompleto());
        System.out.println("CPF do aluno: " + aluno.getCpf());
        System.out.println("Turma do aluno: " + aluno.getTurma());
        System.out.println("Advertências do aluno: " + aluno.getAdvertencia());

        System.out.println("Nome do professor: " + professor.getNomeCompleto());
        System.out.println("CPF do professor: " + professor.getCpf());
        System.out.println("Salário do professor: " + professor.getSalario());
        System.out.println("Disciplina:  " + professor.getDisciplina());
        
    }
    
}
