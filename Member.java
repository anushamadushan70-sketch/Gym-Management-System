class Member extends Person{
	private int weight;
	private String goal;
	
	//Constructor for object
	public Member(String name, int id, int weight, String goal){
		super(name, id);
		setWeight(weight);
		this.goal = goal;
	}
	
	//setter for weight
	public void setWeight(int weight){
		if(weight > 50){
			this.weight = weight;
		}
		else{
			this.weight = 50;
		}
	} 
	
	//getter for weight
	public int getWeight(){
		return weight;
	}
	
	//getter for goal
	public String getGoal(){
		return goal;
	}
	
	//Abstract method
	public void displayDetails(){
		System.out.println("Member's name:" + getName());
		System.out.println("Member's ID:" + getId());
		System.out.println("Member's weight:" + getWeight());
		System.out.println("Member's Goal:" + getGoal());
	}
}