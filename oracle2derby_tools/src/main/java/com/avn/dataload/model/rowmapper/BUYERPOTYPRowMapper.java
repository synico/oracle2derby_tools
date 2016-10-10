package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUYERPOTYP;

public class BUYERPOTYPRowMapper<T> implements RowMapper<BUYERPOTYP> {

	@Override
	public BUYERPOTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUYERPOTYP obj = new BUYERPOTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBUYERPOTYP_ID(rs.getBigDecimal("BUYERPOTYP_ID"));
		
		return obj;
	}

}
