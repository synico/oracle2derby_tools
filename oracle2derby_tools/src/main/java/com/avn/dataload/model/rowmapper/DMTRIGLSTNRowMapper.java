package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMTRIGLSTN;

public class DMTRIGLSTNRowMapper<T> implements RowMapper<DMTRIGLSTN> {

    private static final Logger log = Logger.getLogger(DMTRIGLSTNRowMapper.class);

	@Override
	public DMTRIGLSTN mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMTRIGLSTN obj = new DMTRIGLSTN();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setDMELEMENT_ID(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setALLUSERS(rs.getBigDecimal("ALLUSERS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
