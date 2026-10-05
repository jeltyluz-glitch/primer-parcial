package model

object DatosEjemplo {
    val categorias = listOf(
        Categoria(1, "Analgésicos", "Medicamentos para el dolor"),
        Categoria(2, "Antibióticos", "Combaten infecciones bacterianas"),
        Categoria(3, "Antigripales", "Para síntomas de gripe y resfriado")
    )

    val proveedores = listOf(
        Proveedor(1, "FarmaDistribuciones S.A.", "555-1234", "Buenos Aires"),
        Proveedor(2, "Droguería Central", "555-5678", "Córdoba"),
        Proveedor(3, "Medical Supply Co.", "555-9012", "Rosario")
    )

    val medicamentos = listOf(
        Medicamento(1, "Paracetamol 500mg", 1500.0, 50, "2026-12-31", categorias[0], proveedores[0]),
        Medicamento(2, "Ibuprofeno 400mg", 2200.0, 0, "2025-06-15", categorias[0], proveedores[1]), // Stock 0
        Medicamento(3, "Amoxicilina 875mg", 4500.0, 20, "2027-01-10", categorias[1], proveedores[2]),
        Medicamento(4, "Aspirina 100mg", 1200.0, 35, "2026-09-20", categorias[0], proveedores[0]),
        Medicamento(5, "Gripacontrol Plus", 3100.0, 15, "2025-11-30", categorias[2], proveedores[1])
    )
}
