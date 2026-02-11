


/*                RESPUESTAS
1-  Para cada opción (A y B), determine la complejidad asintótica de las operaciones:

    Yo implemente la B

   a) Enqueue: O(N) cota superior (hay que recorrer la lista), Ω(1) cota inferior (si es el primero o mayor prioridad).

   b) Dequeue: O(1) / Θ(1) porque siempre se saca de la cabeza.


2- Suponga que el sistema recibe N trabajos y luego los procesa todos.

    Para cada opción:
    Determine la complejidad total del proceso completo:

    Complejidad Total para n cantidad

   a) Insertar N: La inserción de N trabajos tiene una complejidad total de $O(N)$ porque cada operación individual es constante al añadir al final de su respectiva cola

   b) Procesar N: La inserción de N trabajos alcanza una complejidad de $O(N^2)$ debido a que cada nuevo elemento requiere recorrer la lista para encontrar su posición correcta según la prioridad.

3- Basándose en su análisis:
a. ¿Cuál implementación es más eficiente en el peor caso?
b. ¿Cuál sería más simple de mantener?
c. Justifique su respuesta con argumentos de complejidad y diseño

   En resumen:
   La Opción A es más eficiente en tiempo (O(1) para todo), pero la Opción B es más simple de
   mantener (y de hacer si java.util) porque usa una sola estructura de datos y menos punteros de control.
   
   En resumen, la Opción A gana en velocidad porque tiene una complejidad de O(N), lo que significa que no importa cuántos trabajos lleguen, el sistema no se pone lento al insertarlos. Sin embargo, la Opción B es mucho más sencilla de programar y mantener.
 */

