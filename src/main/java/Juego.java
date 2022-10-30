public class Juego {

	/**
	 * 
	 * @param resultadoSuma
	 */
	public void resultado(int resultadoSuma) {
		if (resultadoSuma==7){
			System.out.println("¡Ganaste!");
		}else{
			System.out.println("Has perdido");
		}
	}

	/**
	 * 
	 * @param juego
	 */
	public void nuevoJuego(Juego juego) {
		Dado dado1=new Dado();
		Dado dado2=new Dado();
		dado1.lanzamiento();
		dado2.lanzamiento();
		resultado(dado1.getCaraSuperior()+dado2.getCaraSuperior());
		}

}