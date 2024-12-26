package java_161_ControlOfFlow;

public class ControlOfFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlOfFlow con = new ControlOfFlow();
		con.whileLoop();
	}
	public void switchStatement(int numberOfWheel) {
		switch(numberOfWheel) {
			case 1:
				System.out.println("It's one foot bicycle.");
				break;
			case 2:
				System.out.println("It's motorcycle or bicycle.");
				break;
			case 3:
				System.out.println("It's three wheel car.");
				break;
			case 4:
				System.out.println("It's car.");
				break;
			default:
				System.out.println("It's an expensive car.");
				break;
		}
	}
	public void whileLoop() {
		int loop= 0;
		while(loop< 12) {
			loop++;
			switchStatement(loop);
		}
	}
}
