package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
		
		sc.close();

	}

}
