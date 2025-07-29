package com.app.stretegy_dp.factory;

import java.util.HashSet;
import java.util.Set;

import com.app.stretegy_dp.encrypt.Encryption;
import com.app.stretegy_dp.encrypt.MD5Encryption;
import com.app.stretegy_dp.encrypt.SHA1Encryption;
import com.app.stretegy_dp.encrypt.SHA2Encryption;
import com.app.stretegy_dp.enums.EncodingPatternEnum;

public class MainEncryptionFactory {

	public static void main(String[] args) {
		Set<Encryption> set=new HashSet<>();
		set.add(new MD5Encryption());
		set.add(new SHA1Encryption());
		set.add(new SHA2Encryption());
		EncryptionFactory encryptionFactory=new EncryptionFactory(set);
		Encryption findEncryptionType = encryptionFactory.findEncryptionType(EncodingPatternEnum.SHA1);
		findEncryptionType.enctypt("sonu");
		EncodingPatternEnum encyptionType = findEncryptionType.getEncyptionType();
		System.out.println(encyptionType);

	}

}
