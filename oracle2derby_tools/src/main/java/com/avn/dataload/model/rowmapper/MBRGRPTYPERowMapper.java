package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRPTYPE;

public class MBRGRPTYPERowMapper<T> implements RowMapper<MBRGRPTYPE> {

	@Override
	public MBRGRPTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRPTYPE obj = new MBRGRPTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setMBRGRPTYPE_ID(rs.getBigDecimal("MBRGRPTYPE_ID"));
		
		return obj;
	}

}
