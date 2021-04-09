/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinhaDeCodigo;

import Interfaces.TelaDeCadastro;
import javax.swing.JFrame;

/**
 *
 * @author SESI_SENAI
 */
public class ToDoList {

    public static JFrame login;
    public static JFrame home;
    
    public static void main(String[] args) {
        login = new TelaDeCadastro();
        login.setVisible(true);
    }
    
}
