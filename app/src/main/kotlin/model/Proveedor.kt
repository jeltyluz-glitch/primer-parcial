package model

class Proveedor(
    val id: Int,
    val nombre: String,
    val telefono: String,
    val ciudad: String
) {
    // Muestra la información del proveedor
    fun mostrarInfo(): String {
        return "Proveedor [ID: $id] - Nombre: $nombre - Teléfono: $telefono - Ciudad: $ciudad"
    }
}
