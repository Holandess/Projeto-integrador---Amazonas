/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;

/**
 *
 * @author guilherme
 */
public class UsuarioController {
    
        public static boolean Logar(String usuario, String senha) {
            return UsuarioDAO.logar(usuario, senha);
        }
    
}
