public class Fecha {

    private int mes;

    private int dia;

    private int año;



    // Constructor

   Fecha(int mes, int dia, int año) {

        this.mes = mes;

        this.dia = dia;

        this.año = año;

    }



    // Métodos para establecer y obtener el mes

    public void setMes(int mes) {

        this.mes = mes;

    }



    public int getMes() {

        return mes;

    }



    // Métodos para establecer y obtener el día

    public void setDia(int dia) {

        this.dia = dia;

    }



    public int getDia() {

        return dia;

    }



    // Métodos para establecer y obtener el año

    public void setAño(int año) {

        this.año = año;

    }



    public int getAño() {

        return año;

    }



    // Método para mostrar la fecha

    public void mostrarFecha() {

        System.out.printf("%d/%d/%d\n", mes, dia, año);

    }

}