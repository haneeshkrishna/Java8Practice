/**
 * 
 */
package java8;

/**
 * @author MakineniH
 *
 */
public class Emp {

	private int id;
	private String name;
	private long salary;
	private String designation;

	public Emp(int i, String n, long s, String d) {
		this.id = i;
		this.name = n;
		this.salary = s;
		this.designation = d;
	}

	@Override
	public String toString(){
		return id+name+salary+designation;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}