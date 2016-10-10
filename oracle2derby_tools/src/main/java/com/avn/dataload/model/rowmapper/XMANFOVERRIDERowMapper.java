package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XMANFOVERRIDE;

public class XMANFOVERRIDERowMapper<T> implements RowMapper<XMANFOVERRIDE> {

	@Override
	public XMANFOVERRIDE mapRow(ResultSet rs, int rowNum) throws SQLException {
		XMANFOVERRIDE obj = new XMANFOVERRIDE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setOVERRIDE(rs.getString("OVERRIDE"));
		obj.setLASTUPDATED(rs.getTimestamp("LASTUPDATED"));
		
		return obj;
	}

}
