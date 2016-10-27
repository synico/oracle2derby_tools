package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELETEMPLATE;

public class DMELETEMPLATERowMapper<T> implements RowMapper<DMELETEMPLATE> {

    private static final Logger log = Logger.getLogger(DMELETEMPLATERowMapper.class);

	@Override
	public DMELETEMPLATE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELETEMPLATE obj = new DMELETEMPLATE();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMELETEMPLATE_ID(rs.getBigDecimal("DMELETEMPLATE_ID"));
		obj.setDMELEMENTTYPE_ID(rs.getBigDecimal("DMELEMENTTYPE_ID"));
		obj.setBEHAVIORXML(rs.getClob("BEHAVIORXML"));
		obj.setDISPLAYXML(rs.getClob("DISPLAYXML"));
		obj.setIMPLXML(rs.getClob("IMPLXML"));
		obj.setRELATEDXML(rs.getClob("RELATEDXML"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
