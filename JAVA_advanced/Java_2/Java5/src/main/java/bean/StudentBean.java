package bean;

public class StudentBean {
	private String id;
	private String name;
	private String idClass;
	private String address;
	private String email;
	private String image;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(String id, String name, String idClass, String address) {
		super();
		this.id = id;
		this.name = name;
		this.idClass = idClass;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdClass() {
		return idClass;
	}
	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentBean(String id, String name, String idClass, String address, String email, String image) {
		super();
		this.id = id;
		this.name = name;
		this.idClass = idClass;
		this.address = address;
		this.email = email;
		this.image = image;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
