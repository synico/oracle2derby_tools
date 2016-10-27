package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAGELAYOUT;

public class PAGELAYOUTRowMapper<T> implements RowMapper<PAGELAYOUT> {

    private static final Logger log = Logger.getLogger(PAGELAYOUTRowMapper.class);

	@Override
	public PAGELAYOUT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAGELAYOUT obj = new PAGELAYOUT();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setTHUMBNAIL(rs.getString("THUMBNAIL"));
		obj.setFULLIMAGE(rs.getString("FULLIMAGE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		obj.setMASTERCSS(rs.getString("MASTERCSS"));
		obj.setDEVICETYPE(rs.getString("DEVICETYPE"));
		obj.setISTEMPLATE(rs.getBigDecimal("ISTEMPLATE"));
		obj.setCREATEDATE(rs.getTimestamp("CREATEDATE"));
		obj.setISDEFAULT(rs.getBigDecimal("ISDEFAULT"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
