package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    //le asignamos url= /Hola   para acceder a HolaMundo...1. Ejecutar 2. estando en ejecucion.. http://localhost:8081/Hola para acceder.
    //@GetMapping...  Habilita URL para acceder derde el exterior por Url

    /**
     * http://localhost:8081/hola
     */
    @Value("${app.message}")  //inyecta una propiedad dentro de java

    String message; //todo lo que esta dentro de value lo remplaza a message

    @GetMapping("/hola")
    public String HolaMundo(){

        /**
         * imprimimos mensage de la variable traida de "application.properties", se mostrara aqui en consola IntellIJ
         * una vez que se entre desde la web por url, se vera aqui en consola, no en la web, pero una vez que se accede a la web
         */
        System.out.println(message);

        return  "Hola Mundo";  // se muestra a travez de una url desde web
    }

    //@GetMapping...  Habilita URL para acceder derde el exterior por Url
    //@GetMapping("/bootstrap")
    @GetMapping("/")    //ponemos solo barra para que al comenzar la aplicacion muestre este contenido directamente

    public String bootstrap(){
        //return """
         //       """;
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
                  </head>
                  <body>
                    <h1>Hello, world!</h1>
                    <a class="btn btn-primary"  href="https://www.google.com>Google</a>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
                  </body>
                </html>
                """;


    }
}

//Importante: en spring hay dos tipos de controladores
//1 @RestController  ... controlador que permite trabajar con JSON
//2 @Controller  ....    Controlador normal para spring uvc que permite cargar vstas Html (no usamos esto poruqe no tenemos vistas solo devolvemos datos)