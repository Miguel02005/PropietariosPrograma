public class persona {
    int documento;
    String nombre;
    String apellido;
    int edad;

    public persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getInformacion() {
        String informacion = "El nombre es: " + nombre + " El apellido: " + apellido + " Edad: " + edad + " documento: "
                + documento;
        return informacion;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

}
