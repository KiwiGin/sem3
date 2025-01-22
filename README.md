# Script para validar codigo de estudiante

## GRUPO 1
Integrantes:
- TORRES TINEO, CRISTHIAN ANTHONY 	22200050
- BAYES ENRIQUEZ, EVA MARÍA FLORISA 	22200006
- MELENDEZ BLAS, JHAIR ROUSSELL	22200199
- PACOTAYPE CHUCHON, DIEGO ALONZO	22200214
- GONZALES MENDIETA, CLAUDIO	22200020

### Descripción general
Este programa en Java permite validar el formato de un código universitario ingresado por el usuario. Utiliza expresiones regulares y verificaciones adicionales para asegurarse de que el código cumpla con ciertos requisitos específicos, como el formato, el rango del año de ingreso y el número de matrícula.

### Objetivo principal
El objetivo del programa es garantizar que los códigos universitarios ingresados sigan un formato preestablecido, evitando errores y asegurando la consistencia en los datos. Una vez que se verifica que el código es válido, se muestra un mensaje de confirmación.

### Funciones principales del script
#### Lectura de datos:
- Usa la clase Scanner para capturar la entrada del usuario desde la consola.
- Permite que el usuario ingrese repetidamente el código hasta que sea válido.

#### Validación del formato:
- Usa una expresión regular (regex) para definir las reglas que debe cumplir el código universitario.
- Asegura que el código tenga este formato exacto: PE<aa>FISI2<nnnn>
  Donde:
  PE: Fijo (prefijo obligatorio).
  <aa>: Año de ingreso (2 dígitos, entre 00 y 24, tomamos en cuenta desde el año de fundación de la facultad FISI hasta el año 2024).
  FISI2: Fijo (debe aparecer exactamente así, seguido del número 2).
  <nnnn>: Número de matrícula (4 dígitos, entre 0001 y 0128).

#### Validación adicional:
- Año de ingreso:
  - Comprueba que los dos dígitos del año (<aa>) estén dentro del rango válido (00 a 24).
- Número de matrícula:
  - Verifica que el número (<nnnn>) esté en el rango permitido (1 a 128).

#### Mensajes de error claros:
- Muestra mensajes específicos para ayudar al usuario a corregir errores:
  - Si el formato no coincide con el esperado.
  - Si el año de ingreso está fuera del rango permitido.
  - Si el número de matrícula es inválido.

#### Bucle de repetición:
Usa un bucle while para pedir el código nuevamente si no cumple con los requisitos, asegurando que solo se acepte un código válido.

#### Salida del programa:
Cuando se valida un código correctamente, el programa finaliza mostrando un mensaje de éxito.
