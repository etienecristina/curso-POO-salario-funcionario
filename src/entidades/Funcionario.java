package entidades;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentoDeSalario(double porcentagem){
       //salarioBruto = (salarioBruto * (porcentagem/100)) + salarioBruto;
       salarioBruto = (salarioBruto * (1+(porcentagem/100)));
    }

    @Override
    public String toString() {
        return  nome
                +", $ "
                + String.format("%.2f", salarioLiquido());
    }
}
