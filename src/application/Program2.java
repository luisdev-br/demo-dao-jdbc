package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("-----------------------------------");
		System.out.println("	Testing Insert			");
		System.out.println();
		System.out.print("Enter the name of new Department: ");
		String dep_name = sc.next();
		Department new_dep = new Department(null, dep_name);
		departmentDao.insert(new_dep);
		System.out.println("new department inserted!");
		
		
		
		
		
		
		sc.close();
	}

}
