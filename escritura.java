import java.util.Date;

public class escritura {
    int numero;
    Date fecha;
    int notaria;

    public escritura(int numero, Date fecha, int notaria) {
        this.numero = numero;
        this.fecha = fecha;
        this.notaria = notaria;
    }
    public void getInformacion(){
        System.out.println("Numero: "+numero+" fecha: "+fecha+" notaria: "+notaria);
    }
}
