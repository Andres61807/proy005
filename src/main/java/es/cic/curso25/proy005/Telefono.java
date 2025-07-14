package es.cic.curso25.proy005;

public class Telefono {
    
    //atributos
    private long id;
    private String titular;
    private String numero;
    private int tarifa;

    //constructores
    public Telefono(){

    }

    public Telefono(long id, String titular, String numero, int tarifa) {
        this.id = id;
        this.titular = titular;
        this.numero = numero;
        this.tarifa = tarifa;
    }

    //getter y setters
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getTarifa() {
        return tarifa;
    }
    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

}
