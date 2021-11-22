import java.util.ArrayList;
public class Vehiculo extends Sensor
{
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public static ArrayList<Vehiculo>vehiculos = new ArrayList<Vehiculo>();
    private static int id;
    public static int idActual = 1;
    private ArrayList<Sensor>sensores = new ArrayList<Sensor>();

    public Vehiculo(){
        this.idActual += 1;
        this.id = idActual;
        Vehiculo.vehiculos.add(this);


    }

    public Vehiculo(int mod, String mar, double valor){
        this(mod,mar,valor, "Verde");

    }

    public Vehiculo(int mod, String mar, double valor, String col){
        this.modelo = mod;
        this.marca = mar;
        this.valorComercial = valor;
        this.color = col;
        this.idActual += 1;
        this.id = idActual;
        Vehiculo.vehiculos.add(this);
        
    }

    public ArrayList<Sensor> getSensores(){
        return sensores;
    }

    public int getId(){
        return this.id;
    }

    public int getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String getColor(){
        return this.color;
    }

    public void setSensores(ArrayList<Sensor> sen){
        this.sensores = sen;
    }

    public void setModelo(int m){
        this.modelo = m;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double vc){
        this.valorComercial = vc;
    }

    public void setColor(String c){
        this.color = c;
    }

    public String toString(){
        String info = "ID: " + this.getId() + "Modelo: " + this.getModelo() + "Marca: " + this.getMarca() + "valorComercial: " + this.getValorComercial() + "Color: " + this.getColor() + " "+ "Sensores: ";

        for(int i = 0; i < vehiculos.size(); i++){
            info = info + this.sensores.get(i).toString();
        }
        return info;
    }

    public static String toStringVehiculos(){
        String infoVehiculos = "";
        for(int i = 0; i < vehiculos.size(); i++) {
            infoVehiculos += vehiculos.get(i).toString();
        }
        return infoVehiculos;
    }

    public static int cantidadDeVehiculos(){
        int cantidadDeVehiculos = vehiculos.size();
        return cantidadDeVehiculos;
    }

    public void anadirSensor(Sensor s){
        this.sensores.add(s);
    }

    public static String toStringVehiculosVerdes(){
        String infoVehiculosVerdes = "";
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getColor().equals("Verde")){ 
                infoVehiculosVerdes += vehiculos.get(i).getColor();
            }
        }
        return infoVehiculosVerdes;
    }

    public static String obtenerVehiculoPorId(int id){
        int num = id;
        String infoVehiculoPorId = "";
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getId() == num){
                infoVehiculoPorId = vehiculos.get(i).toString();
            }
        }
        return infoVehiculoPorId;
    }
    
    
}
