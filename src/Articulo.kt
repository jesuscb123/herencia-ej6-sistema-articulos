open class Articulo(var nombre: String, var precio: Double) {
    private var id = generarId()

    companion object{
        var totalArticulos = 0
    }

    private fun generarId(): Int{
        totalArticulos++
        return totalArticulos
    }

    open fun promocionNavidad(porcentaje: Double){
        val descuento = precio * (porcentaje / 100)
        precio -= descuento
    }


    override fun toString(): String {
        return "$nombre} - {${"%.2f".format(precio)}}€ ID: {$id}"
    }
}