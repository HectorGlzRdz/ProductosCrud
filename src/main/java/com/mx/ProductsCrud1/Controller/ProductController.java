package com.mx.ProductsCrud1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ProductsCrud1.Model.Products;
import com.mx.ProductsCrud1.Service.ProductServ;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "Productos")
@CrossOrigin
public class ProductController {

	@Autowired
	ProductServ prodServ;

	@PostMapping("Guardar")
	public void save(@RequestBody Products prod) {
		prodServ.save(prod);
	}

	@GetMapping("Listar")
	public List<Products> listAll() {
		return prodServ.listAll();
	}

	@PostMapping("Borrar")
	public void dlt(@RequestBody Products prod) {
		// TODO: process POST request
		prodServ.delete(prod);

	}

	@PostMapping("Editar")
	public void edit(@RequestBody Products prod) {
		// TODO: process POST request
		prodServ.edit(prod);

	}

	@GetMapping("BuscarId")
	public Products fndId(@RequestBody Products prod) {
		return prodServ.shwById(prod);
	}

	@GetMapping("BuscarNombreYTipo")
	public Products fndNameAndType(@RequestBody Products prod) {
		return prodServ.fndByNameAndType(prod);
	}

	@GetMapping("BuscarTipo")
	public List<Products> findByType(@RequestBody Products prod) {
		return prodServ.fndByType(prod);
	}

	@GetMapping("BuscarNombre")
	public Products findByName(@RequestBody Products prod) {
		return prodServ.fndByName(prod);
	}
	
	@PostMapping("BorrarNombre")
	public void dltByName(@RequestBody Products prod) {
		// TODO: process POST request
		prodServ.dltByName(prod);

	}
}
