package org.flumao.urlife.entity;
/**
 * Node  
 * @author Flumao
 *
 */
public class Node {
	private int id;
	/**
	 * 人物id
	 */
	private int personId;
	/**
	 * 任务姓名
	 */
	private String personName;
	/**
	 * gender: 0 male, 1 female
	 */
	private boolean personGender;//0 is male, 1 is felame
	/**
	 * dynasty
	 */
	private String personDynasty;
	/**
	 * hometown address
	 */
	private String personAddr;
	/**
	 * kinship type
	 */
	private String kinship;
	/**
	 * kinship id
	 */
	private int kinId;
	/**
	 * kin name
	 */
	private String kinName;
	/**
	 * kin gender：0 male，1 female
	 */
	private boolean kinGender;
	/**
	 * kin's address
	 */
	private String kinAddr;
	/**
	 * user node's color
	 */
	private String color;
	/**
	 * user node's shape
	 */
	private String shape;
	
	public Node(User user, int i) {
		this.id = i;
		this.personId = user.getId();
		this.personName = user.getPersonName();
		this.personGender = user.isPersonGender();
		this.personDynasty = user.getPersonDynasty();
		this.personAddr = user.getPersonAddr();
		this.kinship = user.getKinship();
		this.kinId = user.getKinId();
		this.kinName = user.getKinName();
		this.kinGender = user.isKinGender();
		this.kinAddr = user.getKinAddr();
		if(i == 0){
			this.shape = "dot";
		}else{
			this.shape = "rectangle";
		}
		switch(i%5){
			case 1:
				this.color = "DarkOrange";
				break;
			case 2:
				this.color = "purple";
				break;
			case 3:
				this.color = "green";
				break;	
			case 4:
				this.color = "blue";
				break;
			default:
				this.color = "DeepSkyBlue";
				break;	
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public boolean isPersonGender() {
		return personGender;
	}
	public void setPersonGender(boolean personGender) {
		this.personGender = personGender;
	}
	public String getPersonDynasty() {
		return personDynasty;
	}
	public void setPersonDynasty(String personDynasty) {
		this.personDynasty = personDynasty;
	}
	public String getPersonAddr() {
		return personAddr;
	}
	public void setPersonAddr(String personAddr) {
		this.personAddr = personAddr;
	}
	public String getKinship() {
		return kinship;
	}
	public void setKinship(String kinship) {
		this.kinship = kinship;
	}
	public int getKinId() {
		return kinId;
	}
	public void setKinId(int kinId) {
		this.kinId = kinId;
	}
	public String getKinName() {
		return kinName;
	}
	public void setKinName(String kinName) {
		this.kinName = kinName;
	}
	public boolean isKinGender() {
		return kinGender;
	}
	public void setKinGender(boolean kinGender) {
		this.kinGender = kinGender;
	}
	public String getKinAddr() {
		return kinAddr;
	}
	public void setKinAddr(String kinAddr) {
		this.kinAddr = kinAddr;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	
}
