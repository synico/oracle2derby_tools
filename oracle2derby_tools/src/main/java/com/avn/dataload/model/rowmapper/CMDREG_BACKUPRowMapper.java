package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMDREG_BACKUP;

public class CMDREG_BACKUPRowMapper<T> implements RowMapper<CMDREG_BACKUP> {

	@Override
	public CMDREG_BACKUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMDREG_BACKUP obj = new CMDREG_BACKUP();
		
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
