public class Calculadora {

	private int resultadoSuma;

	/**
	 * 
	 * @param dado1
	 * @param dado2
	 */
	public int sumar(Dado dado1, Dado dado2) {
		setResultadoSuma(dado1.getCaraSuperior()+dado2.getCaraSuperior());
		return getResultadoSuma();
	}

	public int getResultadoSuma() {
		return this.resultadoSuma;
	}

	/**
	 *
	 * @param resultadoSuma
	 */
	public void setResultadoSuma(int resultadoSuma) {
		this.resultadoSuma = resultadoSuma;
	}

}