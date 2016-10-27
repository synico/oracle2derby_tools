package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.VERSIONSPC;

public class VERSIONSPCRowMapper<T> implements RowMapper<VERSIONSPC> {

    private static final Logger log = Logger.getLogger(VERSIONSPCRowMapper.class);

	@Override
	public VERSIONSPC mapRow(ResultSet rs, int rowNum) throws SQLException {
		VERSIONSPC obj = new VERSIONSPC();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setITEMSPC_ID(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setITEMVERSN_ID(rs.getBigDecimal("ITEMVERSN_ID"));
		obj.setVERSIONSPC_ID(rs.getBigDecimal("VERSIONSPC_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
