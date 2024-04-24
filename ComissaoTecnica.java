public class ComissaoTecnica extends Pessoa {

    String funcao;
    int tempContrato;
    float salario;

    public ComissaoTecnica() {}

    public ComissaoTecnica(String nome, int idade, String cargo, String funcao, int tempContrato, float salario) {

        super(nome, idade, cargo);
        this.funcao = funcao;
        this.tempContrato = tempContrato;
        this.salario = salario;

    }

    public String getFuncao() {

        return funcao;

    }

    public void setFuncao(String funcao) {

        this.funcao = funcao;

    }

    public int getTempContrato() {

        return tempContrato;

    }

    public void setTempContrato(String tempContrato) {

        this.tempContrato = tempContrato;

    }

    public float getSalario() {

        return salario;

    }

    public void setSalario(String salario) {

        this.salario = salario;

    }

    @Override
    public String toString() {

        return super.toString() + "\nFunção: " + funcao + "\nTempo de Contrato(anos): " + tempContrato +
        "\nSalário: R$" + salario;

    }

}