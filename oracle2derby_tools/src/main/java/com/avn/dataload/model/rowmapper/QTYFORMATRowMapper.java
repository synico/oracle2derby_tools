package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYFORMAT;

public class QTYFORMATRowMapper<T> implements RowMapper<QTYFORMAT> {

    private static final Logger log = Logger.getLogger(QTYFORMATRowMapper.class);

	@Override
	public QTYFORMAT mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYFORMAT obj = new QTYFORMAT();
		
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		obj.setROUNDINGMULTIPLE(rs.getBigDecimal("ROUNDINGMULTIPLE"));
		obj.setROUNDINGMETHOD(rs.getString("ROUNDINGMETHOD"));
		obj.setDECIMALPLACES(rs.getBigDecimal("DECIMALPLACES"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
