package com.oraclejava;
//볼런티어(자원자) 클래스
public class Volunteer {
	private int vid; // 자원자 아이디
	private String vname;//자원자 이름
	private String notebook; //자원자 노트북
	
	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getNotebook() {
		return notebook;
	}

	public void setNotebook(String notebook) {
		this.notebook = notebook;
	}
	
	
}
