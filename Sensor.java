import java.util.ArrayList;
public class Sensor
{
    private String tipo;
    private double valor;

    public Sensor(){
    }
    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;

    }

    public String getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public void setValor(double v){
        this.valor = v;
    }

    public String toString(){
        String info = this.getTipo() + " "+ this.getValor();
        return info;
    }
    
    public ArrayList <Sensor> tipoTemperatura(Vehiculo v1){
        ArrayList <Sensor> sensores = v1.getSensores();
        ArrayList <Sensor> tipoTemp = new ArrayList<Sensor>();
        for(Sensor i: sensores){
            if(i.getTipo().equals("temperatura")){
                tipoTemp.add(i);
            }
        }
        return tipoTemp;
    }
    
    
}
