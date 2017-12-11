/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JTextField;

/**
 *
 * @author Higor Alves
 */
public class Cliente extends Pessoa implements Comparable<Cliente>{
    @Override
    public int compareTo(Cliente o) {
        return id-o.getId();
    }
    
    public boolean equals(Object o){
        if (o instanceof Cliente){
            return nome.equalsIgnoreCase(((Cliente) o).getNome());
        }
        return false;
    }
}
