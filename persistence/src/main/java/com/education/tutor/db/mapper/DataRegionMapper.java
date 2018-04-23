package com.education.tutor.db.mapper;

import com.education.tutor.db.domain.TblDataRegion;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DataRegionMapper {

	@Select("select a.name as name,a.name_en as nameEn from data_region a where a.name =#{name} or a.name_en = #{name} ")
	public List<TblDataRegion> getDataRegionByLang(@Param("name")String name);
}
