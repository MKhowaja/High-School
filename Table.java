public class Table {
  	private double height;
  	private double length;
	private double width;
	private int legs;
	private double weight;
	private String shape;
	private String colour;
	
	public Table (double h, double len, double wid, int leg, double w, String s, String c){
		if (len < 0){
			len = Math.abs(len);
		}
		if (wid < 0){
			wid = Math.abs(len);
		}
		if (h < 0){
			h = Math.abs(len);
		}
		if (leg < 0){
			leg = Math.abs(leg);
		}
		if (w < 0){
			w = Math.abs(w);
		}
		length = len;
		width = wid;
		height = h;
		legs = leg;
		weight = w;
		shape = s;
		colour = c;
	}
	
	public Table (Table x){
		length = x.getLength();
		width = x.getWidth();
		height = x.getHeight();
		legs = x.getLegs();
		weight = x.getWeight();
		shape = x.getShape();
		colour = x.getColour();
	}

	public double getHeight(){
		return height;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public int getLegs(){
		return legs;
	}
	public double getWeight(){
		return weight;
	}
	public String getShape(){
		return shape;
	}
	public String getColour(){
		return colour;
	}
	public void putHeight (double x){
		if (x>0 && x<=50){
			height = x;
		}else{
			System.out.println("Error");
		}
	}
	public void putLength (double x){
		if (x>0 && x<=100){
			length = x;
		}else{
			System.out.println("Error");
		}
	}
	public void putWidth (double x){
		if (x>0 && x<=100){
			width = x;
		}else{
			System.out.println("Error");
		}
	}
	public void putLegs (int x){
		if (x>0 && x<=4){
			legs = x;
		}else{
			System.out.println("Error");
		}
	}
	public void putWeight (double x){
		weight = x;
	}
	public void putShape (String x){
		shape = x;
	}
	public void putColour (String x){
		colour = x;
	}
	public double Calculatearea(double length, double weight) {
		double area = length*width;
		return area;
	}
	public double Calculateperimeter (double length, double width){
		double perimeter = 2*(length+width);
		return perimeter;
	}
	public double Calculatesurfacearea(double length, double width, double height){
		double surfacearea = 2*(length*width) + 2*(length*height) + 2*(weight*height);
		return surfacearea;
	}
	public double Calculateweightperleg (int legs, double weight){
		double weightperleg = weight/legs;
		return weightperleg;
	}
	public void Displaydimensions (){
		double [] d = {this.length,this.height,this.width};
		double temp;
		boolean swap;
		for (int i = 0; i<d.length-1;i++){
			swap = false;
			do{
				if (d[i]>d[i+1]){
					temp = d[i];
					d[i] = d[i+1];
					d[i+1]=temp;
				}
			}while (swap == true);
		}
		System.out.println(d[0]+" x "+d[1]+" x "+d[2]);
	}
	public void Displaytable(){
		System.out.println("Height = " + height + "\nLength = " + length + "\nWidth = " + width + "\nLegs = " + legs + "\nWeight = " + weight + "\nShape = " + shape + "\nColour = " + colour);
	}
	public void copytable (Table x){
		height = x.getHeight();
		length = x.getLength();
		width = x.getWidth();
		legs = x.getLegs();
		weight = x.getWeight();
		shape = x.getShape();
		colour = x.getColour();
	}
	public void copylargertable (Table x, Table y){
		Table larger = new Table ();
		if (x.Calculatesurfacearea(x.getLength(), x.getWidth(), x.getHeight())>=y.Calculatesurfacearea(y.getLength(), y.getWidth(), y.getHeight())){
			larger.putHeight(x.getHeight());
			larger.putLength(x.getLength());
		}else{
			larger = y;
		}
	}
}
