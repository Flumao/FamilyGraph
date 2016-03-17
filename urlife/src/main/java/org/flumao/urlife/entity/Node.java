package org.flumao.urlife.entity;
/**
 * Node类，dto类，用来包装User类，给User加上color属性和shape属性，用于给jsp传递数据
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
	 * 人物性别：0为男性，1为女性
	 */
	private boolean personGender;//0 is male, 1 is felame
	/**
	 * 人物所处朝代
	 */
	private String personDynasty;
	/**
	 * 人物籍贯
	 */
	private String personAddr;
	/**
	 * 亲属类型
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
	/**
	 * 人物节点颜色
	 */
	private String color;
	/**
	 * 人物节点形状，圆形或者矩形
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
