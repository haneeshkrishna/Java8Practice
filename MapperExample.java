/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import java.util.List;

public class MapperExample {

	public static void main(String[] args) {

		List<Emp> allEmpList = getAllEmps();
	//	System.out.println(allEmpList);
		
		List<Emp> empForHR = new ArrayList<>();
		for(Emp e : allEmpList){
			Emp temp = new Emp(e.getId(),e.getName(),e.getSalary(),e.getDesignation());
			temp.setSalary(0);
			empForHR.add(temp);
		}
	//	System.out.println(empForHR);
		
		empForHR = allEmpList.stream().map(e -> {
		//	System.out.println(e.getSalary());
			if(e.getSalary() == 100){
			e.setSalary(0L);
			}
			else{ 
				e.setSalary(200L);
			}
			return e;
		}).collect(Collectors.toList());
	//	System.out.println(empForHR);
		
		
		Emp[] emp = empForHR.toArray(new Emp[empForHR.size()]);
		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp));
		 
	}
	
	

	private static List<Emp> getAllEmps() {
		List<Emp> el = new ArrayList<>();
		Emp e1 = new Emp(1, "Haneesh", 100L, "SE");
		el.add(e1);
		Emp e2 = new Emp(2, "Makineni", 200L, "QE");
		el.add(e2);
		Emp e3 = new Emp(3, "Preethi", 300L, "CEO");
		el.add(e3);
		return el;
	}

}
