package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Blkrsncode;

public class BlkrsncodeRowMapper<T> implements RowMapper<Blkrsncode> {

	@Override
	public Blkrsncode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Blkrsncode obj = new Blkrsncode();
		
		obj.setBlkrsncodeId(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setBlockreasontype(rs.getString("BLOCKREASONTYPE"));
		obj.setManualblock(rs.getBigDecimal("MANUALBLOCK"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setMarkfordelete(rs.getString("MARKFORDELETE"));
		
		return obj;
	}

}
