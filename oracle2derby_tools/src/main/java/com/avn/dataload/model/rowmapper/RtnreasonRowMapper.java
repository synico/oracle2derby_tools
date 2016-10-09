package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rtnreason;

public class RtnreasonRowMapper<T> implements RowMapper<Rtnreason> {

	@Override
	public Rtnreason mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rtnreason obj = new Rtnreason();
		
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setRtnreasonId(rs.getBigDecimal("RTNREASON_ID"));
		obj.setReasontype(rs.getString("REASONTYPE"));
		
		return obj;
	}

}
