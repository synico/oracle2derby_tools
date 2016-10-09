package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchreldsc;

public class AtchreldscRowMapper<T> implements RowMapper<Atchreldsc> {

	@Override
	public Atchreldsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchreldsc obj = new Atchreldsc();
		
		obj.setName(rs.getString("NAME"));
		obj.setAtchreldscId(rs.getBigDecimal("ATCHRELDSC_ID"));
		obj.setShortdescription(rs.getString("SHORTDESCRIPTION"));
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAtchrelId(rs.getBigDecimal("ATCHREL_ID"));
		
		return obj;
	}

}
