package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUYERPO;

public class BUYERPORowMapper<T> implements RowMapper<BUYERPO> {

    private static final Logger log = Logger.getLogger(BUYERPORowMapper.class);

	@Override
	public BUYERPO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUYERPO obj = new BUYERPO();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACCOUNT_ID(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setBUYERPOTYP_ID(rs.getBigDecimal("BUYERPOTYP_ID"));
		obj.setBUYERPO_ID(rs.getBigDecimal("BUYERPO_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setPONUMBER(rs.getString("PONUMBER"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
