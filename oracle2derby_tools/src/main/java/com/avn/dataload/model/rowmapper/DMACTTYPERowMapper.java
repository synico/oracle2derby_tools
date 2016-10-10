package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMACTTYPE;

public class DMACTTYPERowMapper<T> implements RowMapper<DMACTTYPE> {

	@Override
	public DMACTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMACTTYPE obj = new DMACTTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMACTTYPE_ID(rs.getBigDecimal("DMACTTYPE_ID"));
		
		return obj;
	}

}
