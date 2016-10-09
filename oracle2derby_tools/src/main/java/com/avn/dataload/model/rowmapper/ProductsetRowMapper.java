package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Productset;

public class ProductsetRowMapper<T> implements RowMapper<Productset> {

	@Override
	public Productset mapRow(ResultSet rs, int rowNum) throws SQLException {
		Productset obj = new Productset();
		
		obj.setName(rs.getString("NAME"));
		obj.setProductsetId(rs.getBigDecimal("PRODUCT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setPublishtime(rs.getDate("PUBLISHTIME"));
		obj.setXmldefinition(rs.getString("XMLDEFINITION"));
		obj.setTheStatic(rs.getString("THE_STATIC"));
		
		return obj;
	}

}
