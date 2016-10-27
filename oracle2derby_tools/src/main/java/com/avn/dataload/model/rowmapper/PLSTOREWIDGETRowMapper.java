package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLSTOREWIDGET;

public class PLSTOREWIDGETRowMapper<T> implements RowMapper<PLSTOREWIDGET> {

    private static final Logger log = Logger.getLogger(PLSTOREWIDGETRowMapper.class);

	@Override
	public PLSTOREWIDGET mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLSTOREWIDGET obj = new PLSTOREWIDGET();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setPLSTOREWIDGET_ID(rs.getBigDecimal("PLSTOREWIDGET_ID"));
		obj.setPLWIDGETDEF_ID(rs.getBigDecimal("PLWIDGETDEF_ID"));
		obj.setDEFINITIONXML(rs.getClob("DEFINITIONXML"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
