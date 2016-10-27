package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STENCALUSG;

public class STENCALUSGRowMapper<T> implements RowMapper<STENCALUSG> {

    private static final Logger log = Logger.getLogger(STENCALUSGRowMapper.class);

	@Override
	public STENCALUSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STENCALUSG obj = new STENCALUSG();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setCALMETHOD_ID_APP(rs.getBigDecimal("CALMETHOD_ID_APP"));
		obj.setUSAGEFLAGS(rs.getBigDecimal("USAGEFLAGS"));
		obj.setACTCC_CALMETHOD_ID(rs.getBigDecimal("ACTCC_CALMETHOD_ID"));
		obj.setACTRC_CALMETHOD_ID(rs.getBigDecimal("ACTRC_CALMETHOD_ID"));
		obj.setCALMETHOD_ID_SUM(rs.getBigDecimal("CALMETHOD_ID_SUM"));
		obj.setCALMETHOD_ID_FIN(rs.getBigDecimal("CALMETHOD_ID_FIN"));
		obj.setCALMETHOD_ID_INI(rs.getBigDecimal("CALMETHOD_ID_INI"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
