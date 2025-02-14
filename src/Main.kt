fun mostrarArticulos(listaArticulos: Array<Articulo>){
    for (articulo in listaArticulos){
        articulo.promocionNavidad(20.0)
        println(articulo)

    }

}

fun main(){
    val articulo1 = Articulo("zapatillas Nike",25.0)
    val articulo2 = Articulo("PSP",45.0)
    val ordenadorGaming = Ordenador("pc READY", 1299.99, tipoOrdenador = TipoOrdenador.GAMING)
    val ordenadorBasico = Ordenador("pc Basic", 399.99)
    val listaArticulos = arrayOf(articulo1,articulo2,ordenadorGaming,ordenadorBasico)
    mostrarArticulos(listaArticulos)

}