package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Inventory;

public class InventoryRowMapper<T> implements RowMapper<Inventory> {

	@Override
	public Inventory mapRow(ResultSet rs, int rowNum) throws SQLException {
		Inventory obj = new Inventory();
		
		obj.setQuantitymeasure(rs.getString("QUANTITYMEASURE"));
		obj.setInventoryflags(rs.getBigDecimal("INVENTORYFLAGS"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
