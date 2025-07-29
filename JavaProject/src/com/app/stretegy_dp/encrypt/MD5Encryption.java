package com.app.stretegy_dp.encrypt;

import com.app.stretegy_dp.enums.EncodingPatternEnum;

public class MD5Encryption implements Encryption {

	@Override
	public void enctypt(String toBeEncrypted) {
		System.out.println("I am encryption using MD5");

	}

	@Override
	public EncodingPatternEnum getEncyptionType() {
		// TODO Auto-generated method stub
		return EncodingPatternEnum.MD5;
	}

}
