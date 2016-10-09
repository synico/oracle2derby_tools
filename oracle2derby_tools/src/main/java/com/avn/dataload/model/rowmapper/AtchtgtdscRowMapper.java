package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchtgtdsc;

public class AtchtgtdscRowMapper<T> implements RowMapper<Atchtgtdsc> {

	@Override
	public Atchtgtdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchtgtdsc obj = new Atchtgtdsc();
		
		obj.setName(rs.getString("NAME"));
		obj.setShortdescription(rs.getString("SHORTDESCRIPTION"));
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setAtchtgtdscId(rs.getBigDecimal("ATCHTGTDSC_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAtchtgtId(rs.getBigDecimal("ATCHTGT_ID"));
		
		return obj;
	}

}
