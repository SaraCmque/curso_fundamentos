import java.util.*;
public class Principal{
    public static void MostrarMenu(){
        Scanner sc = new Scanner(System.in);
        boolean inicio = true;
        while(inicio){
            System.out.println("------------------------------------------------------");    
            System.out.println("ingrese un numero.");
            System.out.println("[0], se cierra.");
            System.out.println("[1], se crea una nueva instancia vehículo.");
            System.out.println("[2],  info. de todos los vehículos almacenados.");
            System.out.println("[3],  cantidad de vehículos almacenados.");
            System.out.println("[4],  info. de todos los vehículos verdes.");
            System.out.println("[5],  info. de todos los vehículos de modelos entre 2000 y 2021.");
            System.out.println("[6],  se crea una nueva instancia sensor.");
            System.out.println("[7],  info. de todos los sensores almacenados.");
            System.out.println("[8],  cantidad de sensores almacenados.");
            System.out.println("[9],  info. de todos los sensores tipo temperatura.");
            System.out.println("[666], sensores tipo temperatura, ordenados por valor.");
            System.out.println("------------------------------------------------------");
            int numPedir = sc.nextInt();
            switch(numPedir){
                case 0:
                    inicio = false;
                    break;
                case 1:
                    System.out.println("Crear un nuevo Vehiculo:");
                    System.out.println("Ingrese el Modelo:");
                    int modelo = sc.nextInt();
                    System.out.println("Ingrese Marca:");
                    String marca = sc.next();
                    System.out.println("Ingrese el valor Comercial:");
                    double valorComercial = sc.nextDouble();
                    System.out.println("Ingrese Color:");
                    String color = sc.next().toLowerCase();
                    Vehiculo.vehiculos.add(new Vehiculo(modelo, marca, valorComercial, color));
                    break;
                case 2:
                    System.out.println("Informacion de todos los vehiculos:");
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;
                case 3:
                    System.out.print("Vehiculos Almacenados:" + " ");
                    System.out.println(Vehiculo.cantidadDeVehiculos());
                    break;
                case 4:
                    System.out.println("Informacion de Vehiculos de Color Verde:"); 
                    System.out.println(Vehiculo.toStringVehiculosVerdes());
                    break;
                case 5:
                    System.out.println("Informacion de vehiculo por ID:");
                    int pedirNum = sc.nextInt();
                    if(pedirNum > Vehiculo.idActual){
                        System.out.println("Error");
                        break;
                    }else{
                        System.out.println(Vehiculo.vehiculos.get(pedirNum).toString());
                    }
                    break;
                case 6:
                    System.out.println("Informacion de vehiculo por ID:");
                    pedirNum = sc.nextInt();
                    if(pedirNum > Vehiculo.idActual){
                        System.out.println("Error");
                        break;
                    }else{
                        int idVehiculo = sc.nextInt();
                        double valorSensor = sc.nextDouble();
                        String tipoSensor = sc.next();
                        Vehiculo.obtenerVehiculoPorId(idVehiculo);
                        Sensor sn = new Sensor(tipoSensor, valorSensor);
                        Vehiculo.obtenerVehiculoPorId(idVehiculo).anadirSensor(sn); 
                    }
                    break;
                case 7:
                    pedirNum = sc.nextInt();
                    if(pedirNum > Vehiculo.idActual){
                        System.out.println("Error");
                        break;
                    }else{
                        for(int i = 0; i < Vehiculo.vehiculos.size(); i++){
                            
                        }
                    }
                    break;
                case 8: 
                    System.out.println("Informacion de sensores tipo: Temperatura");
                    for(Vehiculo i: Vehiculo.vehiculos){
                        Sensor.tipoTemperatura(i);
                    }
                    
                    break;
                case 9:
                    int posicion = 0;
                    int numSensores = 0;
                    int mayor = 0;
                    for(Vehiculo i: Vehiculo.vehiculos){
                        numSensores = i.getSensores().size();
                        if(i.getSensores().size() > mayor){
                            numSensores = i.getSensores().size();
                            mayor = posicion;
                        }
                        posicion += 1;
                    }
                    Vehiculo vehiculoMasSensores = Vehiculo.vehiculos.get(posicion);
                    System.out.println("El vehiculo que tiene mas sensores es: " + vehiculoMasSensores.toString());
                    break;
                case 666:
                    System.out.println("Informacion de sensores tipo: Temperatura. Organizados por: Valor");
                    for(int i = 0; i < Sensor.OrganizarPorValor().length; i++){ 
                        System.out.println(Sensor.OrganizarPorValor()[i]);
                    }
                    break;
                default:
                    System.out.println("Error: opcion no disponible");
                    break;

            }
        }
    }

    public static void main(String[] args){
        Principal.MostrarMenu();

    }
}
