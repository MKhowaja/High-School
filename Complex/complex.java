public class Complex2 {
  double re;
	double im;
	public double modulus (){
		return Math.sqrt(Math.pow(this.re,2) + Math.pow(this.im,2));
	}
	public void scale (double x){
		this.re *=x;
		this.im*=x;
	}
	public Complex2 sum (Complex2 other){
		Complex2 result = new Complex2();
		result.re = this.re+other.re;
		result.im = this.im + other.im;
		return result;
	}
	public Complex2 times (Complex2 other){
		Complex2 result = new Complex2();
		result.re = this.re*other.re + this.re*this.im*-1;
		result.im = this.re * other.im + this.im * other.re;
		return result;
	}
}
