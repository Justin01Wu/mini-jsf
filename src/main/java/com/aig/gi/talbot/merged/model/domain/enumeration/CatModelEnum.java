package com.aig.gi.talbot.merged.model.domain.enumeration;

public enum CatModelEnum {
	RMS(1, "RMS", "RMS"), 
	RMSFQ(5, "RMSFQ", "RMSFQ"),
	EQE(3, "EQE", "EQE"), 
	VALIDUS(4, "Validus", "V"),
	VALIDUSFQ(6, "ValidusFQ", "VFQ"),
	VALIDUSMQ(15, "ValidusMQ", "VMQ"),
	VETIV(14, "VETIV", "VETIV"),
	YELTUNK(23, "YELTUNK", "YELTUNK"); // YELT unknown

	public static final boolean IS_FIXED_QUANTILE = true;
	public static final boolean IS_BLENDED_GROUP = true;
	public static final String VALIDUS_RQ_NAME = "ValidusRQ";
	private final int id;
	private final String name;
	private final String dirPrefix;
	private final boolean hev;
	private final boolean etiv;
	private final boolean yelt;
	private final boolean propertyEnabled;

	/**
	 * Instantiates a new Cat Model Enum.
	 *
	 * @param id   the Cat Model id
	 * @param name the name
	 */
	CatModelEnum(int id, String name, String dirPrefix ) {
		this.id = id;
		this.name = name;
		this.dirPrefix = dirPrefix;
		this.hev = name.endsWith("HEV");
		this.yelt = name.startsWith("YELT");
		this.etiv = name.endsWith("ETIV");
		this.propertyEnabled = false;
	}

	public static CatModelEnum lookupByCode(String catModelCode) {
		for (CatModelEnum item : CatModelEnum.values()) {
			if (item.name.equals(catModelCode))
				return item;
		}
		if (VALIDUS_RQ_NAME.equals(catModelCode)) {
			return VALIDUS;
		}
		return null;
	}

	public int getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public String getViewName() {
		return this == VALIDUS ? VALIDUS_RQ_NAME : name;
	}

	public String getDirPrefix() {
		return dirPrefix;
	}

	public boolean isHev() {
		return hev;
	}

	public boolean isYELT() {
		return yelt;
	}

	public boolean isEtiv() {
		return etiv;
	}

	public boolean isHevEtiv() {
		return hev || etiv;
	}

	public boolean isPropertyEnabled() {
		return propertyEnabled;
	}
}
