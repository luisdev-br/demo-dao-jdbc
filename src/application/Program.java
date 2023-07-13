package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department d_test = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Luis", "luis@gmail.com", LocalDate.now(), 3000.00, d_test);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(seller);

	}

}
