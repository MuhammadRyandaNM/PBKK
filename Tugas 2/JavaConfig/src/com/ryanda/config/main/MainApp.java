package com.ryanda.config.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ryanda.profile.*;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("Java Config");
		System.out.println("Profile Login");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Pilih 1 untuk Dosen \nPilih 2 untuk Mahasiswa");
		int choice = myObj.nextInt();  // Read user input
		
		
		if(choice==1) {
			Profile profil1 = context.getBean("Dosen", Profile.class);
			Dosen inidosen = (Dosen) profil1;
			System.out.println("Tipe Profile: "+inidosen.getProfileName());
			System.out.println(inidosen.toString());
		}
		else if(choice==2) {
			Profile profil2 = context.getBean("Mahasiswa", Profile.class);
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
