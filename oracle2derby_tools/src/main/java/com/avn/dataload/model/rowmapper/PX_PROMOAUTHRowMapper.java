package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_PROMOAUTH;

public class PX_PROMOAUTHRowMapper<T> implements RowMapper<PX_PROMOAUTH> {

	@Override
	public PX_PROMOAUTH mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_PROMOAUTH obj = new PX_PROMOAUTH();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setPROMOTIONTYPE(rs.getString("PROMOTIONTYPE"));
		obj.setDAILYSTARTTIME(rs.getTimestamp("DAILYSTARTTIME"));
		obj.setDAILYENDTIME(rs.getTimestamp("DAILYENDTIME"));
		obj.setWEEKDAY_SUN(rs.getBigDecimal("WEEKDAY_SUN"));
		obj.setWEEKDAY_MON(rs.getBigDecimal("WEEKDAY_MON"));
		obj.setWEEKDAY_TUE(rs.getBigDecimal("WEEKDAY_TUE"));
		obj.setWEEKDAY_WED(rs.getBigDecimal("WEEKDAY_WED"));
		obj.setWEEKDAY_THU(rs.getBigDecimal("WEEKDAY_THU"));
		obj.setWEEKDAY_FRI(rs.getBigDecimal("WEEKDAY_FRI"));
		obj.setWEEKDAY_SAT(rs.getBigDecimal("WEEKDAY_SAT"));
		obj.setADMINSTVENAME(rs.getString("ADMINSTVENAME"));
		obj.setCTLPARAM(rs.getString("CTLPARAM"));
		
		return obj;
	}

}
