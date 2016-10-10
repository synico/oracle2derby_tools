package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COLLTYPE;

public class COLLTYPERowMapper<T> implements RowMapper<COLLTYPE> {

	@Override
	public COLLTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		COLLTYPE obj = new COLLTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setCOLLTYPE_ID(rs.getBigDecimal("COLLTYPE_ID"));
		
		return obj;
	}

}
