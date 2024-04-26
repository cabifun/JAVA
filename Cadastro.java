import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Pessoa> listaColaboradores;

    public Cadastro(){
        listaColaboradores = new ArrayList<>();
    }

    public  void cadastrar(Pessoa p){
        listaColaboradores.add(p);
    }
    public  void cadastrar(Atleta a){
        listaColaboradores.add(a);
    }
    public  void cadastrar(DepartamentoMedico d){
        listaColaboradores.add(d);
    }
    public  void cadastrar(FuncionariosGeral f){
        listaColaboradores.add(f);
    }
    public  void cadastrar(ComissaoTecnica c){
        listaColaboradores.add(c);
    }
    public  List<Pessoa> getListaColaboradores() {
        return listaColaboradores;
    }


    public void procurar(String rc){

        boolean encontrado = false;
        for (Pessoa i : listaColaboradores) {
            if (i.getRc().equals(rc)) {
                System.out.println("Funcionário encontrado!\n" + i.toString());
                encontrado = true;
                return;
            }

        }

        if (!encontrado) {
            System.out.println(rc + " não encontrado.");
        }
    }
    
    public void listarTodos(){

        if (listaColaboradores.isEmpty()) {
            System.out.println("Ainda não há funcionários cadastrados");
        }else {
            for (Pessoa p : listaColaboradores) {
                System.out.println(p.toString());
            }
        }
    }


    public void exlcuirColaborador(List<String> lista, String nome) {

        boolean removido = false;
        for (Pessoa pessoa : listaColaboradores) {
            if (pessoa.getRc().equals(rc)) {
                listaColaboradores.remove(rc);
                System.out.println("Funcionário '" + rc + "' removido com sucesso.");
                removido = true;
                return;
            }
        }
        if (!removido) {
            System.out.println("'" + rc + "' não está presente na lista.");
        }

    }
    
    public void excluirTudo(){
        listaColaboradores.removeAll(listaColaboradores);
    }
}
