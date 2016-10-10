package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ITEMSPC;

public class ITEMSPCRowMapper<T> implements RowMapper<ITEMSPC> {

	@Override
	public ITEMSPC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ITEMSPC obj = new ITEMSPC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setPARTNUMBER(rs.getString("PARTNUMBER"));
		obj.setITEMSPC_ID(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setDISCONTINUED(rs.getString("DISCONTINUED"));
		
		return obj;
	}

}
