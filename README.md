## Despliegue de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el contenido:

```
java.runtime.version=19
```

1. Crear cuenta en heroku.com y github.com
2. Tener configurado git en el ordenador:
   1. `git config --glogal user.name "Milton Soto"`
   2. `git config --glogal user.name miltonsm68@gmail.com`
3. Subir el proyecto a GitHub desde Intellij IDEA desde la opcion: VCS > Share project on GitHub
4. Desde Heroku, crear app y elegir método HitHub y buscar el repositorio subido
5. Habilitar deploy automáticamente y ejecutar el Deploy