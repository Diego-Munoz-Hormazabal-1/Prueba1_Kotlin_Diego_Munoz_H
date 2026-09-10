open class Reserva(
    val identificador: Int,
    val nombreCliente: String,
    val cantidadNoches: Int
) {
    open fun descripcion(): String{
        return "El identificador del cliente es: $identificador, el nombre del cliente es: $nombreCliente, la cantidad de noches reservadas es: $cantidadNoches"
    }
}