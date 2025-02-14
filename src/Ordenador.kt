class Ordenador(nombre: String, precio: Double, var tipoOrdenador: TipoOrdenador = TipoOrdenador.BASICO) : Articulo(nombre,precio) {


    override fun promocionNavidad(porcentaje: Double) {
        if (precio < 500.0){
            super.promocionNavidad(porcentaje)
        }else{
            println("$nombre no puede acceder a la promoción")
        }
    }

    override fun toString(): String {
        return super.toString() + " {$tipoOrdenador}"
    }
}