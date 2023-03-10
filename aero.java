interface vehicle{
	void movef(int x);
	void moveb(int y);
	}
	
	interface helicopter extends vehicle{
		void moveup(int y);
		void movedown(int y);
		}
	class pawnee implements helicopter{
		private String model;
		
	public pawnee(String model){
	this.model = model;
	}
	public void movef(int x){
	System.out.println("Moved forwards:" + x);
	}
	public void moveb(int x){
	System.out.println("Moved backwards:" + x);
	}
	public void moveup(int y){
	System.out.println("Moved up:" + y);
	}
	public void movedown(int y){
	System.out.println("Moved down:" + y);
		}
	}
class aero {
	public static void main(String[] args){
		pawnee a = new pawnee("Little bird");
		a.movef(300);
		a.moveb(20);
		a.moveup(1200);
		a.movedown(200);
		}
}
		
