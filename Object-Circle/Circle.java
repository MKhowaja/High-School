//An object circle
public class Circle {
 	double x; //x co-ordinate
	double y; //y co-ordinate
	double r; //radius
	
	public Circle (double a, double b, double c) { //Construct circle
		x = a;
		y = b;
		r = c;
	}
	
	public double area () { //Return area of circle
		return Math.pow(this.r,2) * Math.PI;
	}
	public Circle smaller (Circle other){ //Returns smaller circle
		if (this.area()<=other.area()){
			return this;
		}else{
			return other;	
		}
	}
	public boolean isInside (Circle other){ //Checks if implicit circle is inside the explicit circle
		if (this.smaller(other)==this && this.r + Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2))<other.r){
			return true;
		}else{
			return false;
		}
	}
	public Circle smaller (Circle other){ //Returns the smaller circle
		if (this.area()<=other.area()){
			return this;
		}else{
			return other;	
		}
	}
	public boolean equals (Circle a){ //Checks if implicit and explicit objects are the same 
		return (a!=null)&& (x==a.x && y==a.y && r==a.r);
	}
	public String toString(){
		return "centre: (" + x + ", "+ y + ")\tradius: " + r;
	}
}
