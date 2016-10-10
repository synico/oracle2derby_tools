package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHATTRPROP;

public class SRCHATTRPROPRowMapper<T> implements RowMapper<SRCHATTRPROP> {

	@Override
	public SRCHATTRPROP mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHATTRPROP obj = new SRCHATTRPROP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROPERTYNAME(rs.getString("PROPERTYNAME"));
		obj.setSRCHATTR_ID(rs.getBigDecimal("SRCHATTR_ID"));
		obj.setPROPERTYVALUE(rs.getString("PROPERTYVALUE"));
		
		return obj;
	}

}
