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
@Table(name="MBRGRP")
public class MemberGrpBean {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "MBRGRP_ID")
	private BigInteger _mbrgrpId;
	
	@NotNull
	@Column(name = "OWNER_ID")
	private BigInteger _ownerId;
	
	@Column(name = "FIELD1")
	private String _field1;
	
	@Column(name = "FIELD2")
	private String _field2;
	
	@Column(name = "FIELD3")
	private String _field3;
	
	@Column(name = "DESCRIPTION")
	private String _description;
	
	
	@NotNull
	@Column(name = "MBRGRPNAME")
	private String _mbrGrpName;
	
	@Column(name = "LASTUPDATE")
	private Timestamp  _lastUpdate;
	
	@Column(name = "LASTUPDATEDBY")
	private String  _lastUpdatedBy;

	public BigInteger get_mbrgrpId() {
		return _mbrgrpId;
	}

	public void set_mbrgrpId(BigInteger _mbrgrpId) {
		this._mbrgrpId = _mbrgrpId;
	}

	public BigInteger get_ownerId() {
		return _ownerId;
	}

	public void set_ownerId(BigInteger _ownerId) {
		this._ownerId = _ownerId;
	}

	public String get_field1() {
		return _field1;
	}

	public void set_field1(String _field1) {
		this._field1 = _field1;
	}

	public String get_field2() {
		return _field2;
	}

	public void set_field2(String _field2) {
		this._field2 = _field2;
	}

	public String get_field3() {
		return _field3;
	}

	public void set_field3(String _field3) {
		this._field3 = _field3;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public String get_mbrGrpName() {
		return _mbrGrpName;
	}

	public void set_mbrGrpName(String _mbrGrpName) {
		this._mbrGrpName = _mbrGrpName;
	}

	public Timestamp get_lastUpdate() {
		return _lastUpdate;
	}

	public void set_lastUpdate(Timestamp _lastUpdate) {
		this._lastUpdate = _lastUpdate;
	}

	public String get_lastUpdatedBy() {
		return _lastUpdatedBy;
	}

	public void set_lastUpdatedBy(String _lastUpdatedBy) {
		this._lastUpdatedBy = _lastUpdatedBy;
	}
	
	
}

