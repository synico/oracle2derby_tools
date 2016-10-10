package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDERBLK;

public class ORDERBLKRowMapper<T> implements RowMapper<ORDERBLK> {

	@Override
	public ORDERBLK mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDERBLK obj = new ORDERBLK();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setBLKRSNCODE_ID(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setRESOLVED(rs.getBigDecimal("RESOLVED"));
		obj.setBLKCOMMENT(rs.getString("BLKCOMMENT"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setORDERBLK_ID(rs.getBigDecimal("ORDERBLK_ID"));
		obj.setTIMEBLOCKED(rs.getTimestamp("TIMEBLOCKED"));
		
		return obj;
	}

}
