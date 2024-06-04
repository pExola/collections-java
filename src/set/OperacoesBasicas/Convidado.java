package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;

    public Convidado(int codigoConvite, String nome) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "codigoConvite=" + codigoConvite +
                ", nome='" + nome + '\'' +
                '}';
    }
}
