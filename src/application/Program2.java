package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ====");
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
		line();

		System.out.println("=== TEST 2: department findAll ====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		line();
		
		System.out.println("=== TEST 3: department insert ====");
//		Department newDep = new Department(null, "D3");
//		departmentDao.insert(newDep);
//		System.out.println("Inserted! New id = " + newDep.getId());
		line();
		
		System.out.println("=== TEST 4: department update ====");
		dep = departmentDao.findById(1);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Update completed");
		line();
		
		System.out.println("=== TEST 5: department delete ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}
	
	public static void line() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}

}
