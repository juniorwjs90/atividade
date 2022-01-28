package app;

import entities.Pessoa;
import entities.PessoaFisica;

public class Imposto {
    public static void main(String[] args){
        PessoaFisica pessoaFisica = new PessoaFisica("Carlos",50000.0, 2000.0);
        System.out.println(pessoaFisica);

    }
}
