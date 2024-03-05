public class inquilino extends persona{
    String numeroContrato;
    String telefono;
    String correo;
    String id_inquilino;

    public inquilino(String nombre, String apellido, int edad, int documento, String numeroContrato, String telefono, String correo, String id_inquilino) {
        super(nombre, apellido, edad, documento);
        this.numeroContrato = numeroContrato;
        this.telefono = telefono;
        this.correo = correo;
        this.id_inquilino = id_inquilino;
    }
    public String getInformación(){
        String información = "El nombre es: " + nombre + " El apellido: " + apellido + " Edad: " + edad + " documento: "+documento+"\nEl número de contrato es: " + numeroContrato + " telefono: " + telefono + " correo: " + correo + " su ID es: " + id_inquilino;
        return información;
    }
}
