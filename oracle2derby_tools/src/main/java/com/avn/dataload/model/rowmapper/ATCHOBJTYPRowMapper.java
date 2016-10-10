package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHOBJTYP;

public class ATCHOBJTYPRowMapper<T> implements RowMapper<ATCHOBJTYP> {

	@Override
	public ATCHOBJTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHOBJTYP obj = new ATCHOBJTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATCHOBJTYP_ID(rs.getBigDecimal("ATCHOBJTYP_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
