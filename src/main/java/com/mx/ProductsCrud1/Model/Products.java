package com.mx.ProductsCrud1.Model;

import java.sql.Date;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
	
	@Id
	@Column(name="ID") @NonNull
	private Long id;
	@Column(name="NAME") @NonNull
	private String name;
	@Column(name="PRICE") @NonNull
	private Float price;
	@Column(name="TYPE")
	private String type;
	@Column(name="CAD")
	private Date cad;
	@Column(name="STOCK")@NonNull
	private Integer stock;
	
}
