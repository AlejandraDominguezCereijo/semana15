import java.util.Random;

public class Jornada extends liga_futbol {

    public Jornada() {
    }

    public Jornada(equipo_futbol[] array_liga) {
        super(array_liga);
    }

    public String primera_jornada(equipo_futbol[] array_liga){
        for (int i=0;i<=11;i++){
            Random al = new Random();
            int equipoAleatorio=al.nextInt(array_liga.length);
            Random aleatorio2=new Random();
            int equipoAleatorio2=aleatorio2.nextInt(array_liga.length);
            equipo_futbol equipo = new equipo_futbol();
            equipo.getNombre();//como ya tenemos los nombres de los equipos añadidos al array aqui usamos get nombre para mostrar esos elementos
            System.out.println(array_liga[equipoAleatorio].getNombre()+" vs "+array_liga[equipoAleatorio2].getNombre());
        }
        // el siguiente bucle no iria aqui lo pondria en medio del anterior, es una de mis pruebas para "eliminar" el elemento que salio de manera aleatoria,
        // realmente lo que hace este bucle es mover el elemento a la ultima posicion y le indico que el array tiene una posicion menos, todavia es no esta implementado correctamente
       /* Random al = new Random();
        int equipoAleatorio=al.nextInt(array_liga.length);
        for (int i=equipoAleatorio;i<(array_liga.length-1);i++) {
            array_liga[i]=array_liga[i+1];
        }*/
        return "";
    }

}
