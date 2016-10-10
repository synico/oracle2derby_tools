package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORBLKRSN;

public class STORBLKRSNRowMapper<T> implements RowMapper<STORBLKRSN> {

	@Override
	public STORBLKRSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORBLKRSN obj = new STORBLKRSN();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setBLKRSNCODE_ID(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setTKLRGENERATION(rs.getBigDecimal("TKLRGENERATION"));
		obj.setRESPECTED(rs.getBigDecimal("RESPECTED"));
		
		return obj;
	}

}
