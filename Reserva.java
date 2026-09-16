package Parcial2Pilas;

public class Reserva {
    
    private int codigo;
    private String nombreCliente;
    private int habitacion;
    private String fechaEntrada;
    private String fechaSalida;
    
    public Reserva(int codigo, String nombreCliente, int habitacion, String fechaEntrada, String fechaSalida) {
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override 
    public String toString() {
        return "Reserva{" +
                "Codigo='" + codigo + '\'' +
                ", Nombre del Cliente ='" + nombreCliente + '\'' +
                ", Habitacion =" + habitacion +
                ", Fecha de entrada=" + fechaEntrada +
                ", Fecha de Salida=" + fechaSalida +
                '}';
    
    }
}
