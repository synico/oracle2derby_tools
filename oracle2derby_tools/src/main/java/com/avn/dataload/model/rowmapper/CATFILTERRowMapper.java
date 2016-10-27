package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATFILTER;

public class CATFILTERRowMapper<T> implements RowMapper<CATFILTER> {

    private static final Logger log = Logger.getLogger(CATFILTERRowMapper.class);

	@Override
	public CATFILTER mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATFILTER obj = new CATFILTER();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setUSAGE(rs.getBigDecimal("USAGE"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
