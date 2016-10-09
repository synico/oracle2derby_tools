package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calrange;

public class CalrangeRowMapper<T> implements RowMapper<Calrange> {

	@Override
	public Calrange mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calrange obj = new Calrange();
		
		obj.setCalrangeId(rs.getBigDecimal("CALRANGE_ID"));
		obj.setCalscaleId(rs.getBigDecimal("CALSCALE_ID"));
		obj.setRangestart(rs.getBigDecimal("RANGESTART"));
		obj.setCumulative(rs.getBigDecimal("CUMULATIVE"));
		obj.setCalmethodId(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
