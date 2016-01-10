package com.chorBazaar.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="STOREENT")
public class StoreENT {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "STOREENT_ID")
	private BigInteger _storeentId;
	
	@NotNull
	@Column(name = "MEMBER_ID")
	private BigInteger _memberId;
	
	@NotNull
	@Column(name = "TYPE")
	private char  _type;
	
	@Column(name = "SETCCURR")
	private char  _setCcurr;
	
	@Column(name = "IDENTIFIER")
	@NotNull
	private String _identifier;
	
	@Column(name = "MARKFORDELETE")
	@NotNull
	private int  _markForDelete;

	public BigInteger get_storeentId() {
		return _storeentId;
	}

	public void set_storeentId(BigInteger _storeentId) {
		this._storeentId = _storeentId;
	}

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

	public char get_setCcurr() {
		return _setCcurr;
	}

	public void set_setCcurr(char _setCcurr) {
		this._setCcurr = _setCcurr;
	}

	public String get_identifier() {
		return _identifier;
	}

	public void set_identifier(String _identifier) {
		this._identifier = _identifier;
	}

	public int get_markForDelete() {
		return _markForDelete;
	}

	public void set_markForDelete(int _markForDelete) {
		this._markForDelete = _markForDelete;
	}
	
}
