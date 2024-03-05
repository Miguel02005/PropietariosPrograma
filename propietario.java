public class propietario extends persona {
    String id_propietario;

    public propietario(String nombre, String apellido, int edad, int documento, String id_propietario) {
        super(nombre, apellido, edad, documento);
        this.id_propietario = id_propietario;
    }

    public String getInformacion() {
        String informacion = "El nombre es: " + nombre + " El apellido: " + apellido + " Edad: " + edad + " documento: "
                + documento + "\nId del propietario: " + id_propietario;
        return informacion;
    }

    public String getId_propietario() {
        return id_propietario;
    }

}
