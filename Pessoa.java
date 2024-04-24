public class Pessoa {

    String nome;
    int idade;
    String cargo;

    public Pessoa(){}

    public Pessoa(String nome, int idade, String cargo) {

        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {

        return idade;

    }

    public void setIdade(int idade) {

        this.idade = idade;

    }

    public String getCargo() {

        return cargo;

    }

    public void setCargo(String cargo) {

        this.cargo = cargo;

    }
    
    @Override
    public String toString() {

        return "FUNCIONÁRIO\nNome: " + nome + "\nIdade: " + idade + "\nCargo: " + cargo;

    }

}