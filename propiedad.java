public class propiedad {
    String id_propiedad;
    String num_matricula;
    String ciudad;
    String direccion;
    String descripcion;
    propietario Propietario;

    public propiedad(String id_propiedad, String num_matricula, String ciudad, String direccion, String descripcion,
            propietario Propietario) {
        this.id_propiedad = id_propiedad;
        this.num_matricula = num_matricula;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.Propietario = Propietario;
    }

    public void getInformacion() {
        System.out.println("Numero de matricula: " + num_matricula + "\nCiudad: " + ciudad + "\nDireccion: " + direccion
                + "\nDescripcion: " + descripcion + "\nID de propiedad: " + id_propiedad
                + "\nEl nombre del propietario es: " + Propietario.getNombre());
    }

}
