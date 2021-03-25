import java.math.BigDecimal;

public class Developer {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salray == null) ? 0 : salray.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salray == null) {
			if (other.salray != null)
				return false;
		} else if (!salray.equals(other.salray))
			return false;
		return true;
	}

	private int age;
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Developer [age=" + age + ", salray=" + salray + ", name=" + name + "]";
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	private BigDecimal salray;
	
	private String name;

	public Developer(int age, BigDecimal salray, String name) {
		super();
		this.age = age;
		this.salray = salray;
		this.name = name;
	}

	/**
	 * @return the salray
	 */
	public BigDecimal getSalray() {
		return salray;
	}

	/**
	 * @param salray the salray to set
	 */
	public void setSalray(BigDecimal salray) {
		this.salray = salray;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


}
