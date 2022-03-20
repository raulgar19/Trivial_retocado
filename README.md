# Trivial_retocado

# Resolución problema 0

Para ello se ha creado un nuevo test que verifique que cuando un jugador saque un 1 vaya a la casilla numero 1. Este test fallaba ya que esta posicion devolvía la 100. Se ha arreglado modificando el metodo tirarDado() y asi refactorizar el código de la posicion en un nuevo metodo llamado nuevaPsicionJugador(). Una vez arreglado, el test pasa coorectamente. 

# Resolución problema 1

Para resolver este problema se han creado dos tests. Uno de ellos que solo agregue un jugador a la partida y otro que agregue 2. De esta manera se confirmará que el test pasa cuando hay mas de dos jugadores mientras que el otro test que solamente agrega 1 jugador falla.

# Resolución problema 2

Para resolver este problema, se crea un test que añada 6 jugadores a la partida. De esta manera devolverá una posición más en el array ya que en vez de guardarse en la posición 0 empieza guardando los datos en la posición 1. Para ello se ha modificado las posiciones del array en el metodo agregar restalonde una posición y asi emp'ezar a contar desde la posición 0 en vez de la 1.