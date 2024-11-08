# Elección del Patrón de Diseño: Template Method

Para el sistema de gestión de pedidos en el restaurante, elegimos el patrón *Template Method* porque necesitamos un proceso estándar para preparar los pedidos, en el que cada tipo de comida (pizza, ensalada, etc.) sigue un flujo similar, con pasos como **preparar ingredientes**, **cocinar** y **servir**, pero con variaciones en los detalles.

El patrón de diseño *Template Method* nos permite definir este esquema general en una clase base y dejar que las subclases implementen las particularidades de cada tipo de comida. Así, logramos un proceso:

- *Consistente y organizado*, ya que todos los tipos de pedidos siguen el mismo flujo.
- *Flexible*, pues permite adaptar los detalles de cada paso para diferentes tipos de comida.
  
Con esta solución, evitamos duplicación de código, facilitamos la escalabilidad y mejoramos la mantenibilidad del sistema.
