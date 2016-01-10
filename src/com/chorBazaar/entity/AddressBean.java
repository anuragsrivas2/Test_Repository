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
@Table(name="Address")
public class AddressBean {
	
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "ADDRESS_ID")
	private BigInteger _addressId;
	
	@Column(name = "ADDRESSTYPE",length=5)
	private String _addressType;
	
	@Column(name = "MEMBER_ID")
	private BigInteger _memberId;
	
	@Column(name = "ADDRBOOK_ID")
	@NotNull
	private BigInteger _addressBookId;
	
	@Column(name = "ORGUNITNAME")
	private String _orgunitName;
	
	@Column(name = "FIELD3")
	private String _field3;
	
	@Column(name = "FIELD1")
	private String _field1;
	
	@Column(name = "FIELD2")
	private String _field2;
	
	@Column(name = "BILLINGCODE")
	private String _billingCode;
	
	@Column(name = "BILLINGCODETYPE")
	private String _billingCodeType;
	
	@Column(name = "STATUS")
	private char _status;
	
	@Column(name = "ORGNAME")
	private String _orgName;
	
	@Column(name = "ISPRIMARY")
	private int _isPrimary;
	
	@Column(name = "LASTNAME")
	private String _lastName;
	
	@Column(name = "PERSONTITLE")
	private String _personTitle;
	
	@Column(name = "FIRSTNAME")
	private String _firstName;
	
	@Column(name = "MIDDLENAME")
	private String _middleName;
	
	@Column(name = "PHONE1")
	private String _phone1;
	
	@Column(name = "PHONE2")
	private String _phone2;
	
	@Column(name = "FAX1")
	private String _fax1;
	
	@Column(name = "FAX2")
	private String _fax2;
	
	@Column(name = "ADDRESS1")
	private String _address1;
	
	@Column(name = "NICKNAME")
	private String _nickName;
	
	@Column(name = "ADDRESS2")
	private String _address2;
	
	@Column(name = "ADDRESS3")
	private String _address3;
	
	@Column(name = "CITY")
	private String _city;
	
	@Column(name = "STATE")
	private String _state;
	
	@Column(name = "COUNTRY")
	private String _country;
	
	@Column(name = "ZIPCODE")
	private String _zipcode;
	
	@Column(name = "EMAIL1")
	private String _email1;
	
	@Column(name = "EMAIL2")
	private String _email2;
	
	@Column(name = "PHONE1TYPE")
	private String _phone1Type;
	
	@Column(name = "PHONE2TYPE")
	private String _phone2Type;
	
	@Column(name = "PUBLISHPHONE1")
	private String _publishPhone1;
	
	@Column(name = "PUBLISHPHONE2")
	private String _publishPhone2;
	
	@Column(name = "BESTCALLINGTIME")
	private char  bestCallingTime;
	
	@Column(name = "LASTCREATE")
	private Timestamp  lastCreate;
	
	@Column(name = "OFFICEADDRESS")
	private String  officeAddress;
	
	@NotNull
	@Column(name = "SELFADDRESS")
	private int  selfAddress;
	
	@Column(name = "TAXGEOCODE")
	private String  taxGeoCode;
	
	@Column(name = "SHIPPINGGEOCODE")
	private String  shippingGeoCode;
	
	@Column(name = "MOBILEPHONE1")
	private String  mobilePhone1;
	
	@Column(name = "MOBILEPHONE1CNTRY")
	private String  mobilePhone1Cntry;
	
	public BigInteger get_addressId() {
		return _addressId;
	}

	public void set_addressId(BigInteger _addressId) {
		this._addressId = _addressId;
	}

	public String get_addressType() {
		return _addressType;
	}

	public void set_addressType(String _addressType) {
		this._addressType = _addressType;
	}

	public BigInteger get_memberId() {
		return _memberId;
	}

	public void set_memberId(BigInteger _memberId) {
		this._memberId = _memberId;
	}

	public BigInteger get_addressBookId() {
		return _addressBookId;
	}

	public void set_addressBookId(BigInteger _addressBookId) {
		this._addressBookId = _addressBookId;
	}

	public String get_orgunitName() {
		return _orgunitName;
	}

	public void set_orgunitName(String _orgunitName) {
		this._orgunitName = _orgunitName;
	}

	public String get_field3() {
		return _field3;
	}

	public void set_field3(String _field3) {
		this._field3 = _field3;
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

	public String get_billingCode() {
		return _billingCode;
	}

	public void set_billingCode(String _billingCode) {
		this._billingCode = _billingCode;
	}

	public String get_billingCodeType() {
		return _billingCodeType;
	}

	public void set_billingCodeType(String _billingCodeType) {
		this._billingCodeType = _billingCodeType;
	}

	public char get_status() {
		return _status;
	}

	public void set_status(char _status) {
		this._status = _status;
	}

	public String get_orgName() {
		return _orgName;
	}

	public void set_orgName(String _orgName) {
		this._orgName = _orgName;
	}

	public int get_isPrimary() {
		return _isPrimary;
	}

	public void set_isPrimary(int _isPrimary) {
		this._isPrimary = _isPrimary;
	}

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}

	public String get_personTitle() {
		return _personTitle;
	}

	public void set_personTitle(String _personTitle) {
		this._personTitle = _personTitle;
	}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}

	public String get_middleName() {
		return _middleName;
	}

	public void set_middleName(String _middleName) {
		this._middleName = _middleName;
	}

	public String get_phone1() {
		return _phone1;
	}

	public void set_phone1(String _phone1) {
		this._phone1 = _phone1;
	}

	public String get_phone2() {
		return _phone2;
	}

	public void set_phone2(String _phone2) {
		this._phone2 = _phone2;
	}

	public String get_fax1() {
		return _fax1;
	}

	public void set_fax1(String _fax1) {
		this._fax1 = _fax1;
	}

	public String get_fax2() {
		return _fax2;
	}

	public void set_fax2(String _fax2) {
		this._fax2 = _fax2;
	}

	public String get_address1() {
		return _address1;
	}

	public void set_address1(String _address1) {
		this._address1 = _address1;
	}

	public String get_nickName() {
		return _nickName;
	}

	public void set_nickName(String _nickName) {
		this._nickName = _nickName;
	}

	public String get_address2() {
		return _address2;
	}

	public void set_address2(String _address2) {
		this._address2 = _address2;
	}

	public String get_address3() {
		return _address3;
	}

	public void set_address3(String _address3) {
		this._address3 = _address3;
	}

	public String get_city() {
		return _city;
	}

	public void set_city(String _city) {
		this._city = _city;
	}

	public String get_state() {
		return _state;
	}

	public void set_state(String _state) {
		this._state = _state;
	}

	public String get_country() {
		return _country;
	}

	public void set_country(String _country) {
		this._country = _country;
	}

	public String get_zipcode() {
		return _zipcode;
	}

	public void set_zipcode(String _zipcode) {
		this._zipcode = _zipcode;
	}

	public String get_email1() {
		return _email1;
	}

	public void set_email1(String _email1) {
		this._email1 = _email1;
	}

	public String get_email2() {
		return _email2;
	}

	public void set_email2(String _email2) {
		this._email2 = _email2;
	}

	public String get_phone1Type() {
		return _phone1Type;
	}

	public void set_phone1Type(String _phone1Type) {
		this._phone1Type = _phone1Type;
	}

	public String get_phone2Type() {
		return _phone2Type;
	}

	public void set_phone2Type(String _phone2Type) {
		this._phone2Type = _phone2Type;
	}

	public String get_publishPhone1() {
		return _publishPhone1;
	}

	public void set_publishPhone1(String _publishPhone1) {
		this._publishPhone1 = _publishPhone1;
	}

	public String get_publishPhone2() {
		return _publishPhone2;
	}

	public void set_publishPhone2(String _publishPhone2) {
		this._publishPhone2 = _publishPhone2;
	}

	public char getBestCallingTime() {
		return bestCallingTime;
	}

	public void setBestCallingTime(char bestCallingTime) {
		this.bestCallingTime = bestCallingTime;
	}

	public Timestamp getLastCreate() {
		return lastCreate;
	}

	public void setLastCreate(Timestamp lastCreate) {
		this.lastCreate = lastCreate;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public int getSelfAddress() {
		return selfAddress;
	}

	public void setSelfAddress(int selfAddress) {
		this.selfAddress = selfAddress;
	}

	public String getTaxGeoCode() {
		return taxGeoCode;
	}

	public void setTaxGeoCode(String taxGeoCode) {
		this.taxGeoCode = taxGeoCode;
	}

	public String getShippingGeoCode() {
		return shippingGeoCode;
	}

	public void setShippingGeoCode(String shippingGeoCode) {
		this.shippingGeoCode = shippingGeoCode;
	}

	public String getMobilePhone1() {
		return mobilePhone1;
	}

	public void setMobilePhone1(String mobilePhone1) {
		this.mobilePhone1 = mobilePhone1;
	}

	public String getMobilePhone1Cntry() {
		return mobilePhone1Cntry;
	}

	public void setMobilePhone1Cntry(String mobilePhone1Cntry) {
		this.mobilePhone1Cntry = mobilePhone1Cntry;
	}

}
