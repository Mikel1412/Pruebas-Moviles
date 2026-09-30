import kotlin.String
import kotlin.collections.MutableList

val usuarios: MutableList<String> = mutableListOf()

fun main() {


    do {
        mostrarMenu()
        var menu = readln()
        when (menu) {
            in "1" -> crearUsuario()
            in "2" -> listarUsuarios()
            in "3" -> filtrarUsuarios()
            in "4" -> filtrarJuegos()
            in "0" -> "Saliendo"
            else -> "Holi"
        }
    }while (menu != "0")
}

fun crearUsuario() {
    print("Introduce tu nombre de usuario: ")
    var nombre: String = readln()
    val juegos: MutableList<String> =  mutableListOf()
    print("Introduce juegos del usuario (0 para salir): ")
    do {
        var juego: String = readln()
        if (juego != "0") {
            juegos.add(juego)
        }
    } while (juego != "0")
    Usuario(nombre,juegos)

    usuarios.add(nombre)
}

fun listarUsuarios() {
    println("Usuarios: ")
    for(usuario in usuarios) {
        println(usuario)
    }
}

fun filtrarUsuarios() {
    print("Introduce el nombre de usuario a filtrar:")
    var nombre: String = readln()
    for (usuario in usuarios) {
        if (nombre == usuario) {

        }
    }
}

fun filtrarJuegos() {

}

fun mostrarMenu(){
    println("-MENU-")
    println("1. Crear Usuario");
    println("2. Listar Usuarios");
    println("3. Filtrar Usuarios");
    println("4. Filtrar Juegos");
    println("5. Salir");
}

//DANIEL Y MIKEL