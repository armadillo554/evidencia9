public class Dado {

	private int caraSuperior;

	public int lanzamiento() {
		setCaraSuperior((int)Math.random()*6+1);
		return caraSuperior;
	}

	public int getCaraSuperior() {
		return this.caraSuperior;
	}

	/**
	 * 
	 * @param caraSuperior
	 */
	public void setCaraSuperior(int caraSuperior) {
		this.caraSuperior = caraSuperior;
	}

}