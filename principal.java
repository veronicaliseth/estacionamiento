public class principal{

    public static void main(String[] args){
        int [] ArregloEspacio = new int [10];

        for(int i=0; i<10; i++ ){
            ArregloEspacio[i]=0;
        }
        final Estacionamiento opcion = new Estacionamiento(ArregloEspacio);
        int op;
        do{
            op = opcion.Menu();
        }while(op !=5);
    }
}