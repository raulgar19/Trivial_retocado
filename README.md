# Trivial_retocado

# Resolución problema 0

Para ello se ha creado un nuevo test que verifique que cuando un jugador saque un 1 vaya a la casilla numero 1. Este test fallaba ya que esta posicion devolvía la 100. Se ha arreglado modificando el metodo tirarDado() y asi refactorizar el código de la posicion en un nuevo metodo llamado nuevaPosicionJugador(). Una vez arreglado, el test pasa coorectamente. 

# Resolución problema 1

Para resolver este problema se han creado dos tests. Uno de ellos que solo agregue un jugador a la partida y otro que agregue 2. De esta manera se confirmará que el test pasa cuando hay mas de dos jugadores mientras que el otro test que solamente agrega 1 jugador falla.

# Resolución problema 2

Para resolver este problema, se crea un test que añada 6 jugadores a la partida. De esta manera devolverá una posición más en el array ya que en vez de guardarse en la posición 0 empieza guardando los datos en la posición 1. Para ello se ha modificado las posiciones del array en el metodo agregar restalonde una posición y asi emp'ezar a contar desde la posición 0 en vez de la 1.

# Resolución problema 3

Para este problema se ha creado un test que confirme que el jugador sale de la carcel. Al rpincipio este test pasa pero en verdad el jugador no sale de la carcel por lo que se crea un metodo en la clase Game llamado EstaEnLaCarcel(). Con este metodo creamos una comprobación más segura. Al ejecutar el test nuevamente falla ya que el array que devuelve el metodo estaEnLaCarcel() da una posición negativa, por lo que le añadimos un + 1. Al volver a ejecutar el test vueolve a dar error ya que el assertion devuelve diferentes valores. Para ello en el metodo tirarDado se le añade una fila nueva al principio y de esta manera el test pasa sin nungún fallo.

# Resolución problema 4

Para este problema se ha creado un test que corrija que ganador = true. Para que este test pase correctamente, se han modificado los codigos en la clase juego y en el launcher cambiando las devoluciones de true por false y cambiando de nombre la variable noGanador por ganador.

# Resolución problema 5

Para este problema se ha creado un metodo llamado cambioJugador() que contenga el código repetitivo y se ha llamado en su lugar a este nuevo metodo pasandole los parametros necesarios en los métodos de respuesta correcta y resapuesta incorrecta.

# Resolución problema 6

Para este problema se ha creado el método refactRespuestaCorrecta() donde se ha guardado el código duplicado que imprime si la respuesta del jugador es correcta. En el método fueRespuestaCorrecta() se ha creado un parámetro boolean llamado ganador que se igualará al nuevo método en sus respectivos sitios.

# Resolucion problema 7

Para resolver este problema se ha creado un test que verifique que las preguntas van rotando. Al principiop como es de esperar da error ya que las preguntas no se ciclan. Par ello, se ha modificado el codigo en el método hacerPregunta() donde  se ha creado un nuevo parámetro que hace que la primera pregunta pase de la primera posición a la última. De esta manera el test pasa sin problemas.