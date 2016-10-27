package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ITEMSPC;

public class ITEMSPCRowMapper<T> implements RowMapper<ITEMSPC> {

    private static final Logger log = Logger.getLogger(ITEMSPCRowMapper.class);

	@Override
	public ITEMSPC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ITEMSPC obj = new ITEMSPC();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setITEMSPC_ID(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setDISCONTINUED(rs.getString("DISCONTINUED"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		obj.setPARTNUMBER(rs.getString("PARTNUMBER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
