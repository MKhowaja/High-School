public class Rectangle {
  private int left;
	private int bottom;
	private int width;
	private int height;
	
	public int GetLeft(){
		return left;
	}
	public int GetBottom(){
		return bottom;
	}
	public int GetWidth(){
		return width;
	}
	public int GetHeight(){
		return height;
	}
	public void PutLeft(int x){
		left = x;
	}
	public void PutBottom(int x){
		bottom = x;
	}
	public void PutWidth(int x){
		width = x;
	}
	public void PutHeight(int x){
		height = x;
	}
	public Rectangle(int a, int b, int c, int d){
		left = a;
		bottom = b;
		width = c;
		height = d;
	}
	public String toString(){
		return "base: (" + left + ", " + bottom + " w: " + width + " h: " + height;
	}
	public int Perimeter(){
		return (width + height)*2;
	}
	public int Area(){
		return width * height;
	}
	public static Rectangle Intersection(Rectangle x, Rectangle y){
		Rectangle temp = new Rectangle(0,0,0,0);
		if (x.GetBottom() < y.GetBottom() && x.GetLeft() < y.GetLeft()){
			if ((x.GetLeft()+ x.GetWidth())>y.GetLeft() && (x.GetBottom() + x.GetHeight())>y.GetBottom()){
				temp.PutBottom(y.GetBottom());
				temp.PutLeft(y.GetLeft());
				temp.PutWidth(x.GetLeft()+ x.GetWidth()-temp.GetLeft());
				temp.PutHeight(x.GetBottom() + x.GetHeight() - temp.GetBottom());
			}
			else{
				
			}
		}else if (x.GetBottom() > y.GetBottom() && x.GetLeft() > y.GetLeft()){
			if ((y.GetLeft()+ y.GetWidth())>x.GetLeft() && (y.GetBottom() + y.GetHeight())>x.GetBottom()){
				temp.PutBottom(x.GetBottom());
				temp.PutLeft(x.GetLeft());
				temp.PutWidth(y.GetLeft()+ y.GetWidth()-temp.GetLeft());
				temp.PutHeight(y.GetBottom() + y.GetHeight() - temp.GetBottom());
			}
			else{
				
			}
		}
		return temp;
	}
}
