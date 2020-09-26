package Colegio;

public class Colegio {

    public static void main(String[] args) {

        // a) CREANDO MATERIAS
        Materia ingles1 = new Materia(101, "Inglés I", 1);
        Materia mate1 = new Materia(111, "Matemática", 1);
        Materia lab1 = new Materia(121, "Laboratorio I", 1);

        // b) CREANDO ALUMNOS
        Alumno alumno1 = new Alumno(1001, "López", "Martín");
        Alumno alumno2 = new Alumno(1002, "Martínez", "Brenda");

        // c) INSCRIBIENDO A LOPEZ EN 3 MATERIAS
        alumno1.agregarMateria(lab1);
        alumno1.agregarMateria(mate1);
        alumno1.agregarMateria(ingles1);

        // d) INSCRIBIENDO A MARTINEZ EN 4 MATERIAS
        alumno2.agregarMateria(lab1);
        alumno2.agregarMateria(mate1);
        alumno2.agregarMateria(ingles1);

        Materia lab1_clon = new Materia(121, "Laboratorio I", 1);
        System.out.println("lab1 es igual a lab1_clon? "
                + lab1.equals(lab1_clon));

        alumno2.agregarMateria(lab1_clon);

        // e) VISUALIZANDO CANT MATERIAS DE CADA ALUMNO
        System.out.println("Cantidad materias de López: "
                + alumno1.cantidadMaterias());
        System.out.println("Cantidad materias de Martínez: "
                + alumno2.cantidadMaterias());

        // e) a) Usé HashSet (No permite repetidos) e idMateria como condición.
        // e) b) Modifiqué los métodos hashcode y equals en la clase Materia.
    }

}
