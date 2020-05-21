package com.himanshu.HibDemo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien 
{
	@Id
    private int aid;
    private String aname;
    
    @OneToMany(mappedBy="alien",fetch=FetchType.EAGER)
    private Collection<Laptop1> laps = new ArrayList<Laptop1>();

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Collection<Laptop1> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop1> laps) {
		this.laps = laps;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
    
    
}
