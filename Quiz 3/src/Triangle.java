
public class Triangle extends GeometricObject{
	//naming double data fields
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	double area;
	double Perimeter;
//no arg constructor for Triangle
public Triangle()
{
}
//Constructor for triangle
public Triangle(double side1, double side2,double side3){
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}
//getters and setters for the side lengths
	public double getSide1() {
	return side1;
}
public void setSide1(double side1) {
	this.side1 = side1;
}
public double getSide2() {
	return side2;
}
public void setSide2(double side2) {
	this.side2 = side2;
}
public double getSide3() {
	return side3;
}
public void setSide3(double side3) {
	this.side3 = side3;
}
//get area method, returns area
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		
		return area;
	}
//returns perimeter of triangle
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		Perimeter = side1+side2+side3;
		return Perimeter;
	}
//returns description of the triangle
	public String toString(){
		return "created:" + getDateCreated() + "\ncolor: " + getColor() +
			      " and filled: " + isFilled();
		
	}

}
