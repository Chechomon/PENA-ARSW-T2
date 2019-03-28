# Parcial T2

El diseño de esta aplicacion implementa el principio open closed por lo que presenta una gran facilidad al momento de extender ya que se utilizaron abstracciones al momento de la creacion, lo que permite un bajo acoplamiento por ejemplo en el caso de la persistencia hay una interface llamada WeatherAppPersistence, por lo tanto al momento de cambiar de persistencia (en memoria, base de datos, etc) solo se implementa esta clase al nuevo modelo de persistencia y gracias a la inyeccion de dependencias implementada con las anotaciones en springboot solo cambiando una anotacion se cambia la persistencia lo cual lo hace altamente extendible. 

La forma de ejecutar localmente es:
* Ejecutar la aplicacion
* Entrar a un navegador
* Colocar la url localhost:5000/weather
* Por ultimo agregas a la url la ciudad que quieres buscar. Por ejemplo: localhost:5000/weather/bogota

## URLs

* https://github.com/Chechomon/PENA-ARSW-T2
* https://salty-cove-91657.herokuapp.com/
