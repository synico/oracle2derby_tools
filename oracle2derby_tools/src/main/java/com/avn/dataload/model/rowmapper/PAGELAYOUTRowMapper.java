package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAGELAYOUT;

public class PAGELAYOUTRowMapper<T> implements RowMapper<PAGELAYOUT> {

	@Override
	public PAGELAYOUT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAGELAYOUT obj = new PAGELAYOUT();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setTHUMBNAIL(rs.getString("THUMBNAIL"));
		obj.setFULLIMAGE(rs.getString("FULLIMAGE"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setMASTERCSS(rs.getString("MASTERCSS"));
		obj.setDEVICETYPE(rs.getString("DEVICETYPE"));
		obj.setISTEMPLATE(rs.getBigDecimal("ISTEMPLATE"));
		obj.setCREATEDATE(rs.getTimestamp("CREATEDATE"));
		obj.setISDEFAULT(rs.getBigDecimal("ISDEFAULT"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
