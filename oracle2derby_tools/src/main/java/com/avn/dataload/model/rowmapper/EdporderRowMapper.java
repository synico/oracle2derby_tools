package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Edporder;

public class EdporderRowMapper<T> implements RowMapper<Edporder> {

	@Override
	public Edporder mapRow(ResultSet rs, int rowNum) throws SQLException {
		Edporder obj = new Edporder();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTotalamount(rs.getBigDecimal("TOTALAMOUNT"));
		obj.setInitialamount(rs.getBigDecimal("INITIALAMOUNT"));
		obj.setBgjobstatus(rs.getBigDecimal("BGJOBSTATUS"));
		obj.setEdporderId(rs.getBigDecimal("EDPORDER_ID"));
		obj.setOrderId(rs.getBigDecimal("ORDER_ID"));
		obj.setBlocked(rs.getBigDecimal("BLOCKED"));
		
		return obj;
	}

}
