package com.rxok.ui.view;

import com.rxok.model.OkDetailEntity;

import java.util.List;
/**
 * description ：
 * project name：RxOk
 * author : Zachary
 * creation date: 2017/7/7
 * @version 1.0
 */
public interface OkDetailView extends MvpView {
	void refresh(List<OkDetailEntity.TngouBean> data);

	void loadMore(List<OkDetailEntity.TngouBean>  data);
}
