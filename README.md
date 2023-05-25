# Proyecto OrageDemo

Este es un proyecto sencillo de formación que realiza pruebas en una página llamada Orange. Utiliza el patrón Page Object para organizar y estructurar el código.

## Manual de Instalación

Sigue estos pasos para configurar el entorno de desarrollo y ejecutar el proyecto SauceDemo:

### Requisitos previos

Asegúrate de tener instalado lo siguiente en tu sistema:

- Java Development Kit (JDK) 8 o superior.
- Gradle (opcionalmente puedes utilizar el wrapper incluido en el proyecto).

### Pasos de instalación

1. Clona este repositorio a tu máquina local o descarga el código fuente en formato ZIP.

2. Abre el proyecto en tu entorno de desarrollo preferido, como IntelliJ IDEA o Eclipse.

3. Configura el proyecto para que utilice el JDK instalado en tu máquina. Puedes hacerlo mediante la configuración del SDK en tu entorno de desarrollo.

4. Asegúrate de que las dependencias definidas en el archivo `build.gradle` están correctamente configuradas. Si utilizas Gradle, el sistema de construcción debería descargar automáticamente las dependencias al sincronizar el proyecto.

5. Verifica la configuración de la página de SauceDemo en el archivo `src/main/java/pageobjects/SauceDemoPage.java`. Asegúrate de que la URL de SauceDemo sea correcta y se ajuste a tu entorno de prueba.

6. Opcionalmente, puedes ejecutar los siguientes comandos en la línea de comandos para compilar y ejecutar las pruebas:

   ```shell
   # Compilar el proyecto
   ./gradlew compileJava
    ```
   Estos comandos utilizan el wrapper de Gradle incluido en el proyecto, por lo que no necesitas tener Gradle instalado en tu sistema.

## Estructura del proyecto

La estructura básica del proyecto se muestra a continuación:
```
├── src
│ ├── main
│ │ └── java
│ │ ├── elements
│ │ │ └── SauceDemoElements.java
│ │ ├── hooks
│ │ │ └── hooks.java
│ │ ├── pages
│ │ │ └── LoginPage.java
│ │ ├── runner
│ │ │ └── runners.java
│ │ └── scripts
│ │ │ └── commons.java
│ │ └── stepDef
│ │ │ └── sauceDemo.java
│ │ └── utils
│ │ │ └── BrowserUtils.java
│ └── resources
│ ├── features
│ │ └── login.feature
│ └── webdriver
│ └── chromedriver.exe
├── build.gradle
└── README.md
```


## Dependencias

El proyecto utiliza las siguientes dependencias en Gradle:

```groovy
dependencies {
    implementation group: 'junit', name: 'junit', version: '4.13.2'
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.8.0'
    implementation group: 'io.cucumber', name: 'cucumber-core', version: '7.8.0'
    implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.8.0'
    implementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.8.0'
    implementation group: 'org.slf4j', name: 'slf4j-api', version: '2.0.7'
    implementation group: 'tech.grasshopper', name: 'extentreports-cucumber7-adapter', version: '1.12.0'
}
```
Asegúrate de tener estas dependencias correctamente configuradas en tu archivo build.gradle o build.gradle.kts.

## Patron Page Object

El proyecto utiliza el patrón Page Object para mejorar la mantenibilidad y reusabilidad del código. El patrón Page Object se basa en la creación de clases que representan las páginas web y contienen los elementos y métodos relacionados con cada página. Esto permite separar la lógica de prueba de la estructura de la página y facilita la escritura de pruebas más robustas.

El código relacionado con el patrón Page Object se encuentra en el directorio ``/src/main/java/pages``. Asegúrate de revisar y seguir este patrón al agregar nuevas pruebas o funcionalidades al proyecto.

## Parametros de lanzamiento

Estas son las opciones de ejecución completas que puedes utilizar al ejecutar el proyecto:

- `-ea`: Habilita las aserciones.
- `-Dweb-driver=firefoxDriver`: Especifica el controlador del navegador como Firefox.
- `-Dheadless-mode=false`: Deshabilita el modo headless del navegador.
- `-DfullSteps=true`: Ejecuta todos los pasos de Cucumber.
- `-Dcucumber.filter.tags="@SauceDemo"`: Filtra los escenarios de Cucumber para ejecutar solo aquellos con la etiqueta @SauceDemo.
- `-Dwindow-size=750x1334`: Establece el tamaño de la ventana del navegador en 750x1334 píxeles.
