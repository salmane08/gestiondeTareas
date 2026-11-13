public class Tarea {
    // ATRIBUTOS: datos de cada tarea
    //toda la documentacion debe de aparecer aqui
    //esto es un comentario
    private String nombre;
    private String asignatura;
    private boolean completada;
    // CONSTRUCTOR: inicializa un nuevo objeto
    public Tarea(String nombre, String asignatura) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.completada = false;
    }

    // MÉTODO: cambia el estado de la tarea
    public void completarTarea() {
        completada = true;
    }

    // MÉTODO: muestra información
    public void mostrarTarea() {
        System.out.println(nombre + " - " + asignatura);
    }
}
