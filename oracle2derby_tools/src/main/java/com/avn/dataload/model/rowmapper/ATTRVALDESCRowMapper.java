package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRVALDESC;

public class ATTRVALDESCRowMapper<T> implements RowMapper<ATTRVALDESC> {

	@Override
	public ATTRVALDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRVALDESC obj = new ATTRVALDESC();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIMAGE1(rs.getString("IMAGE1"));
		obj.setIMAGE2(rs.getString("IMAGE2"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setINTEGERVALUE(rs.getBigDecimal("INTEGERVALUE"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setATTRVAL_ID(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setVALUSAGE(rs.getBigDecimal("VALUSAGE"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setFLOATVALUE(rs.getBigDecimal("FLOATVALUE"));
		
		return obj;
	}

}
