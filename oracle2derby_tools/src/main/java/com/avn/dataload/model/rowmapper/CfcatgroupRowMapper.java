package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cfcatgroup;

public class CfcatgroupRowMapper<T> implements RowMapper<Cfcatgroup> {

	@Override
	public Cfcatgroup mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cfcatgroup obj = new Cfcatgroup();
		
		obj.setField4(rs.getBigDecimal("FIELD4"));
		obj.setCatfilterId(rs.getBigDecimal("CATFILTER_ID"));
		obj.setCfcatgroupId(rs.getBigDecimal("CFCATGROUP_ID"));
		obj.setCondgrprelation(rs.getBigDecimal("CONDGRPRELATION"));
		obj.setField5(rs.getBigDecimal("FIELD5"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setField3(rs.getString("FIELD3"));
		
		return obj;
	}

}
