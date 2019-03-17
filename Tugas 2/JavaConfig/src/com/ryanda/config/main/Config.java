package com.ryanda.config.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.ryanda.profile.*;

@Configuration
@PropertySource("classpath:profile.properties")
public class Config {
	
	@Bean
	public Profile Dosen(@Value("${DosenProp.Id}")int id,
			@Value("${DosenProp.Mk}")String mk,
			 @Value("${DosenProp.Al}")String alamat,
			 @Value("${DosenProp.Jk}") String jkelamin,
			 @Value("${DosenProp.Sc}") double score) {
		
		Dosen inidosen = new Dosen(id,mk,alamat,jkelamin,score);
		return inidosen;
	}
	@Bean
	public Profile Mahasiswa(@Value("${MahasiswaProp.Id}")int id,
			 @Value("${MahasiswaProp.Al}")String alamat,
			 @Value("${MahasiswaProp.Jk}") String jkelamin,
			 @Value("${MahasiswaProp.Sc}") double score) {
		
		Mahasiswa inimahasiswa = new Mahasiswa(id,alamat,jkelamin,score);
		return inimahasiswa;
	}
}
