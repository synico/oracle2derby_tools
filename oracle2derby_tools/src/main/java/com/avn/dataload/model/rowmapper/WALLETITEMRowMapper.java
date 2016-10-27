package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.WALLETITEM;

public class WALLETITEMRowMapper<T> implements RowMapper<WALLETITEM> {

    private static final Logger log = Logger.getLogger(WALLETITEMRowMapper.class);

	@Override
	public WALLETITEM mapRow(ResultSet rs, int rowNum) throws SQLException {
		WALLETITEM obj = new WALLETITEM();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDELETABLE(rs.getBigDecimal("DELETABLE"));
		obj.setCONTENT(rs.getString("CONTENT"));
		obj.setWALLET_ID(rs.getBigDecimal("WALLET_ID"));
		obj.setUNREAD(rs.getBigDecimal("UNREAD"));
		obj.setMOVABLE(rs.getBigDecimal("MOVABLE"));
		obj.setRENAMABLE(rs.getBigDecimal("RENAMABLE"));
		obj.setWALLETITEM_ID(rs.getBigDecimal("WALLETITEM_ID"));
		obj.setCREATIONDATE(rs.getTimestamp("CREATIONDATE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
