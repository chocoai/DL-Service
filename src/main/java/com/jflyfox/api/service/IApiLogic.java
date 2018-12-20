package com.jflyfox.api.service;

import com.jflyfox.api.form.ApiResp;
import com.jflyfox.api.form.ApiForm;

/**
 * api实现接口
 * 
 * 2018年9月29日 上午11:45:08
 */
public interface IApiLogic extends IApiCommon {

	/**
	 * 返回栏目列表
	 * 
	 * 2018年9月29日 上午10:35:28
	 * 
	 * @param form
	 * @return ApiResp
	 */
	public ApiResp folders(ApiForm form);

	/**
	 * 返回文章列表
	 * 
	 * 2018年9月29日 上午10:36:00
	 * 
	 * @param form
	 * @return ApiResp
	 */
	public ApiResp pageArticleSite(ApiForm form);

	/**
	 * 返回文章列表
	 * 
	 * 2018年9月29日 上午10:36:06
	 * 
	 * @param form
	 * @return ApiResp
	 */
	public ApiResp pageArticle(ApiForm form);

	/**
	 * 返回对应文章
	 * 
	 * 2018年9月29日 上午10:36:11
	 * 
	 * @param form
	 * @return ApiResp
	 */
	public ApiResp article(ApiForm form);
}
