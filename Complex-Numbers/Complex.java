public class Complex {
  	double re;
	double im;
	
	public double modulus (){
		return Math.sqrt(Math.pow(this.re,2) + Math.pow(this.im,2));
	}
	public void scale (double x){
		this.re *=x;
		this.im*=x;
	}
	public Complex sum (Complex other){
		Complex result = new Complex();
		result.re = this.re+other.re;
		result.im = this.im + other.im;
		return result;
	}
	public Complex times (Complex other){
		Complex result = new Complex();
		result.re = this.re*other.re + this.re*this.im*-1;
		result.im = this.re * other.im + this.im * other.re;
		return result;
	}
}
