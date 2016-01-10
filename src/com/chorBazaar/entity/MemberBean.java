package com.chorBazaar.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="MEMBER")
public class MemberBean {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "MEMBER_ID")
	private BigInteger _memberId;
	
	@Column(name = "TYPE")
	@NotNull
	private char _type;
	
	@Column(name = "STATE")
	private int _state;

	public BigInteger get_memberId() {
		return _memberId;
	}

	public void set_memberId(BigInteger _memberId) {
		this._memberId = _memberId;
	}

	public char get_type() {
		return _type;
	}

	public void set_type(char _type) {
		this._type = _type;
	}

	public int get_state() {
		return _state;
	}

	public void set_state(int _state) {
		this._state = _state;
	}
	
	
}
