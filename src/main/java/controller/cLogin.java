/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.mLogin;

/**
 *
 * @author TAQI TALENTA
 */
public class cLogin {
    mLogin data = new mLogin();
    
    
    public cLogin() {
        data.user="user";
        data.password="benar";
    }
    
    public boolean cekLogin (String user, String password) {
        if (data.user.equals(user)&&data.password.equals(password))
            return true;
        else
            return false;
    }
    
}
