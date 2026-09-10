import java.util.stream.IntStream

class Alojamiento(
    val valorNoche : Int,
    val cantidadPersonas: Int,
    val tipoAlojamiento: TipoAlojamiento,
    identificador:Int,
    nombreCliente: String,
    cantidadNoches: Int
):Reserva(identificador, nombreCliente, cantidadNoches) {

    val valorReserva = valorNoche * cantidadPersonas

    override fun descripcion(): String{
        return  super.descripcion() + " Valor por noche: $valorNoche, cantidad de personas en reserva: $cantidadPersonas, " +
                "tipo de alojamiento: $tipoAlojamiento, valor total de la reserva: $valorReserva, " +
                "Descripción de la reserva: ${tipoAlojamiento.mostrarTipoAlojamiento()}"
    }

}