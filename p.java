class Employee {
	private String name;
	
	
		public Employee(String name) {
			this.name = name;
			
		}
		public void works(){
			System.out.println("Hard at work");
		}
		public String toString(){
			return name;
		}
}		
	class policy extends Employee {
		public policy(String name){
			super(name);
		}
		public void beneficiary(){
		System.out.println("You now have 2 years Waranty");
		}
		public void PID(){
			System.out.println("Policy Identifcation Number: 72A");
		}
		public void amount(){
			System.out.println("Amount: 1200$");
		}
	}
	
	
	class salesperson extends Employee {
		public salesperson(String name){		
			super(name);
		}
		public void salary(){
			System.out.println("Current Salary of: 375800$");
		}
		public void sells(){
			System.out.println("Policy Sold");
		}
		public void id(){
			System.out.println("Salesperson ID: 24");
		}
	}
	
	class Lab41 {
		public static void main(String[] args) {
		
			salesperson d = new salesperson("Josh");
			System.out.println(d);
			d.id(); d.salary(); d.sells();
			policy t = new policy("POLICIES");
			System.out.println(t);
			t.beneficiary(); t.amount(); t.PID();
		}
		
	}
			