class Trainer extends Person{
	private String Specialization;
	
	//constructor
	public Trainer(String name, int id, String Specialization){
		super(name, id);
		this.Specialization = Specialization;
	}
	
	//getter methods
	public String getSpecialization(){
		return Specialization;
	}
	
	//Abstract method
	public void displayDetails(){
		System.out.println("Member's name:" + getName());
		System.out.println("Member's ID:" + getId());
	}
}