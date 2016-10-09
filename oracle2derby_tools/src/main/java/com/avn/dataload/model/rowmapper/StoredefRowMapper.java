package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storedef;

public class StoredefRowMapper<T> implements RowMapper<Storedef> {

	@Override
	public Storedef mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storedef obj = new Storedef();
		
		obj.setContractId(rs.getBigDecimal("CONTRACT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		
		return obj;
	}

}
