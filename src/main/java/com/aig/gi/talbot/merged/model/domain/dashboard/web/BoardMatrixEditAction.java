package com.aig.gi.talbot.merged.model.domain.dashboard.web;

import java.util.ArrayList;
import java.util.List;

import com.aig.gi.talbot.merged.model.domain.enumeration.CatModelEnum;

public class BoardMatrixEditAction {

	private List<CatModelEnum> catProviderList;

	private List<String> matrixList;

	public List<String> getMatrixList() {
		return matrixList;
	}

	public List<CatModelEnum> getCatProviderList() {
		return catProviderList;
	}

	public BoardMatrixEditAction() {
		catProviderList = new ArrayList<>();
		matrixList = new ArrayList<>();

		catProviderList.add(CatModelEnum.RMS);
		catProviderList.add(CatModelEnum.VALIDUS);
		catProviderList.add(CatModelEnum.VALIDUSMQ);
		catProviderList.add(CatModelEnum.RMSFQ);

		matrixList.add("Justin test");
		matrixList.add("Jack test");
	}

}
