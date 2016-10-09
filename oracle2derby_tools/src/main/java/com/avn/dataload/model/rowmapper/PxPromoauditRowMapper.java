package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxPromoaudit;

public class PxPromoauditRowMapper<T> implements RowMapper<PxPromoaudit> {

	@Override
	public PxPromoaudit mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxPromoaudit obj = new PxPromoaudit();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setXmlparam(rs.getString("XMLPARAM"));
		
		return obj;
	}

}
