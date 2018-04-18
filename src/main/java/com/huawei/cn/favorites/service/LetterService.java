package com.huawei.cn.favorites.service;

import com.huawei.cn.favorites.domain.Letter;
import com.huawei.cn.favorites.domain.view.LetterSummary;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by DingYS on 2017/3/8.
 */
public interface LetterService {

    public void sendLetter(Letter letter);

    public List<LetterSummary> findLetter(Long userId, Pageable pageable);
}
