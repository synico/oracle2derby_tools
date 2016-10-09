package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmfwkspc;

public class CmfwkspcRowMapper<T> implements RowMapper<Cmfwkspc> {

	@Override
	public Cmfwkspc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmfwkspc obj = new Cmfwkspc();
		
		obj.setCmfwkspcId(rs.getBigDecimal("CMFWKSPC_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setPersistentype(rs.getBigDecimal("PERSISTENTYPE"));
		obj.setLockingpolicy(rs.getBigDecimal("LOCKINGPOLICY"));
		obj.setPromotionpolicy(rs.getBigDecimal("PROMOTIONPOLICY"));
		
		return obj;
	}

}
