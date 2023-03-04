import java.util.Random;

public class liga_futbol implements liga {

    public equipo_futbol[] array_liga = new equipo_futbol[22];

    public liga_futbol() {
    }

    public liga_futbol(equipo_futbol[] array_liga) {
        this.array_liga = array_liga;

    }

    public equipo_futbol[] getArray_liga() {
        return array_liga;
    }

    public void setArray_liga(equipo_futbol[] array_liga) {
        this.array_liga = array_liga;
    }


    public equipo_futbol[] añadir_liga() {
        String[] array_liga_string = {"real_madrid", "celta", "olaf", "alonso", "lobato", "joel", "ellie", "verstappen",
                "pocahontas", "bella", "bulerion", "lider", "yoda", "anakin", "luke", "chewbacca", "frodo", "bilbo", "golum", "sauron", "chandler", "joey"};

        System.out.println("Estos son los equipos de la liga:  ");
        for (int i = 0; i < array_liga.length; i++) {
            equipo_futbol equipo = new equipo_futbol();
            array_liga[i] = equipo;//de esta manera añadimos un equipo al array en cada vuelta del bucle
            array_liga[i].setNombre(array_liga_string[i]);// usando set nombre añadimos ese valor al array
            System.out.println("en posicion " + i + " equipo " + array_liga[i]);
        }
        return array_liga;
    }

    @Override
    public int calcular_jornada() {

        return 0;
    }

}



