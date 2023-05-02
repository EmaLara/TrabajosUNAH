/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulario_emanuel;

/**
 *
 * @author crema
 */
class Usuarios{
    
    final private int Id;
    //final private String name;
    final private String nombre;
    final private String email;
    final private String contraseña;
    
    public Usuarios(int id,String nombre,String email,String contraseña){
        this.Id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    /*Usuarios(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
    public int getId(){
        return this.Id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getContraseña(){
        return this.contraseña;
    }
    
    
}
