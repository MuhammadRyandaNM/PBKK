package com.ryanda.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Mahasiswa implements Profile {
	
	private int id;
	private String alamat;
	private String jkelamin;
	private double score;
	
	
	public Mahasiswa() {
		super();
	}
	
	@Autowired
	public Mahasiswa(@Value("${MahasiswaProp.Id}")int id,
					 @Value("${MahasiswaProp.Al}")String alamat,
					 @Value("${MahasiswaProp.Jk}") String jkelamin,
					 @Value("${MahasiswaProp.Sc}") double score) 
	{		
		super();
		this.id = id;
		this.alamat = alamat;
		this.jkelamin = jkelamin;
		this.score=score;
	}
	
	
	
	@Override
	public String getProfileName() {
		return "Mahasiswa";
	}

	@Override
	public Double getProfileScore() {
		return score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJkelamin() {
		return jkelamin;
	}

	public void setJkelamin(String jkelamin) {
		this.jkelamin = jkelamin;
	}

	@Override
	public String toString() {
		return "Id=" + id + "\tAlamat=" + alamat + "\tJ.kelamin=" + jkelamin + "\tIPK=" + score + "";
	}

	
	
}
