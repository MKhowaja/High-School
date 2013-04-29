//An object circle
public class Circle {
  double x; //x co-ordinate
	double y; //y co-ordinate
	double r; //radius
	public double area () {
		return Math.pow(this.r,2) * Math.PI;
	}
	public Circle2 smaller (Circle2 other){ //Returns smaller circle
		if (this.area()<=other.area()){
			return this;
		}else{
			return other;	
		}
	}
	public boolean isInside (Circle2 other){ //Checks if implicit circle is inside the explicit circle
		if (this.smaller(other)==this && this.r + Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2))<other.r){
			return true;
		}else{
			return false;
		}
	}
}
