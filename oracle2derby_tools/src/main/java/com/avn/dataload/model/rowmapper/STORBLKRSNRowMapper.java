package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORBLKRSN;

public class STORBLKRSNRowMapper<T> implements RowMapper<STORBLKRSN> {

    private static final Logger log = Logger.getLogger(STORBLKRSNRowMapper.class);

	@Override
	public STORBLKRSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORBLKRSN obj = new STORBLKRSN();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setBLKRSNCODE_ID(rs.getBigDecimal("BLKRSNCODE_ID"));
		obj.setRESPECTED(rs.getBigDecimal("RESPECTED"));
		obj.setTKLRGENERATION(rs.getBigDecimal("TKLRGENERATION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
