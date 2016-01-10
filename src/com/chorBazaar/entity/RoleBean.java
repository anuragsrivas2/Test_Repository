package com.chorBazaar.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;
@Entity
@Table(name="ROLE")
public class RoleBean {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "ROLE_ID")
	private Integer _roleId;
	
	@Column(name = "NAME")
	@NotNull
	private String _name;
	
	@Column(name = "DESCRIPTION")
	private String _description;

	public Integer get_roleId() {
		return _roleId;
	}

	public void set_roleId(Integer _roleId) {
		this._roleId = _roleId;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}
	
	
	
}
