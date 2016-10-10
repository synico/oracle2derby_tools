package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEXPTYPE;

public class DMEXPTYPERowMapper<T> implements RowMapper<DMEXPTYPE> {

	@Override
	public DMEXPTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEXPTYPE obj = new DMEXPTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMEXPTYPE_ID(rs.getBigDecimal("DMEXPTYPE_ID"));
		
		return obj;
	}

}
