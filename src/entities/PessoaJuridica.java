package entities;

public class PessoaJuridica extends Pessoa{

    private Integer funcionarioNumb;

    public PessoaJuridica(String name, Double rendaAnual, Integer funcionariosNumb) {
        super(name, rendaAnual);
        this.funcionarioNumb = funcionariosNumb;
    }

    @Override
    public Double imposto() {
        double imposto;
        if (funcionarioNumb <= 10) {
            imposto = getRendaAnual() * 0.16;
        }
        else{
            imposto = getRendaAnual() *0.14;
        }
        return imposto;
    }
}
