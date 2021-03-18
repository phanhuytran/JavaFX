package V_TableView;

public class V_TableView_Student {

	private int id;
	private String name;
	private String email;
	private int age;

	public V_TableView_Student(int id, String name, String email, int age) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setAge(age);
	}
	
	public V_TableView_Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
