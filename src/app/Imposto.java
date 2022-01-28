package app;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Double valorTotalImposto = 0.0;

        System.out.print("Coloque o número de pessoas para cadastro: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Pessoa #"+ (i+1));
            System.out.print("Essa pessoa é fisica ou juridica? (f/j): ");
            char option = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Nome: ");
            String name = scan.nextLine();
            System.out.print("Renda anual: ");
            Double renda = scan.nextDouble();
            if (option == 'f') {
                System.out.print("Quanto você gastou com saúde?: ");
                Double gastoSaude = scan.nextDouble();
                pessoas.add(new PessoaFisica(name,renda,gastoSaude));
            }
            else {
                System.out.print("Informe a quantidade de funcionários: ");
                int qtdFuncionario = scan.nextInt();
                pessoas.add(new PessoaJuridica(name, renda, qtdFuncionario));
            }
        }
        System.out.println();
        System.out.println("Impostos pagos");
        for (Pessoa pessoa:pessoas) {
            System.out.println(pessoa);
            valorTotalImposto += pessoa.imposto();
        }
        System.out.println();
        System.out.printf("Valor total pago de impostos: $ %.2f", valorTotalImposto);

        scan.close();

    }
}
