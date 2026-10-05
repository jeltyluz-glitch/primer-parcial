package model

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaMedicamentos(
    onNavigateToProveedores: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Farmacia") },
                actions = {
                    TextButton(onClick = onNavigateToProveedores) {
                        Text("Proveedores")
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(DatosEjemplo.medicamentos) { medicamento ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = medicamento.nombre,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Categoría: ${medicamento.categoria.nombre}",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Precio: $${medicamento.precio}",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        val stockText = if (medicamento.hayStock()) {
                            "Stock: ${medicamento.stock}"
                        } else {
                            "Sin stock"
                        }
                        Text(
                            text = stockText,
                            style = MaterialTheme.typography.bodyMedium,
                            color = if (medicamento.hayStock()) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.error
                        )
                    }
                }
            }
        }
    }
}
