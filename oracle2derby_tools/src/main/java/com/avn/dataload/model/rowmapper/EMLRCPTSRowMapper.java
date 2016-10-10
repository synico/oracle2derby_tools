package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLRCPTS;

public class EMLRCPTSRowMapper<T> implements RowMapper<EMLRCPTS> {

	@Override
	public EMLRCPTS mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLRCPTS obj = new EMLRCPTS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEMLPROMO_ID(rs.getBigDecimal("EMLPROMO_ID"));
		obj.setCOUNT(rs.getBigDecimal("COUNT"));
		obj.setRECIPIENTS(rs.getClob("RECIPIENTS"));
		
		return obj;
	}

}
