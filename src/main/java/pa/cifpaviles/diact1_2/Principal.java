/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.diact1_2;

import java.util.ArrayList;

/**
 *
 * @author eloyvs
 */
public class Principal {
   public static ArrayList <Alumno> alumnos = new ArrayList <Alumno>();
  public static void main(String[] args) {
        FrmFormulario formu = new FrmFormulario();
        formu.setVisible(true);
        Alumno alu = new Alumno();
    }
  
  public static void anadirAlumno(Alumno alu){
      for(int i = 0; i > 5; i++){
          alumnos.add(alu);
      }
  }

}
