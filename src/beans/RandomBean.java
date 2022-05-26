package beans;

public class RandomBean {
	private double T ;

	public RandomBean() {
		setT(0);
	}

	public Number getT() {
		return T;
	}

	public void setT(double t) {
		T = t;
	}
	
	public double calculRandom(double t){
		
		return  Math.random()*t;
	
	
	}
	
}
