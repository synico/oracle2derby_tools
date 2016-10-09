package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xinventory;

public class XinventoryRowMapper<T> implements RowMapper<Xinventory> {

	@Override
	public Xinventory mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xinventory obj = new Xinventory();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setField6(rs.getString("FIELD6"));
		obj.setFactoryqoh(rs.getBigDecimal("FACTORYQOH"));
		obj.setFactoryLeadtime(rs.getBigDecimal("FACTORY_LEADTIME"));
		obj.setLeadtimeUom(rs.getString("LEADTIME_UOM"));
		obj.setTimeStampUtc(rs.getDate("TIME_STAMP_UTC"));
		
		return obj;
	}

}
