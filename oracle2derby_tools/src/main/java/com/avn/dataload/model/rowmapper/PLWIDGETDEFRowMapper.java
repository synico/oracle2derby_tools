package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETDEF;

public class PLWIDGETDEFRowMapper<T> implements RowMapper<PLWIDGETDEF> {

	@Override
	public PLWIDGETDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETDEF obj = new PLWIDGETDEF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setPLWIDGETDEF_ID(rs.getBigDecimal("PLWIDGETDEF_ID"));
		obj.setDEFINITIONXML(rs.getClob("DEFINITIONXML"));
		obj.setUI_OBJECT_NAME(rs.getString("UI_OBJECT_NAME"));
		obj.setCREATEDATE(rs.getTimestamp("CREATEDATE"));
		obj.setVENDOR(rs.getString("VENDOR"));
		obj.setWIDGETTYPE(rs.getBigDecimal("WIDGETTYPE"));
		obj.setJSPPATH(rs.getString("JSPPATH"));
		
		return obj;
	}

}
