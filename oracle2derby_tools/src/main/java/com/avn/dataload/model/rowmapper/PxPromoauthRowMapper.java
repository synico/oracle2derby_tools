package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxPromoauth;

public class PxPromoauthRowMapper<T> implements RowMapper<PxPromoauth> {

	@Override
	public PxPromoauth mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxPromoauth obj = new PxPromoauth();
		
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setComments(rs.getString("COMMENTS"));
		obj.setPromotiontype(rs.getString("PROMOTIONTYPE"));
		obj.setDailystarttime(rs.getDate("DAILYSTARTTIME"));
		obj.setDailyendtime(rs.getDate("DAILYENDTIME"));
		obj.setAdminstvename(rs.getString("ADMINSTVENAME"));
		obj.setWeekdaySun(rs.getBigDecimal("WEEKDAY_SUN"));
		obj.setWeekdayMon(rs.getBigDecimal("WEEKDAY_MON"));
		obj.setWeekdayTue(rs.getBigDecimal("WEEKDAY_TUE"));
		obj.setWeekdayWed(rs.getBigDecimal("WEEKDAY_WED"));
		obj.setWeekdayThu(rs.getBigDecimal("WEEKDAY_THU"));
		obj.setWeekdayFri(rs.getBigDecimal("WEEKDAY_FRI"));
		obj.setWeekdaySat(rs.getBigDecimal("WEEKDAY_SAT"));
		obj.setCtlparam(rs.getString("CTLPARAM"));
		
		return obj;
	}

}
