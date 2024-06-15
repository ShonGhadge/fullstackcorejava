package com.gvacharya.enub;

public enum Menu {
	ADD(1, "(ADD RECORD)"), 
	UPDATE(2, "(UPDATE RECORD)"), 
	DELETE(3, "(DELETE RECORD)"), 
	SELECT(4, "(SELECT RECORD)"),
	SELECT_ALL(5, "(SLECT ALL RCORD)"), 
	EXIT(0, "(SLECT ALL RCORD)");

	private int serialNO;
	private String menuDescription;

	private Menu(int serialNO, String menuDescription) {
		// TODO Auto-generated constructor stub
		this.serialNO = serialNO;
		this.menuDescription = menuDescription;
	}

	public int getSerialNO() {
		return serialNO;
	}

	public void setSerialNO(int serialNO) {
		this.serialNO = serialNO;
	}

	public String getMenuDescription() {
		return menuDescription;
	}

	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}

}
