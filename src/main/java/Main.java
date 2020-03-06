import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int op = -1;

        Scanner scan = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<String>();

        do{
            System.out.println("Digite 0 para finalizar ou 1 para cadastrar!");
            try{
                op = Integer.parseInt(scan.nextLine());
            }catch (Exception e){
                op = -1;
            }

            switch (op){
                case 0:
                    System.out.println("Exibindo nomes...");
                    for ( String aluno: alunos) {
                        System.out.println(aluno);
                    }

                    break;
                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    String aluno = scan.nextLine();
                    if(alunos.contains(aluno)){
                        System.out.println("Aluno já cadastrado");
                    } else {
                        alunos.add(aluno);
                        System.out.println("Aluno adicionado com sucesso!");
                    }
                    break;

                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }while(op != 0);
    }

}
