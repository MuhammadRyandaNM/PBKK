package com.ryanda.model;

public class Student {
	int id;
	String name;
	String alamat;
	char jkelamin;
	Double nilai;
	public Student() {
		
	}
	
	
	public Student(int id, String name, String alamat, char jkelamin, Double nilai) {
		super();
		this.id = id;
		this.name = name;
		this.alamat = alamat;
		this.jkelamin = jkelamin;
		this.nilai = nilai;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAlamat() {
		return alamat;
	}


	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}


	public char getJkelamin() {
		return jkelamin;
	}


	public void setJkelamin(char jkelamin) {
		this.jkelamin = jkelamin;
	}


	public Double getNilai() {
		return nilai;
	}


	public void setNilai(Double nilai) {
		this.nilai = nilai;
	}

	
	@Override
	public String toString() {
		return "Id Mahasiswa=" + id + "\tNama=" + name + "\tAlamat=" + alamat + "\tJ.kelamin=" + jkelamin + "\tIPK="
				+ nilai+"";
	}
	
	
}
