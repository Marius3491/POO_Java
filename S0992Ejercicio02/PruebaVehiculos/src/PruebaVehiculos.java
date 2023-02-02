import java.util.Scanner;
public class PruebaVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int km;

        Bicicleta bhSpeedrom = new Bicicleta(9);
        Coche peugeot406 = new Coche(1900);
        while (opcion != 8) {
            System.out.println("\n1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = sc.nextInt();
                    bhSpeedrom.recorre(km);
                    break;
                case 2:
                    bhSpeedrom.hazCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuantos kilometros quiere recorrer? ");
                    km = sc.nextInt();
                    peugeot406.recorre(km);
                    break;
                case 4:
                    peugeot406.quemaRueda();
                    break;
                case 5:
                    System.out.print("La bicicleta lleva recorridos ");
                    System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
                    break;
                case 6:
                    System.out.print("El coche lleva recorridos ");
                    System.out.println(peugeot406.getKilometrosRecorridos() + " Km");
                    break;
                case 7:
                    System.out.print("Los vehiculos llevan recorridos ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                default:
            }
        }
    }
}
