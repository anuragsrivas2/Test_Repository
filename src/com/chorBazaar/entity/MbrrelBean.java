package com.chorBazaar.entity;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="Mbrgrpmbr")
public class MbrrelBean {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "MEMBER_ID")
	private BigInteger _memberId;
	
	public BigInteger get_memberId() {
		return _memberId;
	}

	public void set_memberId(BigInteger _memberId) {
		this._memberId = _memberId;
	}

	public BigInteger get_mbrgrpId() {
		return _mbrgrpId;
	}

	public void set_mbrgrpId(BigInteger _mbrgrpId) {
		this._mbrgrpId = _mbrgrpId;
	}

	public String get_field1() {
		return _field1;
	}

	public void set_field1(String _field1) {
		this._field1 = _field1;
	}

	public String get_customerId() {
		return _customerId;
	}

	public void set_customerId(String _customerId) {
		this._customerId = _customerId;
	}

	public String get_exclude() {
		return _exclude;
	}

	public void set_exclude(String _exclude) {
		this._exclude = _exclude;
	}

	@NotNull
	@Column(name = "MBRGRP_ID")
	private BigInteger _mbrgrpId;
	
	@Column(name = "FIELD1")
	private String _field1;
	
	@Column(name = "CUSTOMERID")
	private String _customerId;
	
	@Column(name = "EXCLUDE", length = 1)
	private String _exclude;

}
