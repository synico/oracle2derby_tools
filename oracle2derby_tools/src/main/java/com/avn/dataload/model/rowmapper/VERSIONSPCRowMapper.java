package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.VERSIONSPC;

public class VERSIONSPCRowMapper<T> implements RowMapper<VERSIONSPC> {

	@Override
	public VERSIONSPC mapRow(ResultSet rs, int rowNum) throws SQLException {
		VERSIONSPC obj = new VERSIONSPC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setITEMSPC_ID(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setVERSIONSPC_ID(rs.getBigDecimal("VERSIONSPC_ID"));
		obj.setITEMVERSN_ID(rs.getBigDecimal("ITEMVERSN_ID"));
		
		return obj;
	}

}
