package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELEMENT;

public class DMELEMENTRowMapper<T> implements RowMapper<DMELEMENT> {

    private static final Logger log = Logger.getLogger(DMELEMENTRowMapper.class);

	@Override
	public DMELEMENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELEMENT obj = new DMELEMENT();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setDMELEMENT_ID(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setDMELETEMPLATE_ID(rs.getBigDecimal("DMELETEMPLATE_ID"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setRELATED_ID(rs.getBigDecimal("RELATED_ID"));
		obj.setPARENT(rs.getString("PARENT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
