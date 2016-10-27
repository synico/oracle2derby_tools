package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETDEF;

public class PLWIDGETDEFRowMapper<T> implements RowMapper<PLWIDGETDEF> {

    private static final Logger log = Logger.getLogger(PLWIDGETDEFRowMapper.class);

	@Override
	public PLWIDGETDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETDEF obj = new PLWIDGETDEF();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setUI_OBJECT_NAME(rs.getString("UI_OBJECT_NAME"));
		obj.setJSPPATH(rs.getString("JSPPATH"));
		obj.setCREATEDATE(rs.getTimestamp("CREATEDATE"));
		obj.setVENDOR(rs.getString("VENDOR"));
		obj.setWIDGETTYPE(rs.getBigDecimal("WIDGETTYPE"));
		obj.setPLWIDGETDEF_ID(rs.getBigDecimal("PLWIDGETDEF_ID"));
		obj.setDEFINITIONXML(rs.getClob("DEFINITIONXML"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
