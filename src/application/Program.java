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
		System.out.println("-----------------------------------------");
		System.out.print("Enter the id of seller: ");
		Integer id_seller = sc.nextInt();
		
		Seller searchedSeller = sellerDao.findById(id_seller);
		System.out.println("Seller Searched: ");
		System.out.println(searchedSeller);
		
		System.out.println("-----------------------------------------");
		System.out.println("Testing search by Department ID: " + id_seller);
		Department departm = new Department(id_seller, null);
		List<Seller> list = sellerDao.findByDepartment(departm);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Testing findAll: ");
		list = sellerDao.findAll();
		
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Testing update: ");
		
		searchedSeller = sellerDao.findById(1);
		searchedSeller.setName("Birijin");
		sellerDao.update(searchedSeller);
		System.out.println("updated!");
		
		System.out.println("-----------------------------------------");
		System.out.println("Testing delete: ");
		
		System.out.print("enter the id for delete seller: ");
		Integer id_delete = sc.nextInt();
		
		sellerDao.deleteById(id_delete);
		
		/*System.out.println("-----------------------------------------");
		System.out.println("Testing Seller Insert: ");
		
		Seller seller1 = new Seller(null, "Arabe maldito", "arab@hotmail.com", new Date(), 4000.00, departm);
		sellerDao.insert(seller1);
		System.out.println("Inserted ! new Seller ID: " + seller1.getId());*/
		
		sc.close();

	}

}
