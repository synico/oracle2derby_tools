package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmelement;

public class DmelementRowMapper<T> implements RowMapper<Dmelement> {

	@Override
	public Dmelement mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmelement obj = new Dmelement();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setName(rs.getString("NAME"));
		obj.setParent(rs.getString("PARENT"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setDmactivityId(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setDmelementId(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setDmeletemplateId(rs.getBigDecimal("DMELETEMPLATE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setRelatedId(rs.getBigDecimal("RELATED_ID"));
		
		return obj;
	}

}
