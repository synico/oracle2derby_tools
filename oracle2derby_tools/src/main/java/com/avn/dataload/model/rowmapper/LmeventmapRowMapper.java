package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Lmeventmap;

public class LmeventmapRowMapper<T> implements RowMapper<Lmeventmap> {

	@Override
	public Lmeventmap mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lmeventmap obj = new Lmeventmap();
		
		obj.setLmeventmapId(rs.getBigDecimal("LMEVENTMAP_ID"));
		obj.setExteventname(rs.getString("EXTEVENTNAME"));
		obj.setExteventdesc(rs.getString("EXTEVENTDESC"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLmsetname(rs.getString("LMNAME"));
		obj.setLmtxtypeid(rs.getBigDecimal("LMTXTYPEID"));
		
		return obj;
	}

}
