package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cntrstore;

public class CntrstoreRowMapper<T> implements RowMapper<Cntrstore> {

	@Override
	public Cntrstore mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cntrstore obj = new Cntrstore();
		
		obj.setContractId(rs.getBigDecimal("CONTRACT_ID"));
		obj.setStorexml(rs.getString("STOREXML"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
