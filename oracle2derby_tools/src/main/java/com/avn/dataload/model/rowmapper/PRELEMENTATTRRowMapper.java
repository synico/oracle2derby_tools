package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRELEMENTATTR;

public class PRELEMENTATTRRowMapper<T> implements RowMapper<PRELEMENTATTR> {

	@Override
	public PRELEMENTATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRELEMENTATTR obj = new PRELEMENTATTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setPRELEMENT_ID(rs.getBigDecimal("PRELEMENT_ID"));
		
		return obj;
	}

}
