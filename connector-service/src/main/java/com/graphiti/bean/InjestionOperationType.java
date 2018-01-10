package com.graphiti.bean;

/**
 * The source type of a data set
 * 
 * @author 
 *
 */
public enum InjestionOperationType {

	ONLY_SQL("ONLY_SQL"),
	NO_SQL_NO_DATA("NO_SQL_NO_DATA"),
	BOTH_SQL_AND_DATA("BOTH_SQL_AND_DATA"),
	ONLY_DATA_ATTACH_TO_SQL("ONLY_DATA_ATTACH_TO_SQL");
	
	private final String value;
	
	private InjestionOperationType(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}	
}
