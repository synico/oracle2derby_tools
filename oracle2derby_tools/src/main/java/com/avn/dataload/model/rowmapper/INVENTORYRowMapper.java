package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.INVENTORY;

public class INVENTORYRowMapper<T> implements RowMapper<INVENTORY> {

    private static final Logger log = Logger.getLogger(INVENTORYRowMapper.class);

	@Override
	public INVENTORY mapRow(ResultSet rs, int rowNum) throws SQLException {
		INVENTORY obj = new INVENTORY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setINVENTORYFLAGS(rs.getBigDecimal("INVENTORYFLAGS"));
		obj.setQUANTITYMEASURE(rs.getString("QUANTITYMEASURE"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
