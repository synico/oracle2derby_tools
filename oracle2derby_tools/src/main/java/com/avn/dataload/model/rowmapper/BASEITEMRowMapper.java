package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BASEITEM;

public class BASEITEMRowMapper<T> implements RowMapper<BASEITEM> {

	@Override
	public BASEITEM mapRow(ResultSet rs, int rowNum) throws SQLException {
		BASEITEM obj = new BASEITEM();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		obj.setITEMTYPE_ID(rs.getString("ITEMTYPE_ID"));
		obj.setQUANTITYMEASURE(rs.getString("QUANTITYMEASURE"));
		obj.setQUANTITYMULTIPLE(rs.getBigDecimal("QUANTITYMULTIPLE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setPARTNUMBER(rs.getString("PARTNUMBER"));
		
		return obj;
	}

}
