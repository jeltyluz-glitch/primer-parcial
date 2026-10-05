package model

class Medicamento(
    val id: Int,
    val nombre: String,
    precio: Double,
    stock: Int,
    val fechaVencimiento: String,
    val categoria: Categoria,
    val proveedor: Proveedor
) {
    // Encapsulamiento: lectura pública, modificación privada
    var precio: Double = precio
        private set

    var stock: Int = stock
        private set

    // Verifica si hay stock disponible
    fun hayStock(): Boolean {
        return stock > 0
    }

    // Compara la fecha de vencimiento con la fecha actual (formato "yyyy-MM-dd")
    fun estaVencido(fechaActual: String): Boolean {
        return fechaVencimiento < fechaActual
    }

    // Calcula y devuelve el precio con descuento sin modificar el original
    fun aplicarDescuento(porcentaje: Double): Double {
        return precio * (1 - porcentaje / 100.0)
    }

    // Vende una cantidad reduciendo el stock si hay suficiente stock disponible
    fun vender(cantidad: Int): Boolean {
        if (cantidad > 0 && stock >= cantidad) {
            stock -= cantidad
            return true
        }
        return false
    }

    // Muestra la información completa del medicamento y sus relaciones
    fun mostrarInfo(): String {
        return "Medicamento [ID: $id] - Nombre: $nombre - Precio: $$precio - Stock: $stock - " +
                "Vencimiento: $fechaVencimiento\n" +
                "  -> ${categoria.mostrarInfo()}\n" +
                "  -> ${proveedor.mostrarInfo()}"
    }
}
