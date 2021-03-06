package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALCODE;

public class CALCODERowMapper<T> implements RowMapper<CALCODE> {

    private static final Logger log = Logger.getLogger(CALCODERowMapper.class);

	@Override
	public CALCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALCODE obj = new CALCODE();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setTXCDCLASS_ID(rs.getBigDecimal("TXCDCLASS_ID"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setCODE(rs.getString("CODE"));
		obj.setGROUPBY(rs.getBigDecimal("GROUPBY"));
		obj.setPUBLISHED(rs.getBigDecimal("PUBLISHED"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setFLAGS(rs.getBigDecimal("FLAGS"));
		obj.setPRECEDENCE(rs.getBigDecimal("PRECEDENCE"));
		obj.setCOMBINATION(rs.getBigDecimal("COMBINATION"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCALMETHOD_ID_APP(rs.getBigDecimal("CALMETHOD_ID_APP"));
		obj.setCALMETHOD_ID_QFY(rs.getBigDecimal("CALMETHOD_ID_QFY"));
		obj.setDISPLAYLEVEL(rs.getBigDecimal("DISPLAYLEVEL"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
