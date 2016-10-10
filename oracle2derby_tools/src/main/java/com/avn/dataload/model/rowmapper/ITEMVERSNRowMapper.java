package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ITEMVERSN;

public class ITEMVERSNRowMapper<T> implements RowMapper<ITEMVERSN> {

	@Override
	public ITEMVERSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		ITEMVERSN obj = new ITEMVERSN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setITEMVERSN_ID(rs.getBigDecimal("ITEMVERSN_ID"));
		obj.setEXPIRATIONDATE(rs.getTimestamp("EXPIRATIONDATE"));
		obj.setVERSIONNAME(rs.getString("VERSIONNAME"));
		
		return obj;
	}

}
