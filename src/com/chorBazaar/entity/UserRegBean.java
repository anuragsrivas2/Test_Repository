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
@Table(name="USERREG")
public class UserRegBean {
	
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "USERS_ID ")
	private BigInteger _usersId;
	
	@Column(name = "STATUS")
	private int _status;
	
	@Column(name = "PLCYACCT_ID")
	private int _plcyAcctId;
	
	@Column(name = "LOGONID")
	@NotNull
	private String _logonId;
	
	@Column(name = "LOGONPASSWORD")
	private Byte[] _logonPassword;
	
	@Column(name = "PASSWORDEXPIRED")
	private int _passwordExpired;
	
	@Column(name = "CHALLENGEANSWER")
	private String _challengeAnswer;
	
	@Column(name = "CHALLENGEQUESTION")
	private String _challengeQuestion;
	
	@Column(name = "TIMEOUT")
	@NotNull
	private BigInteger _timeout;
	
	@Column(name = "PASSWORDRETRIES")
	private int _passwordRetries;
	
	@Column(name = "SALT")
	private String _salt;
	
	@Column(name = "PASSWORDCREATION")
	private Timestamp  _passwordCreation;
	
	@Column(name = "PASSWORDINVALID")
	private Timestamp  _passwordInvalid;

	public BigInteger get_usersId() {
		return _usersId;
	}

	public void set_usersId(BigInteger _usersId) {
		this._usersId = _usersId;
	}

	public int get_status() {
		return _status;
	}

	public void set_status(int _status) {
		this._status = _status;
	}

	public int get_plcyAcctId() {
		return _plcyAcctId;
	}

	public void set_plcyAcctId(int _plcyAcctId) {
		this._plcyAcctId = _plcyAcctId;
	}

	public String get_logonId() {
		return _logonId;
	}

	public void set_logonId(String _logonId) {
		this._logonId = _logonId;
	}

	public Byte[] get_logonPassword() {
		return _logonPassword;
	}

	public void set_logonPassword(Byte[] _logonPassword) {
		this._logonPassword = _logonPassword;
	}

	public int get_passwordExpired() {
		return _passwordExpired;
	}

	public void set_passwordExpired(int _passwordExpired) {
		this._passwordExpired = _passwordExpired;
	}

	public String get_challengeAnswer() {
		return _challengeAnswer;
	}

	public void set_challengeAnswer(String _challengeAnswer) {
		this._challengeAnswer = _challengeAnswer;
	}

	public String get_challengeQuestion() {
		return _challengeQuestion;
	}

	public void set_challengeQuestion(String _challengeQuestion) {
		this._challengeQuestion = _challengeQuestion;
	}

	public BigInteger get_timeout() {
		return _timeout;
	}

	public void set_timeout(BigInteger _timeout) {
		this._timeout = _timeout;
	}

	public int get_passwordRetries() {
		return _passwordRetries;
	}

	public void set_passwordRetries(int _passwordRetries) {
		this._passwordRetries = _passwordRetries;
	}

	public String get_salt() {
		return _salt;
	}

	public void set_salt(String _salt) {
		this._salt = _salt;
	}

	public Timestamp get_passwordCreation() {
		return _passwordCreation;
	}

	public void set_passwordCreation(Timestamp _passwordCreation) {
		this._passwordCreation = _passwordCreation;
	}

	public Timestamp get_passwordInvalid() {
		return _passwordInvalid;
	}

	public void set_passwordInvalid(Timestamp _passwordInvalid) {
		this._passwordInvalid = _passwordInvalid;
	}
	
}
