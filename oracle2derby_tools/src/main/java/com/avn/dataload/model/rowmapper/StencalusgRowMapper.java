package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Stencalusg;

public class StencalusgRowMapper<T> implements RowMapper<Stencalusg> {

	@Override
	public Stencalusg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stencalusg obj = new Stencalusg();
		
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setCalmethodIdApp(rs.getBigDecimal("CALMETHOD_ID_APP"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setActccCalmethodId(rs.getBigDecimal("ACTCC_CALMETHOD_ID"));
		obj.setActrcCalmethodId(rs.getBigDecimal("ACTRC_CALMETHOD_ID"));
		obj.setCalmethodIdSum(rs.getBigDecimal("CALMETHOD_ID_SUM"));
		obj.setCalmethodIdFin(rs.getBigDecimal("CALMETHOD_ID_FIN"));
		obj.setCalmethodIdIni(rs.getBigDecimal("CALMETHOD_ID_INI"));
		obj.setUsageflags(rs.getBigDecimal("USAGEFLAGS"));
		
		return obj;
	}

}
