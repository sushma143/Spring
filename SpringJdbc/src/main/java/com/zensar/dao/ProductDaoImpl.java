package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Sushma Kumari
 * @creation_date 04 Oct 2019 10:25 AM
 * @version 2.0
 * @modification_date 04 Oct 2019 04:10 PM
 * @copyright All rights are reserver by Zensar.
 * @description It is Product Implementation Dao class.
 * 				It is used in Persistence layer.
 * 		
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	//part of jdbc template
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		String sql="select * from product";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {//inner class new resultsetExtractor

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> products=new ArrayList<Product>();
				while(rs.next()) {
					Product product= new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);
				}
				return products;
			}
		});
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql="select * from product where id=?";
		
		return jdbcTemplate.query(sql, new Object[] {productId}, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next())
				{
					Product product= new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					return product;
				}
				else
				{
				return null;
				}
			}
		});
	}

	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		String sql="insert into product values (?,?,?,?)";
		jdbcTemplate.update(sql, p.getProductId(),p.getName(),p.getBrand(),p.getPrice());
		System.out.println("New product is added.");
		
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		
		String sql="update product set name=?,brand=?,price=? where id=?";
		jdbcTemplate.update(sql,p.getName(),p.getBrand(),p.getPrice(), p.getProductId());
		System.out.println("Product is updated successfully.");
		
	}

	@Override
	public void delete(Product p) {
		// TODO Auto-generated method stub
		String sql="delete from product where id=? ";
		jdbcTemplate.update(sql,p.getProductId());
		System.out.println("Product is deleted successfully.");
		
	}
	
}
