import java.util.Date;

public class gasto {
    int id_gasto;
    Date fecha;
    float valor;
    String descripcion;

    public gasto(int id_gasto, Date fecha, float valor, String descripcion) {
        this.id_gasto = id_gasto;
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
    }
}
