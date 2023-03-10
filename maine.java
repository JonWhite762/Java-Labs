interface animal{
	void eat();
	void sleep();
	
	}
	class cat implements animal{
		private String name;
		public cat(String name){
		this.name = name;
		}
	public void eat(){
		System.out.println("Munch! Crunch!");
		}
		
	public void sleep(){
		System.out.println("ZZZZZZZzzzzzzzzzz");
		}	
	
	public void climb(){
		System.out.println("How'd you get up there?");
		}
	public void purrr(){
		System.out.println("Purrrrrrr");
		}
		public String toString(){
			return name;
			
	}
	}
	class maine{
		public static void main(String[] args){
			cat c = new cat("binky");
			System.out.println(c);
			c.eat();
			c.sleep();
			c.climb();
			c.purrr();
			
			}
	}
			