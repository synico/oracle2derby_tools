package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFCATGROUP;

public class CFCATGROUPRowMapper<T> implements RowMapper<CFCATGROUP> {

    private static final Logger log = Logger.getLogger(CFCATGROUPRowMapper.class);

	@Override
	public CFCATGROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFCATGROUP obj = new CFCATGROUP();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getBigDecimal("FIELD4"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setFIELD5(rs.getBigDecimal("FIELD5"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setCFCATGROUP_ID(rs.getBigDecimal("CFCATGROUP_ID"));
		obj.setCONDGRPRELATION(rs.getBigDecimal("CONDGRPRELATION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
