# Árbol Binario de Búsqueda (ABB) en Java

## Descripción

Este proyecto implementa un **Árbol Binario de Búsqueda (ABB)** utilizando Java.

Un ABB es una estructura de datos jerárquica donde cada nodo cumple la siguiente propiedad:

* Todos los valores del subárbol izquierdo son **menores** que el nodo.
* Todos los valores del subárbol derecho son **mayores** que el nodo.

Esta propiedad permite realizar operaciones de búsqueda, inserción y eliminación de manera eficiente.

---

## Estructura del proyecto

El proyecto está organizado en las siguientes clases:

### NodoBinario.java

Representa un nodo del árbol binario y contiene:

* El valor almacenado en el nodo
* Referencia al nodo padre
* Referencia al hijo izquierdo
* Referencia al hijo derecho

La clase es **genérica**, lo que permite almacenar cualquier tipo de dato que implemente `Comparable`.

---

### ArbolBinarioBusqueda.java

Clase controladora que gestiona la estructura del árbol.

Implementa las operaciones principales del ABB:

* Inserción de elementos (`add`)
* Búsqueda iterativa (`buscarIterativo`)
* Eliminación de nodos (`remove`)
* Modificación de elementos (`modificar`)
* Verificación de nodo raíz, hoja o nodo interno

---

### Main.java

Clase principal que contiene ejemplos de uso del árbol:

* Inserción de valores
* Búsqueda de elementos
* Eliminación de nodos
* Modificación de valores

---

## Funcionalidades implementadas

El árbol permite realizar las siguientes operaciones:

* Inserción de elementos manteniendo el orden del ABB.
* Búsqueda iterativa de un valor dentro del árbol.
* Eliminación de nodos considerando los tres casos posibles:

  * Nodo sin hijos
  * Nodo con un solo hijo
  * Nodo con dos hijos
* Modificación de un valor eliminando el nodo original y agregando uno nuevo.

