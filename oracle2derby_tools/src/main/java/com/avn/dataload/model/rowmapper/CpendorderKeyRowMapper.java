package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CpendorderKey;

public class CpendorderKeyRowMapper<T> implements RowMapper<CpendorderKey> {

	@Override
	public CpendorderKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CpendorderKey obj = new CpendorderKey();
		
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
