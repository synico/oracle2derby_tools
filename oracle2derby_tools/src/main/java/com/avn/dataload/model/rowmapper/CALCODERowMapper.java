package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALCODE;

public class CALCODERowMapper<T> implements RowMapper<CALCODE> {

	@Override
	public CALCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALCODE obj = new CALCODE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setCODE(rs.getString("CODE"));
		obj.setGROUPBY(rs.getBigDecimal("GROUPBY"));
		obj.setPUBLISHED(rs.getBigDecimal("PUBLISHED"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setFLAGS(rs.getBigDecimal("FLAGS"));
		obj.setPRECEDENCE(rs.getBigDecimal("PRECEDENCE"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setTXCDCLASS_ID(rs.getBigDecimal("TXCDCLASS_ID"));
		obj.setCOMBINATION(rs.getBigDecimal("COMBINATION"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCALMETHOD_ID_APP(rs.getBigDecimal("CALMETHOD_ID_APP"));
		obj.setCALMETHOD_ID_QFY(rs.getBigDecimal("CALMETHOD_ID_QFY"));
		obj.setDISPLAYLEVEL(rs.getBigDecimal("DISPLAYLEVEL"));
		
		return obj;
	}

}
