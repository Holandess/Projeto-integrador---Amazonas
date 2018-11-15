/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Venda;

/**
 *
 * @author guilherme.gmonteiro3
 */
public class VendasDAO {
    
    public static boolean Salvar(Venda v)
    {
        return SimulaDB.getInstance().SalvarVenda(v);
    }
    
}
