package com.app.stretegy_dp.encrypt;

import com.app.stretegy_dp.enums.EncodingPatternEnum;

public class SHA2Encryption implements Encryption {

	@Override
	public void enctypt(String toBeEncrypted) {
		System.out.println("I am encryption using SH2");

	}

	@Override
	public EncodingPatternEnum getEncyptionType() {
		// TODO Auto-generated method stub
		return EncodingPatternEnum.SHA2;
	}

}
