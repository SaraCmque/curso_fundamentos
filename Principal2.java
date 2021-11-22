import java.util.Random;
import java.util.*;
public class Principal{

    public static void main(String[] args) {
        Bicho bicho = new Bicho();
        Random claseRandom = new Random();
        Scanner sc = new Scanner(System.in);
        int a = 1 + claseRandom.nextInt(5 - 1);
        System.out.println("Cantidad de bichos que debe crear:" + a);
        for (int i = 0; i < a; i++) {
            System.out.println("Eliga el tipo de bicho");
            System.out.println("{1} normal {2} alien");
            int numPedir = sc.nextInt();
            switch (numPedir) {
            case 1:
                Bicho.introducirObjetos(1);
                Bicho.Filas += 1;
                break;
            case 2:
                Bicho.introducirObjetos(2);
                Bicho.Filas += 1;
                break;    
            }
        }
        Bicho.imprimirTablero();
        while(Bicho.acabarJuego() == true){ 
          System.out.println("[0] Imprimir Tablero");
          System.out.println("[1] Disparar una Bala");
          System.out.println("[2] Activar Bomba Atomica");
          System.out.println("[3] Activar Bicho Mutante");
          System.out.println("[4] Frase de la Abuela");
           int numPedir = sc.nextInt();
        switch(numPedir){ 
           case 0:
           Bicho.imprimirTablero();
           break;
           case 1:
           System.out.println("Elige una posicion");
           System.out.println("[1][2]");
           System.out.println("[3][4]");
           int pedirNum = sc.nextInt();
            switch(pedirNum){
              case 1:
              Bicho.dispararUnaBala(0, 0);
              break;
              case 2: 
              Bicho.dispararUnaBala(0, 1);
              break;
              case 3:
              Bicho.dispararUnaBala(1, 0);
              break;
              case 4:
              Bicho.dispararUnaBala(1, 1);
              break;
            }
             break;
            case 2:
            int b = 1 + claseRandom.nextInt(2 - 1);
            int c = 1 + claseRandom.nextInt(2 - 1);
            Bicho.bombaAtomica(b,c);
            break;
            case 3:
            System.out.println("Se duplica la vida del menor");
            Bicho.activarBichoMutante();
            break;
            case 4: 
            Bicho.frase();
            break;

          }
           
          
           Bicho.acabarJuego();
        
        }
    }
}
//posicion 0.0
//posicion 0.1
//posicion 1.0
//posicion 1.1
