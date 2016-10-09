package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tradeposcn;

public class TradeposcnRowMapper<T> implements RowMapper<Tradeposcn> {

	@Override
	public Tradeposcn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tradeposcn obj = new Tradeposcn();
		
		obj.setName(rs.getString("NAME"));
		obj.setFlags(rs.getBigDecimal("FLAGS"));
		obj.setPrecedence(rs.getBigDecimal("PRECEDENCE"));
		obj.setTradeposcnId(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setProductsetId(rs.getBigDecimal("PRODUCT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setType(rs.getString("TYPE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
