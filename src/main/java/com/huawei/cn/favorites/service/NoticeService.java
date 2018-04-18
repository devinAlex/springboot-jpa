package com.huawei.cn.favorites.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.huawei.cn.favorites.domain.view.CollectSummary;

public interface NoticeService {
	
	public void saveNotice(String collectId,String type,Long userId,String operId);
	
	public List<CollectSummary> getNoticeCollects(String type, Long userId, Pageable pageable);

}
