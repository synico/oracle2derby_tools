package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENTSHIP;

public class CATENTSHIPRowMapper<T> implements RowMapper<CATENTSHIP> {

    private static final Logger log = Logger.getLogger(CATENTSHIPRowMapper.class);

	@Override
	public CATENTSHIP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENTSHIP obj = new CATENTSHIP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setWEIGHT(rs.getBigDecimal("WEIGHT"));
		obj.setLENGTH(rs.getBigDecimal("LENGTH"));
		obj.setWIDTH(rs.getBigDecimal("WIDTH"));
		obj.setHEIGHT(rs.getBigDecimal("HEIGHT"));
		obj.setQUANTITYMEASURE(rs.getString("QUANTITYMEASURE"));
		obj.setQUANTITYMULTIPLE(rs.getBigDecimal("QUANTITYMULTIPLE"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setWEIGHTMEASURE(rs.getString("WEIGHTMEASURE"));
		obj.setSIZEMEASURE(rs.getString("SIZEMEASURE"));
		obj.setNOMINALQUANTITY(rs.getBigDecimal("NOMINALQUANTITY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
