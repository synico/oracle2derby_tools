package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XMANFOVERRIDE;

public class XMANFOVERRIDERowMapper<T> implements RowMapper<XMANFOVERRIDE> {

    private static final Logger log = Logger.getLogger(XMANFOVERRIDERowMapper.class);

	@Override
	public XMANFOVERRIDE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XMANFOVERRIDE obj = new XMANFOVERRIDE();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOVERRIDE(rs.getString("OVERRIDE"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setLASTUPDATED(rs.getTimestamp("LASTUPDATED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
