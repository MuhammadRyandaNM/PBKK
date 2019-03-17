package com.ryanda.app;
import com.ryanda.model.Student;
import com.ryanda.model.Teacher;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.util.Scanner;
public class MainApp {
	public static void main (String[] args) {
		System.out.println("XML");
		System.out.println("List Dosen dan Mahasiswa");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Pilih 1 untuk list mahasiswa \nPilih 2 untuk list dosen");
		int choice = myObj.nextInt();  // Read user input
		
		if(choice == 1) {
			Resource resource = new ClassPathResource("studentbean.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			for(int i=1;i<6;i++) {
				Student emps= (Student) factory.getBean("s"+Integer.toString(i));
				System.out.println(emps.toString());
			}
		}
		
		else if(choice==2) {
			Resource resource2 = new ClassPathResource("teacherbean.xml");
			BeanFactory factory2 = new XmlBeanFactory(resource2);
			for(int i=1;i<6;i++) {
				Teacher emps= (Teacher) factory2.getBean("t"+Integer.toString(i));
				System.out.println(emps.toString());
			}
		}
		else {
			System.out.println("Input Salah");
		}
		
		
	}
}
