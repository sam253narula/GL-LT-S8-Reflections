package B_com.reflection.getClassMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import Z_com.demo.utility.Utils;

public class App {
	
	public static void main(String[] args) {
		User userObj = new User();
		Class user = userObj.getClass();
		System.out.println("Name of the class:- " + user.getName());
		Utils.sectionSeperator();

		System.out.println("Number of Methods:- " + user.getMethods().length);
		System.out.println("All method names below: ");
		Method[] methods = user.getMethods();
		for (int counter = 0; counter < methods.length; counter++) {
			System.out.println(methods[counter]);
		}
		Utils.sectionSeperator();

		System.out.println("Number of Fields: - " + user.getFields().length);
		Field[] fields = user.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		Utils.sectionSeperator();

		// Types of class loaders are Application class loader, Extension classloader
		// and bootstrap class loader
		ClassLoader classLoader = user.getClassLoader();
		System.out.println(classLoader);
		Utils.sectionSeperator();

		Package package1 = user.getPackage();
		System.out.println(package1);
		Utils.sectionSeperator();

		Constructor[] constructors = user.getConstructors();
		System.out.println("Number of constructors: " + constructors.length);
		for (int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i]);
		}
		Utils.sectionSeperator();
		
	}
	
}
