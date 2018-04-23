package com.education.tutor.service;

import com.education.tutor.db.domain.TblDataRegion;
import com.education.tutor.db.mapper.DataRegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DataRegionService {

	@Autowired
	private DataRegionMapper dataRegionMapper;
	
	public TblDataRegion getDataRegionByLang(String name) {
		List<TblDataRegion> list = dataRegionMapper.getDataRegionByLang(name); 
		if(list!=null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
	
	
	public String getAreaZh(String areaEn,String lang) {
		if(areaEn!=null && !areaEn.trim().equals("")) {
        	String areaArr[] = areaEn.split(",");
        	StringBuffer areaBf = new StringBuffer("");
        	if(areaArr!=null && areaArr.length>0) {
        		TblDataRegion dr1 = getDataRegionByLang(areaArr[0]);
        		
        		if(dr1!=null) {
        			if(lang.equals("zh")) {
        				areaBf.append(dr1.getName()).append(",");
        			}else {
        				areaBf.append(dr1.getNameEn()).append(",");
        			}
        		}
        		TblDataRegion dr2 = getDataRegionByLang(areaArr[1]);
        		if(dr2!=null) {
        			if(lang.equals("zh")) {
        				areaBf.append(dr2.getName()) ;
        			}else {
        				areaBf.append(dr2.getNameEn()) ;
        			}
        		}
        	}
        	return areaBf.toString();
        }
		return areaEn;
	}
	
	
}
