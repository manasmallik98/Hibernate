package com.manas.basics.dto;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="account")
public class AccountDTO implements Serializable {
	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="AC_NUMBER")
	private String acNumber;
	@Column(name="AC_HOLDER_NAME")
	private String acHolderName;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="MOB_NUM")
	private Long mobNum;
	@Column(name="BALANCE")
	private Double balance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}
	public String getAcHolderName() {
		return acHolderName;
	}
	public void setAcHolderName(String acHolderName) {
		this.acHolderName = acHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobNum() {
		return mobNum;
	}
	public void setMobNum(Long mobNum) {
		this.mobNum = mobNum;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", acNumber=" + acNumber + ", acHolderName=" + acHolderName + ", address="
				+ address + ", mobNum=" + mobNum + ", balance=" + balance + "]";
	}
	
	
}
