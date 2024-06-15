/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author TAQI TALENTA
 */
public class mLogin {

    public String user;
    public String password;
    
    public Object[] toArray(){
        Object[] data = new Object[2];
        data[0]=user;
        data[1]=password;
        return data;
    }
}
