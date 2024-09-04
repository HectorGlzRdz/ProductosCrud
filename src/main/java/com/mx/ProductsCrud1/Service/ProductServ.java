package com.mx.ProductsCrud1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ProductsCrud1.Dao.ProductDao;
import com.mx.ProductsCrud1.Model.Products;

@Service
public class ProductServ {

	@Autowired
	ProductDao prodDao;

	@Transactional
	public void save(Products prod) {

		prodDao.save(prod);

	}

	@Transactional(readOnly = true)
	public List<Products> listAll() {

		return prodDao.findAll();
	}

	@Transactional(readOnly = true)
	public Products shwById(Products prod) {

		return prodDao.findById(prod.getId()).orElse(null);
	}

	@Transactional
	public void delete(Products prod) {

		prodDao.deleteById(prod.getId());

	}

	@Transactional
	public void edit(Products prod) {

		prodDao.save(prod);

	}

	@Transactional(readOnly = true)
	public Products fndByNameAndType(Products prod) {

		return prodDao.findByNameAndType(prod.getName(), prod.getType());

	}

	@Transactional(readOnly = true)
	public List<Products> fndByType(Products prod) {

		List<Products> lstProducts = new ArrayList<Products>();

		for (Products p : prodDao.findAll()) {

			if (p.getType().equals(prod.getType())) {
				lstProducts.add(p);
			}
		}

		return lstProducts;
	}

	@Transactional(readOnly = true)
	public Products fndByName(Products prod) {

		for (Products p : prodDao.findAll()) {

			if (p.getName().equals(prod.getName())) {

				return p;
			}

		}

		return null;
	}

	@Transactional
	public void dltByName(Products prod) {

		for (Products p : prodDao.findAll()) {

			if (p.getName().equals(prod.getName())) {

				prodDao.delete(p);
				
			}

		}

		
	}

}
