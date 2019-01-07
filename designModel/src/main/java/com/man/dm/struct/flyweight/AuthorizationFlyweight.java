package com.man.dm.struct.flyweight;

public class AuthorizationFlyweight implements Flyweight{

	private String securityEntity;
	
	private String permit;
		
	public AuthorizationFlyweight(String state) {
		String ss[]=state.split(",");
		securityEntity=ss[0];
		permit=ss[1];
	}
		
	@Override
	public boolean match(String securityEntity, String permit) {
		if(this.securityEntity.equals(securityEntity)
				&& this.permit.equals(permit)) {
			return true;	
		}
		return false;		
	}

	public String getSecurityEntity() {
		return securityEntity;
	}

	public String getPermit() {
		return permit;
	}
	
	
	

}
