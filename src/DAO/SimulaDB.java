/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author fernando.fernandes Padrão Singleton
 */
public class SimulaDB {

    private static SimulaDB mockdb;

    private ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    private ArrayList<Usuario> listaUsuarios; //Simulo a tabela Usuarios

    private SimulaDB() {

        listaClientes = new ArrayList<Cliente>();
        listaProdutos = new ArrayList<Produto>();
        listaUsuarios = new ArrayList<Usuario>();
        Usuario user = new Usuario("Vendedor", "1234", "Vendedor Guilherme", "guilhermevendas@teste.com.br");
        listaUsuarios.add(user);
        System.out.println(user.getEmail());
    }

    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }

        return mockdb;
    }

    public boolean SalvarCliente(Cliente c) {
        listaClientes.add(c);

        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return this.listaClientes;
    }

    public boolean AtualizarCliente(Cliente c) {
        for (Cliente item : listaClientes) {
            if (item.getId() == c.getId()) {
                item.setNome(c.getNome());
                item.setCpf(c.getCpf());
            }
        }

        return true;
    }

    public boolean ExcluirCliente(int i) {
        listaClientes.remove(i);

        return true;
    }

    public boolean SalvarProduto(Produto c) {
        listaProdutos.add(c);

        return true;
    }

    public ArrayList<Produto> getProdutos() {
        return this.listaProdutos;
    }

    public boolean AtualizarProduto(Produto p) {
        for (Produto item : listaProdutos) {
            // if (item.getId() == p.getId()) {
            //     item.setNome(p.getNome());
            //     item.setVlrUnitario(p.getVlrUnitario());
            // }
        }

        return true;
    }

    public boolean ExcluirProduto(int i) {
        listaProdutos.remove(i);

        return true;
    }

    public boolean SalvarUsuario(Usuario u) {
        listaUsuarios.add(u);

        return true;
    }

    public boolean logar(String usuario, String senha) {
        ArrayList<Usuario> usuarios = this.listaUsuarios;
        ArrayList<String[]> listaUsuarios = new ArrayList<>();

        boolean valid = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuario.equals(String.valueOf(usuarios.get(i).getLogin())) && senha.equals(String.valueOf(usuarios.get(i).getSenha()))) {
                valid = true;
            }
        }
        
        return valid;
        
    }

}
