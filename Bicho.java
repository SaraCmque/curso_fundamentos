public class Bicho {
    public static int Filas;
    public static int Columnas;
    public int Salud;
    public String Tipo;
    public static Bicho[][] bichos = new Bicho[2][2];
    
    Bicho(){}
    
    Bicho(String t, int s) {
        this.Tipo = t;
        this.Salud = s;
    }

    public void setTipo(String t) {
        this.Tipo = t;
    }

    public void setSalud(int s) {
        this.Salud = s;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public int getSalud() {
        return this.Salud;
    }

    public static void imprimirMatriz(Bicho[][] bichos) {
        for (int j = 0; j < bichos.length; j++) {
            for (int x = 0; x < bichos[j].length; x++) {
                if (bichos[j][x] == null) {
                    System.out.print("|   " + "  | ");
                } else {
                    System.out.print("|" + bichos[j][x].getTipo() + "-" + bichos[j][x].getSalud() + "|");

                }
            }
            System.out.println("");
        }
    }

    public static Bicho[][] introducirObjetos(int a) {
        if (Bicho.Filas > 1) {
            Bicho.Filas = 0;
            Bicho.Columnas = 1;
            if (a == 1) {
                Bicho.bichos[Bicho.Columnas][Bicho.Filas] = new BichosNormales();
            } else if (a == 2) {
                Bicho.bichos[Bicho.Columnas][Bicho.Filas] = new BichosAliens();
            }
        } else {
            if (a == 1) {
                Bicho.bichos[Bicho.Columnas][Bicho.Filas] = new BichosNormales();

            } else if (a == 2) {
                Bicho.bichos[Bicho.Columnas][Bicho.Filas] = new BichosAliens();

            }
        }

        return Bicho.bichos;
    }

    public static void imprimirTablero(){
        System.out.println("- - - - - - -");
        Bicho.imprimirMatriz(Bicho.bichos);
        System.out.println("- - - - - - -");
    }


    public static void dispararUnaBala(int a, int b){
        if (bichos[a][b] == null) {
              System.out.println("Posicion invalida");
                } else {
                     int Salud = bichos[a][b].getSalud();
                     int Saludtotal = Salud - 5;
                     bichos[a][b].setSalud(Saludtotal);
        }
    }  

    public static void bombaAtomica(int a, int b){
              if (bichos[a][b] == null) {
              System.out.println("Posicion invalida");
                } else {
                  System.out.println("Un alien al azar fue Eliminado");
                     bichos[a][b].setSalud(0);
        }
    } 
    
    public static void activarBichoMutante(){
      int mayor = Bicho.bichos[0][0].getSalud();
      Bicho temp = Bicho.bichos[0][0];
      for(int i = 0; i < Bicho.bichos.length; i++){
        for(int j = 0; j < Bicho.bichos[0].length; j++){
          if(Bicho.bichos[i][j] == null){
            break;
          }
           if(mayor > Bicho.bichos[i][j].getSalud()){
             mayor = Bicho.bichos[i][j].getSalud();
             temp = Bicho.bichos[i][j];
             
           }
        }
       }
       int total = mayor * 2;
       temp.setSalud(total);
    }
    
   public static boolean acabarJuego(){
    boolean ControlJuego = true;
    int Contador = 0;
    for(int i = 0; i < Bicho.bichos.length; i++){
      for(int j = 0; j < Bicho.bichos[0].length; j++){
        if(Bicho.bichos[i][j] == null){
          break;
        }else{
          Contador += Bicho.bichos[i][j].getSalud();
        }
       }
     }
      if(Contador == 0){
       ControlJuego = false;
      }
      return ControlJuego;
   }
   public static void frase(){
     String frase = "No me compares con tu tia";
     System.out.println(frase);
   }


  }
