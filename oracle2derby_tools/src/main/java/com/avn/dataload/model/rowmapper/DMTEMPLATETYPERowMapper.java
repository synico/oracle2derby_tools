package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMTEMPLATETYPE;

public class DMTEMPLATETYPERowMapper<T> implements RowMapper<DMTEMPLATETYPE> {

	@Override
	public DMTEMPLATETYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMTEMPLATETYPE obj = new DMTEMPLATETYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMTEMPLATETYPE_ID(rs.getBigDecimal("DMTEMPLATETYPE_ID"));
		
		return obj;
	}

}
