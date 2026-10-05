package model

class Categoria(
    val id: Int,
    val nombre: String,
    val descripcion: String
) {
    // Muestra la información de la categoría
    fun mostrarInfo(): String {
        return "Categoría [ID: $id] - Nombre: $nombre - Descripción: $descripcion"
    }
}
