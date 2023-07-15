package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.print("Enter the id of seller: ");
		Integer id_seller = sc.nextInt();
		
		Seller searchedSeller = sellerDao.findById(id_seller);
		System.out.println("Seller Searched: ");
		System.out.println(searchedSeller);
		
		System.out.println("Testing search by Department ID: ");
		Department departm = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(departm);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}
