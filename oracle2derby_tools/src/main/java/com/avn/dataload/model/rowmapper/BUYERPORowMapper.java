package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUYERPO;

public class BUYERPORowMapper<T> implements RowMapper<BUYERPO> {

	@Override
	public BUYERPO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUYERPO obj = new BUYERPO();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACCOUNT_ID(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setBUYERPO_ID(rs.getBigDecimal("BUYERPO_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setPONUMBER(rs.getString("PONUMBER"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		obj.setBUYERPOTYP_ID(rs.getBigDecimal("BUYERPOTYP_ID"));
		
		return obj;
	}

}
