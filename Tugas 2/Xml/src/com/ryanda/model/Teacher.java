package com.ryanda.model;

public class Teacher {
	int id;
	String name;
	String alamat;
	String mk;
	char jkelamin;
	String nilai;
	public Teacher() {
		
	}
	public Teacher(int id, String name, String alamat, String mk, char jkelamin, String nilai) {
		super();
		this.id = id;
		this.name = name;
		this.alamat = alamat;
		this.mk = mk;
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
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	public char getJkelamin() {
		return jkelamin;
	}
	public void setJkelamin(char jkelamin) {
		this.jkelamin = jkelamin;
	}
	public String getNilai() {
		return nilai;
	}
	public void setNilai(String nilai) {
		this.nilai = nilai;
	}
	@Override
	public String toString() {
		return "Id Dosen=" + id + "\tNama=" + name + "\tAlamat=" + alamat + "\tJ.Kelamin=" + jkelamin + "\tMK=" + mk
				+ "\tIPD=" + nilai + "";
	}
	
	
	
}