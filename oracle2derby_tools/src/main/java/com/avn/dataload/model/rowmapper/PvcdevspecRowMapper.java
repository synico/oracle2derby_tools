package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pvcdevspec;

public class PvcdevspecRowMapper<T> implements RowMapper<Pvcdevspec> {

	@Override
	public Pvcdevspec mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pvcdevspec obj = new Pvcdevspec();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setSessiontype(rs.getString("SESSIONTYPE"));
		obj.setMaxcontentlength(rs.getBigDecimal("MAXCONTENTLENGTH"));
		obj.setMaxurllength(rs.getBigDecimal("MAXURLLENGTH"));
		obj.setLcdmonochrome(rs.getString("LCDMONOCHROME"));
		obj.setImageformat(rs.getString("IMAGEFORMAT"));
		obj.setSoundformat(rs.getString("SOUNDFORMAT"));
		obj.setDocumentformat(rs.getString("DOCUMENTFORMAT"));
		obj.setDocumentversion(rs.getString("DOCUMENTVERSION"));
		obj.setSpecId(rs.getBigDecimal("SPEC_ID"));
		obj.setSpecname(rs.getString("SPECNAME"));
		obj.setLcdwidth(rs.getBigDecimal("LCDWIDTH"));
		obj.setLcdheight(rs.getBigDecimal("LCDHEIGHT"));
		obj.setLcdcolors(rs.getBigDecimal("LCDCOLORS"));
		obj.setContentdir(rs.getString("CONTENTDIR"));
		
		return obj;
	}

}
