package com.ryanda.config.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ryanda.profile.*;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext
			context = new ClassPathXmlApplicationContext("ProfileAnnotation.xml"); 
		

		Profiles profil1 =(Profiles) context.getBean("Dosen", Profiles.class);
		Dosen inidosen = (Dosen) profil1;
		
		
		
		System.out.println("Tipe Profile: "+inidosen.getProfileName());
		System.out.println(inidosen.toString());
		
		context.close();
	}
}
