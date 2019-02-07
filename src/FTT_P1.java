
public class FTT_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TESTE");
		
		Calc c = new Calc();
		c.setX(10);
		c.setY(1);
		
		System.out.println(c.add());
	}

	
}
class Calc {
	
	int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int add(){
		
		return this.getX() + this.getY();
	}
}
