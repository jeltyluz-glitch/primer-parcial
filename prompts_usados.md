# Scripts usados en el examen - Programación III (Caso: Farmacia)

Prompts utilizados con la IA de Android Studio durante el examen.

## Checkpoint 1 - Diseño de clases

```
Estoy haciendo un examen de Programación III con Kotlin. El caso de estudio es una FARMACIA. Hazlo sencillo y con comentarios cortos.

Diseña 3 clases: Medicamento, Categoria y Proveedor.
- Medicamento: id, nombre, precio, stock, fechaVencimiento, categoria, proveedor. Métodos: hayStock(), estaVencido(), aplicarDescuento(porcentaje).
- Categoria: id, nombre, descripcion.
- Proveedor: id, nombre, telefono, ciudad.
Relaciones: un Medicamento pertenece a una Categoria y tiene un Proveedor; una Categoria y un Proveedor pueden tener muchos Medicamentos.
Muéstrame primero el diseño en texto (para pasarlo a un diagrama UML).
```

## Checkpoint 2 - Implementación en Kotlin

```
Implementa en Kotlin las clases Categoria, Proveedor y Medicamento dentro de un package "model", cada una en su propio archivo, aplicando POO (constructores y encapsulamiento). Medicamento: precio y stock con private set; métodos hayStock(), estaVencido(fechaActual), aplicarDescuento(porcentaje), vender(cantidad) y mostrarInfo(). Sin pantallas ni librerías extra.
```

## Checkpoint 5 - Interfaz (completar cuando se use)

```
[Pega aquí el prompt de las 2 pantallas con Jetpack Compose]
```
