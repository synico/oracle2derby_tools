package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Baseitem;

public class BaseitemRowMapper<T> implements RowMapper<Baseitem> {

	@Override
	public Baseitem mapRow(ResultSet rs, int rowNum) throws SQLException {
		Baseitem obj = new Baseitem();
		
		obj.setQuantitymeasure(rs.getString("QUANTITYMEASURE"));
		obj.setQuantitymultiple(rs.getBigDecimal("QUANTITYMULTIPLE"));
		obj.setBaseitemId(rs.getBigDecimal("BASEITEM_ID"));
		obj.setItemtypeId(rs.getString("ITEMTYPE_ID"));
		obj.setPartnumber(rs.getString("PARTNUMBER"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
