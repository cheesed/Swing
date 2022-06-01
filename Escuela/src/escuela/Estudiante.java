/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author info7
 */
public class Estudiante {
    String id;
    String nombre;
    String curso;
    String especialidad;

    /*La finalidad de un constructor es inicializar el objeto y sirve para 
    asegurarnos que los objetos siempre contengan valores válidos.*/
    
    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String curso, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.especialidad = especialidad;
    }
    
    /*Setters: Sirve para asignar un valor inicial a un atributo, pero de forma explícita.
      Getters:  Sirve para obtener (recuperar o acceder) el valor ya asignado a un
      atributo y utilizarlo para cierto método.
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
