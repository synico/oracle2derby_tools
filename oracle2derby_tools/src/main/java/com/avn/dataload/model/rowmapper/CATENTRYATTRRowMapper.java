package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENTRYATTR;

public class CATENTRYATTRRowMapper<T> implements RowMapper<CATENTRYATTR> {

	@Override
	public CATENTRYATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENTRYATTR obj = new CATENTRYATTR();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setATTRVAL_ID(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setUSAGE(rs.getString("USAGE"));
		
		return obj;
	}

}
