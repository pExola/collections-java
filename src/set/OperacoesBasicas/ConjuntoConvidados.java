package set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(int codigoConvite, String nome) {
        convidadoSet.add(new Convidado(codigoConvite, nome));

    }

    public void removerPorCodigoConvite (int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return convidadoSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set convidados");

        conjuntoConvidados.adicionarConvidado(1, "Pedro");
        conjuntoConvidados.adicionarConvidado(2, "Pedrao");
        conjuntoConvidados.adicionarConvidado(2, "Pedrin");
        conjuntoConvidados.adicionarConvidado(4, "Pedroca");

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set convidados");

        conjuntoConvidados.removerPorCodigoConvite(2);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
