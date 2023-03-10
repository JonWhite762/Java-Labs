 class animal {
	 protected string name;
	 
	public animal(String name){
		this.name = name;
	}
	public void noise() {
		System.out.println("Animal noise");
	}
	public void eat(){
		System.out.println("CRUNCH MUNCH");
	}
	public void sleep(){
		System.out.println("Zzzzzzzz");
	}
	public String toString(){
		return name;
	}
	
	class frog extends animal{
		public frog(string name){
			super(name);
		}
		public void noise(){
			System.out.println("RIBIT");
		}
		public void eat(){
			System.out.println("Splat Splat");
		}
		public void sleep(){
		System.out.println("NAP time");
		}
	}
		class frog{
			public static void main(String[] args){
				frog d = new frog(Squiggles);
				System.out.println(d);
				d.eat(); d.sleep(); d.noise();
			}
		}
 }	