package org.flumao.urlife.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * User实体类
 * @author Flumao
 *
 */
@Entity
@Table(name="kin")
public class User {
	
	private int id;
	/**
	 * 人物编号
	 */
	private int personId;
	/**
	 * 人物姓名
	 */
	private String personName;
	/**
	 * 人物性别：0为男性，1为女性
	 */
	private boolean personGender;//0 is male, 1 is felame
	/**
	 * 人物所在的朝代
	 */
	private String personDynasty;
	/**
	 * 籍贯
	 */
	private String personAddr;
	/**
	 * 亲属类型，比如：父亲，母亲等
	 */
	private String kinship;
	/**
	 * 亲属id
	 */
	private int kinId;
	/**
	 * 亲属姓名
	 */
	private String kinName;
	/**
	 * 亲属性别：0为男性，1为女性
	 */
	private boolean kinGender;
	/**
	 * 亲属籍贯
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
