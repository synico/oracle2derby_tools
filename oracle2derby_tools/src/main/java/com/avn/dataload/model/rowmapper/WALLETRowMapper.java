package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.WALLET;

public class WALLETRowMapper<T> implements RowMapper<WALLET> {

    private static final Logger log = Logger.getLogger(WALLETRowMapper.class);

	@Override
	public WALLET mapRow(ResultSet rs, int rowNum) throws SQLException {
		WALLET obj = new WALLET();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setWALLET_ID(rs.getBigDecimal("WALLET_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
