package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {

    private int actorId;
    private String actorName;
    private String actorCatergory;
    private String actorFee;
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActorCatergory() {
		return actorCatergory;
	}
	public void setActorCatergory(String actorCatergory) {
		this.actorCatergory = actorCatergory;
	}
	public String getActorFee() {
		return actorFee;
	}
	public void setActorFee(String actorFee) {
		this.actorFee = actorFee;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorCatergory=" + actorCatergory
				+ ", actorFee=" + actorFee + "]";
	}
	

}
