
fun main() {


    var menu = readln()

    do {
        MostrarMenu()
        when (menu) {
            in "1" -> crearUsuario()
            in "2" -> listarUsuarios()
            in "3" -> FiltrarUsuarios()
            in "4" -> FiltrarJuegos()
            in "0" -> "Saliendo"
            else -> "Holi"
        }
    }while (menu != "0")
}

fun crearUsuario() {
    print("Introduce tu nombre de usuario: ")
    val nombre: String? = readLine()
    do {
        var juegos: String? = readLine()
        if (juegos != "0") {

            juegos.add = juegos
        }
    } while (juegos != "0")
}

fun listarUsuarios() {

}

fun FiltrarUsuarios() {

}

fun FiltrarJuegos() {

}

fun MostrarMenu(){
    println("-MENU-")
    println("1. Crear Usuario");
    println("2. Listar Usuarios");
    println("3. Filtrar Usuarios");
    println("4. Filtrar Juegos");
    println("5. Salir");
}

//DANIEL Y MIKEL