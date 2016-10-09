package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmtriglstn;

public class DmtriglstnRowMapper<T> implements RowMapper<Dmtriglstn> {

	@Override
	public Dmtriglstn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmtriglstn obj = new Dmtriglstn();
		
		obj.setName(rs.getString("NAME"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setDmactivityId(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setDmelementId(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setAllusers(rs.getBigDecimal("ALLUSERS"));
		
		return obj;
	}

}
