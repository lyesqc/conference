package com.myjpa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.AccessType;
import org.hibernate.annotations.AttributeAccessor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="membrecomite")

public class MembreComite {
	
	@Id
	@GeneratedValue
	Long idmembre;
	String login;
	String compagnie;
	String email;
	
	String motpass;
	String nommembre;
	@ManyToMany(mappedBy="comite_mbr",fetch=FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	List<Commite> commites = new ArrayList<>();

}
