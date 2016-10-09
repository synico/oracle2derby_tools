package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Orderhist;

public class OrderhistRowMapper<T> implements RowMapper<Orderhist> {

	@Override
	public Orderhist mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orderhist obj = new Orderhist();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getDate("FIELD3"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setOrdxml(rs.getString("ORDXML"));
		
		return obj;
	}

}
