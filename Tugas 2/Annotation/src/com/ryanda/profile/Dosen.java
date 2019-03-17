package com.ryanda.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Dosen implements Profiles {
	
	private int id;
	private String mk;
	private String alamat;
	private String jkelamin;
	private double score;
	
	
	public Dosen() {
		super();
	}
	
	@Autowired
	public Dosen(@Value("${DosenProp.Id}")int id,
					@Value("${DosenProp.Mk}")String mk,
					 @Value("${DosenProp.Al}")String alamat,
					 @Value("${DosenProp.Jk}") String jkelamin,
					 @Value("${DosenProp.Sc}") double score
					 ) 
	{		
		super();
		this.id = id;
		this.mk =mk;
		this.alamat = alamat;
		this.jkelamin = jkelamin;
		this.score=score;
	}
	
	
	
	@Override
	public String getProfileName() {
		return "Dosen";
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
	

	public String getMk() {
		return mk;
	}

	public void setMk(String mk) {
		this.mk = mk;
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
		return "Id=" + id + "\tMK=" + mk + "\tAlamat=" + alamat + "\tJ.kelamin=" + jkelamin + "\tIPD=" + score
				+ "";
	}

	
	
}
