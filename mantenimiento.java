import java.util.Date;

public class mantenimiento extends gasto{
    String responsable;
    String id_mantenimiento;

    public mantenimiento(int id_gasto, Date fecha, float valor, String descripcion, String responsable, String id_mantenimiento) {
        super(id_gasto, fecha, valor, descripcion);
        this.responsable = responsable;
        this.id_mantenimiento = id_mantenimiento;
    }
    public void getInformacion(){
        System.out.println("ID del gasto: "+id_gasto+" fecha: "+fecha+ " valor: "+valor+"\ndescripcion: "+descripcion+" responsable: "+responsable+" ID de mantenimiento: "+id_mantenimiento);
    }
}
