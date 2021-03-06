package com.dc.menus.dao;

import java.util.List;

import com.dc.menus.vo.MenusVo;

public interface MenusDao {
	
	public List<MenusVo> menusSelectList(int restaurantKey);
	
	public int menusInsert(MenusVo menusVo);
	
	public int menusUpdate(MenusVo menusVo) throws Exception;
	
	public int menusDelete(int restaurantNo);

	public void menusDeleteMemberNo(int memberNo);

}
