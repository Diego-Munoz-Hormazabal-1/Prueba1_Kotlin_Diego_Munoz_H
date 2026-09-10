class Mantenedor {
    private val lista = mutableListOf<Alojamiento>()

    fun registrarReserva(a : Alojamiento){
        try {
            require(a.identificador>0){"El ID debe ser mayor a 0"}
            require(a.nombreCliente.isNotBlank()){"El nombre del cliente no puede estar vacio"}
            require(a.cantidadNoches>0){"La cantidad de noches debe ser mayor que 0"}
            require(a.valorNoche>0){"El valor por noche debe ser mayor a 0"}
            require(a.cantidadPersonas>0){"La cantidad de personas debe ser mayor a 0"}
            require(lista.none(){it.identificador ==  a.identificador }){"El ID no puede estar repetido"}
            lista.add(a)
            println("Reservado con exito, ID: ${a.identificador}")
        }
        catch (e: Exception){
            println("Error de reserva en el ID: ${a.identificador} | por motivo: ${e.message}")
        }
    }

    fun obtenerReservas(){
        if (lista.isEmpty()){
             return println("No hay reservas")

        }else{
            for (i in lista){
                println(i.descripcion())
            }
        }
    }

    fun calculoValorReservasNoche(a: Alojamiento){
        for (i in lista){
            var total = i.valorNoche * i.cantidadNoches
            println("El total de la reserva del ID: ${a.identificador} es: $total")
        }
    }

    fun calculoValorReservasTotal(){
        var acum : Int = 0
        for (i in lista){

             acum += i.valorNoche * i.cantidadNoches

        }
        return println("El total de la reserva es: $acum")
    }

    fun obtenerNombres(): List<String>{
        return lista.map{it.nombreCliente}
    }

}