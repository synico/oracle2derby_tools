package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMDREG;

public class CMDREGRowMapper<T> implements RowMapper<CMDREG> {

	@Override
	public CMDREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMDREG obj = new CMDREG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setTARGET(rs.getString("TARGET"));
		obj.setINTERFACENAME(rs.getString("INTERFACENAME"));
		
		return obj;
	}

}
