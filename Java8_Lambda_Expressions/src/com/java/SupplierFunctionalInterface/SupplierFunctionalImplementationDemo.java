package com.java.SupplierFunctionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SuplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now() ;
	}
	
}
public class SupplierFunctionalImplementationDemo {
public static void  main(String[] args) {
	Supplier<LocalDateTime> supplier = ()->  LocalDateTime.now();
    System.out.println(supplier.get());
}
}
