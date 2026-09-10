//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val mantenedor = Mantenedor()

    val reserva1 = Alojamiento(
        valorNoche = 100,
        cantidadPersonas = 1,
        tipoAlojamiento = TipoAlojamiento.Cabana,
        identificador = 1,
        nombreCliente = "Diego",
        cantidadNoches = 1
    )

    val reserva2 = Alojamiento(
        valorNoche = 200,
        cantidadPersonas = 1,
        tipoAlojamiento = TipoAlojamiento.Departamento,
        identificador = 2,
        nombreCliente = "Eduardo",
        cantidadNoches = 1
    )

    val reserva3 = Alojamiento(
        valorNoche = 300,
        cantidadPersonas = 1,
        tipoAlojamiento = TipoAlojamiento.Habitacion,
        identificador = 3,
        nombreCliente = "Benjamin",
        cantidadNoches = 1
    )

    println("---Agregar reserva---")
    mantenedor.registrarReserva(reserva1)
    mantenedor.registrarReserva(reserva2)
    mantenedor.registrarReserva(reserva3)

    println("---Mostrar reserva---")
    mantenedor.obtenerReservas()

    println("---Calculo reserva por cliente---")
    println(mantenedor.calculoValorReservasNoche(reserva1))

    println("---Calculo reservas total---")
    println(mantenedor.calculoValorReservasTotal())

    println("---Nombres de clientes---")
    println(mantenedor.obtenerNombres())
}