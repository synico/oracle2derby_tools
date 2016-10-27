package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MASSOCCECE;

public class MASSOCCECERowMapper<T> implements RowMapper<MASSOCCECE> {

    private static final Logger log = Logger.getLogger(MASSOCCECERowMapper.class);

	@Override
	public MASSOCCECE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MASSOCCECE obj = new MASSOCCECE();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setGROUPNAME(rs.getString("GROUPNAME"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setRANK(rs.getBigDecimal("RANK"));
		obj.setRULE(rs.getString("RULE"));
		obj.setMASSOCCECE_ID(rs.getBigDecimal("MASSOCCECE_ID"));
		obj.setMASSOCTYPE_ID(rs.getString("MASSOCTYPE_ID"));
		obj.setCATENTRY_ID_FROM(rs.getBigDecimal("CATENTRY_ID_FROM"));
		obj.setCATENTRY_ID_TO(rs.getBigDecimal("CATENTRY_ID_TO"));
		obj.setOID(rs.getString("OID"));
		obj.setMASSOC_ID(rs.getString("MASSOC_ID"));
		obj.setDATE1(rs.getTimestamp("DATE1"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
