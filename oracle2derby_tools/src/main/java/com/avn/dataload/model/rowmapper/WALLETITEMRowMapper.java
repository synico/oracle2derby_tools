package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.WALLETITEM;

public class WALLETITEMRowMapper<T> implements RowMapper<WALLETITEM> {

	@Override
	public WALLETITEM mapRow(ResultSet rs, int rowNum) throws SQLException {
		WALLETITEM obj = new WALLETITEM();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setCONTENT(rs.getString("CONTENT"));
		obj.setWALLETITEM_ID(rs.getBigDecimal("WALLETITEM_ID"));
		obj.setCREATIONDATE(rs.getTimestamp("CREATIONDATE"));
		obj.setWALLET_ID(rs.getBigDecimal("WALLET_ID"));
		obj.setUNREAD(rs.getBigDecimal("UNREAD"));
		obj.setMOVABLE(rs.getBigDecimal("MOVABLE"));
		obj.setRENAMABLE(rs.getBigDecimal("RENAMABLE"));
		obj.setDELETABLE(rs.getBigDecimal("DELETABLE"));
		
		return obj;
	}

}
