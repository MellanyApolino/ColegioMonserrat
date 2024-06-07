/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

public class Matricula {
    private ArrayList<Curso> cursos;

    public Matricula() {
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public boolean cursoExiste(String codigoCurso) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                return true;
            }
        }
        return false;
    }

    public String matricularAlumno(String codigoCurso, Alumno alumno) {
        if (!cursoExiste(codigoCurso)) {
            return "Curso no encontrado";
        }
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                curso.agregarAlumno(alumno);
                return "Alumno matriculado con éxito en el curso " + curso.getNombre();
            }
        }
        return "Error al matricular al alumno";
    }

    public String listarCursos() {
        StringBuilder lista = new StringBuilder("Cursos disponibles:\n");
        for (Curso curso : cursos) {
            lista.append(curso).append("\n");
        }
        return lista.toString();
    }
}
