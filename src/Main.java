import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        Scanner rellenar = new Scanner(System.in);
        String nombreLiga = "";
        liga_futbol _liga_futbol=new liga_futbol();
        Jornada _jornada=new Jornada();



        int salir = 1;
        do {
            System.out.println("¿Que operacion quieres realizar? \n1 Crear nueva liga \n2 Jugar liga \n3 Eliminar liga actual \n4 Salir");
            int operacion = cubrir.nextInt();
            switch (operacion) {
                case 1:
                    System.out.println("¿Como se va a llamar tu liga?");
                    nombreLiga = rellenar.nextLine();

                    _liga_futbol.añadir_liga();
                    System.out.println("La primera jornada sera: ");
                    _jornada.primera_jornada(_liga_futbol.añadir_liga());//al pasar por parametros _liga_futbol.añadir_liga() hacemos que nos muestre los datos que tenemos en la liga que generamos previamente
                    break;
                case 2:
                    if (nombreLiga.contains("a")) {//modificar esta condicion if, esta puesto asi para comprobar que funcionaba el resto
                        int pausarLiga = 1;
                        do {
                            System.out.println("¿Que consulta quieres realizar? \n1 Siguiente jornada \n2 Consultar tabla \n3 Pausar liga");
                            int consulta = cubrir.nextInt();
                            switch (consulta) {
                                case 1:
                                    System.out.println("siguiente jornada");
                                    break;
                                case 2:
                                    System.out.println("Consulta la liga");
                                    break;
                                case 3:
                                    System.out.println("pausa la liga");
                                    pausarLiga=0;
                                    break;
                            }
                        } while (pausarLiga != 0);
                    } else {
                        System.out.println("Tienes que crear antes una liga");
                    }
                    break;
                case 3:
                    if (nombreLiga.contains("a")) {
                        System.out.println("¿Estas seguro de que quieres eliminar tu liga? \n1 Si \n2 No");
                        int eliminarLiga = cubrir.nextInt();
                        if (eliminarLiga==1){
                            System.out.println("La liga ha sido eliminada");
                        }
                    } else {
                        System.out.println("Tienes que crear antes una liga");
                    }
                    break;
                case 4:
                    System.out.println("salir");
                    salir = 0;
                    break;
            }
        } while (salir != 0);

    }
}
