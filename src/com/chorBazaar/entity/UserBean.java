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
@Table(name="users")
public class UserBean {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "USERS_ID ")
	private BigInteger _usersId;
	
	@Column(name = "REGISTERTYPE")
	@NotNull
	private char _registerType;
	
	@Column(name = "LANGUAGE_ID")
	private int _languageId;
	
	@Column(name = "FIELD1")
	private String _field1;
	
	@Column(name = "SETCCURR")
	private char _setCCURR;
	
	@Column(name = "FIELD2")
	private String _field2;
	
	@Column(name = "FIELD3")
	private String _field3;
	
	@Column(name = "LASTORDER")
	private Timestamp  _lastOrder;
	
	@Column(name = "REGISTRATION")
	private Timestamp  _registration;
	
	@Column(name = "LASTSESSION")
	private Timestamp  _lastSession;
	
	@Column(name = "REGISTRATIONUPDATE")
	private Timestamp  _registrationUpdate;
	
	@Column(name = "REGISTRATIONCANCEL")
	private Timestamp  _registrationCancel;
	
	@Column(name = "PREVLASTSESSION")
	private Timestamp  _prevLastSession;

	public BigInteger get_usersId() {
		return _usersId;
	}

	public void set_usersId(BigInteger _usersId) {
		this._usersId = _usersId;
	}

	public char get_registerType() {
		return _registerType;
	}

	public void set_registerType(char _registerType) {
		this._registerType = _registerType;
	}

	public int get_languageId() {
		return _languageId;
	}

	public void set_languageId(int _languageId) {
		this._languageId = _languageId;
	}

	public String get_field1() {
		return _field1;
	}

	public void set_field1(String _field1) {
		this._field1 = _field1;
	}

	public char get_setCCURR() {
		return _setCCURR;
	}

	public void set_setCCURR(char _setCCURR) {
		this._setCCURR = _setCCURR;
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

	public Timestamp get_lastOrder() {
		return _lastOrder;
	}

	public void set_lastOrder(Timestamp _lastOrder) {
		this._lastOrder = _lastOrder;
	}

	public Timestamp get_registration() {
		return _registration;
	}

	public void set_registration(Timestamp _registration) {
		this._registration = _registration;
	}

	public Timestamp get_lastSession() {
		return _lastSession;
	}

	public void set_lastSession(Timestamp _lastSession) {
		this._lastSession = _lastSession;
	}

	public Timestamp get_registrationUpdate() {
		return _registrationUpdate;
	}

	public void set_registrationUpdate(Timestamp _registrationUpdate) {
		this._registrationUpdate = _registrationUpdate;
	}

	public Timestamp get_registrationCancel() {
		return _registrationCancel;
	}

	public void set_registrationCancel(Timestamp _registrationCancel) {
		this._registrationCancel = _registrationCancel;
	}

	public Timestamp get_prevLastSession() {
		return _prevLastSession;
	}

	public void set_prevLastSession(Timestamp _prevLastSession) {
		this._prevLastSession = _prevLastSession;
	}
	
}
