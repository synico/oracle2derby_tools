package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StoretpcKey;

public class StoretpcKeyRowMapper<T> implements RowMapper<StoretpcKey> {

	@Override
	public StoretpcKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StoretpcKey obj = new StoretpcKey();
		
		obj.setTradeposcnId(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSttpcusgId(rs.getBigDecimal("STTPCUSG_ID"));
		
		return obj;
	}

}
