package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYFORMAT;

public class QTYFORMATRowMapper<T> implements RowMapper<QTYFORMAT> {

	@Override
	public QTYFORMAT mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYFORMAT obj = new QTYFORMAT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		obj.setROUNDINGMULTIPLE(rs.getBigDecimal("ROUNDINGMULTIPLE"));
		obj.setROUNDINGMETHOD(rs.getString("ROUNDINGMETHOD"));
		obj.setDECIMALPLACES(rs.getBigDecimal("DECIMALPLACES"));
		
		return obj;
	}

}
