package com.ryanda.config.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ryanda.profile.Profiles;
import com.ryanda.profile.Dosen;
import com.ryanda.profile.Mahasiswa;
import com.ryanda.profile.Profiles;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext
			context = new ClassPathXmlApplicationContext("ProfileAnnotation.xml"); 
		
		System.out.println("Annotation");
		System.out.println("Profile Login");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Pilih 1 untuk Dosen \nPilih 2 untuk Mahasiswa");
		int choice = myObj.nextInt();  // Read user input
		
		
		if(choice==1) {
			Profiles profil1 = context.getBean("dosen", Profiles.class);
			Dosen inidosen = (Dosen) profil1;
			System.out.println("Tipe Profile: "+inidosen.getProfileName());
			System.out.println(inidosen.toString());
		}
		else if(choice==2) {
			Profiles profil2 = context.getBean("mahasiswa", Profiles.class);
			Mahasiswa inimahasiswa = (Mahasiswa) profil2;
			System.out.println("Tipe Profile: "+inimahasiswa.getProfileName());
			System.out.println(inimahasiswa.toString());
		}
		else {
			System.out.println("Input Salah");
		}
		
		
		context.close();
	}
}
