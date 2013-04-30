//Creating an object type Fraction
public class Fraction {
  int num;
	int den;
	public double size () {
		return Math.abs((double)num/den);
	}
	public Fraction larger (Fraction other){
		if (this.size() >= other.size()){
			return this;
		}else{
			return other;
		}
	}
	public void timesEquals (Fraction p){
		num*=p.num;
		den*=p.den;
	}
	public Fraction times (Fraction other){
		Fraction result = new Fraction();
		result.num = num*other.num;
		result.den = den*other.den;
		return result;
	}
	public void plusEquals (Fraction other){
		if (this.den != other.den){
			int d;
			d = this.den*other.den;
			this.num *= other.den;
			this.den = d;
			this.num+=other.num*this.den;
		}else{
			this.num+=other.num;
		}
	}
	public Fraction plus (Fraction f){
		Fraction result = new Fraction();		
		if (this.den != f.den){
			result.den = this.den*f.den;
			result.num = this.num*f.den + f.num*this.den;
		}else{
			result.den = this.den;
			result.num = this.num + f.num;
		}
		return result;
	}
	public void reduce() {
		for (int i = 2; i<=Math.abs(Math.min(this.num,this.den));i++){
			while (this.num % i==0 && this.den % i == 0){
				this.num/=i;
				this.den/=i;
			}
		}
		if (num < 0 && den < 0){
			Math.abs(num);
			Math.abs(den);
		}
	}
}
