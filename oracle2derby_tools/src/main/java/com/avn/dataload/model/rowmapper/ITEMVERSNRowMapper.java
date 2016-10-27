package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ITEMVERSN;

public class ITEMVERSNRowMapper<T> implements RowMapper<ITEMVERSN> {

    private static final Logger log = Logger.getLogger(ITEMVERSNRowMapper.class);

	@Override
	public ITEMVERSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		ITEMVERSN obj = new ITEMVERSN();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setITEMVERSN_ID(rs.getBigDecimal("ITEMVERSN_ID"));
		obj.setEXPIRATIONDATE(rs.getTimestamp("EXPIRATIONDATE"));
		obj.setVERSIONNAME(rs.getString("VERSIONNAME"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
