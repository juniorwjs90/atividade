package entities;

public  abstract class Pessoa {

    private String name;
    private Double rendaAnual;

    public String getName(){
        return name;
    }
    public Double getRendaAnual(){
        return rendaAnual;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRendaAnual(Double rendaAnual){
        this.rendaAnual = rendaAnual;
    }
    public Pessoa(String name, Double rendaAnual){
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString(){
        return String.format("%s: $ %.2f", name, imposto());
    }

    public abstract Double imposto();
}
