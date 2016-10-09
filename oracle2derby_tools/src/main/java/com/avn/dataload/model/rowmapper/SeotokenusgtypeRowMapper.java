package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seotokenusgtype;

public class SeotokenusgtypeRowMapper<T> implements RowMapper<Seotokenusgtype> {

	@Override
	public Seotokenusgtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seotokenusgtype obj = new Seotokenusgtype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setTokenusgtypeId(rs.getBigDecimal("TOKENUSGTYPE_ID"));
		obj.setTokenusgtype(rs.getString("TOKENUSGTYPE"));
		obj.setPrimarytoken(rs.getString("PRIMARYTOKEN"));
		obj.setIsstatic(rs.getBigDecimal("ISSTATIC"));
		
		return obj;
	}

}
