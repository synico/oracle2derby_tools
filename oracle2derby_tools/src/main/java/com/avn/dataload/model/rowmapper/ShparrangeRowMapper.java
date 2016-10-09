package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Shparrange;

public class ShparrangeRowMapper<T> implements RowMapper<Shparrange> {

	@Override
	public Shparrange mapRow(ResultSet rs, int rowNum) throws SQLException {
		Shparrange obj = new Shparrange();
		
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setFlags(rs.getBigDecimal("FLAGS"));
		obj.setPrecedence(rs.getBigDecimal("PRECEDENCE"));
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setShparrangeId(rs.getBigDecimal("SHPARRANGE_ID"));
		obj.setTrackingnumber(rs.getString("TRACKINGNUMBER"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		
		return obj;
	}

}
