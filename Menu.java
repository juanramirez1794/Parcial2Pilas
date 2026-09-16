package Parcial2Pilas;
import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String [] args) {
        Stack<Reserva> pila = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n===== HOTEL NUTIBARA =====");
            System.out.println("1. Registrar Reserva");
            System.out.println("2. Eliminar ultima reserva");
            System.out.println("3. Consultar último reserva");
            System.out.println("4. Mostrar todos las reservas");
            System.out.println("5. Eliminar una reserva en especifico");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción:");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    pila = m.llenarPila(pila, sc);
                    break;

                case 2:
                    m.cancelarReserva(pila);
                    break;

                case 3:
                    m.consultarUltimo(pila);
                    break;

                case 4:
                    m.mostrarPila(pila);
                    break;

                case 5:
                    pila = m.EliminarRegitro(pila, sc, m);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no valida.");
            }
        }
        sc.close();
    }
}