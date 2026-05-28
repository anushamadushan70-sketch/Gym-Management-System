abstract class Person{
	private String name;
	private int id;
	
	//constructor for object
	public Person(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	//getters
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	//Abstract method details
	abstract void displayDetails();
}