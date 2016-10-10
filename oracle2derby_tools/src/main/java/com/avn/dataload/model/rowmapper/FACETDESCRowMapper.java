package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FACETDESC;

public class FACETDESCRowMapper<T> implements RowMapper<FACETDESC> {

	@Override
	public FACETDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FACETDESC obj = new FACETDESC();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFACET_ID(rs.getBigDecimal("FACET_ID"));
		
		return obj;
	}

}
