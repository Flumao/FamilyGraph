package org.flumao.urlife.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * User Entity
 * @author Flumao
 *
 */
@Entity
@Table(name="kin")
public class User {
	
	private int id;
	/**
	 * person's id
	 */
	private int personId;
	/**
	 * name
	 */
	private String personName;
	/**
	 * gender：0 male, 1 female
	 */
	private boolean personGender;//0 is male, 1 is felame
	/**
	 * dynasty
	 */
	private String personDynasty;
	/**
	 * address
	 */
	private String personAddr;
	/**
	 * kin's type, eg: father, mother etc.
	 */
	private String kinship;
	/**
	 * kin's id
	 */
	private int kinId;
	/**
	 * kin's name
	 */
	private String kinName;
	/**
	 * kin's gender：0 male, 1 female
	 */
	private boolean kinGender;
	/**
	 * kin's address
	 */
	private String kinAddr;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="personid")
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	@Column(name="personname")
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Column(name="persongender")
	public boolean isPersonGender() {
		return personGender;
	}
	public void setPersonGender(boolean personGender) {
		this.personGender = personGender;
	}
	@Column(name="persondynasty")
	public String getPersonDynasty() {
		return personDynasty;
	}
	public void setPersonDynasty(String personDynasty) {
		this.personDynasty = personDynasty;
	}
	@Column(name="personaddr")
	public String getPersonAddr() {
		return personAddr;
	}
	public void setPersonAddr(String personAddr) {
		this.personAddr = personAddr;
	}
	@Column(name="kinship")
	public String getKinship() {
		return kinship;
	}
	public void setKinship(String kinship) {
		this.kinship = kinship;
	}
	@Column(name="kinid")
	public int getKinId() {
		return kinId;
	}
	public void setKinId(int kinId) {
		this.kinId = kinId;
	}
	@Column(name="kinname")
	public String getKinName() {
		return kinName;
	}
	public void setKinName(String kinName) {
		this.kinName = kinName;
	}
	@Column(name="kingender")
	public boolean isKinGender() {
		return kinGender;
	}
	public void setKinGender(boolean kinGender) {
		this.kinGender = kinGender;
	}
	@Column(name="kinaddr")
	public String getKinAddr() {
		return kinAddr;
	}
	public void setKinAddr(String kinAddr) {
		this.kinAddr = kinAddr;
	}
	
	
	
}
