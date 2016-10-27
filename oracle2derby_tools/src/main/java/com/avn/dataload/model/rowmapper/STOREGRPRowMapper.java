package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREGRP;

public class STOREGRPRowMapper<T> implements RowMapper<STOREGRP> {

    private static final Logger log = Logger.getLogger(STOREGRPRowMapper.class);

	@Override
	public STOREGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREGRP obj = new STOREGRP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setSTOREGRP_ID(rs.getBigDecimal("STOREGRP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
