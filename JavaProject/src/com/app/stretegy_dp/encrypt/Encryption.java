package com.app.stretegy_dp.encrypt;

import com.app.stretegy_dp.enums.EncodingPatternEnum;

public interface Encryption {
	public void enctypt(String toBeEncrypted);
	public EncodingPatternEnum getEncyptionType();

}
