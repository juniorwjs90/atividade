package entities;

public class PessoaFisica extends Pessoa{

    private Double gastoComSaude;

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastoComSaude) {
        super(name, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public Double imposto() {
        Double desconto = 0.0;
        Double imposto = 0.0;
        if (getRendaAnual() < 20000.0){
            imposto = getRendaAnual() * 0.15;
        }
        if(getRendaAnual() >= 20000.0){
            imposto = getRendaAnual() * 0.25;
        }
        if (gastoComSaude > 0){
            desconto = getGastoComSaude() * 0.50;
        }
        return imposto - desconto;
    }
}
