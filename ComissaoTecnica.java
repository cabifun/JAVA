public class ComissaoTecnica extends Pessoa {

    private int tempContrato;
    private float salario;
    

    public ComissaoTecnica() {}

    public ComissaoTecnica(String nome, int idade, String rc, String cargo, int tempContrato, float salario) {

        super(nome, idade, rc, cargo);
        this.tempContrato = tempContrato;
        this.salario = salario;
        

    }

    public int getTempContrato() {

        return tempContrato;

    }

    public void setTempContrato(int tempContrato) {

        this.tempContrato = tempContrato;

    }

    public float getSalario() {

        return salario;

    }

    public void setSalario(float salario) {

        this.salario = salario;

    }
    
    @Override
    public String toString() {

        return super.toString() + "\nTempo de Contrato(meses): " + tempContrato +
        "\nSalário: R$" + salario;

    }

   

}