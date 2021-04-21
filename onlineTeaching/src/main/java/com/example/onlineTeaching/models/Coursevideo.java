package com.example.onlineTeaching.models;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cvideos")
public class Coursevideo implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid ;
	@Column
	private  String name ;
	@Column
	private int  likes;
	 
	@Column
	private String url;
	
	@Column
	private String[] comments;
	@Column
	 private String  pdate ;
	 
	public Coursevideo() {}

	public Coursevideo(String link, int id, String name, int like, String date) {
	
		this.url = link;
		this.vid = id;
		this.name = name;
		this.likes = like;
		this.pdate = date;
	}



	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String[] getComments() {
		return comments;
	}

	public void setComments(String[] comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "video [vid=" + vid + ", name=" + name + ", like=" + likes + ", link=" + url + ", date=" + pdate + "]";
	}


	 
	 
	 
	 

}
