package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cseditatt;

public class CseditattRowMapper<T> implements RowMapper<Cseditatt> {

	@Override
	public Cseditatt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cseditatt obj = new Cseditatt();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setProfileId(rs.getBigDecimal("PROFILE_ID"));
		obj.setCseditattId(rs.getBigDecimal("CSEDITATT_ID"));
		obj.setTransportId(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setInstanceNum(rs.getBigDecimal("INSTANCE_NUM"));
		obj.setCustomizable(rs.getBigDecimal("CUSTOMIZABLE"));
		obj.setConnspecattname(rs.getString("CONNSPECATTNAME"));
		obj.setConnspecattvalue(rs.getString("CONNSPECATTVALUE"));
		
		return obj;
	}

}
