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
@Table(name="Roledesc")
public class RoledescBean {
	
	public int get_languageId() {
		return _languageId;
	}

	public void set_languageId(int _languageId) {
		this._languageId = _languageId;
	}

	public String get_displayName() {
		return _displayName;
	}

	public void set_displayName(String _displayName) {
		this._displayName = _displayName;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	@NotNull
	@Column(name = "LANGUAGE_ID")
	private int _languageId;
	
	
	@Column(name = "DISPLAYNAME")
	private String _displayName;
	
	@Column(name = "DESCRIPTION")
	private String _description;

}
