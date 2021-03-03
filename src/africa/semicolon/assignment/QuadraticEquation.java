public class QuadraticEquation{
	private double coefficientOfXSquared;
	private double coefficientOfX;
	private double constant;
	private double x1;
	private double x2;

	public void setCoefficientOfXSquared(double number){
		coefficientOfXSquared = number;
	}
	public double getCoefficientOfXSquared(){
		return coefficientOfXSquared;
	}
	public void setCoefficientOfX(double number){
		coefficientOfX = number;
	}
	public double getCoefficientOfX(){
		return coefficientOfX;
	}
	public void setConstant(double constant){
		this.constant = constant;
	}
	public double getConstant(){
		return constant;
	}
	public void calculateX1(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		x1 =(-coefficientOfX + squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getX1(){
		return x1;
	}
	public void calculateX2(){
		double squareRootValue = Math.sqrt((coefficientOfX * coefficientOfX) - (4 * coefficientOfXSquared * constant));
		x2 =(-coefficientOfX - squareRootValue) / (2 * coefficientOfXSquared);
	}
	public double getX2(){
		return x2;
	}
	

}