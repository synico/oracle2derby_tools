package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_POLICY;

public class PX_POLICYRowMapper<T> implements RowMapper<PX_POLICY> {

	@Override
	public PX_POLICY mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_POLICY obj = new PX_POLICY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setIMPLCLS(rs.getString("IMPLCLS"));
		obj.setPX_POLICY_ID(rs.getBigDecimal("PX_POLICY_ID"));
		obj.setXMLPARAM(rs.getClob("XMLPARAM"));
		
		return obj;
	}

}
