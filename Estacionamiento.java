import java.util.Scanner;
public class Estacionamiento {
    int [] ArregloEspacio;

    public Estacionamiento(int[] ArregloEspacio ){
        this.ArregloEspacio=ArregloEspacio;
    }

    public int Menu(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("1.Asignar espacio\n");
        System.out.println("2.Liberar espaio\n");
        System.out.println("3.Ver espacio disponible\n");
        System.out.println("4.Ver espacios ocupados\n");
        System.out.println("5. Salir\n");

        int opcion = entrada.nextInt();

        switch(opcion){
            case 1:
            asignarEspacio();
            break;
            case 2:
            liberarEspacio();
            break;
            case 3:
            System.out.println("Espacios libres \n");
            buscarValor(0);
            break;
            case 4:
            System.out.println("Espacios ocupados\n");
            buscarValor(1);
            break;
            case 5:
            System.out. println("Adios! :)");
            break;
            default:
            System.out.println("Opcion invalida :(");
        }
        return opcion;

    }

    public void liberarEspacio(){
        int numero;
        int indicador;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nIngrese espacio a liberar\n");
        numero = entrada.nextInt();
        validarNumero(numero);
        indicador = verificarEspacio(numero,1);

        if(indicador==1){
            ArregloEspacio[numero-1]=0;
         } else {
            System.out.println("El espacio esta libre\n");
         }
    }

    public void asignarEspacio(){
        Scanner entrada = new Scanner(System.in);
        int numero, indicador;
        System.out.println("Ingrese un espacio a ocupar\n");
        numero = entrada.nextInt();
      int valor= validarNumero(numero);
       indicador= verificarEspacio(valor,0);
       
       if(indicador==1){
            ArregloEspacio[valor-1]=1;
       } else 
         System.out.println("Esta ocupado\n");
    }

    public int validarNumero(int numero){
        Scanner entrada = new Scanner(System.in);
        while(numero<1 || numero>10){
            System.out.println("Ingrese numero 1-10\n");
            numero = entrada.nextInt();
        }
        return numero;
    }

    public int verificarEspacio(int numero, int valor){
        int indicador=2;
        if(ArregloEspacio[numero-1]==valor){ 
            indicador=1;
        }
        return indicador;
    }

    public void buscarValor(int valor){
        for (int i=0; i<10; i++){
            if(ArregloEspacio[i]==valor){
                System.out.println(i+1+"\t");
            }
        }
    }



}