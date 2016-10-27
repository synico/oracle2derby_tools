package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRVAL;

public class ATTRVALRowMapper<T> implements RowMapper<ATTRVAL> {

    private static final Logger log = Logger.getLogger(ATTRVALRowMapper.class);

	@Override
	public ATTRVAL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRVAL obj = new ATTRVAL();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setATTRVAL_ID(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setVALUSAGE(rs.getBigDecimal("VALUSAGE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
