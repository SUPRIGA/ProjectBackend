package com.niit.homeshop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.homeshop.modal.Card;
import com.niit.homeshop.modal.Cart;
import com.niit.homeshop.modal.Category;
import com.niit.homeshop.modal.Product;
import com.niit.homeshop.modal.Role;
import com.niit.homeshop.modal.ShippingAddress;
import com.niit.homeshop.modal.Supplier;
import com.niit.homeshop.modal.UserAccount;
import com.niit.homeshop.service.CardDAO;
import com.niit.homeshop.service.CartDAO;
import com.niit.homeshop.service.CategoryDAO;
import com.niit.homeshop.service.ProductDAO;
import com.niit.homeshop.service.RoleDAO;
import com.niit.homeshop.service.ShippingAddressDAO;
import com.niit.homeshop.service.SupplierDAO;
import com.niit.homeshop.service.UserAccountDAO;

public class UserAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		System.out.println("system.....");
		 
		UserAccountDAO useraccountDAO=(UserAccountDAO) context.getBean("UserAccountDAO");
		UserAccount userAccount = (UserAccount) context.getBean("userAccount");
		
		userAccount.setFirst_Name("sup");
		userAccount.setLast_Name("raj");
		userAccount.setGender("female");
		userAccount.setEmail_id("suprigavivek03@gmail.com");
		userAccount.setPassword("aravind");
		userAccount.setMobile_Number(812495);
		userAccount.setAddress("hudco colony");
	
   useraccountDAO.insertUserAccount(userAccount);
	

	ProductDAO productDAO=(ProductDAO) context.getBean("ProductDAO");
	Product product= (Product) context.getBean("product");
	
	product.setProduct_Name("Washing Machine");
	product.setDescription("Frontload,Topload");
	product.setQuantity(6);
	product.setCategory_Id( 1);
	product.setPrice(2000);
	product.setSub_Category_Id(1);
	product.setSupplier_Id( 1);
	product.setLiters(5);
	product.setWeight(35);

  productDAO.insertProduct(product);
  productDAO.deleteProduct(7);
 
  
  
  CategoryDAO categoryDAO=(CategoryDAO) context.getBean("CategoryDAO");
	Category category= (Category) context.getBean("category");
  
	
	category .setCategory_Name("Large Appliances");
	 category.setCategory_Description("Airconditioners,WashingMachine,Refrigirators");
	 
	  categoryDAO.insertCategory(category);
	  
	  
	  
SupplierDAO supplierDAO=(SupplierDAO) context.getBean("SupplierDAO");
Supplier supplier= (Supplier) context.getBean("supplier");


supplier.setSupplier_Name("Vivek");
supplier.setEmail_id("vivek1anandan@gmail.com");
supplier.setMobile_Number(98654358);
supplier.setSupplier_Address("gandhimanagar,coimbatore");

supplierDAO.insertSupplier(supplier);
	  
	
CartDAO cartDAO=(CartDAO) context.getBean("CartDAO");
Cart cart= (Cart) context.getBean("cart");

cart.setUser_Id(1);
cart.setProduct_Id(1);
cart.setQuantity(5);
cart.setPrice(400);

cartDAO.insertCart(cart);

ShippingAddressDAO shippingaddressDAO=(ShippingAddressDAO) context.getBean("ShippingAddressDAO");
ShippingAddress shippingAddress= (ShippingAddress) context.getBean("shippingAddress");


shippingAddress.setProduct_Id(1);
shippingAddress.setUser_Id(1);
shippingAddress.setMobile_Number(5);
shippingAddress.setAddress("gandhimanagar");
shippingAddress.setPrice(500);

shippingaddressDAO.insertShippingAddress(shippingAddress);


RoleDAO roleDAO=(RoleDAO) context.getBean("RoleDAO");
Role role= (Role) context.getBean("role");

     role.setUser_Id(1);
     role.setUser_name("supriga");
     role.setRole("user");
     role.setEnabled("true");
     role.setPassword("raj");
     
     userAccount.setRole(role);
     role.setUseraccount(userAccount);
    // roleDAO.insertRole(role);
     
     
     CardDAO cardDAO=(CardDAO) context.getBean("CardDAO");
     Card card= (Card) context.getBean("card");
     
     
     card.setCardHolder_Name(" malati");
     card.setCard_Number(1);
     card.setCvv_number(567);
     card.setCardType("credit card");

      cardDAO.insertCard(card);
}

}
