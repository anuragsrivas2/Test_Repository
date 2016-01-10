package com.chorBazaar.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="Orgentity")
public class OrgentityBean {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "ORGENTITY_ID")
	private BigInteger _orgentityId;
	
	@Column(name = "LEGALID")
	private String _legalId;
	
	@NotNull
	@Column(name = "ORGENTITYTYPE", length = 3)
	private String _orgentityType;
	
	@NotNull
	@Column(name = "ORGENTITYNAME")
	private String _orgentityName;
	
	public BigInteger get_orgentityId() {
		return _orgentityId;
	}

	public void set_orgentityId(BigInteger _orgentityId) {
		this._orgentityId = _orgentityId;
	}

	public String get_legalId() {
		return _legalId;
	}

	public void set_legalId(String _legalId) {
		this._legalId = _legalId;
	}

	public String get_orgentityType() {
		return _orgentityType;
	}

	public void set_orgentityType(String _orgentityType) {
		this._orgentityType = _orgentityType;
	}

	public String get_orgentityName() {
		return _orgentityName;
	}

	public void set_orgentityName(String _orgentityName) {
		this._orgentityName = _orgentityName;
	}

	public String get_businessCategory() {
		return _businessCategory;
	}

	public void set_businessCategory(String _businessCategory) {
		this._businessCategory = _businessCategory;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public String get_adminFirstName() {
		return _adminFirstName;
	}

	public void set_adminFirstName(String _adminFirstName) {
		this._adminFirstName = _adminFirstName;
	}

	public String get_adminLastName() {
		return _adminLastName;
	}

	public void set_adminLastName(String _adminLastName) {
		this._adminLastName = _adminLastName;
	}

	public String get_adminMiddleName() {
		return _adminMiddleName;
	}

	public void set_adminMiddleName(String _adminMiddleName) {
		this._adminMiddleName = _adminMiddleName;
	}

	public String get_preferredDelivery() {
		return _preferredDelivery;
	}

	public void set_preferredDelivery(String _preferredDelivery) {
		this._preferredDelivery = _preferredDelivery;
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

	public String get_taxPayerId() {
		return _taxPayerId;
	}

	public void set_taxPayerId(String _taxPayerId) {
		this._taxPayerId = _taxPayerId;
	}

	public String get_field3() {
		return _field3;
	}

	public void set_field3(String _field3) {
		this._field3 = _field3;
	}

	public int get_status() {
		return _status;
	}

	public void set_status(int _status) {
		this._status = _status;
	}

	@Column(name = "BUSINESSCATEGORY")
	private String _businessCategory;
	
	@Column(name = "DESCRIPTION")
	private String _description;
	
	@Column(name = "ADMINFIRSTNAME")
	private String _adminFirstName;
	
	@Column(name = "ADMINLASTNAME")
	private String _adminLastName;
	
	@Column(name = "ADMINMIDDLENAME")
	private String _adminMiddleName;
	
	@Column(name = "PREFERREDDELIVERY")
	private String _preferredDelivery;
	
	@Column(name = "FIELD1")
	private String _field1;
	
	@Column(name = "FIELD2")
	private String _field2;
	
	@Column(name = "TAXPAYERID")
	private String _taxPayerId;
	
	@Column(name = "FIELD3")
	private String _field3;
	
	@NotNull
	@Column(name = "STATUS")
	private int _status;
	

}
