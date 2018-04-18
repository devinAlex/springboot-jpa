package com.huawei.cn.favorites.service;

import com.huawei.cn.favorites.domain.Collect;
import com.huawei.cn.favorites.domain.Favorites;

public interface FavoritesService {
	public Favorites saveFavorites(Long userId,String name);
	public Favorites saveFavorites(Collect collect);
	public void countFavorites(Long id);

}
