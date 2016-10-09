package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmeletemplate;

public class DmeletemplateRowMapper<T> implements RowMapper<Dmeletemplate> {

	@Override
	public Dmeletemplate mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmeletemplate obj = new Dmeletemplate();
		
		obj.setName(rs.getString("NAME"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setDmeletemplateId(rs.getBigDecimal("DMELETEMPLATE_ID"));
		obj.setDmelementtypeId(rs.getBigDecimal("DMELEMENTTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
