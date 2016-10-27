package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XINVENTORY;

public class XINVENTORYRowMapper<T> implements RowMapper<XINVENTORY> {

    private static final Logger log = Logger.getLogger(XINVENTORYRowMapper.class);

	@Override
	public XINVENTORY mapRow(ResultSet rs, int rowNum) throws SQLException {
		XINVENTORY obj = new XINVENTORY();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setFACTORY_LEADTIME(rs.getBigDecimal("FACTORY_LEADTIME"));
		obj.setLEADTIME_UOM(rs.getString("LEADTIME_UOM"));
		obj.setTIME_STAMP_UTC(rs.getTimestamp("TIME_STAMP_UTC"));
		obj.setFACTORYQOH(rs.getBigDecimal("FACTORYQOH"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setFIELD6(rs.getString("FIELD6"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
