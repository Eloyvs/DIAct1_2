/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.diact1_2;

/**
 *
 * @author eloyvs
 */
public class Alumno {

        private String nombre;
        private String apellidos;
        private String email;
        private int edad;
        private String telefono;
        private static String joven = "";
        private static int menorEdad = 1000;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static String getJoven() {
        return joven;
    }

    public static void setJoven(String joven) {
        Alumno.joven = joven;
    }

    public static int getMenorEdad() {
        return menorEdad;
    }

    public static void setMenorEdad(int menorEdad) {
        Alumno.menorEdad = menorEdad;
    }
    
    
        
    public Alumno (){}
    
    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
            if(this.edad < menorEdad){
                joven = this.nombre + this.apellidos;
                menorEdad = this.edad;
            }

    }

    public Alumno(String nombre, String apellidos, String email, int edad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
            if(this.edad < menorEdad){
                joven = this.nombre + " " + this.apellidos;
                menorEdad = this.edad;
            }
    }
    
    public boolean compEdad(Alumno c){
        boolean mayor;
        
        if (c.getEdad() >= 18) mayor = true;
        
        else mayor = false;
        
        return mayor;
    }
    
    
}
