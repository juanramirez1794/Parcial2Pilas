package Parcial2Pilas;
import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<Reserva> llenarPila(Stack<Reserva> pila, Scanner sc){
        
        boolean continuar = true;

        while (continuar){
            System.out.println("Ingrese el código de la reserva: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Ingrese el nommbre del cliente: ");
            String nombreCliente =sc.nextLine();

            System.out.println("Ingrese el numero de la habitación: ");
            int habitacion = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese la fecha de entrada: ");
            String fechaEntrada = sc.nextLine();

            System.out.println("Ingrese la fecha de salida: ");
            String fechaSalida = sc.nextLine();

            Reserva reserva = new Reserva(codigo, nombreCliente, habitacion, fechaEntrada, fechaSalida);
            pila.push(reserva);

            System.out.println("¿Desea ingresar otro cliente? 1)Sí  2)No");
            int opcion = sc.nextInt();

            if(opcion == 2) {
                continuar = false;

            }
        }
        return pila;
    }
    public void cancelarReserva(Stack<Reserva> pila){
        Reserva reserva = pila.pop();
        System.out.println("Reserva cancelada: " + reserva);
    }
    public void consultarUltimo(Stack<Reserva> pila){
        Reserva reserva = pila.peek();
        System.out.println("La ultima reserva es: " + reserva);
    }
    public void mostrarPila(Stack<Reserva> pila){
        for( Reserva reserva : pila) {
            System.out.print(reserva);
        }
    }

    public Stack<Reserva> EliminarRegitro(Stack<Reserva> pila, Scanner sc, Metodos m) {
        System.out.println("Ingrese el Numero a eliminar");
        int codigoEliminar = m.ValidarEentero(sc);
        Stack<Reserva> pilaaux = new Stack<>();

        while (!pila.isEmpty()) {
            Reserva reservaActual = pila.pop();
            if (reservaActual.getCodigo() == codigoEliminar) {
                System.out.println("registro eliminado");
            } else {
                pilaaux.push(reservaActual);
            }
        }

        while (!pilaaux.isEmpty()) {
            pila.push(pilaaux.pop());
        }

        return pila;
    }

    public int ValidarEentero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println(
                    "Por favor tenga en cuenta que se le esta pidiendo un dato numerico ojala en el rango de 1 a 5 ");
            sc.next();
        }
        return sc.nextInt();
    }
}

