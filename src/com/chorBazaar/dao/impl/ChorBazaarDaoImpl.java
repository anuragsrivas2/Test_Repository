package com.chorBazaar.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.chorBazaar.dao.ChorBazaarDao;
import com.chorBazaar.entity.AddressBean;

public class ChorBazaarDaoImpl implements ChorBazaarDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void getAll() {
		
	}

	@Override
	public void save(AddressBean add) {
		hibernateTemplate.save(add);
	}
	

}
