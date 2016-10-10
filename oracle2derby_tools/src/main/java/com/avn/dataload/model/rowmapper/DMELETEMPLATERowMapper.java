package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELETEMPLATE;

public class DMELETEMPLATERowMapper<T> implements RowMapper<DMELETEMPLATE> {

	@Override
	public DMELETEMPLATE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELETEMPLATE obj = new DMELETEMPLATE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setDISPLAYXML(rs.getClob("DISPLAYXML"));
		obj.setIMPLXML(rs.getClob("IMPLXML"));
		obj.setRELATEDXML(rs.getClob("RELATEDXML"));
		obj.setDMELETEMPLATE_ID(rs.getBigDecimal("DMELETEMPLATE_ID"));
		obj.setDMELEMENTTYPE_ID(rs.getBigDecimal("DMELEMENTTYPE_ID"));
		obj.setBEHAVIORXML(rs.getClob("BEHAVIORXML"));
		
		return obj;
	}

}
