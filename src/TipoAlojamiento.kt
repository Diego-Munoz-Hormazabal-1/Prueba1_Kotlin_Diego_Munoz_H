sealed class TipoAlojamiento (val mensajeTipoAlojamiento: String){

    data object  Habitacion : TipoAlojamiento("Habitaciones vistas al lago")
    data object  Cabana: TipoAlojamiento ("Cabañas sin vecinos")
    data object  Departamento: TipoAlojamiento ("Departamentos sin vistas")

    fun mostrarTipoAlojamiento(): String{
        return mensajeTipoAlojamiento
    }
}



