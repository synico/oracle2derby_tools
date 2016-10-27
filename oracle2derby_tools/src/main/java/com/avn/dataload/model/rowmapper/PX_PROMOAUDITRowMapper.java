package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_PROMOAUDIT;

public class PX_PROMOAUDITRowMapper<T> implements RowMapper<PX_PROMOAUDIT> {

    private static final Logger log = Logger.getLogger(PX_PROMOAUDITRowMapper.class);

	@Override
	public PX_PROMOAUDIT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_PROMOAUDIT obj = new PX_PROMOAUDIT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setXMLPARAM(rs.getClob("XMLPARAM"));
		obj.setREVISION(rs.getBigDecimal("REVISION"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
