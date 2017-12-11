/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Higor Alves
 */
public class Locacao implements Model, Comparable<Locacao>{
    private Filme filme;
    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Filme getFilme() {
        return filme;
    }

    @Override
    public int compareTo(Locacao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean equals(Object o){
        if (o instanceof Locacao){
            return cliente.equals(((Locacao) o).getCliente()) && filme.equals(((Locacao)o).getFilme());
        }
        return false;
    }
}
