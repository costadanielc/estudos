package Aula_02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        String usuarioDigitado;
        String senhaDigitada;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        String opcaoMenu = null;
        String opcaoSubMenu = null;

        //Variáveis de Lista
        List<Coordenador> coordenadores= new ArrayList<>();
        List<Gerente> gerentes = new ArrayList<>();


        //Login
        System.out.println("Digite o usuario: ");
        usuarioDigitado = scan.next();
        System.out.println("Digite a senha: ");
        senhaDigitada = scan.next();

        Usuario usuario = new Usuario();

        if(usuarioDigitado.equals(usuario.getNome()) && senhaDigitada.equals(usuario.getSenha())){
            System.out.println("Usuario logado!");

            while(continuar){
                System.out.println("MENU - Digite a opção desejada");
                System.out.println("1    - CADASTRAR COORDENADOR");
                System.out.println("2    - CADASTRAR GERENTE");
                System.out.println("3    - SAIR");
                opcaoMenu = scan.next();

                if(opcaoMenu.equals("1") || opcaoMenu.equals("2") || opcaoMenu.equals("3")){

                    switch(opcaoMenu){
                        case "1":
                            Coordenador coordenador = new Coordenador();
                            System.out.println("Nome do coordenador: ");
                            coordenador.setNome(scan.next());
                            System.out.println("CPF: ");
                            coordenador.setCpf(scan.next());
                            System.out.println("Salário: ");
                            coordenador.setSalario(scan.nextDouble());
                            System.out.println("Loja: ");
                            coordenador.setLoja(scan.next());
                            System.out.println("Meta da Loja: ");
                            coordenador.setMetaDaLoja(scan.nextDouble());
                            coordenadores.add(coordenador);

                            System.out.println("SUB_MENU - Digite a opção desejada");
                            System.out.println("1    - CADASTRAR NOVO COORDENADOR");
                            System.out.println("2    - LISTAR COORDENADORES CADASTRADOS");
                            System.out.println("3    - SAIR");
                            opcaoSubMenu = scan.next();

                            if(opcaoSubMenu.equals("1") || opcaoSubMenu.equals("2") || opcaoSubMenu.equals("3")){
                                switch(opcaoSubMenu){
                                    case "1":
                                    Coordenador coordenador2 = new Coordenador();
                                    System.out.println("Nome do coordenador: ");
                                    coordenador2.setNome(scan.next());
                                    System.out.println("CPF: ");
                                    coordenador2.setCpf(scan.next());
                                    System.out.println("Salário: ");
                                    coordenador2.setSalario(scan.nextDouble());
                                    System.out.println("Loja: ");
                                    coordenador2.setLoja(scan.next());
                                    System.out.println("Meta da Loja: ");
                                    coordenador2.setMetaDaLoja(scan.nextDouble());
                                    coordenadores.add(coordenador2);
                                    
                                    break;

                                    case "2":
                                    for (Coordenador coordenadorItem : coordenadores) {
                                        System.out.println("*************************************************************");
                                        System.out.println("Nome do coordeador: " + coordenadorItem.getNome());
                                        System.out.println("Salário do coordeador: " + coordenadorItem.getSalario());
                                        System.out.println("CPF do coordeador: " + coordenadorItem.getCpf());
                                        System.out.println("Loja do coordeador: " + coordenadorItem.getLoja());
                                        System.out.println("Meta Loja do coordeador: " + coordenadorItem.getMetaDaLoja());
                                        System.out.println("*************************************************************");
                                        
                                    }

                                    break;

                                    case "3":
                                        System.out.println("Programa encerrado");
                                        continuar = false;
                                        break;

                                }

                            } else{
                                System.out.println("Opção digitada é inválida");
                            }



                            break;

                        case "2":

                            Gerente gerente = new Gerente();

                            System.out.println("Nome do gerente: ");
                            gerente.setNome(scan.next());
                            System.out.println("CPF: ");
                            gerente.setCpf(scan.next());
                            System.out.println("Salário: ");
                            gerente.setSalario(scan.nextDouble());
                            System.out.println("Regional: ");
                            gerente.setRegional(scan.next());
                            System.out.println("Meta da Regional: ");
                            gerente.setMetaRegional(scan.nextDouble());

                            break;

                        case "3":
                            continuar = false;

                            break;
                    }

            }

            System.out.println("*************************************************************");
            System.out.println("Nome do gerente: " + gerente.getNome());
            System.out.println("Salário do gerente: " + gerente.getSalario());
            System.out.println("CPF do gerente: " + gerente.getCpf());
            System.out.println("Regional do gerente: " + gerente.getRegional());
            System.out.println("Meta Regional do gerente: " + gerente.getMetaRegional());
            System.out.println("*************************************************************");


        }
            } else{
                System.out.println("Login Inválido");
        }

    }
    
}
