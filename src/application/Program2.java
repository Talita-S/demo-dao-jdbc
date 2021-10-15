package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("===TEST 1: department findById===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("===TEST 2: department findAll===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===TEST 3: department insert===");
		Department newDepartment = new Department(10, "Fast food");
		System.out.println(newDepartment);
		
		System.out.println("===TEST 4: department update===");
		dep = departmentDao.findById(6);
		dep.setName("Furniture");
		departmentDao.update(dep);
		System.out.println("Update complete!");
	}

}
