package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFPRODUCTSET;

public class CFPRODUCTSETRowMapper<T> implements RowMapper<CFPRODUCTSET> {

    private static final Logger log = Logger.getLogger(CFPRODUCTSETRowMapper.class);

	@Override
	public CFPRODUCTSET mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFPRODUCTSET obj = new CFPRODUCTSET();
		
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setCFPRODUCTSET_ID(rs.getBigDecimal("CFPRODUCTSET_ID"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
