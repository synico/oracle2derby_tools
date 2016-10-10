package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CRULESCALE;

public class CRULESCALERowMapper<T> implements RowMapper<CRULESCALE> {

	@Override
	public CRULESCALE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CRULESCALE obj = new CRULESCALE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCALSCALE_ID(rs.getBigDecimal("CALSCALE_ID"));
		obj.setCALRULE_ID(rs.getBigDecimal("CALRULE_ID"));
		
		return obj;
	}

}
