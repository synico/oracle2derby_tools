package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Orderblk;

public class OrderblkRowMapper<T> implements RowMapper<Orderblk> {

	@Override
	public Orderblk mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orderblk obj = new Orderblk();
		
		obj.setBlkrsncodeId(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setTimeblocked(rs.getDate("TIMEBLOCKED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setOrderblkId(rs.getBigDecimal("ORDERBLK_ID"));
		obj.setResolved(rs.getBigDecimal("RESOLVED"));
		obj.setBlkcomment(rs.getString("BLKCOMMENT"));
		
		return obj;
	}

}
