package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALRULE;

public class CALRULERowMapper<T> implements RowMapper<CALRULE> {

	@Override
	public CALRULE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALRULE obj = new CALRULE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setIDENTIFIER(rs.getBigDecimal("IDENTIFIER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setFLAGS(rs.getBigDecimal("FLAGS"));
		obj.setCOMBINATION(rs.getBigDecimal("COMBINATION"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCALMETHOD_ID_QFY(rs.getBigDecimal("CALMETHOD_ID_QFY"));
		obj.setCALRULE_ID(rs.getBigDecimal("CALRULE_ID"));
		obj.setTAXCGRY_ID(rs.getBigDecimal("TAXCGRY_ID"));
		
		return obj;
	}

}
