# Trivial_retocado

# Resolución problema 0

Para ello se ha creado un nuevo test que verifique que cuando un jugador saque un 1 vaya a la casilla numero 1. Este test fallaba ya que esta posicion devolvía la 100. Se ha arreglado modificando el metodo tirarDado() y asi refactorizar el código de la posicion en un nuevo metodo llamado nuevaPsicionJugador(). Una vez arreglado, el test pasa coorectamente. 

# Resolución problema 1

Para resolver este problema se han creado dos tests. Uno de ellos que solo agregue un jugador a la partida y otro que agregue 2. De esta manera se confirmará que el test pasa cuando hay mas de dos jugadores mientras que el otro test que solamente agrega 1 jugador falla.