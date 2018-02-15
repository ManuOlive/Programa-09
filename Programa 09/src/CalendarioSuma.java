
import java.util.Scanner;

public class CalendarioSuma {

    private Integer dia;
    private Integer mes;
    private Integer anio;
    private Integer suma;

    public void setDia(Integer d) {
        dia = d;
    }

    public Integer getDia() {
        return dia;
    }

    public void setMes(Integer m) {
        mes = m;
        if (m == 1) {
            System.out.println("(Enero)");
        } else if (m == 2) {
            System.out.println("(Febrero)");
        } else if (m == 3) {
            System.out.println("(Marzo)");
        } else if (m == 4) {
            System.out.println("(Abril)");
        } else if (m == 5) {
            System.out.println("(Mayo)");
        } else if (m == 6) {
            System.out.println("(Junio)");
        } else if (m == 7) {
            System.out.println("(Julio)");
        } else if (m == 8) {
            System.out.println("(Agosto)");
        } else if (m == 9) {
            System.out.println("(Septiembre)");
        } else if (m == 10) {
            System.out.println("(Octubre)");
        } else if (m == 11) {
            System.out.println("(Noviembre)");
        } else if (m == 12) {
            System.out.println("(Diciembre)");
        }
    }

    public Integer getMes() {
        return mes;
    }

    public void setAnio(Integer a) {
        anio = a;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setSuma(Integer z) {
        suma = z;
    }

    public Integer getSuma() {
        return suma;
    }

    public Integer Operacion() {
        Integer resul = dia + suma;
        return resul;
    }

    public Integer sumaMes() {//Valor del mes
        Integer resul2 = mes + 1;
        return resul2;
    }

    public Integer recorridoDia() {//Valor de los dias
        Integer sum = dia + suma;
        Integer reco = sum - 30;
        return reco;
    }

    public Integer recorridoDia2() {//Valor de los dias (31 dias)
        Integer sum = dia + suma;
        Integer reco = sum - 31;
        return reco;
    }
    public Integer recoBi() {//Febrero bisiesto
        Integer sum = dia + suma;
        Integer reco = sum - 29;
        return reco;
    }    
    public Integer recoFeb() {//Febrero no bisiesto
        Integer sum = dia + suma;
        Integer reco = sum - 28;
        return reco;
    }
    public Integer sumaAnio() {//Suma año
        Integer sum = anio + 1;
        return sum;
    }
    public Integer reinicioMes() {
        Integer sum = 1;
        return sum;
    }
    public static void main(String[] args) {
        CalendarioSuma x = new CalendarioSuma();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el dia: ");
        x.setDia(entrada.nextInt());
        System.out.println("Ingresa el mes: ");
        x.setMes(entrada.nextInt());
        System.out.println("Ingresa el año: ");
        x.setAnio(entrada.nextInt());
        System.out.println("La fecha es: " + x.getDia() + "/" + x.getMes() + "/" + x.getAnio());
        System.out.println("¿Cuantos dias se van a sumar? ");
        x.setSuma(entrada.nextInt());
        if (x.Operacion() >= 31) {
            while (x.getMes() == 4 || x.getMes() == 6 || x.getMes() == 9 || x.getMes() == 11) {
                System.out.println("El fecha es: " + x.recorridoDia() + "/" + x.sumaMes() + "/" + x.getAnio());
                break;    
            }
            while (x.getMes() == 1 || x.getMes() == 3 || x.getMes() == 5 || x.getMes() == 7 || x.getMes() == 8 || x.getMes() == 10) {
                System.out.println("El fecha es: " + x.recorridoDia2() + "/" + x.sumaMes() + "/" + x.getAnio());
                break;    
            }
            while (x.getMes()==2){
                if(x.getAnio()%4 == 0){
                    System.out.println("La fecha es: "+ x.recoBi() + "/" + x.sumaMes() + "/" + x.getAnio());
                }
                else{
                    System.out.println("La fecha es: "+ x.recoFeb() + "/" + x.sumaMes() + "/" + x.getAnio());
                }
                break;
            }
            while (x.getMes()==12){
                System.out.println("El fecha es: " + x.recorridoDia2() + "/" + x.reinicioMes() + "/" + x.sumaAnio());
                break;
            }
        } else {
            System.out.println("La fecha es: " + x.Operacion() + "/" + x.getMes() + "/" + x.getAnio());
        }
    }
}
