package com.ryanda.config.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ryanda.profile.Profiles;
import com.ryanda.profile.Dosen;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext
			context = new ClassPathXmlApplicationContext("ProfileAnnotation.xml"); 
		

		Profiles profil1 = context.getBean("dosen", Profiles.class);
		Dosen aramitama1 = (Dosen) profil1;
		
		
		context.close();
	}
}
