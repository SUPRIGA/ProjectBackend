package com.niit.homeshop.service;

import java.util.List;

import com.niit.homeshop.model.Supplier;





public interface SupplierDAO {
	
	   public List<Supplier> getAllSupplier();
	   public  Supplier getSupplier(int supplier_id);
	   public void insertSupplier(Supplier supplier );
	   public void updateSupplier(Supplier supplier );
	   public void deleteSupplier(int id);
	   public void deleteallSupplier(Supplier supplier);

}
