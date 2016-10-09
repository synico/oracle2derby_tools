package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Trading;

public class TradingRowMapper<T> implements RowMapper<Trading> {

	@Override
	public Trading mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trading obj = new Trading();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAccountId(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setReferencecount(rs.getBigDecimal("REFERENCECOUNT"));
		obj.setCreditallowed(rs.getBigDecimal("CREDITALLOWED"));
		obj.setReftradingId(rs.getBigDecimal("REFTRADING_ID"));
		obj.setStarttime(rs.getDate("STARTTIME"));
		obj.setEndtime(rs.getDate("ENDTIME"));
		obj.setTrdtypeId(rs.getBigDecimal("TRDTYPE_ID"));
		
		return obj;
	}

}
