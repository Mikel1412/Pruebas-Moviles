//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("-MENU-")
    println("1. Crear Usuario");
    println("2. Listar Usuarios");
    println("3. Filtrar Usuarios");
    println("4. Filtrar Juegos");
    println("5. Salir");

    var menu = readln()

    when (menu) {
        in 1 ->crearUsuario()
        in 2 ->
        in 3 ->
        in 4 ->
        in 5 ->
        else ->
    } while (menu != 0)

}

fun crearUsuario() {
    print("Introduce tu nombre de usuario: ")
    val nombre: String = readLine()
    val juegos: String? = readLine()
}

//DANIEL Y MIKEL