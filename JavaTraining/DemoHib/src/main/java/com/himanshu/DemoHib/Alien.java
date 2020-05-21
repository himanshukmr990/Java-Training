package com.himanshu.DemoHib;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Alien_Table") 
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien //POJOs
{
  @Id
  private int aid;
//@Transient      to hide
//  private AlienName aname;
  private String aname;
//@Column(name="Alien_color")  to change column name
  private String color;
  
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
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
	  this.color = color;
  }
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
}
  
  
  
}
