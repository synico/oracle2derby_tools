package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cfproductset;

public class CfproductsetRowMapper<T> implements RowMapper<Cfproductset> {

	@Override
	public Cfproductset mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cfproductset obj = new Cfproductset();
		
		obj.setCatfilterId(rs.getBigDecimal("CATFILTER_ID"));
		obj.setCfproductsetId(rs.getBigDecimal("CFPRODUCT_ID"));
		obj.setProductsetId(rs.getBigDecimal("PRODUCT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getBigDecimal("TYPE"));
		
		return obj;
	}

}
