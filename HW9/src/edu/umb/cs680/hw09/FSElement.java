package edu.umb.cs680.hw09;

import java.util.Date;


public class FSElement {
	private ApfsDirectory parent;
	private String name;
	private String owner;
	private Date created;
	private Date lastModified;
	private int size;

	public FSElement(){
		
	}
	
	public FSElement(ApfsDirectory parent, String name, int Size, Date created, String owner, Date lastModified) {
		this.name = name;
		this.size = size;
		this.owner = owner;
		this.created = created;
		this.lastModified = lastModified;
		this.parent = parent;
	}
	
	public ApfsDirectory getParent(){
		return this.parent;
	}
	
	public boolean isLeaf(){
		return false;
	}
		
	public int getSize(){
		return this.size;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Date getCreationTime(){
		return this.created;
	}
	
	public void accept(FSVisitor v) {
		return;
	}

}
