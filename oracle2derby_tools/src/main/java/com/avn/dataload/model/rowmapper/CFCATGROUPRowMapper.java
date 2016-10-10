package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFCATGROUP;

public class CFCATGROUPRowMapper<T> implements RowMapper<CFCATGROUP> {

	@Override
	public CFCATGROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFCATGROUP obj = new CFCATGROUP();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getBigDecimal("FIELD4"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setCFCATGROUP_ID(rs.getBigDecimal("CFCATGROUP_ID"));
		obj.setCONDGRPRELATION(rs.getBigDecimal("CONDGRPRELATION"));
		obj.setFIELD5(rs.getBigDecimal("FIELD5"));
		
		return obj;
	}

}
